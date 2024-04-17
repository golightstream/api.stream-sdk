/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
/* eslint-disable */
import _m0 from "protobufjs/minimal";
import { Observable } from "rxjs";
import { map } from "rxjs/operators";
import { Struct, Value } from "../../../google/protobuf/struct";

export const protobufPackage = "apis.event.v2";

export enum EventsStreamMessageType {
  EVENTS_STREAM_MESSAGE_TYPE_UNSPECIFIED = "EVENTS_STREAM_MESSAGE_TYPE_UNSPECIFIED",
  EVENTS_STREAM_MESSAGE_TYPE_PING = "EVENTS_STREAM_MESSAGE_TYPE_PING",
  EVENTS_STREAM_MESSAGE_TYPE_ERROR = "EVENTS_STREAM_MESSAGE_TYPE_ERROR",
  EVENTS_STREAM_MESSAGE_TYPE_SUBSCRIBED = "EVENTS_STREAM_MESSAGE_TYPE_SUBSCRIBED",
  EVENTS_STREAM_MESSAGE_TYPE_UNSUBSCRIBED = "EVENTS_STREAM_MESSAGE_TYPE_UNSUBSCRIBED",
  EVENTS_STREAM_MESSAGE_TYPE_PUBLISHED = "EVENTS_STREAM_MESSAGE_TYPE_PUBLISHED",
}

export function eventsStreamMessageTypeFromJSON(object: any): EventsStreamMessageType {
  switch (object) {
    case 0:
    case "EVENTS_STREAM_MESSAGE_TYPE_UNSPECIFIED":
      return EventsStreamMessageType.EVENTS_STREAM_MESSAGE_TYPE_UNSPECIFIED;
    case 1:
    case "EVENTS_STREAM_MESSAGE_TYPE_PING":
      return EventsStreamMessageType.EVENTS_STREAM_MESSAGE_TYPE_PING;
    case 2:
    case "EVENTS_STREAM_MESSAGE_TYPE_ERROR":
      return EventsStreamMessageType.EVENTS_STREAM_MESSAGE_TYPE_ERROR;
    case 3:
    case "EVENTS_STREAM_MESSAGE_TYPE_SUBSCRIBED":
      return EventsStreamMessageType.EVENTS_STREAM_MESSAGE_TYPE_SUBSCRIBED;
    case 4:
    case "EVENTS_STREAM_MESSAGE_TYPE_UNSUBSCRIBED":
      return EventsStreamMessageType.EVENTS_STREAM_MESSAGE_TYPE_UNSUBSCRIBED;
    case 5:
    case "EVENTS_STREAM_MESSAGE_TYPE_PUBLISHED":
      return EventsStreamMessageType.EVENTS_STREAM_MESSAGE_TYPE_PUBLISHED;
    default:
      throw new tsProtoGlobalThis.Error("Unrecognized enum value " + object + " for enum EventsStreamMessageType");
  }
}

export function eventsStreamMessageTypeToJSON(object: EventsStreamMessageType): string {
  switch (object) {
    case EventsStreamMessageType.EVENTS_STREAM_MESSAGE_TYPE_UNSPECIFIED:
      return "EVENTS_STREAM_MESSAGE_TYPE_UNSPECIFIED";
    case EventsStreamMessageType.EVENTS_STREAM_MESSAGE_TYPE_PING:
      return "EVENTS_STREAM_MESSAGE_TYPE_PING";
    case EventsStreamMessageType.EVENTS_STREAM_MESSAGE_TYPE_ERROR:
      return "EVENTS_STREAM_MESSAGE_TYPE_ERROR";
    case EventsStreamMessageType.EVENTS_STREAM_MESSAGE_TYPE_SUBSCRIBED:
      return "EVENTS_STREAM_MESSAGE_TYPE_SUBSCRIBED";
    case EventsStreamMessageType.EVENTS_STREAM_MESSAGE_TYPE_UNSUBSCRIBED:
      return "EVENTS_STREAM_MESSAGE_TYPE_UNSUBSCRIBED";
    case EventsStreamMessageType.EVENTS_STREAM_MESSAGE_TYPE_PUBLISHED:
      return "EVENTS_STREAM_MESSAGE_TYPE_PUBLISHED";
    default:
      throw new tsProtoGlobalThis.Error("Unrecognized enum value " + object + " for enum EventsStreamMessageType");
  }
}

