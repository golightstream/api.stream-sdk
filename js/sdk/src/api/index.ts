/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
/**
 * @summary an API for creating cloud video applications
 */

import * as NiceGrpc from 'nice-grpc-web';
import { isAbortError } from 'abort-controller-x';
import { Category } from 'typescript-logging-category-style';
import { logger } from './logger';

const clientVersion = require( "../version/index.js" );

export module ApiClient {
  export type ApiLogCallback = ( api: string, service: string, func: string, request: any, response: any ) => void;
  export type EventLogCallback = ( service: string, type: string, subtype: string, event: any ) => void;
}

export class ApiClient {
  protected channel: NiceGrpc.Channel;
  protected accessToken?: string;
  protected clientFactory?: NiceGrpc.ClientFactory;
  protected sdkVersion?: string;
  protected version?: string;
  protected log?: Category;
  protected sessionId: string;
  protected grpcOptions: NiceGrpc.CallOptions;
  protected apiLogCallback?: ApiClient.ApiLogCallback;
  protected eventLogCallback?: ApiClient.EventLogCallback;
  protected apikey?: string;

  async * logMiddleware<Request, Response> (
    call: NiceGrpc.ClientMiddlewareCall<Request, Response>,
    options: NiceGrpc.CallOptions ) {
    const { path } = call.method;

    try {
      const result = yield* call.next( call.request, options );
      this.log.debug( `-> ${ path }: ok` );
      this.log.trace( `${ JSON.stringify( call.request ) } -> ${ path }: ${ JSON.stringify( result ) }` );

      if ( this.apiLogCallback ) {
        let parts = path.split( "/" );
        let serviceParts = parts[ 1 ].split( "." );
        let service = serviceParts[ serviceParts.length - 1 ];
        let version = serviceParts[ serviceParts.length - 2 ];
        let api = serviceParts[ serviceParts.length - 3 ];
        let func = parts[ 2 ];

        this.apiLogCallback( api, service, func, call.request, result );
      }

      return result;
    } catch ( error ) {
      this.log.trace( `${ JSON.stringify( call.request ) } -> ${ path }` );

      if ( error instanceof NiceGrpc.ClientError ) {
        this.log.warn( `-> ${ path }: error: ${ NiceGrpc.Status[ error.code ] }: ${ error.details }` );
      } else if ( isAbortError( error ) ) {
        this.log.warn( `-> ${ path }: cancel` );
      } else {
        this.log.warn( `-> ${ path }: error: ${ error?.stack }` );
      }

      throw error;
    }
  }

  constructor ( sessionId: string, server: string, sdkVersion?: string, logCategory?: string, apiLogCallback?: ApiClient.ApiLogCallback, eventLogCallback?: ApiClient.EventLogCallback, apikey?: string, private featureOverrides?: string[]) {
    this.sessionId = sessionId;
    this.sdkVersion = sdkVersion;
    this.version = clientVersion;
    this.apiLogCallback = apiLogCallback;
    this.eventLogCallback = eventLogCallback;
    this.log = logger.getCategory( logCategory );
    this.apikey = apikey;

    this.channel = NiceGrpc.createChannel( server, NiceGrpc.FetchTransport());
    this.clientFactory = NiceGrpc.createClientFactory().use( this.logMiddleware.bind( this ) );
  }

  public setAccessToken ( accessToken: string ) {
    if ( ( this.accessToken == undefined ) || ( this.accessToken != accessToken ) ) {
      this.log.debug( "access token refreshed" );
      this.accessToken = accessToken;
      this.setup();
    }
  }

  protected makeGrpcMetadata (): NiceGrpc.Metadata {
    let metadata = NiceGrpc.Metadata( {
      Authorization: `Bearer ${ this.accessToken }`,

      ClientType: 'nodejs',
      'apistream-sdk-type': 'nodejs',

      Version: this.version,
      'apistream-sdk-version': this.version,

      SessionId: this.sessionId,
      'apistream-sessionid': this.sessionId,
    } );

    if ( this.sdkVersion != undefined ) {
      metadata.set( "SdkVersion", this.sdkVersion );
      metadata.set( "apistream-studiokit-version", this.sdkVersion );
    }

    if ( this.featureOverrides?.length ) {
      metadata.set( "apistream-feature-overrides", this.featureOverrides);
    }

    if (this.apikey) {
      metadata.set("x-api-key", this.apikey);
    }

    return metadata;
  }
  protected setup (): void {
    let options = {
      metadata: this.makeGrpcMetadata(),
    };
    this._setup( options );
  }

  protected _setup ( options: NiceGrpc.CallOptions ): void {
  }
}
