/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
/* eslint-disable */
import _m0 from "protobufjs/minimal";
import { Observable } from "rxjs";
import { map } from "rxjs/operators";
import { Struct, Value } from "../../../google/protobuf/struct";
import { Timestamp } from "../../../google/protobuf/timestamp";

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

export interface ServiceEventTarget {
  /**
   * Subscribe to events in a given collection.
   * this is deprecated, prefer `service_user_id`.
   */
  userId?:
    | string
    | undefined;
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
  layoutId?:
    | string
    | undefined;
  /** Subscribe to events by a given user, this takes priority over user_id */
  serviceUserId?: string | undefined;
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

export interface WebhookSubscription {
  /** Subscription identifier */
  webhookId: string;
  /** Event name to subscribe to for custom events, this can be a wildcard `my_service:*` */
  events: string[];
  /** The target to subscribe to. If not defined, all events will be sent. */
  target?:
    | ServiceEventTarget
    | undefined;
  /** The URL to send the event to. */
  url: string;
  timeoutMs?: number | undefined;
}

export interface ListWebhookSubscriptionsRequest {
  /** The target to filter by. */
  target?: ServiceEventTarget | undefined;
}

export interface ListWebhookSubscriptionsResponse {
  subscriptions: WebhookSubscription[];
}

export interface CreateWebhookSubscriptionRequest {
  /** Event's to subscribe to for custom events, this can be a wildcard `my_service:*` */
  events: string[];
  /** The target to subscribe to. If not defined, all events will be sent. */
  target?:
    | ServiceEventTarget
    | undefined;
  /** The URL to send the event to. */
  url: string;
  timeoutMs?: number | undefined;
}

export interface CreateWebhookSubscriptionResponse {
  subscription: WebhookSubscription | undefined;
}

export interface DeleteWebhookSubscriptionRequest {
  /** The webhook subscription identifier. */
  webhookId: string;
}

export interface DeleteWebhookSubscriptionResponse {
}

/** Payload to subscribe or unsubscribe from an event */
export interface SubscribePayload {
  /**
   * Event name to subscribe to for custom events.
   * This can be a wildcard `my_service:*` or multiple events `my_event|my_other_event`. This is deprecated, prefer `events`.
   */
  name: string;
  /** Event name to subscribe to for custom events, this can be a wildcard `my_service:*` */
  events: string[];
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

export interface GetEventsQuery {
  /** Defaults to 100 */
  limit: number;
  /** Defaults to CREATED_AT_DESC */
  order: GetEventsQuery_PaginationOrder;
  events: string[];
  /** The target to filter by. */
  target?:
    | GetEventsQuery_Target
    | undefined;
  /** Defaults to 1 day ago */
  afterTimestamp?:
    | string
    | undefined;
  /** Defaults to now */
  beforeTimestamp?: string | undefined;
}

export enum GetEventsQuery_PaginationOrder {
  PAGINATION_ORDER_UNSPECIFIED = "PAGINATION_ORDER_UNSPECIFIED",
  PAGINATION_ORDER_CREATED_AT_DESC = "PAGINATION_ORDER_CREATED_AT_DESC",
  PAGINATION_ORDER_CREATED_AT_ASC = "PAGINATION_ORDER_CREATED_AT_ASC",
}

export function getEventsQuery_PaginationOrderFromJSON(object: any): GetEventsQuery_PaginationOrder {
  switch (object) {
    case 0:
    case "PAGINATION_ORDER_UNSPECIFIED":
      return GetEventsQuery_PaginationOrder.PAGINATION_ORDER_UNSPECIFIED;
    case 1:
    case "PAGINATION_ORDER_CREATED_AT_DESC":
      return GetEventsQuery_PaginationOrder.PAGINATION_ORDER_CREATED_AT_DESC;
    case 2:
    case "PAGINATION_ORDER_CREATED_AT_ASC":
      return GetEventsQuery_PaginationOrder.PAGINATION_ORDER_CREATED_AT_ASC;
    default:
      throw new tsProtoGlobalThis.Error(
        "Unrecognized enum value " + object + " for enum GetEventsQuery_PaginationOrder",
      );
  }
}

export function getEventsQuery_PaginationOrderToJSON(object: GetEventsQuery_PaginationOrder): string {
  switch (object) {
    case GetEventsQuery_PaginationOrder.PAGINATION_ORDER_UNSPECIFIED:
      return "PAGINATION_ORDER_UNSPECIFIED";
    case GetEventsQuery_PaginationOrder.PAGINATION_ORDER_CREATED_AT_DESC:
      return "PAGINATION_ORDER_CREATED_AT_DESC";
    case GetEventsQuery_PaginationOrder.PAGINATION_ORDER_CREATED_AT_ASC:
      return "PAGINATION_ORDER_CREATED_AT_ASC";
    default:
      throw new tsProtoGlobalThis.Error(
        "Unrecognized enum value " + object + " for enum GetEventsQuery_PaginationOrder",
      );
  }
}

export function getEventsQuery_PaginationOrderToNumber(object: GetEventsQuery_PaginationOrder): number {
  switch (object) {
    case GetEventsQuery_PaginationOrder.PAGINATION_ORDER_UNSPECIFIED:
      return 0;
    case GetEventsQuery_PaginationOrder.PAGINATION_ORDER_CREATED_AT_DESC:
      return 1;
    case GetEventsQuery_PaginationOrder.PAGINATION_ORDER_CREATED_AT_ASC:
      return 2;
    default:
      throw new tsProtoGlobalThis.Error(
        "Unrecognized enum value " + object + " for enum GetEventsQuery_PaginationOrder",
      );
  }
}

export interface GetEventsQuery_TargetValue {
  value: string;
  /**
   * By default this is assumed to be true, if set to false any events that aren't explicitly targetted will be included.
   * E.g you want to receive all events for a layout, but also want to receive broadcast events (only scoped to the project).
   */
  explicitOnly: boolean;
}

export interface GetEventsQuery_Target {
  serviceUserId?: GetEventsQuery_TargetValue | undefined;
  collectionId?: GetEventsQuery_TargetValue | undefined;
  projectId?: GetEventsQuery_TargetValue | undefined;
  layoutId?: GetEventsQuery_TargetValue | undefined;
}

export interface GetEventsRequest {
  cursor?: string | undefined;
  query?: GetEventsQuery | undefined;
}

export interface GetEventsResponse {
  events: Event[];
  nextCursor?: string | undefined;
}

/** A representation of an event */
export interface Event {
  /** Name of the event. */
  name: string;
  /** Value of the event. */
  payload:
    | { [key: string]: any }
    | undefined;
  /** Custom scoping parameters. */
  target?:
    | ServiceEventTarget
    | undefined;
  /** Metadata associated with the publishing of the event */
  requestMetadata?:
    | any
    | undefined;
  /** Internal ID of the event. */
  id: string;
  /** The time the event was first published. */
  publishedAt: string | undefined;
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

function createBaseServiceEventTarget(): ServiceEventTarget {
  return {
    userId: undefined,
    collectionId: undefined,
    projectId: undefined,
    layoutId: undefined,
    serviceUserId: undefined,
  };
}

export const ServiceEventTarget = {
  encode(message: ServiceEventTarget, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.userId !== undefined) {
      writer.uint32(10).string(message.userId);
    }
    if (message.collectionId !== undefined) {
      writer.uint32(18).string(message.collectionId);
    }
    if (message.projectId !== undefined) {
      writer.uint32(26).string(message.projectId);
    }
    if (message.layoutId !== undefined) {
      writer.uint32(34).string(message.layoutId);
    }
    if (message.serviceUserId !== undefined) {
      writer.uint32(42).string(message.serviceUserId);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): ServiceEventTarget {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseServiceEventTarget();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.userId = reader.string();
          break;
        case 2:
          message.collectionId = reader.string();
          break;
        case 3:
          message.projectId = reader.string();
          break;
        case 4:
          message.layoutId = reader.string();
          break;
        case 5:
          message.serviceUserId = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): ServiceEventTarget {
    return {
      userId: isSet(object.userId) ? String(object.userId) : undefined,
      collectionId: isSet(object.collectionId) ? String(object.collectionId) : undefined,
      projectId: isSet(object.projectId) ? String(object.projectId) : undefined,
      layoutId: isSet(object.layoutId) ? String(object.layoutId) : undefined,
      serviceUserId: isSet(object.serviceUserId) ? String(object.serviceUserId) : undefined,
    };
  },

  toJSON(message: ServiceEventTarget): unknown {
    const obj: any = {};
    message.userId !== undefined && (obj.userId = message.userId);
    message.collectionId !== undefined && (obj.collectionId = message.collectionId);
    message.projectId !== undefined && (obj.projectId = message.projectId);
    message.layoutId !== undefined && (obj.layoutId = message.layoutId);
    message.serviceUserId !== undefined && (obj.serviceUserId = message.serviceUserId);
    return obj;
  },

  fromPartial(object: DeepPartial<ServiceEventTarget>): ServiceEventTarget {
    const message = createBaseServiceEventTarget();
    message.userId = object.userId ?? undefined;
    message.collectionId = object.collectionId ?? undefined;
    message.projectId = object.projectId ?? undefined;
    message.layoutId = object.layoutId ?? undefined;
    message.serviceUserId = object.serviceUserId ?? undefined;
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

function createBaseWebhookSubscription(): WebhookSubscription {
  return { webhookId: "", events: [], target: undefined, url: "", timeoutMs: undefined };
}

export const WebhookSubscription = {
  encode(message: WebhookSubscription, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.webhookId !== "") {
      writer.uint32(10).string(message.webhookId);
    }
    for (const v of message.events) {
      writer.uint32(18).string(v!);
    }
    if (message.target !== undefined) {
      ServiceEventTarget.encode(message.target, writer.uint32(26).fork()).ldelim();
    }
    if (message.url !== "") {
      writer.uint32(34).string(message.url);
    }
    if (message.timeoutMs !== undefined) {
      writer.uint32(40).uint32(message.timeoutMs);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): WebhookSubscription {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseWebhookSubscription();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.webhookId = reader.string();
          break;
        case 2:
          message.events.push(reader.string());
          break;
        case 3:
          message.target = ServiceEventTarget.decode(reader, reader.uint32());
          break;
        case 4:
          message.url = reader.string();
          break;
        case 5:
          message.timeoutMs = reader.uint32();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): WebhookSubscription {
    return {
      webhookId: isSet(object.webhookId) ? String(object.webhookId) : "",
      events: Array.isArray(object?.events) ? object.events.map((e: any) => String(e)) : [],
      target: isSet(object.target) ? ServiceEventTarget.fromJSON(object.target) : undefined,
      url: isSet(object.url) ? String(object.url) : "",
      timeoutMs: isSet(object.timeoutMs) ? Number(object.timeoutMs) : undefined,
    };
  },

  toJSON(message: WebhookSubscription): unknown {
    const obj: any = {};
    message.webhookId !== undefined && (obj.webhookId = message.webhookId);
    if (message.events) {
      obj.events = message.events.map((e) => e);
    } else {
      obj.events = [];
    }
    message.target !== undefined &&
      (obj.target = message.target ? ServiceEventTarget.toJSON(message.target) : undefined);
    message.url !== undefined && (obj.url = message.url);
    message.timeoutMs !== undefined && (obj.timeoutMs = Math.round(message.timeoutMs));
    return obj;
  },

  fromPartial(object: DeepPartial<WebhookSubscription>): WebhookSubscription {
    const message = createBaseWebhookSubscription();
    message.webhookId = object.webhookId ?? "";
    message.events = object.events?.map((e) => e) || [];
    message.target = (object.target !== undefined && object.target !== null)
      ? ServiceEventTarget.fromPartial(object.target)
      : undefined;
    message.url = object.url ?? "";
    message.timeoutMs = object.timeoutMs ?? undefined;
    return message;
  },
};

function createBaseListWebhookSubscriptionsRequest(): ListWebhookSubscriptionsRequest {
  return { target: undefined };
}

export const ListWebhookSubscriptionsRequest = {
  encode(message: ListWebhookSubscriptionsRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.target !== undefined) {
      ServiceEventTarget.encode(message.target, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): ListWebhookSubscriptionsRequest {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseListWebhookSubscriptionsRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.target = ServiceEventTarget.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): ListWebhookSubscriptionsRequest {
    return { target: isSet(object.target) ? ServiceEventTarget.fromJSON(object.target) : undefined };
  },

  toJSON(message: ListWebhookSubscriptionsRequest): unknown {
    const obj: any = {};
    message.target !== undefined &&
      (obj.target = message.target ? ServiceEventTarget.toJSON(message.target) : undefined);
    return obj;
  },

  fromPartial(object: DeepPartial<ListWebhookSubscriptionsRequest>): ListWebhookSubscriptionsRequest {
    const message = createBaseListWebhookSubscriptionsRequest();
    message.target = (object.target !== undefined && object.target !== null)
      ? ServiceEventTarget.fromPartial(object.target)
      : undefined;
    return message;
  },
};

function createBaseListWebhookSubscriptionsResponse(): ListWebhookSubscriptionsResponse {
  return { subscriptions: [] };
}

export const ListWebhookSubscriptionsResponse = {
  encode(message: ListWebhookSubscriptionsResponse, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    for (const v of message.subscriptions) {
      WebhookSubscription.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): ListWebhookSubscriptionsResponse {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseListWebhookSubscriptionsResponse();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.subscriptions.push(WebhookSubscription.decode(reader, reader.uint32()));
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): ListWebhookSubscriptionsResponse {
    return {
      subscriptions: Array.isArray(object?.subscriptions)
        ? object.subscriptions.map((e: any) => WebhookSubscription.fromJSON(e))
        : [],
    };
  },

  toJSON(message: ListWebhookSubscriptionsResponse): unknown {
    const obj: any = {};
    if (message.subscriptions) {
      obj.subscriptions = message.subscriptions.map((e) => e ? WebhookSubscription.toJSON(e) : undefined);
    } else {
      obj.subscriptions = [];
    }
    return obj;
  },

  fromPartial(object: DeepPartial<ListWebhookSubscriptionsResponse>): ListWebhookSubscriptionsResponse {
    const message = createBaseListWebhookSubscriptionsResponse();
    message.subscriptions = object.subscriptions?.map((e) => WebhookSubscription.fromPartial(e)) || [];
    return message;
  },
};

function createBaseCreateWebhookSubscriptionRequest(): CreateWebhookSubscriptionRequest {
  return { events: [], target: undefined, url: "", timeoutMs: undefined };
}

export const CreateWebhookSubscriptionRequest = {
  encode(message: CreateWebhookSubscriptionRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    for (const v of message.events) {
      writer.uint32(10).string(v!);
    }
    if (message.target !== undefined) {
      ServiceEventTarget.encode(message.target, writer.uint32(18).fork()).ldelim();
    }
    if (message.url !== "") {
      writer.uint32(26).string(message.url);
    }
    if (message.timeoutMs !== undefined) {
      writer.uint32(32).uint32(message.timeoutMs);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): CreateWebhookSubscriptionRequest {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseCreateWebhookSubscriptionRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.events.push(reader.string());
          break;
        case 2:
          message.target = ServiceEventTarget.decode(reader, reader.uint32());
          break;
        case 3:
          message.url = reader.string();
          break;
        case 4:
          message.timeoutMs = reader.uint32();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): CreateWebhookSubscriptionRequest {
    return {
      events: Array.isArray(object?.events) ? object.events.map((e: any) => String(e)) : [],
      target: isSet(object.target) ? ServiceEventTarget.fromJSON(object.target) : undefined,
      url: isSet(object.url) ? String(object.url) : "",
      timeoutMs: isSet(object.timeoutMs) ? Number(object.timeoutMs) : undefined,
    };
  },

  toJSON(message: CreateWebhookSubscriptionRequest): unknown {
    const obj: any = {};
    if (message.events) {
      obj.events = message.events.map((e) => e);
    } else {
      obj.events = [];
    }
    message.target !== undefined &&
      (obj.target = message.target ? ServiceEventTarget.toJSON(message.target) : undefined);
    message.url !== undefined && (obj.url = message.url);
    message.timeoutMs !== undefined && (obj.timeoutMs = Math.round(message.timeoutMs));
    return obj;
  },

  fromPartial(object: DeepPartial<CreateWebhookSubscriptionRequest>): CreateWebhookSubscriptionRequest {
    const message = createBaseCreateWebhookSubscriptionRequest();
    message.events = object.events?.map((e) => e) || [];
    message.target = (object.target !== undefined && object.target !== null)
      ? ServiceEventTarget.fromPartial(object.target)
      : undefined;
    message.url = object.url ?? "";
    message.timeoutMs = object.timeoutMs ?? undefined;
    return message;
  },
};

function createBaseCreateWebhookSubscriptionResponse(): CreateWebhookSubscriptionResponse {
  return { subscription: undefined };
}

export const CreateWebhookSubscriptionResponse = {
  encode(message: CreateWebhookSubscriptionResponse, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.subscription !== undefined) {
      WebhookSubscription.encode(message.subscription, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): CreateWebhookSubscriptionResponse {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseCreateWebhookSubscriptionResponse();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.subscription = WebhookSubscription.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): CreateWebhookSubscriptionResponse {
    return { subscription: isSet(object.subscription) ? WebhookSubscription.fromJSON(object.subscription) : undefined };
  },

  toJSON(message: CreateWebhookSubscriptionResponse): unknown {
    const obj: any = {};
    message.subscription !== undefined &&
      (obj.subscription = message.subscription ? WebhookSubscription.toJSON(message.subscription) : undefined);
    return obj;
  },

  fromPartial(object: DeepPartial<CreateWebhookSubscriptionResponse>): CreateWebhookSubscriptionResponse {
    const message = createBaseCreateWebhookSubscriptionResponse();
    message.subscription = (object.subscription !== undefined && object.subscription !== null)
      ? WebhookSubscription.fromPartial(object.subscription)
      : undefined;
    return message;
  },
};

function createBaseDeleteWebhookSubscriptionRequest(): DeleteWebhookSubscriptionRequest {
  return { webhookId: "" };
}

export const DeleteWebhookSubscriptionRequest = {
  encode(message: DeleteWebhookSubscriptionRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.webhookId !== "") {
      writer.uint32(10).string(message.webhookId);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): DeleteWebhookSubscriptionRequest {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseDeleteWebhookSubscriptionRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.webhookId = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): DeleteWebhookSubscriptionRequest {
    return { webhookId: isSet(object.webhookId) ? String(object.webhookId) : "" };
  },

  toJSON(message: DeleteWebhookSubscriptionRequest): unknown {
    const obj: any = {};
    message.webhookId !== undefined && (obj.webhookId = message.webhookId);
    return obj;
  },

  fromPartial(object: DeepPartial<DeleteWebhookSubscriptionRequest>): DeleteWebhookSubscriptionRequest {
    const message = createBaseDeleteWebhookSubscriptionRequest();
    message.webhookId = object.webhookId ?? "";
    return message;
  },
};

function createBaseDeleteWebhookSubscriptionResponse(): DeleteWebhookSubscriptionResponse {
  return {};
}

export const DeleteWebhookSubscriptionResponse = {
  encode(_: DeleteWebhookSubscriptionResponse, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): DeleteWebhookSubscriptionResponse {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseDeleteWebhookSubscriptionResponse();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(_: any): DeleteWebhookSubscriptionResponse {
    return {};
  },

  toJSON(_: DeleteWebhookSubscriptionResponse): unknown {
    const obj: any = {};
    return obj;
  },

  fromPartial(_: DeepPartial<DeleteWebhookSubscriptionResponse>): DeleteWebhookSubscriptionResponse {
    const message = createBaseDeleteWebhookSubscriptionResponse();
    return message;
  },
};

function createBaseSubscribePayload(): SubscribePayload {
  return { name: "", events: [], target: undefined };
}

export const SubscribePayload = {
  encode(message: SubscribePayload, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.name !== "") {
      writer.uint32(10).string(message.name);
    }
    for (const v of message.events) {
      writer.uint32(26).string(v!);
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
        case 3:
          message.events.push(reader.string());
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
      events: Array.isArray(object?.events) ? object.events.map((e: any) => String(e)) : [],
      target: isSet(object.target) ? EventTarget.fromJSON(object.target) : undefined,
    };
  },

  toJSON(message: SubscribePayload): unknown {
    const obj: any = {};
    message.name !== undefined && (obj.name = message.name);
    if (message.events) {
      obj.events = message.events.map((e) => e);
    } else {
      obj.events = [];
    }
    message.target !== undefined && (obj.target = message.target ? EventTarget.toJSON(message.target) : undefined);
    return obj;
  },

  fromPartial(object: DeepPartial<SubscribePayload>): SubscribePayload {
    const message = createBaseSubscribePayload();
    message.name = object.name ?? "";
    message.events = object.events?.map((e) => e) || [];
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

function createBaseGetEventsQuery(): GetEventsQuery {
  return {
    limit: 0,
    order: GetEventsQuery_PaginationOrder.PAGINATION_ORDER_UNSPECIFIED,
    events: [],
    target: undefined,
    afterTimestamp: undefined,
    beforeTimestamp: undefined,
  };
}

export const GetEventsQuery = {
  encode(message: GetEventsQuery, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.limit !== 0) {
      writer.uint32(8).int32(message.limit);
    }
    if (message.order !== GetEventsQuery_PaginationOrder.PAGINATION_ORDER_UNSPECIFIED) {
      writer.uint32(16).int32(getEventsQuery_PaginationOrderToNumber(message.order));
    }
    for (const v of message.events) {
      writer.uint32(26).string(v!);
    }
    if (message.target !== undefined) {
      GetEventsQuery_Target.encode(message.target, writer.uint32(34).fork()).ldelim();
    }
    if (message.afterTimestamp !== undefined) {
      Timestamp.encode(toTimestamp(message.afterTimestamp), writer.uint32(42).fork()).ldelim();
    }
    if (message.beforeTimestamp !== undefined) {
      Timestamp.encode(toTimestamp(message.beforeTimestamp), writer.uint32(50).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): GetEventsQuery {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseGetEventsQuery();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.limit = reader.int32();
          break;
        case 2:
          message.order = getEventsQuery_PaginationOrderFromJSON(reader.int32());
          break;
        case 3:
          message.events.push(reader.string());
          break;
        case 4:
          message.target = GetEventsQuery_Target.decode(reader, reader.uint32());
          break;
        case 5:
          message.afterTimestamp = fromTimestamp(Timestamp.decode(reader, reader.uint32()));
          break;
        case 6:
          message.beforeTimestamp = fromTimestamp(Timestamp.decode(reader, reader.uint32()));
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetEventsQuery {
    return {
      limit: isSet(object.limit) ? Number(object.limit) : 0,
      order: isSet(object.order)
        ? getEventsQuery_PaginationOrderFromJSON(object.order)
        : GetEventsQuery_PaginationOrder.PAGINATION_ORDER_UNSPECIFIED,
      events: Array.isArray(object?.events) ? object.events.map((e: any) => String(e)) : [],
      target: isSet(object.target) ? GetEventsQuery_Target.fromJSON(object.target) : undefined,
      afterTimestamp: isSet(object.afterTimestamp) ? String(object.afterTimestamp) : undefined,
      beforeTimestamp: isSet(object.beforeTimestamp) ? String(object.beforeTimestamp) : undefined,
    };
  },

  toJSON(message: GetEventsQuery): unknown {
    const obj: any = {};
    message.limit !== undefined && (obj.limit = Math.round(message.limit));
    message.order !== undefined && (obj.order = getEventsQuery_PaginationOrderToJSON(message.order));
    if (message.events) {
      obj.events = message.events.map((e) => e);
    } else {
      obj.events = [];
    }
    message.target !== undefined &&
      (obj.target = message.target ? GetEventsQuery_Target.toJSON(message.target) : undefined);
    message.afterTimestamp !== undefined && (obj.afterTimestamp = message.afterTimestamp);
    message.beforeTimestamp !== undefined && (obj.beforeTimestamp = message.beforeTimestamp);
    return obj;
  },

  fromPartial(object: DeepPartial<GetEventsQuery>): GetEventsQuery {
    const message = createBaseGetEventsQuery();
    message.limit = object.limit ?? 0;
    message.order = object.order ?? GetEventsQuery_PaginationOrder.PAGINATION_ORDER_UNSPECIFIED;
    message.events = object.events?.map((e) => e) || [];
    message.target = (object.target !== undefined && object.target !== null)
      ? GetEventsQuery_Target.fromPartial(object.target)
      : undefined;
    message.afterTimestamp = object.afterTimestamp ?? undefined;
    message.beforeTimestamp = object.beforeTimestamp ?? undefined;
    return message;
  },
};

function createBaseGetEventsQuery_TargetValue(): GetEventsQuery_TargetValue {
  return { value: "", explicitOnly: false };
}

export const GetEventsQuery_TargetValue = {
  encode(message: GetEventsQuery_TargetValue, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.value !== "") {
      writer.uint32(10).string(message.value);
    }
    if (message.explicitOnly === true) {
      writer.uint32(16).bool(message.explicitOnly);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): GetEventsQuery_TargetValue {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseGetEventsQuery_TargetValue();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.value = reader.string();
          break;
        case 2:
          message.explicitOnly = reader.bool();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetEventsQuery_TargetValue {
    return {
      value: isSet(object.value) ? String(object.value) : "",
      explicitOnly: isSet(object.explicitOnly) ? Boolean(object.explicitOnly) : false,
    };
  },

  toJSON(message: GetEventsQuery_TargetValue): unknown {
    const obj: any = {};
    message.value !== undefined && (obj.value = message.value);
    message.explicitOnly !== undefined && (obj.explicitOnly = message.explicitOnly);
    return obj;
  },

  fromPartial(object: DeepPartial<GetEventsQuery_TargetValue>): GetEventsQuery_TargetValue {
    const message = createBaseGetEventsQuery_TargetValue();
    message.value = object.value ?? "";
    message.explicitOnly = object.explicitOnly ?? false;
    return message;
  },
};

function createBaseGetEventsQuery_Target(): GetEventsQuery_Target {
  return { serviceUserId: undefined, collectionId: undefined, projectId: undefined, layoutId: undefined };
}

export const GetEventsQuery_Target = {
  encode(message: GetEventsQuery_Target, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.serviceUserId !== undefined) {
      GetEventsQuery_TargetValue.encode(message.serviceUserId, writer.uint32(10).fork()).ldelim();
    }
    if (message.collectionId !== undefined) {
      GetEventsQuery_TargetValue.encode(message.collectionId, writer.uint32(18).fork()).ldelim();
    }
    if (message.projectId !== undefined) {
      GetEventsQuery_TargetValue.encode(message.projectId, writer.uint32(26).fork()).ldelim();
    }
    if (message.layoutId !== undefined) {
      GetEventsQuery_TargetValue.encode(message.layoutId, writer.uint32(34).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): GetEventsQuery_Target {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseGetEventsQuery_Target();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.serviceUserId = GetEventsQuery_TargetValue.decode(reader, reader.uint32());
          break;
        case 2:
          message.collectionId = GetEventsQuery_TargetValue.decode(reader, reader.uint32());
          break;
        case 3:
          message.projectId = GetEventsQuery_TargetValue.decode(reader, reader.uint32());
          break;
        case 4:
          message.layoutId = GetEventsQuery_TargetValue.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetEventsQuery_Target {
    return {
      serviceUserId: isSet(object.serviceUserId)
        ? GetEventsQuery_TargetValue.fromJSON(object.serviceUserId)
        : undefined,
      collectionId: isSet(object.collectionId) ? GetEventsQuery_TargetValue.fromJSON(object.collectionId) : undefined,
      projectId: isSet(object.projectId) ? GetEventsQuery_TargetValue.fromJSON(object.projectId) : undefined,
      layoutId: isSet(object.layoutId) ? GetEventsQuery_TargetValue.fromJSON(object.layoutId) : undefined,
    };
  },

  toJSON(message: GetEventsQuery_Target): unknown {
    const obj: any = {};
    message.serviceUserId !== undefined &&
      (obj.serviceUserId = message.serviceUserId
        ? GetEventsQuery_TargetValue.toJSON(message.serviceUserId)
        : undefined);
    message.collectionId !== undefined &&
      (obj.collectionId = message.collectionId ? GetEventsQuery_TargetValue.toJSON(message.collectionId) : undefined);
    message.projectId !== undefined &&
      (obj.projectId = message.projectId ? GetEventsQuery_TargetValue.toJSON(message.projectId) : undefined);
    message.layoutId !== undefined &&
      (obj.layoutId = message.layoutId ? GetEventsQuery_TargetValue.toJSON(message.layoutId) : undefined);
    return obj;
  },

  fromPartial(object: DeepPartial<GetEventsQuery_Target>): GetEventsQuery_Target {
    const message = createBaseGetEventsQuery_Target();
    message.serviceUserId = (object.serviceUserId !== undefined && object.serviceUserId !== null)
      ? GetEventsQuery_TargetValue.fromPartial(object.serviceUserId)
      : undefined;
    message.collectionId = (object.collectionId !== undefined && object.collectionId !== null)
      ? GetEventsQuery_TargetValue.fromPartial(object.collectionId)
      : undefined;
    message.projectId = (object.projectId !== undefined && object.projectId !== null)
      ? GetEventsQuery_TargetValue.fromPartial(object.projectId)
      : undefined;
    message.layoutId = (object.layoutId !== undefined && object.layoutId !== null)
      ? GetEventsQuery_TargetValue.fromPartial(object.layoutId)
      : undefined;
    return message;
  },
};

function createBaseGetEventsRequest(): GetEventsRequest {
  return { cursor: undefined, query: undefined };
}

export const GetEventsRequest = {
  encode(message: GetEventsRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.cursor !== undefined) {
      writer.uint32(10).string(message.cursor);
    }
    if (message.query !== undefined) {
      GetEventsQuery.encode(message.query, writer.uint32(18).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): GetEventsRequest {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseGetEventsRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.cursor = reader.string();
          break;
        case 2:
          message.query = GetEventsQuery.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetEventsRequest {
    return {
      cursor: isSet(object.cursor) ? String(object.cursor) : undefined,
      query: isSet(object.query) ? GetEventsQuery.fromJSON(object.query) : undefined,
    };
  },

  toJSON(message: GetEventsRequest): unknown {
    const obj: any = {};
    message.cursor !== undefined && (obj.cursor = message.cursor);
    message.query !== undefined && (obj.query = message.query ? GetEventsQuery.toJSON(message.query) : undefined);
    return obj;
  },

  fromPartial(object: DeepPartial<GetEventsRequest>): GetEventsRequest {
    const message = createBaseGetEventsRequest();
    message.cursor = object.cursor ?? undefined;
    message.query = (object.query !== undefined && object.query !== null)
      ? GetEventsQuery.fromPartial(object.query)
      : undefined;
    return message;
  },
};

function createBaseGetEventsResponse(): GetEventsResponse {
  return { events: [], nextCursor: undefined };
}

export const GetEventsResponse = {
  encode(message: GetEventsResponse, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    for (const v of message.events) {
      Event.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    if (message.nextCursor !== undefined) {
      writer.uint32(18).string(message.nextCursor);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): GetEventsResponse {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseGetEventsResponse();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.events.push(Event.decode(reader, reader.uint32()));
          break;
        case 2:
          message.nextCursor = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetEventsResponse {
    return {
      events: Array.isArray(object?.events) ? object.events.map((e: any) => Event.fromJSON(e)) : [],
      nextCursor: isSet(object.nextCursor) ? String(object.nextCursor) : undefined,
    };
  },

  toJSON(message: GetEventsResponse): unknown {
    const obj: any = {};
    if (message.events) {
      obj.events = message.events.map((e) => e ? Event.toJSON(e) : undefined);
    } else {
      obj.events = [];
    }
    message.nextCursor !== undefined && (obj.nextCursor = message.nextCursor);
    return obj;
  },

  fromPartial(object: DeepPartial<GetEventsResponse>): GetEventsResponse {
    const message = createBaseGetEventsResponse();
    message.events = object.events?.map((e) => Event.fromPartial(e)) || [];
    message.nextCursor = object.nextCursor ?? undefined;
    return message;
  },
};

function createBaseEvent(): Event {
  return {
    name: "",
    payload: undefined,
    target: undefined,
    requestMetadata: undefined,
    id: "",
    publishedAt: undefined,
  };
}

export const Event = {
  encode(message: Event, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.name !== "") {
      writer.uint32(10).string(message.name);
    }
    if (message.payload !== undefined) {
      Struct.encode(Struct.wrap(message.payload), writer.uint32(18).fork()).ldelim();
    }
    if (message.target !== undefined) {
      ServiceEventTarget.encode(message.target, writer.uint32(26).fork()).ldelim();
    }
    if (message.requestMetadata !== undefined) {
      Value.encode(Value.wrap(message.requestMetadata), writer.uint32(34).fork()).ldelim();
    }
    if (message.id !== "") {
      writer.uint32(42).string(message.id);
    }
    if (message.publishedAt !== undefined) {
      Timestamp.encode(toTimestamp(message.publishedAt), writer.uint32(50).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): Event {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseEvent();
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
          message.target = ServiceEventTarget.decode(reader, reader.uint32());
          break;
        case 4:
          message.requestMetadata = Value.unwrap(Value.decode(reader, reader.uint32()));
          break;
        case 5:
          message.id = reader.string();
          break;
        case 6:
          message.publishedAt = fromTimestamp(Timestamp.decode(reader, reader.uint32()));
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): Event {
    return {
      name: isSet(object.name) ? String(object.name) : "",
      payload: isObject(object.payload) ? object.payload : undefined,
      target: isSet(object.target) ? ServiceEventTarget.fromJSON(object.target) : undefined,
      requestMetadata: isSet(object?.requestMetadata) ? object.requestMetadata : undefined,
      id: isSet(object.id) ? String(object.id) : "",
      publishedAt: isSet(object.publishedAt) ? String(object.publishedAt) : undefined,
    };
  },

  toJSON(message: Event): unknown {
    const obj: any = {};
    message.name !== undefined && (obj.name = message.name);
    message.payload !== undefined && (obj.payload = message.payload);
    message.target !== undefined &&
      (obj.target = message.target ? ServiceEventTarget.toJSON(message.target) : undefined);
    message.requestMetadata !== undefined && (obj.requestMetadata = message.requestMetadata);
    message.id !== undefined && (obj.id = message.id);
    message.publishedAt !== undefined && (obj.publishedAt = message.publishedAt);
    return obj;
  },

  fromPartial(object: DeepPartial<Event>): Event {
    const message = createBaseEvent();
    message.name = object.name ?? "";
    message.payload = object.payload ?? undefined;
    message.target = (object.target !== undefined && object.target !== null)
      ? ServiceEventTarget.fromPartial(object.target)
      : undefined;
    message.requestMetadata = object.requestMetadata ?? undefined;
    message.id = object.id ?? "";
    message.publishedAt = object.publishedAt ?? undefined;
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

/** Webhook service for managing subscriptions */
export interface WebhookService {
  /** List all webhook subscriptions. */
  ListWebhookSubscriptions(request: ListWebhookSubscriptionsRequest): Promise<ListWebhookSubscriptionsResponse>;
  /** Create a new webhook subscription. */
  CreateWebhookSubscription(request: CreateWebhookSubscriptionRequest): Promise<CreateWebhookSubscriptionResponse>;
  /**
   * Delete a webhook subscription.
   * Existing events queued will be delivered before the subscription is removed.
   */
  DeleteWebhookSubscription(request: DeleteWebhookSubscriptionRequest): Promise<DeleteWebhookSubscriptionResponse>;
}

export class WebhookServiceClientImpl implements WebhookService {
  private readonly rpc: Rpc;
  private readonly service: string;
  constructor(rpc: Rpc, opts?: { service?: string }) {
    this.service = opts?.service || "apis.event.v2.WebhookService";
    this.rpc = rpc;
    this.ListWebhookSubscriptions = this.ListWebhookSubscriptions.bind(this);
    this.CreateWebhookSubscription = this.CreateWebhookSubscription.bind(this);
    this.DeleteWebhookSubscription = this.DeleteWebhookSubscription.bind(this);
  }
  ListWebhookSubscriptions(request: ListWebhookSubscriptionsRequest): Promise<ListWebhookSubscriptionsResponse> {
    const data = ListWebhookSubscriptionsRequest.encode(request).finish();
    const promise = this.rpc.request(this.service, "ListWebhookSubscriptions", data);
    return promise.then((data) => ListWebhookSubscriptionsResponse.decode(new _m0.Reader(data)));
  }

  CreateWebhookSubscription(request: CreateWebhookSubscriptionRequest): Promise<CreateWebhookSubscriptionResponse> {
    const data = CreateWebhookSubscriptionRequest.encode(request).finish();
    const promise = this.rpc.request(this.service, "CreateWebhookSubscription", data);
    return promise.then((data) => CreateWebhookSubscriptionResponse.decode(new _m0.Reader(data)));
  }

  DeleteWebhookSubscription(request: DeleteWebhookSubscriptionRequest): Promise<DeleteWebhookSubscriptionResponse> {
    const data = DeleteWebhookSubscriptionRequest.encode(request).finish();
    const promise = this.rpc.request(this.service, "DeleteWebhookSubscription", data);
    return promise.then((data) => DeleteWebhookSubscriptionResponse.decode(new _m0.Reader(data)));
  }
}

/** Webhook service for managing subscriptions */
export type WebhookServiceDefinition = typeof WebhookServiceDefinition;
export const WebhookServiceDefinition = {
  name: "WebhookService",
  fullName: "apis.event.v2.WebhookService",
  methods: {
    /** List all webhook subscriptions. */
    listWebhookSubscriptions: {
      name: "ListWebhookSubscriptions",
      requestType: ListWebhookSubscriptionsRequest,
      requestStream: false,
      responseType: ListWebhookSubscriptionsResponse,
      responseStream: false,
      options: {},
    },
    /** Create a new webhook subscription. */
    createWebhookSubscription: {
      name: "CreateWebhookSubscription",
      requestType: CreateWebhookSubscriptionRequest,
      requestStream: false,
      responseType: CreateWebhookSubscriptionResponse,
      responseStream: false,
      options: {},
    },
    /**
     * Delete a webhook subscription.
     * Existing events queued will be delivered before the subscription is removed.
     */
    deleteWebhookSubscription: {
      name: "DeleteWebhookSubscription",
      requestType: DeleteWebhookSubscriptionRequest,
      requestStream: false,
      responseType: DeleteWebhookSubscriptionResponse,
      responseStream: false,
      options: {},
    },
  },
} as const;

export interface HistoryService {
  GetEvents(request: GetEventsRequest): Promise<GetEventsResponse>;
}

export class HistoryServiceClientImpl implements HistoryService {
  private readonly rpc: Rpc;
  private readonly service: string;
  constructor(rpc: Rpc, opts?: { service?: string }) {
    this.service = opts?.service || "apis.event.v2.HistoryService";
    this.rpc = rpc;
    this.GetEvents = this.GetEvents.bind(this);
  }
  GetEvents(request: GetEventsRequest): Promise<GetEventsResponse> {
    const data = GetEventsRequest.encode(request).finish();
    const promise = this.rpc.request(this.service, "GetEvents", data);
    return promise.then((data) => GetEventsResponse.decode(new _m0.Reader(data)));
  }
}

export type HistoryServiceDefinition = typeof HistoryServiceDefinition;
export const HistoryServiceDefinition = {
  name: "HistoryService",
  fullName: "apis.event.v2.HistoryService",
  methods: {
    getEvents: {
      name: "GetEvents",
      requestType: GetEventsRequest,
      requestStream: false,
      responseType: GetEventsResponse,
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

function toTimestamp(dateStr: string): Timestamp {
  const date = new Date(dateStr);
  const seconds = date.getTime() / 1_000;
  const nanos = (date.getTime() % 1_000) * 1_000_000;
  return { seconds, nanos };
}

function fromTimestamp(t: Timestamp): string {
  let millis = t.seconds * 1_000;
  millis += t.nanos / 1_000_000;
  return new Date(millis).toISOString();
}

function isObject(value: any): boolean {
  return typeof value === "object" && value !== null;
}

function isSet(value: any): boolean {
  return value !== null && value !== undefined;
}