export function eventsStreamMessageTypeToNumber(object: EventsStreamMessageType): number {
  switch (object) {
    case EventsStreamMessageType.EVENTS_STREAM_MESSAGE_TYPE_UNSPECIFIED:
      return 0;
    case EventsStreamMessageType.EVENTS_STREAM_MESSAGE_TYPE_PING:
      return 1;
    case EventsStreamMessageType.EVENTS_STREAM_MESSAGE_TYPE_ERROR:
      return 2;
    case EventsStreamMessageType.EVENTS_STREAM_MESSAGE_TYPE_SUBSCRIBED:
      return 3;
    case EventsStreamMessageType.EVENTS_STREAM_MESSAGE_TYPE_UNSUBSCRIBED:
      return 4;
    case EventsStreamMessageType.EVENTS_STREAM_MESSAGE_TYPE_PUBLISHED:
      return 5;
    default:
      throw new tsProtoGlobalThis.Error("Unrecognized enum value " + object + " for enum EventsStreamMessageType");
  }
}

/**
 * Targetting for an event
 * Event targetting allows you to listen or publish an event against a specific target. You can assume that:
 * When subscribing, you will receive events for the chosen scope and any higher scope that isn't targetted. This means
 * - An event published against a layoutId can be listened to by targetting the given layoutId, projectId or collectionId
 * - An event published against a collectionId can be subscribed by scoping to any given projectId or layoutId under the collection.
 */
export interface EventTarget {
  /** Subscribe to events in a given collection. */
  collectionId?:
    | string
    | undefined;
  /** Subscribe to events in a given project. */
  projectId?:
    | string
    | undefined;
  /**
   * Stream events to a specific layout.
   * Note: when specified, collection_id and project_id are implictly defined. If you choose
   * to define them, you they _must_ match the layout.
   */
  layoutId?: string | undefined;
}

/** Publish a custom event */
export interface PublishEventRequest {
  /** Name of the event. */
  name: string;
  /** Value of the event. This can be a free-form value which we do not inspect. */
  payload:
    | { [key: string]: any }
    | undefined;
  /**
   * Metadata associated with the publishing of the event.
   * Typically this is information about _why_ the event happened. Use `payload` for
   * _what_ the event is.
   */
  requestMetadata?:
    | any
    | undefined;
  /** Scope the event to a specific target */
  target?: EventTarget | undefined;
}

/**
 * Response of an event being forwarded to a subscription.
 * note: if this socket is also the publisher, this payload will be
 * sent twice. Once for `published` and once for `event`. You can use `correlation_id`
 * to identify the published event.
 */
export interface PublishEventResponse {
  /** Name of the event. */
  name: string;
  /** Value of the event. */
  payload:
    | { [key: string]: any }
    | undefined;
  /** Custom scoping parameters. */
  target?:
    | EventTarget
    | undefined;
  /** Metadata associated with the publishing of the event */
  requestMetadata?:
    | any
    | undefined;
  /** Internal ID of the event. */
  id: string;
}

/** Payload to subscribe or unsubscribe from an event */
export interface SubscribePayload {
  /**
   * Event name to subscribe to for custom events.
   * This can be a wildcard `my_service:*` or multiple events `my_event|my_other_event`.
   */
  name: string;
  /** The target to subscribe to. */
  target?: EventTarget | undefined;
}

/**
 * Indicates an error with a message sent to the Event API.
 * Tie `correlation_id` on the message sent to the Event API and the `correlation_id`
 * on the parent message to understand which request this error is for.
 */
export interface EventsStreamError {
  /** The GRPC error code for the event. */
  code: number;
  /** A mesasage indicating what the error is. */
  message: string;
}

/** Indicate to the client that they should re-open their connection */
export interface EventsStreamReconnectRequest {
  /** Whether the access token needs to be refreshed before reconnecting. */
  reauthenticate: boolean;
  /**
   * A timestamp indicating when the connection should be reconnected by.
   * If you're maintaining multiple connections, you should reconnect at a random interval within this time range.
   */
  beforeTimestamp: string;
}

/** Payload sent to the event API */
export interface EventsStreamRequest {
  /**
   * Optional value to tag any return values with. This can be any string-based value
   * that your are able to track.
   */
  correlationId?:
    | string
    | undefined;
  /** Subscribe to a new event. */
  subscribe?:
    | SubscribePayload
    | undefined;
  /** Unsubscribe from an event. */
  unsubscribe?:
    | SubscribePayload
    | undefined;
  /** Publish a new event. */
  publish?:
    | PublishEventRequest
    | undefined;
  /** Initiate a ping-pong message. */
  ping?: string | undefined;
}

/** Payload returned from the event API. */
export interface EventsStreamResponse {
  /**
   * Optional value to tag any return values with.
   * Correlation ID should be used to correlate requests sent down the socket,
   * enabling you to tie a `PUBLISH` to a `PUBLISHED``
   */
  correlationId?:
    | string
    | undefined;
  /**
   * Optional session id
   * This is set by sending the `SessionId` header for any HTTP requests
   * and the `sessionId` query parameter for websockets.
   */
  sessionId?:
    | string
    | undefined;
  /** Custom event emitted */
  event?:
    | PublishEventResponse
    | undefined;
  /** Ping payload */
  pong?:
    | string
    | undefined;
  /** Non-blocking streaming error */
  error?:
    | EventsStreamError
    | undefined;
  /** Subscribe to a new event. */
  subscribed?:
    | SubscribePayload
    | undefined;
  /** Unsubscribe from an event. */
  unsubscribed?:
    | SubscribePayload
    | undefined;
  /** Publish a new event. */
  published?:
    | PublishEventResponse
    | undefined;
  /** Inform the client should reoconnect before a timestamp. */
  reconnectBefore?: EventsStreamReconnectRequest | undefined;
}

function createBaseEventTarget(): EventTarget {
  return { collectionId: undefined, projectId: undefined, layoutId: undefined };
}

export const EventTarget = {
  encode(message: EventTarget, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.collectionId !== undefined) {
      writer.uint32(42).string(message.collectionId);
    }
    if (message.projectId !== undefined) {
      writer.uint32(34).string(message.projectId);
    }
    if (message.layoutId !== undefined) {
      writer.uint32(10).string(message.layoutId);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): EventTarget {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseEventTarget();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 5:
          message.collectionId = reader.string();
          break;
        case 4:
          message.projectId = reader.string();
          break;
        case 1:
          message.layoutId = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): EventTarget {
    return {
      collectionId: isSet(object.collectionId) ? String(object.collectionId) : undefined,
      projectId: isSet(object.projectId) ? String(object.projectId) : undefined,
      layoutId: isSet(object.layoutId) ? String(object.layoutId) : undefined,
    };
  },

  toJSON(message: EventTarget): unknown {
    const obj: any = {};
    message.collectionId !== undefined && (obj.collectionId = message.collectionId);
    message.projectId !== undefined && (obj.projectId = message.projectId);
    message.layoutId !== undefined && (obj.layoutId = message.layoutId);
    return obj;
  },

  fromPartial(object: DeepPartial<EventTarget>): EventTarget {
    const message = createBaseEventTarget();
    message.collectionId = object.collectionId ?? undefined;
    message.projectId = object.projectId ?? undefined;
    message.layoutId = object.layoutId ?? undefined;
    return message;
  },
};

function createBasePublishEventRequest(): PublishEventRequest {
  return { name: "", payload: undefined, requestMetadata: undefined, target: undefined };
}

export const PublishEventRequest = {
  encode(message: PublishEventRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.name !== "") {
      writer.uint32(10).string(message.name);
    }
    if (message.payload !== undefined) {
      Struct.encode(Struct.wrap(message.payload), writer.uint32(18).fork()).ldelim();
    }
    if (message.requestMetadata !== undefined) {
      Value.encode(Value.wrap(message.requestMetadata), writer.uint32(34).fork()).ldelim();
    }
    if (message.target !== undefined) {
      EventTarget.encode(message.target, writer.uint32(26).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): PublishEventRequest {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBasePublishEventRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.name = reader.string();
          break;
        case 2:
          message.payload = Struct.unwrap(Struct.decode(reader, reader.uint32()));
          break;
        case 4:
          message.requestMetadata = Value.unwrap(Value.decode(reader, reader.uint32()));
          break;
        case 3:
          message.target = EventTarget.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): PublishEventRequest {
    return {
      name: isSet(object.name) ? String(object.name) : "",
      payload: isObject(object.payload) ? object.payload : undefined,
      requestMetadata: isSet(object?.requestMetadata) ? object.requestMetadata : undefined,
      target: isSet(object.target) ? EventTarget.fromJSON(object.target) : undefined,
    };
  },

  toJSON(message: PublishEventRequest): unknown {
    const obj: any = {};
    message.name !== undefined && (obj.name = message.name);
    message.payload !== undefined && (obj.payload = message.payload);
    message.requestMetadata !== undefined && (obj.requestMetadata = message.requestMetadata);
    message.target !== undefined && (obj.target = message.target ? EventTarget.toJSON(message.target) : undefined);
    return obj;
  },

  fromPartial(object: DeepPartial<PublishEventRequest>): PublishEventRequest {
    const message = createBasePublishEventRequest();
    message.name = object.name ?? "";
    message.payload = object.payload ?? undefined;
    message.requestMetadata = object.requestMetadata ?? undefined;
    message.target = (object.target !== undefined && object.target !== null)
      ? EventTarget.fromPartial(object.target)
      : undefined;
    return message;
  },
};

function createBasePublishEventResponse(): PublishEventResponse {
  return { name: "", payload: undefined, target: undefined, requestMetadata: undefined, id: "" };
}

export const PublishEventResponse = {
  encode(message: PublishEventResponse, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.name !== "") {
      writer.uint32(10).string(message.name);
    }
    if (message.payload !== undefined) {
      Struct.encode(Struct.wrap(message.payload), writer.uint32(18).fork()).ldelim();
    }
    if (message.target !== undefined) {
      EventTarget.encode(message.target, writer.uint32(26).fork()).ldelim();
    }
    if (message.requestMetadata !== undefined) {
      Value.encode(Value.wrap(message.requestMetadata), writer.uint32(34).fork()).ldelim();
    }
    if (message.id !== "") {
      writer.uint32(42).string(message.id);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): PublishEventResponse {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBasePublishEventResponse();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.name = reader.string();
          break;
        case 2:
          message.payload = Struct.unwrap(Struct.decode(reader, reader.uint32()));
          break;
        case 3:
          message.target = EventTarget.decode(reader, reader.uint32());
          break;
        case 4:
          message.requestMetadata = Value.unwrap(Value.decode(reader, reader.uint32()));
          break;
        case 5:
          message.id = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): PublishEventResponse {
    return {
      name: isSet(object.name) ? String(object.name) : "",
      payload: isObject(object.payload) ? object.payload : undefined,
      target: isSet(object.target) ? EventTarget.fromJSON(object.target) : undefined,
      requestMetadata: isSet(object?.requestMetadata) ? object.requestMetadata : undefined,
      id: isSet(object.id) ? String(object.id) : "",
    };
  },

  toJSON(message: PublishEventResponse): unknown {
    const obj: any = {};
    message.name !== undefined && (obj.name = message.name);
    message.payload !== undefined && (obj.payload = message.payload);
    message.target !== undefined && (obj.target = message.target ? EventTarget.toJSON(message.target) : undefined);
    message.requestMetadata !== undefined && (obj.requestMetadata = message.requestMetadata);
    message.id !== undefined && (obj.id = message.id);
    return obj;
  },

  fromPartial(object: DeepPartial<PublishEventResponse>): PublishEventResponse {
    const message = createBasePublishEventResponse();
    message.name = object.name ?? "";
    message.payload = object.payload ?? undefined;
    message.target = (object.target !== undefined && object.target !== null)
      ? EventTarget.fromPartial(object.target)
      : undefined;
    message.requestMetadata = object.requestMetadata ?? undefined;
    message.id = object.id ?? "";
    return message;
  },
};

function createBaseSubscribePayload(): SubscribePayload {
  return { name: "", target: undefined };
}

export const SubscribePayload = {
  encode(message: SubscribePayload, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.name !== "") {
      writer.uint32(10).string(message.name);
    }
    if (message.target !== undefined) {
      EventTarget.encode(message.target, writer.uint32(18).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): SubscribePayload {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseSubscribePayload();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.name = reader.string();
          break;
        case 2:
          message.target = EventTarget.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): SubscribePayload {
    return {
      name: isSet(object.name) ? String(object.name) : "",
      target: isSet(object.target) ? EventTarget.fromJSON(object.target) : undefined,
    };
  },

  toJSON(message: SubscribePayload): unknown {
    const obj: any = {};
    message.name !== undefined && (obj.name = message.name);
    message.target !== undefined && (obj.target = message.target ? EventTarget.toJSON(message.target) : undefined);
    return obj;
  },

  fromPartial(object: DeepPartial<SubscribePayload>): SubscribePayload {
    const message = createBaseSubscribePayload();
    message.name = object.name ?? "";
    message.target = (object.target !== undefined && object.target !== null)
      ? EventTarget.fromPartial(object.target)
      : undefined;
    return message;
  },
};

function createBaseEventsStreamError(): EventsStreamError {
  return { code: 0, message: "" };
}

export const EventsStreamError = {
  encode(message: EventsStreamError, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.code !== 0) {
      writer.uint32(8).int32(message.code);
    }
    if (message.message !== "") {
      writer.uint32(18).string(message.message);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): EventsStreamError {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseEventsStreamError();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.code = reader.int32();
          break;
        case 2:
          message.message = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): EventsStreamError {
    return {
      code: isSet(object.code) ? Number(object.code) : 0,
      message: isSet(object.message) ? String(object.message) : "",
    };
  },

  toJSON(message: EventsStreamError): unknown {
    const obj: any = {};
    message.code !== undefined && (obj.code = Math.round(message.code));
    message.message !== undefined && (obj.message = message.message);
    return obj;
  },

  fromPartial(object: DeepPartial<EventsStreamError>): EventsStreamError {
    const message = createBaseEventsStreamError();
    message.code = object.code ?? 0;
    message.message = object.message ?? "";
    return message;
  },
};

function createBaseEventsStreamReconnectRequest(): EventsStreamReconnectRequest {
  return { reauthenticate: false, beforeTimestamp: "" };
}

export const EventsStreamReconnectRequest = {
  encode(message: EventsStreamReconnectRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.reauthenticate === true) {
      writer.uint32(8).bool(message.reauthenticate);
    }
    if (message.beforeTimestamp !== "") {
      writer.uint32(18).string(message.beforeTimestamp);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): EventsStreamReconnectRequest {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseEventsStreamReconnectRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.reauthenticate = reader.bool();
          break;
        case 2:
          message.beforeTimestamp = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): EventsStreamReconnectRequest {
    return {
      reauthenticate: isSet(object.reauthenticate) ? Boolean(object.reauthenticate) : false,
      beforeTimestamp: isSet(object.beforeTimestamp) ? String(object.beforeTimestamp) : "",
    };
  },

  toJSON(message: EventsStreamReconnectRequest): unknown {
    const obj: any = {};
    message.reauthenticate !== undefined && (obj.reauthenticate = message.reauthenticate);
    message.beforeTimestamp !== undefined && (obj.beforeTimestamp = message.beforeTimestamp);
    return obj;
  },

  fromPartial(object: DeepPartial<EventsStreamReconnectRequest>): EventsStreamReconnectRequest {
    const message = createBaseEventsStreamReconnectRequest();
    message.reauthenticate = object.reauthenticate ?? false;
    message.beforeTimestamp = object.beforeTimestamp ?? "";
    return message;
  },
};

function createBaseEventsStreamRequest(): EventsStreamRequest {
  return {
    correlationId: undefined,
    subscribe: undefined,
    unsubscribe: undefined,
    publish: undefined,
    ping: undefined,
  };
}

export const EventsStreamRequest = {
  encode(message: EventsStreamRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.correlationId !== undefined) {
      writer.uint32(10).string(message.correlationId);
    }
    if (message.subscribe !== undefined) {
      SubscribePayload.encode(message.subscribe, writer.uint32(802).fork()).ldelim();
    }
    if (message.unsubscribe !== undefined) {
      SubscribePayload.encode(message.unsubscribe, writer.uint32(810).fork()).ldelim();
    }
    if (message.publish !== undefined) {
      PublishEventRequest.encode(message.publish, writer.uint32(818).fork()).ldelim();
    }
    if (message.ping !== undefined) {
      writer.uint32(826).string(message.ping);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): EventsStreamRequest {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseEventsStreamRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.correlationId = reader.string();
          break;
        case 100:
          message.subscribe = SubscribePayload.decode(reader, reader.uint32());
          break;
        case 101:
          message.unsubscribe = SubscribePayload.decode(reader, reader.uint32());
          break;
        case 102:
          message.publish = PublishEventRequest.decode(reader, reader.uint32());
          break;
        case 103:
          message.ping = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): EventsStreamRequest {
    return {
      correlationId: isSet(object.correlationId) ? String(object.correlationId) : undefined,
      subscribe: isSet(object.subscribe) ? SubscribePayload.fromJSON(object.subscribe) : undefined,
      unsubscribe: isSet(object.unsubscribe) ? SubscribePayload.fromJSON(object.unsubscribe) : undefined,
      publish: isSet(object.publish) ? PublishEventRequest.fromJSON(object.publish) : undefined,
      ping: isSet(object.ping) ? String(object.ping) : undefined,
    };
  },

  toJSON(message: EventsStreamRequest): unknown {
    const obj: any = {};
    message.correlationId !== undefined && (obj.correlationId = message.correlationId);
    message.subscribe !== undefined &&
      (obj.subscribe = message.subscribe ? SubscribePayload.toJSON(message.subscribe) : undefined);
    message.unsubscribe !== undefined &&
      (obj.unsubscribe = message.unsubscribe ? SubscribePayload.toJSON(message.unsubscribe) : undefined);
    message.publish !== undefined &&
      (obj.publish = message.publish ? PublishEventRequest.toJSON(message.publish) : undefined);
    message.ping !== undefined && (obj.ping = message.ping);
    return obj;
  },

  fromPartial(object: DeepPartial<EventsStreamRequest>): EventsStreamRequest {
    const message = createBaseEventsStreamRequest();
    message.correlationId = object.correlationId ?? undefined;
    message.subscribe = (object.subscribe !== undefined && object.subscribe !== null)
      ? SubscribePayload.fromPartial(object.subscribe)
      : undefined;
    message.unsubscribe = (object.unsubscribe !== undefined && object.unsubscribe !== null)
      ? SubscribePayload.fromPartial(object.unsubscribe)
      : undefined;
    message.publish = (object.publish !== undefined && object.publish !== null)
      ? PublishEventRequest.fromPartial(object.publish)
      : undefined;
    message.ping = object.ping ?? undefined;
    return message;
  },
};

function createBaseEventsStreamResponse(): EventsStreamResponse {
  return {
    correlationId: undefined,
    sessionId: undefined,
    event: undefined,
    pong: undefined,
    error: undefined,
    subscribed: undefined,
    unsubscribed: undefined,
    published: undefined,
    reconnectBefore: undefined,
  };
}

export const EventsStreamResponse = {
  encode(message: EventsStreamResponse, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.correlationId !== undefined) {
      writer.uint32(18).string(message.correlationId);
    }
    if (message.sessionId !== undefined) {
      writer.uint32(26).string(message.sessionId);
    }
    if (message.event !== undefined) {
      PublishEventResponse.encode(message.event, writer.uint32(802).fork()).ldelim();
    }
    if (message.pong !== undefined) {
      writer.uint32(1602).string(message.pong);
    }
    if (message.error !== undefined) {
      EventsStreamError.encode(message.error, writer.uint32(1610).fork()).ldelim();
    }
    if (message.subscribed !== undefined) {
      SubscribePayload.encode(message.subscribed, writer.uint32(1618).fork()).ldelim();
    }
    if (message.unsubscribed !== undefined) {
      SubscribePayload.encode(message.unsubscribed, writer.uint32(1626).fork()).ldelim();
    }
    if (message.published !== undefined) {
      PublishEventResponse.encode(message.published, writer.uint32(1634).fork()).ldelim();
    }
    if (message.reconnectBefore !== undefined) {
      EventsStreamReconnectRequest.encode(message.reconnectBefore, writer.uint32(1642).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): EventsStreamResponse {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseEventsStreamResponse();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 2:
          message.correlationId = reader.string();
          break;
        case 3:
          message.sessionId = reader.string();
          break;
        case 100:
          message.event = PublishEventResponse.decode(reader, reader.uint32());
          break;
        case 200:
          message.pong = reader.string();
          break;
        case 201:
          message.error = EventsStreamError.decode(reader, reader.uint32());
          break;
        case 202:
          message.subscribed = SubscribePayload.decode(reader, reader.uint32());
          break;
        case 203:
          message.unsubscribed = SubscribePayload.decode(reader, reader.uint32());
          break;
        case 204:
          message.published = PublishEventResponse.decode(reader, reader.uint32());
          break;
        case 205:
          message.reconnectBefore = EventsStreamReconnectRequest.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): EventsStreamResponse {
    return {
      correlationId: isSet(object.correlationId) ? String(object.correlationId) : undefined,
      sessionId: isSet(object.sessionId) ? String(object.sessionId) : undefined,
      event: isSet(object.event) ? PublishEventResponse.fromJSON(object.event) : undefined,
      pong: isSet(object.pong) ? String(object.pong) : undefined,
      error: isSet(object.error) ? EventsStreamError.fromJSON(object.error) : undefined,
      subscribed: isSet(object.subscribed) ? SubscribePayload.fromJSON(object.subscribed) : undefined,
      unsubscribed: isSet(object.unsubscribed) ? SubscribePayload.fromJSON(object.unsubscribed) : undefined,
      published: isSet(object.published) ? PublishEventResponse.fromJSON(object.published) : undefined,
      reconnectBefore: isSet(object.reconnectBefore)
        ? EventsStreamReconnectRequest.fromJSON(object.reconnectBefore)
        : undefined,
    };
  },

  toJSON(message: EventsStreamResponse): unknown {
    const obj: any = {};
    message.correlationId !== undefined && (obj.correlationId = message.correlationId);
    message.sessionId !== undefined && (obj.sessionId = message.sessionId);
    message.event !== undefined && (obj.event = message.event ? PublishEventResponse.toJSON(message.event) : undefined);
    message.pong !== undefined && (obj.pong = message.pong);
    message.error !== undefined && (obj.error = message.error ? EventsStreamError.toJSON(message.error) : undefined);
    message.subscribed !== undefined &&
      (obj.subscribed = message.subscribed ? SubscribePayload.toJSON(message.subscribed) : undefined);
    message.unsubscribed !== undefined &&
      (obj.unsubscribed = message.unsubscribed ? SubscribePayload.toJSON(message.unsubscribed) : undefined);
    message.published !== undefined &&
      (obj.published = message.published ? PublishEventResponse.toJSON(message.published) : undefined);
    message.reconnectBefore !== undefined && (obj.reconnectBefore = message.reconnectBefore
      ? EventsStreamReconnectRequest.toJSON(message.reconnectBefore)
      : undefined);
    return obj;
  },

  fromPartial(object: DeepPartial<EventsStreamResponse>): EventsStreamResponse {
    const message = createBaseEventsStreamResponse();
    message.correlationId = object.correlationId ?? undefined;
    message.sessionId = object.sessionId ?? undefined;
    message.event = (object.event !== undefined && object.event !== null)
      ? PublishEventResponse.fromPartial(object.event)
      : undefined;
    message.pong = object.pong ?? undefined;
    message.error = (object.error !== undefined && object.error !== null)
      ? EventsStreamError.fromPartial(object.error)
      : undefined;
    message.subscribed = (object.subscribed !== undefined && object.subscribed !== null)
      ? SubscribePayload.fromPartial(object.subscribed)
      : undefined;
    message.unsubscribed = (object.unsubscribed !== undefined && object.unsubscribed !== null)
      ? SubscribePayload.fromPartial(object.unsubscribed)
      : undefined;
    message.published = (object.published !== undefined && object.published !== null)
      ? PublishEventResponse.fromPartial(object.published)
      : undefined;
    message.reconnectBefore = (object.reconnectBefore !== undefined && object.reconnectBefore !== null)
      ? EventsStreamReconnectRequest.fromPartial(object.reconnectBefore)
      : undefined;
    return message;
  },
};

/**
 * The event API provides a mechanism for you to subscribe and publish events between
 * your backend services and the composition, as well as receive events from the live and layout api.
 */
export interface EventService {
  /**
   * Stream Events
   * buf:lint:ignore RPC_REQUEST_STANDARD_NAME
   * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
   */
  Stream(request: Observable<EventsStreamRequest>): Observable<EventsStreamResponse>;
  /**
   * Publish Event
   * buf:lint:ignore RPC_REQUEST_STANDARD_NAME
   * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
   */
  Publish(request: PublishEventRequest): Promise<PublishEventResponse>;
}

export class EventServiceClientImpl implements EventService {
  private readonly rpc: Rpc;
  private readonly service: string;
  constructor(rpc: Rpc, opts?: { service?: string }) {
    this.service = opts?.service || "apis.event.v2.EventService";
    this.rpc = rpc;
    this.Stream = this.Stream.bind(this);
    this.Publish = this.Publish.bind(this);
  }
  Stream(request: Observable<EventsStreamRequest>): Observable<EventsStreamResponse> {
    const data = request.pipe(map((request) => EventsStreamRequest.encode(request).finish()));
    const result = this.rpc.bidirectionalStreamingRequest(this.service, "Stream", data);
    return result.pipe(map((data) => EventsStreamResponse.decode(new _m0.Reader(data))));
  }

  Publish(request: PublishEventRequest): Promise<PublishEventResponse> {
    const data = PublishEventRequest.encode(request).finish();
    const promise = this.rpc.request(this.service, "Publish", data);
    return promise.then((data) => PublishEventResponse.decode(new _m0.Reader(data)));
  }
}

/**
 * The event API provides a mechanism for you to subscribe and publish events between
 * your backend services and the composition, as well as receive events from the live and layout api.
 */
export type EventServiceDefinition = typeof EventServiceDefinition;
export const EventServiceDefinition = {
  name: "EventService",
  fullName: "apis.event.v2.EventService",
  methods: {
    /**
     * Stream Events
     * buf:lint:ignore RPC_REQUEST_STANDARD_NAME
     * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
     */
    stream: {
      name: "Stream",
      requestType: EventsStreamRequest,
      requestStream: true,
      responseType: EventsStreamResponse,
      responseStream: true,
      options: {},
    },
    /**
     * Publish Event
     * buf:lint:ignore RPC_REQUEST_STANDARD_NAME
     * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
     */
    publish: {
      name: "Publish",
      requestType: PublishEventRequest,
      requestStream: false,
      responseType: PublishEventResponse,
      responseStream: false,
      options: {},
    },
  },
} as const;

interface Rpc {
  request(service: string, method: string, data: Uint8Array): Promise<Uint8Array>;
  clientStreamingRequest(service: string, method: string, data: Observable<Uint8Array>): Promise<Uint8Array>;
  serverStreamingRequest(service: string, method: string, data: Uint8Array): Observable<Uint8Array>;
  bidirectionalStreamingRequest(service: string, method: string, data: Observable<Uint8Array>): Observable<Uint8Array>;
}

declare var self: any | undefined;
declare var window: any | undefined;
declare var global: any | undefined;
var tsProtoGlobalThis: any = (() => {
  if (typeof globalThis !== "undefined") {
    return globalThis;
  }
  if (typeof self !== "undefined") {
    return self;
  }
  if (typeof window !== "undefined") {
    return window;
  }
  if (typeof global !== "undefined") {
    return global;
  }
  throw "Unable to locate global object";
})();

type Builtin = Date | Function | Uint8Array | string | number | boolean | undefined;

export type DeepPartial<T> = T extends Builtin ? T
  : T extends Array<infer U> ? Array<DeepPartial<U>> : T extends ReadonlyArray<infer U> ? ReadonlyArray<DeepPartial<U>>
  : T extends {} ? { [K in keyof T]?: DeepPartial<T[K]> }
  : Partial<T>;

function isObject(value: any): boolean {
  return typeof value === "object" && value !== null;
}

function isSet(value: any): boolean {
  return value !== null && value !== undefined;
}
