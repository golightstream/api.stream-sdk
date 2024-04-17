/* ---------------------------------------------------------------------------------------------
 * Copyright (c) Infiniscene, Inc. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for license information.
 * -------------------------------------------------------------------------------------------- */
/* eslint-disable */
import _m0 from "protobufjs/minimal";
import { ListValue, Struct, Value } from "../../../google/protobuf/struct";

export const protobufPackage = "apis.layout.v2";

/** The type of layout, specifying how it functions. */
export enum LayoutType {
  LAYOUT_TYPE_UNSPECIFIED = "LAYOUT_TYPE_UNSPECIFIED",
  /** LAYOUT_TYPE_SCENELESS - A layout managed by Studio Kit */
  LAYOUT_TYPE_SCENELESS = "LAYOUT_TYPE_SCENELESS",
  /** LAYOUT_TYPE_SCENE - A layout managed via the layout API for use with our scene-based renderer. */
  LAYOUT_TYPE_SCENE = "LAYOUT_TYPE_SCENE",
}

export function layoutTypeFromJSON(object: any): LayoutType {
  switch (object) {
    case 0:
    case "LAYOUT_TYPE_UNSPECIFIED":
      return LayoutType.LAYOUT_TYPE_UNSPECIFIED;
    case 1:
    case "LAYOUT_TYPE_SCENELESS":
      return LayoutType.LAYOUT_TYPE_SCENELESS;
    case 2:
    case "LAYOUT_TYPE_SCENE":
      return LayoutType.LAYOUT_TYPE_SCENE;
    default:
      throw new tsProtoGlobalThis.Error("Unrecognized enum value " + object + " for enum LayoutType");
  }
}

export function layoutTypeToJSON(object: LayoutType): string {
  switch (object) {
    case LayoutType.LAYOUT_TYPE_UNSPECIFIED:
      return "LAYOUT_TYPE_UNSPECIFIED";
    case LayoutType.LAYOUT_TYPE_SCENELESS:
      return "LAYOUT_TYPE_SCENELESS";
    case LayoutType.LAYOUT_TYPE_SCENE:
      return "LAYOUT_TYPE_SCENE";
    default:
      throw new tsProtoGlobalThis.Error("Unrecognized enum value " + object + " for enum LayoutType");
  }
}

export function layoutTypeToNumber(object: LayoutType): number {
  switch (object) {
    case LayoutType.LAYOUT_TYPE_UNSPECIFIED:
      return 0;
    case LayoutType.LAYOUT_TYPE_SCENELESS:
      return 1;
    case LayoutType.LAYOUT_TYPE_SCENE:
      return 2;
    default:
      throw new tsProtoGlobalThis.Error("Unrecognized enum value " + object + " for enum LayoutType");
  }
}

/** Define how to apply animations in a batch request. */
export enum RequestAnimationMode {
  REQUEST_ANIMATION_MODE_UNSPECIFIED = "REQUEST_ANIMATION_MODE_UNSPECIFIED",
  /** REQUEST_ANIMATION_MODE_PARALLEL - All animations in the batch will be applied at once. */
  REQUEST_ANIMATION_MODE_PARALLEL = "REQUEST_ANIMATION_MODE_PARALLEL",
  /** REQUEST_ANIMATION_MODE_SERIES - Each layer update will appy after all animations on the previous layer(s) have completed. */
  REQUEST_ANIMATION_MODE_SERIES = "REQUEST_ANIMATION_MODE_SERIES",
}

export function requestAnimationModeFromJSON(object: any): RequestAnimationMode {
  switch (object) {
    case 0:
    case "REQUEST_ANIMATION_MODE_UNSPECIFIED":
      return RequestAnimationMode.REQUEST_ANIMATION_MODE_UNSPECIFIED;
    case 1:
    case "REQUEST_ANIMATION_MODE_PARALLEL":
      return RequestAnimationMode.REQUEST_ANIMATION_MODE_PARALLEL;
    case 2:
    case "REQUEST_ANIMATION_MODE_SERIES":
      return RequestAnimationMode.REQUEST_ANIMATION_MODE_SERIES;
    default:
      throw new tsProtoGlobalThis.Error("Unrecognized enum value " + object + " for enum RequestAnimationMode");
  }
}

export function requestAnimationModeToJSON(object: RequestAnimationMode): string {
  switch (object) {
    case RequestAnimationMode.REQUEST_ANIMATION_MODE_UNSPECIFIED:
      return "REQUEST_ANIMATION_MODE_UNSPECIFIED";
    case RequestAnimationMode.REQUEST_ANIMATION_MODE_PARALLEL:
      return "REQUEST_ANIMATION_MODE_PARALLEL";
    case RequestAnimationMode.REQUEST_ANIMATION_MODE_SERIES:
      return "REQUEST_ANIMATION_MODE_SERIES";
    default:
      throw new tsProtoGlobalThis.Error("Unrecognized enum value " + object + " for enum RequestAnimationMode");
  }
}

export function requestAnimationModeToNumber(object: RequestAnimationMode): number {
  switch (object) {
    case RequestAnimationMode.REQUEST_ANIMATION_MODE_UNSPECIFIED:
      return 0;
    case RequestAnimationMode.REQUEST_ANIMATION_MODE_PARALLEL:
      return 1;
    case RequestAnimationMode.REQUEST_ANIMATION_MODE_SERIES:
      return 2;
    default:
      throw new tsProtoGlobalThis.Error("Unrecognized enum value " + object + " for enum RequestAnimationMode");
  }
}

export enum EventSubType {
  EVENT_SUB_TYPE_UNSPECIFIED = "EVENT_SUB_TYPE_UNSPECIFIED",
  EVENT_SUB_TYPE_CREATE = "EVENT_SUB_TYPE_CREATE",
  EVENT_SUB_TYPE_UPDATE = "EVENT_SUB_TYPE_UPDATE",
  EVENT_SUB_TYPE_DELETE = "EVENT_SUB_TYPE_DELETE",
  EVENT_SUB_TYPE_BATCH = "EVENT_SUB_TYPE_BATCH",
}

export function eventSubTypeFromJSON(object: any): EventSubType {
  switch (object) {
    case 0:
    case "EVENT_SUB_TYPE_UNSPECIFIED":
      return EventSubType.EVENT_SUB_TYPE_UNSPECIFIED;
    case 1:
    case "EVENT_SUB_TYPE_CREATE":
      return EventSubType.EVENT_SUB_TYPE_CREATE;
    case 2:
    case "EVENT_SUB_TYPE_UPDATE":
      return EventSubType.EVENT_SUB_TYPE_UPDATE;
    case 3:
    case "EVENT_SUB_TYPE_DELETE":
      return EventSubType.EVENT_SUB_TYPE_DELETE;
    case 4:
    case "EVENT_SUB_TYPE_BATCH":
      return EventSubType.EVENT_SUB_TYPE_BATCH;
    default:
      throw new tsProtoGlobalThis.Error("Unrecognized enum value " + object + " for enum EventSubType");
  }
}

export function eventSubTypeToJSON(object: EventSubType): string {
  switch (object) {
    case EventSubType.EVENT_SUB_TYPE_UNSPECIFIED:
      return "EVENT_SUB_TYPE_UNSPECIFIED";
    case EventSubType.EVENT_SUB_TYPE_CREATE:
      return "EVENT_SUB_TYPE_CREATE";
    case EventSubType.EVENT_SUB_TYPE_UPDATE:
      return "EVENT_SUB_TYPE_UPDATE";
    case EventSubType.EVENT_SUB_TYPE_DELETE:
      return "EVENT_SUB_TYPE_DELETE";
    case EventSubType.EVENT_SUB_TYPE_BATCH:
      return "EVENT_SUB_TYPE_BATCH";
    default:
      throw new tsProtoGlobalThis.Error("Unrecognized enum value " + object + " for enum EventSubType");
  }
}

export function eventSubTypeToNumber(object: EventSubType): number {
  switch (object) {
    case EventSubType.EVENT_SUB_TYPE_UNSPECIFIED:
      return 0;
    case EventSubType.EVENT_SUB_TYPE_CREATE:
      return 1;
    case EventSubType.EVENT_SUB_TYPE_UPDATE:
      return 2;
    case EventSubType.EVENT_SUB_TYPE_DELETE:
      return 3;
    case EventSubType.EVENT_SUB_TYPE_BATCH:
      return 4;
    default:
      throw new tsProtoGlobalThis.Error("Unrecognized enum value " + object + " for enum EventSubType");
  }
}

export enum EventType {
  EVENT_TYPE_UNSPECIFIED = "EVENT_TYPE_UNSPECIFIED",
  EVENT_TYPE_LAYOUT = "EVENT_TYPE_LAYOUT",
  EVENT_TYPE_LAYER = "EVENT_TYPE_LAYER",
}

export function eventTypeFromJSON(object: any): EventType {
  switch (object) {
    case 0:
    case "EVENT_TYPE_UNSPECIFIED":
      return EventType.EVENT_TYPE_UNSPECIFIED;
    case 1:
    case "EVENT_TYPE_LAYOUT":
      return EventType.EVENT_TYPE_LAYOUT;
    case 2:
    case "EVENT_TYPE_LAYER":
      return EventType.EVENT_TYPE_LAYER;
    default:
      throw new tsProtoGlobalThis.Error("Unrecognized enum value " + object + " for enum EventType");
  }
}

export function eventTypeToJSON(object: EventType): string {
  switch (object) {
    case EventType.EVENT_TYPE_UNSPECIFIED:
      return "EVENT_TYPE_UNSPECIFIED";
    case EventType.EVENT_TYPE_LAYOUT:
      return "EVENT_TYPE_LAYOUT";
    case EventType.EVENT_TYPE_LAYER:
      return "EVENT_TYPE_LAYER";
    default:
      throw new tsProtoGlobalThis.Error("Unrecognized enum value " + object + " for enum EventType");
  }
}

export function eventTypeToNumber(object: EventType): number {
  switch (object) {
    case EventType.EVENT_TYPE_UNSPECIFIED:
      return 0;
    case EventType.EVENT_TYPE_LAYOUT:
      return 1;
    case EventType.EVENT_TYPE_LAYER:
      return 2;
    default:
      throw new tsProtoGlobalThis.Error("Unrecognized enum value " + object + " for enum EventType");
  }
}

/** Transition defines a transition into this layout. */
export interface Transition {
  /**
   * A list of layout IDs to apply this transition to. If empty,
   * this transition will apply to all scene switches which _do not_ have a matching transition.
   * If multiple transitions match (e.g multiple targetting the layout), a transition will be chosen at random.
   */
  fromLayoutIds: string[];
  cut?: Transition_TransitionCut | undefined;
  crossfade?: Transition_TransitionCrossfade | undefined;
  fadeToColor?: Transition_TransitionFadeToColor | undefined;
  swipe?: Transition_TransitionSwipe | undefined;
  stinger?: Transition_TransitionStinger | undefined;
}

/** Direction for the animation to display in. */
export enum Transition_TransitionDirection {
  TRANSITION_DIRECTION_UNSPECIFIED = "TRANSITION_DIRECTION_UNSPECIFIED",
  TRANSITION_DIRECTION_LEFT = "TRANSITION_DIRECTION_LEFT",
  TRANSITION_DIRECTION_RIGHT = "TRANSITION_DIRECTION_RIGHT",
  TRANSITION_DIRECTION_UP = "TRANSITION_DIRECTION_UP",
  TRANSITION_DIRECTION_DOWN = "TRANSITION_DIRECTION_DOWN",
}

export function transition_TransitionDirectionFromJSON(object: any): Transition_TransitionDirection {
  switch (object) {
    case 0:
    case "TRANSITION_DIRECTION_UNSPECIFIED":
      return Transition_TransitionDirection.TRANSITION_DIRECTION_UNSPECIFIED;
    case 1:
    case "TRANSITION_DIRECTION_LEFT":
      return Transition_TransitionDirection.TRANSITION_DIRECTION_LEFT;
    case 2:
    case "TRANSITION_DIRECTION_RIGHT":
      return Transition_TransitionDirection.TRANSITION_DIRECTION_RIGHT;
    case 3:
    case "TRANSITION_DIRECTION_UP":
      return Transition_TransitionDirection.TRANSITION_DIRECTION_UP;
    case 4:
    case "TRANSITION_DIRECTION_DOWN":
      return Transition_TransitionDirection.TRANSITION_DIRECTION_DOWN;
    default:
      throw new tsProtoGlobalThis.Error(
        "Unrecognized enum value " + object + " for enum Transition_TransitionDirection",
      );
  }
}

export function transition_TransitionDirectionToJSON(object: Transition_TransitionDirection): string {
  switch (object) {
    case Transition_TransitionDirection.TRANSITION_DIRECTION_UNSPECIFIED:
      return "TRANSITION_DIRECTION_UNSPECIFIED";
    case Transition_TransitionDirection.TRANSITION_DIRECTION_LEFT:
      return "TRANSITION_DIRECTION_LEFT";
    case Transition_TransitionDirection.TRANSITION_DIRECTION_RIGHT:
      return "TRANSITION_DIRECTION_RIGHT";
    case Transition_TransitionDirection.TRANSITION_DIRECTION_UP:
      return "TRANSITION_DIRECTION_UP";
    case Transition_TransitionDirection.TRANSITION_DIRECTION_DOWN:
      return "TRANSITION_DIRECTION_DOWN";
    default:
      throw new tsProtoGlobalThis.Error(
        "Unrecognized enum value " + object + " for enum Transition_TransitionDirection",
      );
  }
}

export function transition_TransitionDirectionToNumber(object: Transition_TransitionDirection): number {
  switch (object) {
    case Transition_TransitionDirection.TRANSITION_DIRECTION_UNSPECIFIED:
      return 0;
    case Transition_TransitionDirection.TRANSITION_DIRECTION_LEFT:
      return 1;
    case Transition_TransitionDirection.TRANSITION_DIRECTION_RIGHT:
      return 2;
    case Transition_TransitionDirection.TRANSITION_DIRECTION_UP:
      return 3;
    case Transition_TransitionDirection.TRANSITION_DIRECTION_DOWN:
      return 4;
    default:
      throw new tsProtoGlobalThis.Error(
        "Unrecognized enum value " + object + " for enum Transition_TransitionDirection",
      );
  }
}

export enum Transition_TransitionSwipeType {
  /** TRANSITION_SWIPE_TYPE_UNSPECIFIED - Both layouts are animated together */
  TRANSITION_SWIPE_TYPE_UNSPECIFIED = "TRANSITION_SWIPE_TYPE_UNSPECIFIED",
  /** TRANSITION_SWIPE_TYPE_COMBINED - Both layouts are animated together */
  TRANSITION_SWIPE_TYPE_COMBINED = "TRANSITION_SWIPE_TYPE_COMBINED",
  /** TRANSITION_SWIPE_TYPE_SOURCE - The source animation is moved out of the way */
  TRANSITION_SWIPE_TYPE_SOURCE = "TRANSITION_SWIPE_TYPE_SOURCE",
  /** TRANSITION_SWIPE_TYPE_DESTINATION - The destination layout is overlaid */
  TRANSITION_SWIPE_TYPE_DESTINATION = "TRANSITION_SWIPE_TYPE_DESTINATION",
}

export function transition_TransitionSwipeTypeFromJSON(object: any): Transition_TransitionSwipeType {
  switch (object) {
    case 0:
    case "TRANSITION_SWIPE_TYPE_UNSPECIFIED":
      return Transition_TransitionSwipeType.TRANSITION_SWIPE_TYPE_UNSPECIFIED;
    case 1:
    case "TRANSITION_SWIPE_TYPE_COMBINED":
      return Transition_TransitionSwipeType.TRANSITION_SWIPE_TYPE_COMBINED;
    case 2:
    case "TRANSITION_SWIPE_TYPE_SOURCE":
      return Transition_TransitionSwipeType.TRANSITION_SWIPE_TYPE_SOURCE;
    case 3:
    case "TRANSITION_SWIPE_TYPE_DESTINATION":
      return Transition_TransitionSwipeType.TRANSITION_SWIPE_TYPE_DESTINATION;
    default:
      throw new tsProtoGlobalThis.Error(
        "Unrecognized enum value " + object + " for enum Transition_TransitionSwipeType",
      );
  }
}

export function transition_TransitionSwipeTypeToJSON(object: Transition_TransitionSwipeType): string {
  switch (object) {
    case Transition_TransitionSwipeType.TRANSITION_SWIPE_TYPE_UNSPECIFIED:
      return "TRANSITION_SWIPE_TYPE_UNSPECIFIED";
    case Transition_TransitionSwipeType.TRANSITION_SWIPE_TYPE_COMBINED:
      return "TRANSITION_SWIPE_TYPE_COMBINED";
    case Transition_TransitionSwipeType.TRANSITION_SWIPE_TYPE_SOURCE:
      return "TRANSITION_SWIPE_TYPE_SOURCE";
    case Transition_TransitionSwipeType.TRANSITION_SWIPE_TYPE_DESTINATION:
      return "TRANSITION_SWIPE_TYPE_DESTINATION";
    default:
      throw new tsProtoGlobalThis.Error(
        "Unrecognized enum value " + object + " for enum Transition_TransitionSwipeType",
      );
  }
}

export function transition_TransitionSwipeTypeToNumber(object: Transition_TransitionSwipeType): number {
  switch (object) {
    case Transition_TransitionSwipeType.TRANSITION_SWIPE_TYPE_UNSPECIFIED:
      return 0;
    case Transition_TransitionSwipeType.TRANSITION_SWIPE_TYPE_COMBINED:
      return 1;
    case Transition_TransitionSwipeType.TRANSITION_SWIPE_TYPE_SOURCE:
      return 2;
    case Transition_TransitionSwipeType.TRANSITION_SWIPE_TYPE_DESTINATION:
      return 3;
    default:
      throw new tsProtoGlobalThis.Error(
        "Unrecognized enum value " + object + " for enum Transition_TransitionSwipeType",
      );
  }
}

/** Media definition */
export interface Transition_TransitionMediaType {
  /** External URL to the media content. */
  url: string;
  /** Volume to play the media at between 0 and 1. */
  volume: number;
}

/** Transition: a simple scene switch. this is the default transition. */
export interface Transition_TransitionCut {
}

/** Transition: Fade to a color before transitioning to another layout. */
export interface Transition_TransitionFadeToColor {
  /** The duration to animate over. The fade to color will take half this duration. */
  durationMs: number;
  /** A CSS-compatible background color. */
  backgroundColor: string;
}

/** Transition: crossfade between two layouts. */
export interface Transition_TransitionCrossfade {
  /** The duration to animate over. */
  durationMs: number;
}

/** Transition: Animation where layouts are slide over another. */
export interface Transition_TransitionSwipe {
  /** The duration to animate over. */
  durationMs: number;
  /** The direction to swipe the layer from. */
  direction: Transition_TransitionDirection;
  /** How to animate the slide. */
  combinedAnimation: Transition_TransitionSwipeType;
}

/** Stinger where the layout is cut over at a specific point. */
export interface Transition_TransitionStingerCut {
  /**
   * The duration from the start of the media playing at which the layout should change.
   * this should be a point where the entire screen is filled.
   */
  cutPointMs: number;
  /** The remote media to play as the stinger. */
  media: Transition_TransitionMediaType | undefined;
}

/** Transition: stinger animation. */
export interface Transition_TransitionStinger {
  cut?: Transition_TransitionStingerCut | undefined;
}

/** A Layout represents a container for multiple layers. */
export interface Layout {
  /** internal ID for the layout */
  id: string;
  /** width of the layout in pixels */
  width: number;
  /** height of the layout in pixels */
  height: number;
  /** Custom metadata for the layout. This is freeform. */
  metadata?: any | undefined;
  projectId?: string | undefined;
  collectionId?: string | undefined;
  type?:
    | LayoutType
    | undefined;
  /**
   * Transitions to apply when switching to this scene from another
   * note: this is only available for layouts of type `LAYOUT_TYPE_SCENE`.
   */
  transitions: Transition[];
  /** Metadata sent with the request */
  requestMetadata?: any | undefined;
}

/** The Layer represents a single item within a layout. */
export interface Layer {
  /** the type of layer we're interacting with: e.g alert, banner */
  type: string;
  /** Custom value for the layer. This is freeform. */
  data:
    | { [key: string]: any }
    | undefined;
  /** x position in pixels. This can be null if the layer has no absolute position. */
  x:
    | any
    | undefined;
  /** y position in pixels. Can be null if the layer has no absolute position. */
  y:
    | any
    | undefined;
  /** width in pixels of the layer. can be null if the layer is dynamically sizable. */
  width:
    | any
    | undefined;
  /** height in pixels of the layer. can be null if the layer is dynamically sizable. */
  height:
    | any
    | undefined;
  /** rotation of layer in degrees of the layer. */
  rotation: number;
  /** opacity of the layer. This is the same as the CSS value, 0 being transparent and 1 being opaque. */
  opacity: number;
  /**
   * Scale of the layer. This is expontential, with 1 equaling the normal size of the layer.
   * note: width/height will be affected.
   */
  scale: number;
  /** whether the layer should be rendered. */
  hidden: boolean;
  /** children of the layer. */
  children:
    | Array<any>
    | undefined;
  /** Custom metadata for the layer. This is freeform. */
  metadata:
    | any
    | undefined;
  /** id of the layer */
  id: string;
  /** the layout this layer is associated with. */
  layoutId: string;
  /** Metadata sent with the request */
  requestMetadata?:
    | any
    | undefined;
  /** Animation information for the layer which should be applied on update. */
  requestAnimation: LayerAnimation[];
}

/** Request to delete a specific layer. */
export interface DeleteLayerRequest {
  /** the id of the Layout */
  layoutId: string;
  /** the id of the Layer */
  layerId: string;
  /** Metadata associated with the deletion of a layer */
  payload?: DeleteLayerPayload | undefined;
}

export interface DeleteLayerResponse {
  /** The layer id that was deleted */
  id: string;
  /** The layout this layer belongs to. */
  layoutId: string;
  /** Optional request metadata sent with the delete request */
  requestMetadata?: any | undefined;
}

/** A batch update for layers within a layout, indicating creation, removal and updates to layers. */
export interface BatchLayerResponse {
  /** List of responses */
  layers: BatchLayerResponse_BatchLayerItem[];
  /** The layout this batch update belongs to. */
  layoutId: string;
  /** Metadata sent with the request */
  requestMetadata?:
    | any
    | undefined;
  /** Order in which layer animations are applied in the batch. */
  requestAnimationMode: RequestAnimationMode;
}

/** Thee result of interacting with that layer. */
export interface BatchLayerResponse_BatchLayerItem {
  create?: Layer | undefined;
  update?: Layer | undefined;
  delete?: DeleteLayerResponse | undefined;
}

/** Partial layout */
export interface PartialLayout {
  /** width of the layer in pixels */
  width?:
    | number
    | undefined;
  /** height of the layer in pixels */
  height?:
    | number
    | undefined;
  /** Metadata associated with a layout. This is freeform JSON. */
  metadata?:
    | any
    | undefined;
  /**
   * Project ID from the Live API for the layout
   * note: this cannot be changed for existing layouts.
   */
  projectId?:
    | string
    | undefined;
  /**
   * Collection ID from the Live API for the layout
   * note: this cannot be changed once set.
   */
  collectionId?:
    | string
    | undefined;
  /**
   * The type of layout to use.
   * Typically you should use LAYOUT_TYPE_SCENE to manage layouts via the API. This automatically
   * creates a "root" layer for all layers to be under.
   * LAYOUT_TYPE_SCENELESS is used for layouts managed by the Studio SDK.
   */
  type?:
    | LayoutType
    | undefined;
  /**
   * Transitions to apply when switching to this scene from another
   * note: this is only available for layouts of type `LAYOUT_TYPE_SCENE`.
   */
  transitions: Transition[];
  /** Metadata associated with the publishing of the event */
  requestMetadata?: any | undefined;
}

/**
 * Filter options for listing layouts. Each request
 * parameter will filter the response down (AND)
 */
export interface ListLayoutsRequest {
  projectId?: string | undefined;
  collectionId?: string | undefined;
  type?: LayoutType | undefined;
}

export interface ListLayoutsResponse {
  /** All layouts returned. */
  layouts: Layout[];
}

export interface CreateLayoutRequest {
  /** layout to create */
  layout: PartialLayout | undefined;
}

export interface GetLayoutRequest {
  /** the id of the Layout */
  layoutId: string;
}

export interface UpdateLayoutRequest {
  /** the id of the Layout */
  layoutId: string;
  /** layout data to update with. */
  layout: PartialLayout | undefined;
}

export interface DeleteLayoutPayload {
  /** Metadata associated with the deletion of the layout */
  requestMetadata?: any | undefined;
}

/** Request to delete a specific layout. */
export interface DeleteLayoutRequest {
  /** the id of the Layout */
  layoutId: string;
  /** Metadata associated with the deletion of a layout */
  payload?: DeleteLayoutPayload | undefined;
}

export interface DeleteLayoutResponse {
  /** The ID of the layout deleted */
  id: string;
  /** Metadata associated with the deletion of a layout */
  requestMetadata?: any | undefined;
}

/**
 * Represents how we should apply the action, transitioning from the current state to the new state.
 * If multiple LayerAnimation's are defined, the final LayerAnimation will be used that has a matching property!
 *
 * note: this is currently only supported where layout type is "scene".
 */
export interface LayerAnimation {
  /** The properties to animate on. Currently x, y, width, height, opacity and scale are supported. "*" can be used to target all properties. */
  properties: string[];
  /** The duration to transition over in milliseconds */
  durationMs: number;
  /** A delay to offset the animation by. */
  delayMs?:
    | number
    | undefined;
  /**
   * The easing mode for the transition.
   * This value can be anything supported as an easing function: https://developer.mozilla.org/en-US/docs/Web/CSS/easing-function
   */
  easingMode?: string | undefined;
}

/** Partial Layer for creating and updating. */
export interface PartialLayer {
  /** the type of layer we're interacting with: e.g alert, banner */
  type?:
    | string
    | undefined;
  /** Custom value for the layer. This is freeform. */
  data?:
    | { [key: string]: any }
    | undefined;
  /** x position in pixels. This can be null if the layer has no absolute position. */
  x:
    | any
    | undefined;
  /** y position in pixels. Can be null if the layer has no absolute position. */
  y:
    | any
    | undefined;
  /** width in pixels of the layer. can be null if the layer is dynamically sizable. */
  width:
    | any
    | undefined;
  /** height in pixels of the layer. can be null if the layer is dynamically sizable. */
  height:
    | any
    | undefined;
  /** rotation of layer in degrees of the layer. */
  rotation?:
    | number
    | undefined;
  /** opacity of the layer. This is the same as the CSS value, 0 being transparent and 1 being opaque. */
  opacity?:
    | number
    | undefined;
  /**
   * Scale of the layer. This is expontential, with 1 equaling the normal size of the layer.
   * note: width/height will be affected.
   */
  scale?:
    | number
    | undefined;
  /** whether the layer should be rendered. */
  hidden?:
    | boolean
    | undefined;
  /** children of the layer. */
  children?:
    | Array<any>
    | undefined;
  /** parent layer to asssign to. */
  parentId?: string | undefined;
  metadata:
    | any
    | undefined;
  /** Metadata sent with the request */
  requestMetadata?:
    | any
    | undefined;
  /** Animation information for the layer. */
  requestAnimation: LayerAnimation[];
}

/** Partial Layer for updating. */
export interface PartialLayerWithID {
  /** ID of the layer. */
  id: string;
  /** the type of layer we're interacting with: e.g alert, banner */
  type?:
    | string
    | undefined;
  /** Custom value for the layer. This is freeform. */
  data?:
    | { [key: string]: any }
    | undefined;
  /** x position in pixels. This can be null if the layer has no absolute position. */
  x:
    | any
    | undefined;
  /** y position in pixels. Can be null if the layer has no absolute position. */
  y:
    | any
    | undefined;
  /** width in pixels of the layer. can be null if the layer is dynamically sizable. */
  width:
    | any
    | undefined;
  /** height in pixels of the layer. can be null if the layer is dynamically sizable. */
  height:
    | any
    | undefined;
  /** rotation of layer in degrees of the layer. */
  rotation?:
    | number
    | undefined;
  /** opacity of the layer. This is the same as the CSS value, 0 being transparent and 1 being opaque. */
  opacity?:
    | number
    | undefined;
  /**
   * Scale of the layer. This is expontential, with 1 equaling the normal size of the layer.
   * note: width/height will be affected.
   */
  scale?:
    | number
    | undefined;
  /** whether the layer should be rendered. */
  hidden?:
    | boolean
    | undefined;
  /** children of the layer. */
  children?:
    | Array<any>
    | undefined;
  /** parent layer to asssign to. */
  parentId?: string | undefined;
  metadata:
    | any
    | undefined;
  /** Metadata sent with the request */
  requestMetadata?:
    | any
    | undefined;
  /** Animation information for the layer. */
  requestAnimation: LayerAnimation[];
}

export interface ListLayersRequest {
  /** the id of the Layout */
  layoutId: string;
}

export interface ListLayersResponse {
  /** list of all layers */
  layers: Layer[];
}

export interface CreateLayerRequest {
  /** the id of the Layout */
  layoutId: string;
  /** layer to create - all fields have defaults except type. */
  layer: PartialLayer | undefined;
}

export interface GetLayerRequest {
  /** the id of the Layout */
  layoutId: string;
  /** the id of the Layer */
  layerId: string;
}

export interface UpdateLayerRequest {
  /** the id of the Layout */
  layoutId: string;
  /** the id of the Layer */
  layerId: string;
  /** layer data to update with. */
  layer: PartialLayer | undefined;
}

export interface DeleteLayerPayload {
  /** Metadata associated with the deletion of a layer */
  requestMetadata?: any | undefined;
}

export interface BatchDeleteLayerRequest {
  /** ID of the layer deleted. */
  id: string;
  /** Metadata associated with the deletion of a layer */
  requestMetadata?: any | undefined;
}

/** Batch request to modify a layout. */
export interface BatchLayerRequest {
  /** The layout all requests interact with. */
  layoutId: string;
  /** List of layers to update */
  layers: BatchLayerRequest_BatchItem[];
  /** Metadata sent with the request */
  requestMetadata?:
    | any
    | undefined;
  /** Order in which layer animations are applied in the batch. */
  requestAnimationMode?: RequestAnimationMode | undefined;
}

/** A batch action. */
export interface BatchLayerRequest_BatchItem {
  /** Create a layer */
  create?:
    | PartialLayer
    | undefined;
  /** Update a layer */
  update?:
    | PartialLayerWithID
    | undefined;
  /** Delete a layer */
  delete?: BatchDeleteLayerRequest | undefined;
}

export interface LayoutEvent {
  /** New layout created */
  create?:
    | Layout
    | undefined;
  /** Existing layout updated */
  update?:
    | Layout
    | undefined;
  /** Existing layout destroyed */
  delete?: DeleteLayoutResponse | undefined;
}

export interface LayerEvent {
  /** New layer added */
  create?:
    | Layer
    | undefined;
  /** Existing layer updated */
  update?:
    | Layer
    | undefined;
  /** Existing layer destroyed */
  delete?:
    | DeleteLayerResponse
    | undefined;
  /** Batch events */
  batch?: BatchLayerResponse | undefined;
}

/**
 * Event structure for an event sent from the layout
 * api via the event api
 */
export interface Event {
  layout?: LayoutEvent | undefined;
  layer?: LayerEvent | undefined;
}

function createBaseTransition(): Transition {
  return {
    fromLayoutIds: [],
    cut: undefined,
    crossfade: undefined,
    fadeToColor: undefined,
    swipe: undefined,
    stinger: undefined,
  };
}

export const Transition = {
  encode(message: Transition, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    for (const v of message.fromLayoutIds) {
      writer.uint32(10).string(v!);
    }
    if (message.cut !== undefined) {
      Transition_TransitionCut.encode(message.cut, writer.uint32(82).fork()).ldelim();
    }
    if (message.crossfade !== undefined) {
      Transition_TransitionCrossfade.encode(message.crossfade, writer.uint32(90).fork()).ldelim();
    }
    if (message.fadeToColor !== undefined) {
      Transition_TransitionFadeToColor.encode(message.fadeToColor, writer.uint32(98).fork()).ldelim();
    }
    if (message.swipe !== undefined) {
      Transition_TransitionSwipe.encode(message.swipe, writer.uint32(106).fork()).ldelim();
    }
    if (message.stinger !== undefined) {
      Transition_TransitionStinger.encode(message.stinger, writer.uint32(114).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): Transition {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseTransition();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.fromLayoutIds.push(reader.string());
          break;
        case 10:
          message.cut = Transition_TransitionCut.decode(reader, reader.uint32());
          break;
        case 11:
          message.crossfade = Transition_TransitionCrossfade.decode(reader, reader.uint32());
          break;
        case 12:
          message.fadeToColor = Transition_TransitionFadeToColor.decode(reader, reader.uint32());
          break;
        case 13:
          message.swipe = Transition_TransitionSwipe.decode(reader, reader.uint32());
          break;
        case 14:
          message.stinger = Transition_TransitionStinger.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): Transition {
    return {
      fromLayoutIds: Array.isArray(object?.fromLayoutIds) ? object.fromLayoutIds.map((e: any) => String(e)) : [],
      cut: isSet(object.cut) ? Transition_TransitionCut.fromJSON(object.cut) : undefined,
      crossfade: isSet(object.crossfade) ? Transition_TransitionCrossfade.fromJSON(object.crossfade) : undefined,
      fadeToColor: isSet(object.fadeToColor)
        ? Transition_TransitionFadeToColor.fromJSON(object.fadeToColor)
        : undefined,
      swipe: isSet(object.swipe) ? Transition_TransitionSwipe.fromJSON(object.swipe) : undefined,
      stinger: isSet(object.stinger) ? Transition_TransitionStinger.fromJSON(object.stinger) : undefined,
    };
  },

  toJSON(message: Transition): unknown {
    const obj: any = {};
    if (message.fromLayoutIds) {
      obj.fromLayoutIds = message.fromLayoutIds.map((e) => e);
    } else {
      obj.fromLayoutIds = [];
    }
    message.cut !== undefined && (obj.cut = message.cut ? Transition_TransitionCut.toJSON(message.cut) : undefined);
    message.crossfade !== undefined &&
      (obj.crossfade = message.crossfade ? Transition_TransitionCrossfade.toJSON(message.crossfade) : undefined);
    message.fadeToColor !== undefined &&
      (obj.fadeToColor = message.fadeToColor
        ? Transition_TransitionFadeToColor.toJSON(message.fadeToColor)
        : undefined);
    message.swipe !== undefined &&
      (obj.swipe = message.swipe ? Transition_TransitionSwipe.toJSON(message.swipe) : undefined);
    message.stinger !== undefined &&
      (obj.stinger = message.stinger ? Transition_TransitionStinger.toJSON(message.stinger) : undefined);
    return obj;
  },

  fromPartial(object: DeepPartial<Transition>): Transition {
    const message = createBaseTransition();
    message.fromLayoutIds = object.fromLayoutIds?.map((e) => e) || [];
    message.cut = (object.cut !== undefined && object.cut !== null)
      ? Transition_TransitionCut.fromPartial(object.cut)
      : undefined;
    message.crossfade = (object.crossfade !== undefined && object.crossfade !== null)
      ? Transition_TransitionCrossfade.fromPartial(object.crossfade)
      : undefined;
    message.fadeToColor = (object.fadeToColor !== undefined && object.fadeToColor !== null)
      ? Transition_TransitionFadeToColor.fromPartial(object.fadeToColor)
      : undefined;
    message.swipe = (object.swipe !== undefined && object.swipe !== null)
      ? Transition_TransitionSwipe.fromPartial(object.swipe)
      : undefined;
    message.stinger = (object.stinger !== undefined && object.stinger !== null)
      ? Transition_TransitionStinger.fromPartial(object.stinger)
      : undefined;
    return message;
  },
};

function createBaseTransition_TransitionMediaType(): Transition_TransitionMediaType {
  return { url: "", volume: 0 };
}

export const Transition_TransitionMediaType = {
  encode(message: Transition_TransitionMediaType, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.url !== "") {
      writer.uint32(10).string(message.url);
    }
    if (message.volume !== 0) {
      writer.uint32(17).double(message.volume);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): Transition_TransitionMediaType {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseTransition_TransitionMediaType();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.url = reader.string();
          break;
        case 2:
          message.volume = reader.double();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): Transition_TransitionMediaType {
    return {
      url: isSet(object.url) ? String(object.url) : "",
      volume: isSet(object.volume) ? Number(object.volume) : 0,
    };
  },

  toJSON(message: Transition_TransitionMediaType): unknown {
    const obj: any = {};
    message.url !== undefined && (obj.url = message.url);
    message.volume !== undefined && (obj.volume = message.volume);
    return obj;
  },

  fromPartial(object: DeepPartial<Transition_TransitionMediaType>): Transition_TransitionMediaType {
    const message = createBaseTransition_TransitionMediaType();
    message.url = object.url ?? "";
    message.volume = object.volume ?? 0;
    return message;
  },
};

function createBaseTransition_TransitionCut(): Transition_TransitionCut {
  return {};
}

export const Transition_TransitionCut = {
  encode(_: Transition_TransitionCut, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): Transition_TransitionCut {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseTransition_TransitionCut();
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

  fromJSON(_: any): Transition_TransitionCut {
    return {};
  },

  toJSON(_: Transition_TransitionCut): unknown {
    const obj: any = {};
    return obj;
  },

  fromPartial(_: DeepPartial<Transition_TransitionCut>): Transition_TransitionCut {
    const message = createBaseTransition_TransitionCut();
    return message;
  },
};

function createBaseTransition_TransitionFadeToColor(): Transition_TransitionFadeToColor {
  return { durationMs: 0, backgroundColor: "" };
}

export const Transition_TransitionFadeToColor = {
  encode(message: Transition_TransitionFadeToColor, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.durationMs !== 0) {
      writer.uint32(8).int32(message.durationMs);
    }
    if (message.backgroundColor !== "") {
      writer.uint32(18).string(message.backgroundColor);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): Transition_TransitionFadeToColor {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseTransition_TransitionFadeToColor();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.durationMs = reader.int32();
          break;
        case 2:
          message.backgroundColor = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): Transition_TransitionFadeToColor {
    return {
      durationMs: isSet(object.durationMs) ? Number(object.durationMs) : 0,
      backgroundColor: isSet(object.backgroundColor) ? String(object.backgroundColor) : "",
    };
  },

  toJSON(message: Transition_TransitionFadeToColor): unknown {
    const obj: any = {};
    message.durationMs !== undefined && (obj.durationMs = Math.round(message.durationMs));
    message.backgroundColor !== undefined && (obj.backgroundColor = message.backgroundColor);
    return obj;
  },

  fromPartial(object: DeepPartial<Transition_TransitionFadeToColor>): Transition_TransitionFadeToColor {
    const message = createBaseTransition_TransitionFadeToColor();
    message.durationMs = object.durationMs ?? 0;
    message.backgroundColor = object.backgroundColor ?? "";
    return message;
  },
};

function createBaseTransition_TransitionCrossfade(): Transition_TransitionCrossfade {
  return { durationMs: 0 };
}

export const Transition_TransitionCrossfade = {
  encode(message: Transition_TransitionCrossfade, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.durationMs !== 0) {
      writer.uint32(8).int32(message.durationMs);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): Transition_TransitionCrossfade {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseTransition_TransitionCrossfade();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.durationMs = reader.int32();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): Transition_TransitionCrossfade {
    return { durationMs: isSet(object.durationMs) ? Number(object.durationMs) : 0 };
  },

  toJSON(message: Transition_TransitionCrossfade): unknown {
    const obj: any = {};
    message.durationMs !== undefined && (obj.durationMs = Math.round(message.durationMs));
    return obj;
  },

  fromPartial(object: DeepPartial<Transition_TransitionCrossfade>): Transition_TransitionCrossfade {
    const message = createBaseTransition_TransitionCrossfade();
    message.durationMs = object.durationMs ?? 0;
    return message;
  },
};

function createBaseTransition_TransitionSwipe(): Transition_TransitionSwipe {
  return {
    durationMs: 0,
    direction: Transition_TransitionDirection.TRANSITION_DIRECTION_UNSPECIFIED,
    combinedAnimation: Transition_TransitionSwipeType.TRANSITION_SWIPE_TYPE_UNSPECIFIED,
  };
}

export const Transition_TransitionSwipe = {
  encode(message: Transition_TransitionSwipe, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.durationMs !== 0) {
      writer.uint32(8).int32(message.durationMs);
    }
    if (message.direction !== Transition_TransitionDirection.TRANSITION_DIRECTION_UNSPECIFIED) {
      writer.uint32(16).int32(transition_TransitionDirectionToNumber(message.direction));
    }
    if (message.combinedAnimation !== Transition_TransitionSwipeType.TRANSITION_SWIPE_TYPE_UNSPECIFIED) {
      writer.uint32(24).int32(transition_TransitionSwipeTypeToNumber(message.combinedAnimation));
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): Transition_TransitionSwipe {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseTransition_TransitionSwipe();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.durationMs = reader.int32();
          break;
        case 2:
          message.direction = transition_TransitionDirectionFromJSON(reader.int32());
          break;
        case 3:
          message.combinedAnimation = transition_TransitionSwipeTypeFromJSON(reader.int32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): Transition_TransitionSwipe {
    return {
      durationMs: isSet(object.durationMs) ? Number(object.durationMs) : 0,
      direction: isSet(object.direction)
        ? transition_TransitionDirectionFromJSON(object.direction)
        : Transition_TransitionDirection.TRANSITION_DIRECTION_UNSPECIFIED,
      combinedAnimation: isSet(object.combinedAnimation)
        ? transition_TransitionSwipeTypeFromJSON(object.combinedAnimation)
        : Transition_TransitionSwipeType.TRANSITION_SWIPE_TYPE_UNSPECIFIED,
    };
  },

  toJSON(message: Transition_TransitionSwipe): unknown {
    const obj: any = {};
    message.durationMs !== undefined && (obj.durationMs = Math.round(message.durationMs));
    message.direction !== undefined && (obj.direction = transition_TransitionDirectionToJSON(message.direction));
    message.combinedAnimation !== undefined &&
      (obj.combinedAnimation = transition_TransitionSwipeTypeToJSON(message.combinedAnimation));
    return obj;
  },

  fromPartial(object: DeepPartial<Transition_TransitionSwipe>): Transition_TransitionSwipe {
    const message = createBaseTransition_TransitionSwipe();
    message.durationMs = object.durationMs ?? 0;
    message.direction = object.direction ?? Transition_TransitionDirection.TRANSITION_DIRECTION_UNSPECIFIED;
    message.combinedAnimation = object.combinedAnimation ??
      Transition_TransitionSwipeType.TRANSITION_SWIPE_TYPE_UNSPECIFIED;
    return message;
  },
};

function createBaseTransition_TransitionStingerCut(): Transition_TransitionStingerCut {
  return { cutPointMs: 0, media: undefined };
}

export const Transition_TransitionStingerCut = {
  encode(message: Transition_TransitionStingerCut, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.cutPointMs !== 0) {
      writer.uint32(8).int32(message.cutPointMs);
    }
    if (message.media !== undefined) {
      Transition_TransitionMediaType.encode(message.media, writer.uint32(18).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): Transition_TransitionStingerCut {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseTransition_TransitionStingerCut();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.cutPointMs = reader.int32();
          break;
        case 2:
          message.media = Transition_TransitionMediaType.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): Transition_TransitionStingerCut {
    return {
      cutPointMs: isSet(object.cutPointMs) ? Number(object.cutPointMs) : 0,
      media: isSet(object.media) ? Transition_TransitionMediaType.fromJSON(object.media) : undefined,
    };
  },

  toJSON(message: Transition_TransitionStingerCut): unknown {
    const obj: any = {};
    message.cutPointMs !== undefined && (obj.cutPointMs = Math.round(message.cutPointMs));
    message.media !== undefined &&
      (obj.media = message.media ? Transition_TransitionMediaType.toJSON(message.media) : undefined);
    return obj;
  },

  fromPartial(object: DeepPartial<Transition_TransitionStingerCut>): Transition_TransitionStingerCut {
    const message = createBaseTransition_TransitionStingerCut();
    message.cutPointMs = object.cutPointMs ?? 0;
    message.media = (object.media !== undefined && object.media !== null)
      ? Transition_TransitionMediaType.fromPartial(object.media)
      : undefined;
    return message;
  },
};

function createBaseTransition_TransitionStinger(): Transition_TransitionStinger {
  return { cut: undefined };
}

export const Transition_TransitionStinger = {
  encode(message: Transition_TransitionStinger, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.cut !== undefined) {
      Transition_TransitionStingerCut.encode(message.cut, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): Transition_TransitionStinger {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseTransition_TransitionStinger();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.cut = Transition_TransitionStingerCut.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): Transition_TransitionStinger {
    return { cut: isSet(object.cut) ? Transition_TransitionStingerCut.fromJSON(object.cut) : undefined };
  },

  toJSON(message: Transition_TransitionStinger): unknown {
    const obj: any = {};
    message.cut !== undefined &&
      (obj.cut = message.cut ? Transition_TransitionStingerCut.toJSON(message.cut) : undefined);
    return obj;
  },

  fromPartial(object: DeepPartial<Transition_TransitionStinger>): Transition_TransitionStinger {
    const message = createBaseTransition_TransitionStinger();
    message.cut = (object.cut !== undefined && object.cut !== null)
      ? Transition_TransitionStingerCut.fromPartial(object.cut)
      : undefined;
    return message;
  },
};

function createBaseLayout(): Layout {
  return {
    id: "",
    width: 0,
    height: 0,
    metadata: undefined,
    projectId: undefined,
    collectionId: undefined,
    type: undefined,
    transitions: [],
    requestMetadata: undefined,
  };
}

export const Layout = {
  encode(message: Layout, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.id !== "") {
      writer.uint32(10).string(message.id);
    }
    if (message.width !== 0) {
      writer.uint32(16).int32(message.width);
    }
    if (message.height !== 0) {
      writer.uint32(24).int32(message.height);
    }
    if (message.metadata !== undefined) {
      Value.encode(Value.wrap(message.metadata), writer.uint32(50).fork()).ldelim();
    }
    if (message.projectId !== undefined) {
      writer.uint32(58).string(message.projectId);
    }
    if (message.collectionId !== undefined) {
      writer.uint32(66).string(message.collectionId);
    }
    if (message.type !== undefined) {
      writer.uint32(72).int32(layoutTypeToNumber(message.type));
    }
    for (const v of message.transitions) {
      Transition.encode(v!, writer.uint32(82).fork()).ldelim();
    }
    if (message.requestMetadata !== undefined) {
      Value.encode(Value.wrap(message.requestMetadata), writer.uint32(810).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): Layout {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseLayout();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.id = reader.string();
          break;
        case 2:
          message.width = reader.int32();
          break;
        case 3:
          message.height = reader.int32();
          break;
        case 6:
          message.metadata = Value.unwrap(Value.decode(reader, reader.uint32()));
          break;
        case 7:
          message.projectId = reader.string();
          break;
        case 8:
          message.collectionId = reader.string();
          break;
        case 9:
          message.type = layoutTypeFromJSON(reader.int32());
          break;
        case 10:
          message.transitions.push(Transition.decode(reader, reader.uint32()));
          break;
        case 101:
          message.requestMetadata = Value.unwrap(Value.decode(reader, reader.uint32()));
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): Layout {
    return {
      id: isSet(object.id) ? String(object.id) : "",
      width: isSet(object.width) ? Number(object.width) : 0,
      height: isSet(object.height) ? Number(object.height) : 0,
      metadata: isSet(object?.metadata) ? object.metadata : undefined,
      projectId: isSet(object.projectId) ? String(object.projectId) : undefined,
      collectionId: isSet(object.collectionId) ? String(object.collectionId) : undefined,
      type: isSet(object.type) ? layoutTypeFromJSON(object.type) : undefined,
      transitions: Array.isArray(object?.transitions) ? object.transitions.map((e: any) => Transition.fromJSON(e)) : [],
      requestMetadata: isSet(object?.requestMetadata) ? object.requestMetadata : undefined,
    };
  },

  toJSON(message: Layout): unknown {
    const obj: any = {};
    message.id !== undefined && (obj.id = message.id);
    message.width !== undefined && (obj.width = Math.round(message.width));
    message.height !== undefined && (obj.height = Math.round(message.height));
    message.metadata !== undefined && (obj.metadata = message.metadata);
    message.projectId !== undefined && (obj.projectId = message.projectId);
    message.collectionId !== undefined && (obj.collectionId = message.collectionId);
    message.type !== undefined && (obj.type = message.type !== undefined ? layoutTypeToJSON(message.type) : undefined);
    if (message.transitions) {
      obj.transitions = message.transitions.map((e) => e ? Transition.toJSON(e) : undefined);
    } else {
      obj.transitions = [];
    }
    message.requestMetadata !== undefined && (obj.requestMetadata = message.requestMetadata);
    return obj;
  },

  fromPartial(object: DeepPartial<Layout>): Layout {
    const message = createBaseLayout();
    message.id = object.id ?? "";
    message.width = object.width ?? 0;
    message.height = object.height ?? 0;
    message.metadata = object.metadata ?? undefined;
    message.projectId = object.projectId ?? undefined;
    message.collectionId = object.collectionId ?? undefined;
    message.type = object.type ?? undefined;
    message.transitions = object.transitions?.map((e) => Transition.fromPartial(e)) || [];
    message.requestMetadata = object.requestMetadata ?? undefined;
    return message;
  },
};

function createBaseLayer(): Layer {
  return {
    type: "",
    data: undefined,
    x: undefined,
    y: undefined,
    width: undefined,
    height: undefined,
    rotation: 0,
    opacity: 0,
    scale: 0,
    hidden: false,
    children: undefined,
    metadata: undefined,
    id: "",
    layoutId: "",
    requestMetadata: undefined,
    requestAnimation: [],
  };
}

export const Layer = {
  encode(message: Layer, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.type !== "") {
      writer.uint32(10).string(message.type);
    }
    if (message.data !== undefined) {
      Struct.encode(Struct.wrap(message.data), writer.uint32(18).fork()).ldelim();
    }
    if (message.x !== undefined) {
      Value.encode(Value.wrap(message.x), writer.uint32(26).fork()).ldelim();
    }
    if (message.y !== undefined) {
      Value.encode(Value.wrap(message.y), writer.uint32(34).fork()).ldelim();
    }
    if (message.width !== undefined) {
      Value.encode(Value.wrap(message.width), writer.uint32(42).fork()).ldelim();
    }
    if (message.height !== undefined) {
      Value.encode(Value.wrap(message.height), writer.uint32(50).fork()).ldelim();
    }
    if (message.rotation !== 0) {
      writer.uint32(57).double(message.rotation);
    }
    if (message.opacity !== 0) {
      writer.uint32(65).double(message.opacity);
    }
    if (message.scale !== 0) {
      writer.uint32(73).double(message.scale);
    }
    if (message.hidden === true) {
      writer.uint32(80).bool(message.hidden);
    }
    if (message.children !== undefined) {
      ListValue.encode(ListValue.wrap(message.children), writer.uint32(98).fork()).ldelim();
    }
    if (message.metadata !== undefined) {
      Value.encode(Value.wrap(message.metadata), writer.uint32(114).fork()).ldelim();
    }
    if (message.id !== "") {
      writer.uint32(802).string(message.id);
    }
    if (message.layoutId !== "") {
      writer.uint32(818).string(message.layoutId);
    }
    if (message.requestMetadata !== undefined) {
      Value.encode(Value.wrap(message.requestMetadata), writer.uint32(810).fork()).ldelim();
    }
    for (const v of message.requestAnimation) {
      LayerAnimation.encode(v!, writer.uint32(826).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): Layer {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseLayer();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.type = reader.string();
          break;
        case 2:
          message.data = Struct.unwrap(Struct.decode(reader, reader.uint32()));
          break;
        case 3:
          message.x = Value.unwrap(Value.decode(reader, reader.uint32()));
          break;
        case 4:
          message.y = Value.unwrap(Value.decode(reader, reader.uint32()));
          break;
        case 5:
          message.width = Value.unwrap(Value.decode(reader, reader.uint32()));
          break;
        case 6:
          message.height = Value.unwrap(Value.decode(reader, reader.uint32()));
          break;
        case 7:
          message.rotation = reader.double();
          break;
        case 8:
          message.opacity = reader.double();
          break;
        case 9:
          message.scale = reader.double();
          break;
        case 10:
          message.hidden = reader.bool();
          break;
        case 12:
          message.children = ListValue.unwrap(ListValue.decode(reader, reader.uint32()));
          break;
        case 14:
          message.metadata = Value.unwrap(Value.decode(reader, reader.uint32()));
          break;
        case 100:
          message.id = reader.string();
          break;
        case 102:
          message.layoutId = reader.string();
          break;
        case 101:
          message.requestMetadata = Value.unwrap(Value.decode(reader, reader.uint32()));
          break;
        case 103:
          message.requestAnimation.push(LayerAnimation.decode(reader, reader.uint32()));
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): Layer {
    return {
      type: isSet(object.type) ? String(object.type) : "",
      data: isObject(object.data) ? object.data : undefined,
      x: isSet(object?.x) ? object.x : undefined,
      y: isSet(object?.y) ? object.y : undefined,
      width: isSet(object?.width) ? object.width : undefined,
      height: isSet(object?.height) ? object.height : undefined,
      rotation: isSet(object.rotation) ? Number(object.rotation) : 0,
      opacity: isSet(object.opacity) ? Number(object.opacity) : 0,
      scale: isSet(object.scale) ? Number(object.scale) : 0,
      hidden: isSet(object.hidden) ? Boolean(object.hidden) : false,
      children: Array.isArray(object.children) ? [...object.children] : undefined,
      metadata: isSet(object?.metadata) ? object.metadata : undefined,
      id: isSet(object.id) ? String(object.id) : "",
      layoutId: isSet(object.layoutId) ? String(object.layoutId) : "",
      requestMetadata: isSet(object?.requestMetadata) ? object.requestMetadata : undefined,
      requestAnimation: Array.isArray(object?.requestAnimation)
        ? object.requestAnimation.map((e: any) => LayerAnimation.fromJSON(e))
        : [],
    };
  },

  toJSON(message: Layer): unknown {
    const obj: any = {};
    message.type !== undefined && (obj.type = message.type);
    message.data !== undefined && (obj.data = message.data);
    message.x !== undefined && (obj.x = message.x);
    message.y !== undefined && (obj.y = message.y);
    message.width !== undefined && (obj.width = message.width);
    message.height !== undefined && (obj.height = message.height);
    message.rotation !== undefined && (obj.rotation = message.rotation);
    message.opacity !== undefined && (obj.opacity = message.opacity);
    message.scale !== undefined && (obj.scale = message.scale);
    message.hidden !== undefined && (obj.hidden = message.hidden);
    message.children !== undefined && (obj.children = message.children);
    message.metadata !== undefined && (obj.metadata = message.metadata);
    message.id !== undefined && (obj.id = message.id);
    message.layoutId !== undefined && (obj.layoutId = message.layoutId);
    message.requestMetadata !== undefined && (obj.requestMetadata = message.requestMetadata);
    if (message.requestAnimation) {
      obj.requestAnimation = message.requestAnimation.map((e) => e ? LayerAnimation.toJSON(e) : undefined);
    } else {
      obj.requestAnimation = [];
    }
    return obj;
  },

  fromPartial(object: DeepPartial<Layer>): Layer {
    const message = createBaseLayer();
    message.type = object.type ?? "";
    message.data = object.data ?? undefined;
    message.x = object.x ?? undefined;
    message.y = object.y ?? undefined;
    message.width = object.width ?? undefined;
    message.height = object.height ?? undefined;
    message.rotation = object.rotation ?? 0;
    message.opacity = object.opacity ?? 0;
    message.scale = object.scale ?? 0;
    message.hidden = object.hidden ?? false;
    message.children = object.children ?? undefined;
    message.metadata = object.metadata ?? undefined;
    message.id = object.id ?? "";
    message.layoutId = object.layoutId ?? "";
    message.requestMetadata = object.requestMetadata ?? undefined;
    message.requestAnimation = object.requestAnimation?.map((e) => LayerAnimation.fromPartial(e)) || [];
    return message;
  },
};

function createBaseDeleteLayerRequest(): DeleteLayerRequest {
  return { layoutId: "", layerId: "", payload: undefined };
}

export const DeleteLayerRequest = {
  encode(message: DeleteLayerRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.layoutId !== "") {
      writer.uint32(10).string(message.layoutId);
    }
    if (message.layerId !== "") {
      writer.uint32(18).string(message.layerId);
    }
    if (message.payload !== undefined) {
      DeleteLayerPayload.encode(message.payload, writer.uint32(26).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): DeleteLayerRequest {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseDeleteLayerRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.layoutId = reader.string();
          break;
        case 2:
          message.layerId = reader.string();
          break;
        case 3:
          message.payload = DeleteLayerPayload.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): DeleteLayerRequest {
    return {
      layoutId: isSet(object.layoutId) ? String(object.layoutId) : "",
      layerId: isSet(object.layerId) ? String(object.layerId) : "",
      payload: isSet(object.payload) ? DeleteLayerPayload.fromJSON(object.payload) : undefined,
    };
  },

  toJSON(message: DeleteLayerRequest): unknown {
    const obj: any = {};
    message.layoutId !== undefined && (obj.layoutId = message.layoutId);
    message.layerId !== undefined && (obj.layerId = message.layerId);
    message.payload !== undefined &&
      (obj.payload = message.payload ? DeleteLayerPayload.toJSON(message.payload) : undefined);
    return obj;
  },

  fromPartial(object: DeepPartial<DeleteLayerRequest>): DeleteLayerRequest {
    const message = createBaseDeleteLayerRequest();
    message.layoutId = object.layoutId ?? "";
    message.layerId = object.layerId ?? "";
    message.payload = (object.payload !== undefined && object.payload !== null)
      ? DeleteLayerPayload.fromPartial(object.payload)
      : undefined;
    return message;
  },
};

function createBaseDeleteLayerResponse(): DeleteLayerResponse {
  return { id: "", layoutId: "", requestMetadata: undefined };
}

export const DeleteLayerResponse = {
  encode(message: DeleteLayerResponse, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.id !== "") {
      writer.uint32(10).string(message.id);
    }
    if (message.layoutId !== "") {
      writer.uint32(18).string(message.layoutId);
    }
    if (message.requestMetadata !== undefined) {
      Value.encode(Value.wrap(message.requestMetadata), writer.uint32(802).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): DeleteLayerResponse {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseDeleteLayerResponse();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.id = reader.string();
          break;
        case 2:
          message.layoutId = reader.string();
          break;
        case 100:
          message.requestMetadata = Value.unwrap(Value.decode(reader, reader.uint32()));
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): DeleteLayerResponse {
    return {
      id: isSet(object.id) ? String(object.id) : "",
      layoutId: isSet(object.layoutId) ? String(object.layoutId) : "",
      requestMetadata: isSet(object?.requestMetadata) ? object.requestMetadata : undefined,
    };
  },

  toJSON(message: DeleteLayerResponse): unknown {
    const obj: any = {};
    message.id !== undefined && (obj.id = message.id);
    message.layoutId !== undefined && (obj.layoutId = message.layoutId);
    message.requestMetadata !== undefined && (obj.requestMetadata = message.requestMetadata);
    return obj;
  },

  fromPartial(object: DeepPartial<DeleteLayerResponse>): DeleteLayerResponse {
    const message = createBaseDeleteLayerResponse();
    message.id = object.id ?? "";
    message.layoutId = object.layoutId ?? "";
    message.requestMetadata = object.requestMetadata ?? undefined;
    return message;
  },
};

function createBaseBatchLayerResponse(): BatchLayerResponse {
  return {
    layers: [],
    layoutId: "",
    requestMetadata: undefined,
    requestAnimationMode: RequestAnimationMode.REQUEST_ANIMATION_MODE_UNSPECIFIED,
  };
}

export const BatchLayerResponse = {
  encode(message: BatchLayerResponse, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    for (const v of message.layers) {
      BatchLayerResponse_BatchLayerItem.encode(v!, writer.uint32(18).fork()).ldelim();
    }
    if (message.layoutId !== "") {
      writer.uint32(26).string(message.layoutId);
    }
    if (message.requestMetadata !== undefined) {
      Value.encode(Value.wrap(message.requestMetadata), writer.uint32(802).fork()).ldelim();
    }
    if (message.requestAnimationMode !== RequestAnimationMode.REQUEST_ANIMATION_MODE_UNSPECIFIED) {
      writer.uint32(808).int32(requestAnimationModeToNumber(message.requestAnimationMode));
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): BatchLayerResponse {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseBatchLayerResponse();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 2:
          message.layers.push(BatchLayerResponse_BatchLayerItem.decode(reader, reader.uint32()));
          break;
        case 3:
          message.layoutId = reader.string();
          break;
        case 100:
          message.requestMetadata = Value.unwrap(Value.decode(reader, reader.uint32()));
          break;
        case 101:
          message.requestAnimationMode = requestAnimationModeFromJSON(reader.int32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): BatchLayerResponse {
    return {
      layers: Array.isArray(object?.layers)
        ? object.layers.map((e: any) => BatchLayerResponse_BatchLayerItem.fromJSON(e))
        : [],
      layoutId: isSet(object.layoutId) ? String(object.layoutId) : "",
      requestMetadata: isSet(object?.requestMetadata) ? object.requestMetadata : undefined,
      requestAnimationMode: isSet(object.requestAnimationMode)
        ? requestAnimationModeFromJSON(object.requestAnimationMode)
        : RequestAnimationMode.REQUEST_ANIMATION_MODE_UNSPECIFIED,
    };
  },

  toJSON(message: BatchLayerResponse): unknown {
    const obj: any = {};
    if (message.layers) {
      obj.layers = message.layers.map((e) => e ? BatchLayerResponse_BatchLayerItem.toJSON(e) : undefined);
    } else {
      obj.layers = [];
    }
    message.layoutId !== undefined && (obj.layoutId = message.layoutId);
    message.requestMetadata !== undefined && (obj.requestMetadata = message.requestMetadata);
    message.requestAnimationMode !== undefined &&
      (obj.requestAnimationMode = requestAnimationModeToJSON(message.requestAnimationMode));
    return obj;
  },

  fromPartial(object: DeepPartial<BatchLayerResponse>): BatchLayerResponse {
    const message = createBaseBatchLayerResponse();
    message.layers = object.layers?.map((e) => BatchLayerResponse_BatchLayerItem.fromPartial(e)) || [];
    message.layoutId = object.layoutId ?? "";
    message.requestMetadata = object.requestMetadata ?? undefined;
    message.requestAnimationMode = object.requestAnimationMode ??
      RequestAnimationMode.REQUEST_ANIMATION_MODE_UNSPECIFIED;
    return message;
  },
};

function createBaseBatchLayerResponse_BatchLayerItem(): BatchLayerResponse_BatchLayerItem {
  return { create: undefined, update: undefined, delete: undefined };
}

export const BatchLayerResponse_BatchLayerItem = {
  encode(message: BatchLayerResponse_BatchLayerItem, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.create !== undefined) {
      Layer.encode(message.create, writer.uint32(10).fork()).ldelim();
    }
    if (message.update !== undefined) {
      Layer.encode(message.update, writer.uint32(18).fork()).ldelim();
    }
    if (message.delete !== undefined) {
      DeleteLayerResponse.encode(message.delete, writer.uint32(26).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): BatchLayerResponse_BatchLayerItem {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseBatchLayerResponse_BatchLayerItem();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.create = Layer.decode(reader, reader.uint32());
          break;
        case 2:
          message.update = Layer.decode(reader, reader.uint32());
          break;
        case 3:
          message.delete = DeleteLayerResponse.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): BatchLayerResponse_BatchLayerItem {
    return {
      create: isSet(object.create) ? Layer.fromJSON(object.create) : undefined,
      update: isSet(object.update) ? Layer.fromJSON(object.update) : undefined,
      delete: isSet(object.delete) ? DeleteLayerResponse.fromJSON(object.delete) : undefined,
    };
  },

  toJSON(message: BatchLayerResponse_BatchLayerItem): unknown {
    const obj: any = {};
    message.create !== undefined && (obj.create = message.create ? Layer.toJSON(message.create) : undefined);
    message.update !== undefined && (obj.update = message.update ? Layer.toJSON(message.update) : undefined);
    message.delete !== undefined &&
      (obj.delete = message.delete ? DeleteLayerResponse.toJSON(message.delete) : undefined);
    return obj;
  },

  fromPartial(object: DeepPartial<BatchLayerResponse_BatchLayerItem>): BatchLayerResponse_BatchLayerItem {
    const message = createBaseBatchLayerResponse_BatchLayerItem();
    message.create = (object.create !== undefined && object.create !== null)
      ? Layer.fromPartial(object.create)
      : undefined;
    message.update = (object.update !== undefined && object.update !== null)
      ? Layer.fromPartial(object.update)
      : undefined;
    message.delete = (object.delete !== undefined && object.delete !== null)
      ? DeleteLayerResponse.fromPartial(object.delete)
      : undefined;
    return message;
  },
};

function createBasePartialLayout(): PartialLayout {
  return {
    width: undefined,
    height: undefined,
    metadata: undefined,
    projectId: undefined,
    collectionId: undefined,
    type: undefined,
    transitions: [],
    requestMetadata: undefined,
  };
}

export const PartialLayout = {
  encode(message: PartialLayout, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.width !== undefined) {
      writer.uint32(16).int32(message.width);
    }
    if (message.height !== undefined) {
      writer.uint32(24).int32(message.height);
    }
    if (message.metadata !== undefined) {
      Value.encode(Value.wrap(message.metadata), writer.uint32(50).fork()).ldelim();
    }
    if (message.projectId !== undefined) {
      writer.uint32(58).string(message.projectId);
    }
    if (message.collectionId !== undefined) {
      writer.uint32(66).string(message.collectionId);
    }
    if (message.type !== undefined) {
      writer.uint32(72).int32(layoutTypeToNumber(message.type));
    }
    for (const v of message.transitions) {
      Transition.encode(v!, writer.uint32(82).fork()).ldelim();
    }
    if (message.requestMetadata !== undefined) {
      Value.encode(Value.wrap(message.requestMetadata), writer.uint32(810).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): PartialLayout {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBasePartialLayout();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 2:
          message.width = reader.int32();
          break;
        case 3:
          message.height = reader.int32();
          break;
        case 6:
          message.metadata = Value.unwrap(Value.decode(reader, reader.uint32()));
          break;
        case 7:
          message.projectId = reader.string();
          break;
        case 8:
          message.collectionId = reader.string();
          break;
        case 9:
          message.type = layoutTypeFromJSON(reader.int32());
          break;
        case 10:
          message.transitions.push(Transition.decode(reader, reader.uint32()));
          break;
        case 101:
          message.requestMetadata = Value.unwrap(Value.decode(reader, reader.uint32()));
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): PartialLayout {
    return {
      width: isSet(object.width) ? Number(object.width) : undefined,
      height: isSet(object.height) ? Number(object.height) : undefined,
      metadata: isSet(object?.metadata) ? object.metadata : undefined,
      projectId: isSet(object.projectId) ? String(object.projectId) : undefined,
      collectionId: isSet(object.collectionId) ? String(object.collectionId) : undefined,
      type: isSet(object.type) ? layoutTypeFromJSON(object.type) : undefined,
      transitions: Array.isArray(object?.transitions) ? object.transitions.map((e: any) => Transition.fromJSON(e)) : [],
      requestMetadata: isSet(object?.requestMetadata) ? object.requestMetadata : undefined,
    };
  },

  toJSON(message: PartialLayout): unknown {
    const obj: any = {};
    message.width !== undefined && (obj.width = Math.round(message.width));
    message.height !== undefined && (obj.height = Math.round(message.height));
    message.metadata !== undefined && (obj.metadata = message.metadata);
    message.projectId !== undefined && (obj.projectId = message.projectId);
    message.collectionId !== undefined && (obj.collectionId = message.collectionId);
    message.type !== undefined && (obj.type = message.type !== undefined ? layoutTypeToJSON(message.type) : undefined);
    if (message.transitions) {
      obj.transitions = message.transitions.map((e) => e ? Transition.toJSON(e) : undefined);
    } else {
      obj.transitions = [];
    }
    message.requestMetadata !== undefined && (obj.requestMetadata = message.requestMetadata);
    return obj;
  },

  fromPartial(object: DeepPartial<PartialLayout>): PartialLayout {
    const message = createBasePartialLayout();
    message.width = object.width ?? undefined;
    message.height = object.height ?? undefined;
    message.metadata = object.metadata ?? undefined;
    message.projectId = object.projectId ?? undefined;
    message.collectionId = object.collectionId ?? undefined;
    message.type = object.type ?? undefined;
    message.transitions = object.transitions?.map((e) => Transition.fromPartial(e)) || [];
    message.requestMetadata = object.requestMetadata ?? undefined;
    return message;
  },
};

function createBaseListLayoutsRequest(): ListLayoutsRequest {
  return { projectId: undefined, collectionId: undefined, type: undefined };
}

export const ListLayoutsRequest = {
  encode(message: ListLayoutsRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.projectId !== undefined) {
      writer.uint32(10).string(message.projectId);
    }
    if (message.collectionId !== undefined) {
      writer.uint32(18).string(message.collectionId);
    }
    if (message.type !== undefined) {
      writer.uint32(24).int32(layoutTypeToNumber(message.type));
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): ListLayoutsRequest {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseListLayoutsRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.projectId = reader.string();
          break;
        case 2:
          message.collectionId = reader.string();
          break;
        case 3:
          message.type = layoutTypeFromJSON(reader.int32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): ListLayoutsRequest {
    return {
      projectId: isSet(object.projectId) ? String(object.projectId) : undefined,
      collectionId: isSet(object.collectionId) ? String(object.collectionId) : undefined,
      type: isSet(object.type) ? layoutTypeFromJSON(object.type) : undefined,
    };
  },

  toJSON(message: ListLayoutsRequest): unknown {
    const obj: any = {};
    message.projectId !== undefined && (obj.projectId = message.projectId);
    message.collectionId !== undefined && (obj.collectionId = message.collectionId);
    message.type !== undefined && (obj.type = message.type !== undefined ? layoutTypeToJSON(message.type) : undefined);
    return obj;
  },

  fromPartial(object: DeepPartial<ListLayoutsRequest>): ListLayoutsRequest {
    const message = createBaseListLayoutsRequest();
    message.projectId = object.projectId ?? undefined;
    message.collectionId = object.collectionId ?? undefined;
    message.type = object.type ?? undefined;
    return message;
  },
};

function createBaseListLayoutsResponse(): ListLayoutsResponse {
  return { layouts: [] };
}

export const ListLayoutsResponse = {
  encode(message: ListLayoutsResponse, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    for (const v of message.layouts) {
      Layout.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): ListLayoutsResponse {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseListLayoutsResponse();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.layouts.push(Layout.decode(reader, reader.uint32()));
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): ListLayoutsResponse {
    return { layouts: Array.isArray(object?.layouts) ? object.layouts.map((e: any) => Layout.fromJSON(e)) : [] };
  },

  toJSON(message: ListLayoutsResponse): unknown {
    const obj: any = {};
    if (message.layouts) {
      obj.layouts = message.layouts.map((e) => e ? Layout.toJSON(e) : undefined);
    } else {
      obj.layouts = [];
    }
    return obj;
  },

  fromPartial(object: DeepPartial<ListLayoutsResponse>): ListLayoutsResponse {
    const message = createBaseListLayoutsResponse();
    message.layouts = object.layouts?.map((e) => Layout.fromPartial(e)) || [];
    return message;
  },
};

function createBaseCreateLayoutRequest(): CreateLayoutRequest {
  return { layout: undefined };
}

export const CreateLayoutRequest = {
  encode(message: CreateLayoutRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.layout !== undefined) {
      PartialLayout.encode(message.layout, writer.uint32(18).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): CreateLayoutRequest {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseCreateLayoutRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 2:
          message.layout = PartialLayout.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): CreateLayoutRequest {
    return { layout: isSet(object.layout) ? PartialLayout.fromJSON(object.layout) : undefined };
  },

  toJSON(message: CreateLayoutRequest): unknown {
    const obj: any = {};
    message.layout !== undefined && (obj.layout = message.layout ? PartialLayout.toJSON(message.layout) : undefined);
    return obj;
  },

  fromPartial(object: DeepPartial<CreateLayoutRequest>): CreateLayoutRequest {
    const message = createBaseCreateLayoutRequest();
    message.layout = (object.layout !== undefined && object.layout !== null)
      ? PartialLayout.fromPartial(object.layout)
      : undefined;
    return message;
  },
};

function createBaseGetLayoutRequest(): GetLayoutRequest {
  return { layoutId: "" };
}

export const GetLayoutRequest = {
  encode(message: GetLayoutRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.layoutId !== "") {
      writer.uint32(10).string(message.layoutId);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): GetLayoutRequest {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseGetLayoutRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
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

  fromJSON(object: any): GetLayoutRequest {
    return { layoutId: isSet(object.layoutId) ? String(object.layoutId) : "" };
  },

  toJSON(message: GetLayoutRequest): unknown {
    const obj: any = {};
    message.layoutId !== undefined && (obj.layoutId = message.layoutId);
    return obj;
  },

  fromPartial(object: DeepPartial<GetLayoutRequest>): GetLayoutRequest {
    const message = createBaseGetLayoutRequest();
    message.layoutId = object.layoutId ?? "";
    return message;
  },
};

function createBaseUpdateLayoutRequest(): UpdateLayoutRequest {
  return { layoutId: "", layout: undefined };
}

export const UpdateLayoutRequest = {
  encode(message: UpdateLayoutRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.layoutId !== "") {
      writer.uint32(10).string(message.layoutId);
    }
    if (message.layout !== undefined) {
      PartialLayout.encode(message.layout, writer.uint32(26).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): UpdateLayoutRequest {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseUpdateLayoutRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.layoutId = reader.string();
          break;
        case 3:
          message.layout = PartialLayout.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): UpdateLayoutRequest {
    return {
      layoutId: isSet(object.layoutId) ? String(object.layoutId) : "",
      layout: isSet(object.layout) ? PartialLayout.fromJSON(object.layout) : undefined,
    };
  },

  toJSON(message: UpdateLayoutRequest): unknown {
    const obj: any = {};
    message.layoutId !== undefined && (obj.layoutId = message.layoutId);
    message.layout !== undefined && (obj.layout = message.layout ? PartialLayout.toJSON(message.layout) : undefined);
    return obj;
  },

  fromPartial(object: DeepPartial<UpdateLayoutRequest>): UpdateLayoutRequest {
    const message = createBaseUpdateLayoutRequest();
    message.layoutId = object.layoutId ?? "";
    message.layout = (object.layout !== undefined && object.layout !== null)
      ? PartialLayout.fromPartial(object.layout)
      : undefined;
    return message;
  },
};

function createBaseDeleteLayoutPayload(): DeleteLayoutPayload {
  return { requestMetadata: undefined };
}

export const DeleteLayoutPayload = {
  encode(message: DeleteLayoutPayload, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.requestMetadata !== undefined) {
      Value.encode(Value.wrap(message.requestMetadata), writer.uint32(802).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): DeleteLayoutPayload {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseDeleteLayoutPayload();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 100:
          message.requestMetadata = Value.unwrap(Value.decode(reader, reader.uint32()));
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): DeleteLayoutPayload {
    return { requestMetadata: isSet(object?.requestMetadata) ? object.requestMetadata : undefined };
  },

  toJSON(message: DeleteLayoutPayload): unknown {
    const obj: any = {};
    message.requestMetadata !== undefined && (obj.requestMetadata = message.requestMetadata);
    return obj;
  },

  fromPartial(object: DeepPartial<DeleteLayoutPayload>): DeleteLayoutPayload {
    const message = createBaseDeleteLayoutPayload();
    message.requestMetadata = object.requestMetadata ?? undefined;
    return message;
  },
};

function createBaseDeleteLayoutRequest(): DeleteLayoutRequest {
  return { layoutId: "", payload: undefined };
}

export const DeleteLayoutRequest = {
  encode(message: DeleteLayoutRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.layoutId !== "") {
      writer.uint32(10).string(message.layoutId);
    }
    if (message.payload !== undefined) {
      DeleteLayoutPayload.encode(message.payload, writer.uint32(18).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): DeleteLayoutRequest {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseDeleteLayoutRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.layoutId = reader.string();
          break;
        case 2:
          message.payload = DeleteLayoutPayload.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): DeleteLayoutRequest {
    return {
      layoutId: isSet(object.layoutId) ? String(object.layoutId) : "",
      payload: isSet(object.payload) ? DeleteLayoutPayload.fromJSON(object.payload) : undefined,
    };
  },

  toJSON(message: DeleteLayoutRequest): unknown {
    const obj: any = {};
    message.layoutId !== undefined && (obj.layoutId = message.layoutId);
    message.payload !== undefined &&
      (obj.payload = message.payload ? DeleteLayoutPayload.toJSON(message.payload) : undefined);
    return obj;
  },

  fromPartial(object: DeepPartial<DeleteLayoutRequest>): DeleteLayoutRequest {
    const message = createBaseDeleteLayoutRequest();
    message.layoutId = object.layoutId ?? "";
    message.payload = (object.payload !== undefined && object.payload !== null)
      ? DeleteLayoutPayload.fromPartial(object.payload)
      : undefined;
    return message;
  },
};

function createBaseDeleteLayoutResponse(): DeleteLayoutResponse {
  return { id: "", requestMetadata: undefined };
}

export const DeleteLayoutResponse = {
  encode(message: DeleteLayoutResponse, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.id !== "") {
      writer.uint32(18).string(message.id);
    }
    if (message.requestMetadata !== undefined) {
      Value.encode(Value.wrap(message.requestMetadata), writer.uint32(802).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): DeleteLayoutResponse {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseDeleteLayoutResponse();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 2:
          message.id = reader.string();
          break;
        case 100:
          message.requestMetadata = Value.unwrap(Value.decode(reader, reader.uint32()));
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): DeleteLayoutResponse {
    return {
      id: isSet(object.id) ? String(object.id) : "",
      requestMetadata: isSet(object?.requestMetadata) ? object.requestMetadata : undefined,
    };
  },

  toJSON(message: DeleteLayoutResponse): unknown {
    const obj: any = {};
    message.id !== undefined && (obj.id = message.id);
    message.requestMetadata !== undefined && (obj.requestMetadata = message.requestMetadata);
    return obj;
  },

  fromPartial(object: DeepPartial<DeleteLayoutResponse>): DeleteLayoutResponse {
    const message = createBaseDeleteLayoutResponse();
    message.id = object.id ?? "";
    message.requestMetadata = object.requestMetadata ?? undefined;
    return message;
  },
};

function createBaseLayerAnimation(): LayerAnimation {
  return { properties: [], durationMs: 0, delayMs: undefined, easingMode: undefined };
}

export const LayerAnimation = {
  encode(message: LayerAnimation, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    for (const v of message.properties) {
      writer.uint32(10).string(v!);
    }
    if (message.durationMs !== 0) {
      writer.uint32(16).int32(message.durationMs);
    }
    if (message.delayMs !== undefined) {
      writer.uint32(32).int32(message.delayMs);
    }
    if (message.easingMode !== undefined) {
      writer.uint32(42).string(message.easingMode);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): LayerAnimation {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseLayerAnimation();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.properties.push(reader.string());
          break;
        case 2:
          message.durationMs = reader.int32();
          break;
        case 4:
          message.delayMs = reader.int32();
          break;
        case 5:
          message.easingMode = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): LayerAnimation {
    return {
      properties: Array.isArray(object?.properties) ? object.properties.map((e: any) => String(e)) : [],
      durationMs: isSet(object.durationMs) ? Number(object.durationMs) : 0,
      delayMs: isSet(object.delayMs) ? Number(object.delayMs) : undefined,
      easingMode: isSet(object.easingMode) ? String(object.easingMode) : undefined,
    };
  },

  toJSON(message: LayerAnimation): unknown {
    const obj: any = {};
    if (message.properties) {
      obj.properties = message.properties.map((e) => e);
    } else {
      obj.properties = [];
    }
    message.durationMs !== undefined && (obj.durationMs = Math.round(message.durationMs));
    message.delayMs !== undefined && (obj.delayMs = Math.round(message.delayMs));
    message.easingMode !== undefined && (obj.easingMode = message.easingMode);
    return obj;
  },

  fromPartial(object: DeepPartial<LayerAnimation>): LayerAnimation {
    const message = createBaseLayerAnimation();
    message.properties = object.properties?.map((e) => e) || [];
    message.durationMs = object.durationMs ?? 0;
    message.delayMs = object.delayMs ?? undefined;
    message.easingMode = object.easingMode ?? undefined;
    return message;
  },
};

function createBasePartialLayer(): PartialLayer {
  return {
    type: undefined,
    data: undefined,
    x: undefined,
    y: undefined,
    width: undefined,
    height: undefined,
    rotation: undefined,
    opacity: undefined,
    scale: undefined,
    hidden: undefined,
    children: undefined,
    parentId: undefined,
    metadata: undefined,
    requestMetadata: undefined,
    requestAnimation: [],
  };
}

export const PartialLayer = {
  encode(message: PartialLayer, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.type !== undefined) {
      writer.uint32(10).string(message.type);
    }
    if (message.data !== undefined) {
      Struct.encode(Struct.wrap(message.data), writer.uint32(18).fork()).ldelim();
    }
    if (message.x !== undefined) {
      Value.encode(Value.wrap(message.x), writer.uint32(26).fork()).ldelim();
    }
    if (message.y !== undefined) {
      Value.encode(Value.wrap(message.y), writer.uint32(34).fork()).ldelim();
    }
    if (message.width !== undefined) {
      Value.encode(Value.wrap(message.width), writer.uint32(42).fork()).ldelim();
    }
    if (message.height !== undefined) {
      Value.encode(Value.wrap(message.height), writer.uint32(50).fork()).ldelim();
    }
    if (message.rotation !== undefined) {
      writer.uint32(57).double(message.rotation);
    }
    if (message.opacity !== undefined) {
      writer.uint32(65).double(message.opacity);
    }
    if (message.scale !== undefined) {
      writer.uint32(73).double(message.scale);
    }
    if (message.hidden !== undefined) {
      writer.uint32(80).bool(message.hidden);
    }
    if (message.children !== undefined) {
      ListValue.encode(ListValue.wrap(message.children), writer.uint32(98).fork()).ldelim();
    }
    if (message.parentId !== undefined) {
      writer.uint32(106).string(message.parentId);
    }
    if (message.metadata !== undefined) {
      Value.encode(Value.wrap(message.metadata), writer.uint32(114).fork()).ldelim();
    }
    if (message.requestMetadata !== undefined) {
      Value.encode(Value.wrap(message.requestMetadata), writer.uint32(802).fork()).ldelim();
    }
    for (const v of message.requestAnimation) {
      LayerAnimation.encode(v!, writer.uint32(826).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): PartialLayer {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBasePartialLayer();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.type = reader.string();
          break;
        case 2:
          message.data = Struct.unwrap(Struct.decode(reader, reader.uint32()));
          break;
        case 3:
          message.x = Value.unwrap(Value.decode(reader, reader.uint32()));
          break;
        case 4:
          message.y = Value.unwrap(Value.decode(reader, reader.uint32()));
          break;
        case 5:
          message.width = Value.unwrap(Value.decode(reader, reader.uint32()));
          break;
        case 6:
          message.height = Value.unwrap(Value.decode(reader, reader.uint32()));
          break;
        case 7:
          message.rotation = reader.double();
          break;
        case 8:
          message.opacity = reader.double();
          break;
        case 9:
          message.scale = reader.double();
          break;
        case 10:
          message.hidden = reader.bool();
          break;
        case 12:
          message.children = ListValue.unwrap(ListValue.decode(reader, reader.uint32()));
          break;
        case 13:
          message.parentId = reader.string();
          break;
        case 14:
          message.metadata = Value.unwrap(Value.decode(reader, reader.uint32()));
          break;
        case 100:
          message.requestMetadata = Value.unwrap(Value.decode(reader, reader.uint32()));
          break;
        case 103:
          message.requestAnimation.push(LayerAnimation.decode(reader, reader.uint32()));
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): PartialLayer {
    return {
      type: isSet(object.type) ? String(object.type) : undefined,
      data: isObject(object.data) ? object.data : undefined,
      x: isSet(object?.x) ? object.x : undefined,
      y: isSet(object?.y) ? object.y : undefined,
      width: isSet(object?.width) ? object.width : undefined,
      height: isSet(object?.height) ? object.height : undefined,
      rotation: isSet(object.rotation) ? Number(object.rotation) : undefined,
      opacity: isSet(object.opacity) ? Number(object.opacity) : undefined,
      scale: isSet(object.scale) ? Number(object.scale) : undefined,
      hidden: isSet(object.hidden) ? Boolean(object.hidden) : undefined,
      children: Array.isArray(object.children) ? [...object.children] : undefined,
      parentId: isSet(object.parentId) ? String(object.parentId) : undefined,
      metadata: isSet(object?.metadata) ? object.metadata : undefined,
      requestMetadata: isSet(object?.requestMetadata) ? object.requestMetadata : undefined,
      requestAnimation: Array.isArray(object?.requestAnimation)
        ? object.requestAnimation.map((e: any) => LayerAnimation.fromJSON(e))
        : [],
    };
  },

  toJSON(message: PartialLayer): unknown {
    const obj: any = {};
    message.type !== undefined && (obj.type = message.type);
    message.data !== undefined && (obj.data = message.data);
    message.x !== undefined && (obj.x = message.x);
    message.y !== undefined && (obj.y = message.y);
    message.width !== undefined && (obj.width = message.width);
    message.height !== undefined && (obj.height = message.height);
    message.rotation !== undefined && (obj.rotation = message.rotation);
    message.opacity !== undefined && (obj.opacity = message.opacity);
    message.scale !== undefined && (obj.scale = message.scale);
    message.hidden !== undefined && (obj.hidden = message.hidden);
    message.children !== undefined && (obj.children = message.children);
    message.parentId !== undefined && (obj.parentId = message.parentId);
    message.metadata !== undefined && (obj.metadata = message.metadata);
    message.requestMetadata !== undefined && (obj.requestMetadata = message.requestMetadata);
    if (message.requestAnimation) {
      obj.requestAnimation = message.requestAnimation.map((e) => e ? LayerAnimation.toJSON(e) : undefined);
    } else {
      obj.requestAnimation = [];
    }
    return obj;
  },

  fromPartial(object: DeepPartial<PartialLayer>): PartialLayer {
    const message = createBasePartialLayer();
    message.type = object.type ?? undefined;
    message.data = object.data ?? undefined;
    message.x = object.x ?? undefined;
    message.y = object.y ?? undefined;
    message.width = object.width ?? undefined;
    message.height = object.height ?? undefined;
    message.rotation = object.rotation ?? undefined;
    message.opacity = object.opacity ?? undefined;
    message.scale = object.scale ?? undefined;
    message.hidden = object.hidden ?? undefined;
    message.children = object.children ?? undefined;
    message.parentId = object.parentId ?? undefined;
    message.metadata = object.metadata ?? undefined;
    message.requestMetadata = object.requestMetadata ?? undefined;
    message.requestAnimation = object.requestAnimation?.map((e) => LayerAnimation.fromPartial(e)) || [];
    return message;
  },
};

function createBasePartialLayerWithID(): PartialLayerWithID {
  return {
    id: "",
    type: undefined,
    data: undefined,
    x: undefined,
    y: undefined,
    width: undefined,
    height: undefined,
    rotation: undefined,
    opacity: undefined,
    scale: undefined,
    hidden: undefined,
    children: undefined,
    parentId: undefined,
    metadata: undefined,
    requestMetadata: undefined,
    requestAnimation: [],
  };
}

export const PartialLayerWithID = {
  encode(message: PartialLayerWithID, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.id !== "") {
      writer.uint32(8002).string(message.id);
    }
    if (message.type !== undefined) {
      writer.uint32(10).string(message.type);
    }
    if (message.data !== undefined) {
      Struct.encode(Struct.wrap(message.data), writer.uint32(18).fork()).ldelim();
    }
    if (message.x !== undefined) {
      Value.encode(Value.wrap(message.x), writer.uint32(26).fork()).ldelim();
    }
    if (message.y !== undefined) {
      Value.encode(Value.wrap(message.y), writer.uint32(34).fork()).ldelim();
    }
    if (message.width !== undefined) {
      Value.encode(Value.wrap(message.width), writer.uint32(42).fork()).ldelim();
    }
    if (message.height !== undefined) {
      Value.encode(Value.wrap(message.height), writer.uint32(50).fork()).ldelim();
    }
    if (message.rotation !== undefined) {
      writer.uint32(57).double(message.rotation);
    }
    if (message.opacity !== undefined) {
      writer.uint32(65).double(message.opacity);
    }
    if (message.scale !== undefined) {
      writer.uint32(73).double(message.scale);
    }
    if (message.hidden !== undefined) {
      writer.uint32(80).bool(message.hidden);
    }
    if (message.children !== undefined) {
      ListValue.encode(ListValue.wrap(message.children), writer.uint32(98).fork()).ldelim();
    }
    if (message.parentId !== undefined) {
      writer.uint32(106).string(message.parentId);
    }
    if (message.metadata !== undefined) {
      Value.encode(Value.wrap(message.metadata), writer.uint32(114).fork()).ldelim();
    }
    if (message.requestMetadata !== undefined) {
      Value.encode(Value.wrap(message.requestMetadata), writer.uint32(802).fork()).ldelim();
    }
    for (const v of message.requestAnimation) {
      LayerAnimation.encode(v!, writer.uint32(826).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): PartialLayerWithID {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBasePartialLayerWithID();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1000:
          message.id = reader.string();
          break;
        case 1:
          message.type = reader.string();
          break;
        case 2:
          message.data = Struct.unwrap(Struct.decode(reader, reader.uint32()));
          break;
        case 3:
          message.x = Value.unwrap(Value.decode(reader, reader.uint32()));
          break;
        case 4:
          message.y = Value.unwrap(Value.decode(reader, reader.uint32()));
          break;
        case 5:
          message.width = Value.unwrap(Value.decode(reader, reader.uint32()));
          break;
        case 6:
          message.height = Value.unwrap(Value.decode(reader, reader.uint32()));
          break;
        case 7:
          message.rotation = reader.double();
          break;
        case 8:
          message.opacity = reader.double();
          break;
        case 9:
          message.scale = reader.double();
          break;
        case 10:
          message.hidden = reader.bool();
          break;
        case 12:
          message.children = ListValue.unwrap(ListValue.decode(reader, reader.uint32()));
          break;
        case 13:
          message.parentId = reader.string();
          break;
        case 14:
          message.metadata = Value.unwrap(Value.decode(reader, reader.uint32()));
          break;
        case 100:
          message.requestMetadata = Value.unwrap(Value.decode(reader, reader.uint32()));
          break;
        case 103:
          message.requestAnimation.push(LayerAnimation.decode(reader, reader.uint32()));
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): PartialLayerWithID {
    return {
      id: isSet(object.id) ? String(object.id) : "",
      type: isSet(object.type) ? String(object.type) : undefined,
      data: isObject(object.data) ? object.data : undefined,
      x: isSet(object?.x) ? object.x : undefined,
      y: isSet(object?.y) ? object.y : undefined,
      width: isSet(object?.width) ? object.width : undefined,
      height: isSet(object?.height) ? object.height : undefined,
      rotation: isSet(object.rotation) ? Number(object.rotation) : undefined,
      opacity: isSet(object.opacity) ? Number(object.opacity) : undefined,
      scale: isSet(object.scale) ? Number(object.scale) : undefined,
      hidden: isSet(object.hidden) ? Boolean(object.hidden) : undefined,
      children: Array.isArray(object.children) ? [...object.children] : undefined,
      parentId: isSet(object.parentId) ? String(object.parentId) : undefined,
      metadata: isSet(object?.metadata) ? object.metadata : undefined,
      requestMetadata: isSet(object?.requestMetadata) ? object.requestMetadata : undefined,
      requestAnimation: Array.isArray(object?.requestAnimation)
        ? object.requestAnimation.map((e: any) => LayerAnimation.fromJSON(e))
        : [],
    };
  },

  toJSON(message: PartialLayerWithID): unknown {
    const obj: any = {};
    message.id !== undefined && (obj.id = message.id);
    message.type !== undefined && (obj.type = message.type);
    message.data !== undefined && (obj.data = message.data);
    message.x !== undefined && (obj.x = message.x);
    message.y !== undefined && (obj.y = message.y);
    message.width !== undefined && (obj.width = message.width);
    message.height !== undefined && (obj.height = message.height);
    message.rotation !== undefined && (obj.rotation = message.rotation);
    message.opacity !== undefined && (obj.opacity = message.opacity);
    message.scale !== undefined && (obj.scale = message.scale);
    message.hidden !== undefined && (obj.hidden = message.hidden);
    message.children !== undefined && (obj.children = message.children);
    message.parentId !== undefined && (obj.parentId = message.parentId);
    message.metadata !== undefined && (obj.metadata = message.metadata);
    message.requestMetadata !== undefined && (obj.requestMetadata = message.requestMetadata);
    if (message.requestAnimation) {
      obj.requestAnimation = message.requestAnimation.map((e) => e ? LayerAnimation.toJSON(e) : undefined);
    } else {
      obj.requestAnimation = [];
    }
    return obj;
  },

  fromPartial(object: DeepPartial<PartialLayerWithID>): PartialLayerWithID {
    const message = createBasePartialLayerWithID();
    message.id = object.id ?? "";
    message.type = object.type ?? undefined;
    message.data = object.data ?? undefined;
    message.x = object.x ?? undefined;
    message.y = object.y ?? undefined;
    message.width = object.width ?? undefined;
    message.height = object.height ?? undefined;
    message.rotation = object.rotation ?? undefined;
    message.opacity = object.opacity ?? undefined;
    message.scale = object.scale ?? undefined;
    message.hidden = object.hidden ?? undefined;
    message.children = object.children ?? undefined;
    message.parentId = object.parentId ?? undefined;
    message.metadata = object.metadata ?? undefined;
    message.requestMetadata = object.requestMetadata ?? undefined;
    message.requestAnimation = object.requestAnimation?.map((e) => LayerAnimation.fromPartial(e)) || [];
    return message;
  },
};

function createBaseListLayersRequest(): ListLayersRequest {
  return { layoutId: "" };
}

export const ListLayersRequest = {
  encode(message: ListLayersRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.layoutId !== "") {
      writer.uint32(10).string(message.layoutId);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): ListLayersRequest {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseListLayersRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
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

  fromJSON(object: any): ListLayersRequest {
    return { layoutId: isSet(object.layoutId) ? String(object.layoutId) : "" };
  },

  toJSON(message: ListLayersRequest): unknown {
    const obj: any = {};
    message.layoutId !== undefined && (obj.layoutId = message.layoutId);
    return obj;
  },

  fromPartial(object: DeepPartial<ListLayersRequest>): ListLayersRequest {
    const message = createBaseListLayersRequest();
    message.layoutId = object.layoutId ?? "";
    return message;
  },
};

function createBaseListLayersResponse(): ListLayersResponse {
  return { layers: [] };
}

export const ListLayersResponse = {
  encode(message: ListLayersResponse, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    for (const v of message.layers) {
      Layer.encode(v!, writer.uint32(10).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): ListLayersResponse {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseListLayersResponse();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.layers.push(Layer.decode(reader, reader.uint32()));
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): ListLayersResponse {
    return { layers: Array.isArray(object?.layers) ? object.layers.map((e: any) => Layer.fromJSON(e)) : [] };
  },

  toJSON(message: ListLayersResponse): unknown {
    const obj: any = {};
    if (message.layers) {
      obj.layers = message.layers.map((e) => e ? Layer.toJSON(e) : undefined);
    } else {
      obj.layers = [];
    }
    return obj;
  },

  fromPartial(object: DeepPartial<ListLayersResponse>): ListLayersResponse {
    const message = createBaseListLayersResponse();
    message.layers = object.layers?.map((e) => Layer.fromPartial(e)) || [];
    return message;
  },
};

function createBaseCreateLayerRequest(): CreateLayerRequest {
  return { layoutId: "", layer: undefined };
}

export const CreateLayerRequest = {
  encode(message: CreateLayerRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.layoutId !== "") {
      writer.uint32(10).string(message.layoutId);
    }
    if (message.layer !== undefined) {
      PartialLayer.encode(message.layer, writer.uint32(18).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): CreateLayerRequest {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseCreateLayerRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.layoutId = reader.string();
          break;
        case 2:
          message.layer = PartialLayer.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): CreateLayerRequest {
    return {
      layoutId: isSet(object.layoutId) ? String(object.layoutId) : "",
      layer: isSet(object.layer) ? PartialLayer.fromJSON(object.layer) : undefined,
    };
  },

  toJSON(message: CreateLayerRequest): unknown {
    const obj: any = {};
    message.layoutId !== undefined && (obj.layoutId = message.layoutId);
    message.layer !== undefined && (obj.layer = message.layer ? PartialLayer.toJSON(message.layer) : undefined);
    return obj;
  },

  fromPartial(object: DeepPartial<CreateLayerRequest>): CreateLayerRequest {
    const message = createBaseCreateLayerRequest();
    message.layoutId = object.layoutId ?? "";
    message.layer = (object.layer !== undefined && object.layer !== null)
      ? PartialLayer.fromPartial(object.layer)
      : undefined;
    return message;
  },
};

function createBaseGetLayerRequest(): GetLayerRequest {
  return { layoutId: "", layerId: "" };
}

export const GetLayerRequest = {
  encode(message: GetLayerRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.layoutId !== "") {
      writer.uint32(10).string(message.layoutId);
    }
    if (message.layerId !== "") {
      writer.uint32(18).string(message.layerId);
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): GetLayerRequest {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseGetLayerRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.layoutId = reader.string();
          break;
        case 2:
          message.layerId = reader.string();
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): GetLayerRequest {
    return {
      layoutId: isSet(object.layoutId) ? String(object.layoutId) : "",
      layerId: isSet(object.layerId) ? String(object.layerId) : "",
    };
  },

  toJSON(message: GetLayerRequest): unknown {
    const obj: any = {};
    message.layoutId !== undefined && (obj.layoutId = message.layoutId);
    message.layerId !== undefined && (obj.layerId = message.layerId);
    return obj;
  },

  fromPartial(object: DeepPartial<GetLayerRequest>): GetLayerRequest {
    const message = createBaseGetLayerRequest();
    message.layoutId = object.layoutId ?? "";
    message.layerId = object.layerId ?? "";
    return message;
  },
};

function createBaseUpdateLayerRequest(): UpdateLayerRequest {
  return { layoutId: "", layerId: "", layer: undefined };
}

export const UpdateLayerRequest = {
  encode(message: UpdateLayerRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.layoutId !== "") {
      writer.uint32(10).string(message.layoutId);
    }
    if (message.layerId !== "") {
      writer.uint32(18).string(message.layerId);
    }
    if (message.layer !== undefined) {
      PartialLayer.encode(message.layer, writer.uint32(26).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): UpdateLayerRequest {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseUpdateLayerRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.layoutId = reader.string();
          break;
        case 2:
          message.layerId = reader.string();
          break;
        case 3:
          message.layer = PartialLayer.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): UpdateLayerRequest {
    return {
      layoutId: isSet(object.layoutId) ? String(object.layoutId) : "",
      layerId: isSet(object.layerId) ? String(object.layerId) : "",
      layer: isSet(object.layer) ? PartialLayer.fromJSON(object.layer) : undefined,
    };
  },

  toJSON(message: UpdateLayerRequest): unknown {
    const obj: any = {};
    message.layoutId !== undefined && (obj.layoutId = message.layoutId);
    message.layerId !== undefined && (obj.layerId = message.layerId);
    message.layer !== undefined && (obj.layer = message.layer ? PartialLayer.toJSON(message.layer) : undefined);
    return obj;
  },

  fromPartial(object: DeepPartial<UpdateLayerRequest>): UpdateLayerRequest {
    const message = createBaseUpdateLayerRequest();
    message.layoutId = object.layoutId ?? "";
    message.layerId = object.layerId ?? "";
    message.layer = (object.layer !== undefined && object.layer !== null)
      ? PartialLayer.fromPartial(object.layer)
      : undefined;
    return message;
  },
};

function createBaseDeleteLayerPayload(): DeleteLayerPayload {
  return { requestMetadata: undefined };
}

export const DeleteLayerPayload = {
  encode(message: DeleteLayerPayload, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.requestMetadata !== undefined) {
      Value.encode(Value.wrap(message.requestMetadata), writer.uint32(802).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): DeleteLayerPayload {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseDeleteLayerPayload();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 100:
          message.requestMetadata = Value.unwrap(Value.decode(reader, reader.uint32()));
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): DeleteLayerPayload {
    return { requestMetadata: isSet(object?.requestMetadata) ? object.requestMetadata : undefined };
  },

  toJSON(message: DeleteLayerPayload): unknown {
    const obj: any = {};
    message.requestMetadata !== undefined && (obj.requestMetadata = message.requestMetadata);
    return obj;
  },

  fromPartial(object: DeepPartial<DeleteLayerPayload>): DeleteLayerPayload {
    const message = createBaseDeleteLayerPayload();
    message.requestMetadata = object.requestMetadata ?? undefined;
    return message;
  },
};

function createBaseBatchDeleteLayerRequest(): BatchDeleteLayerRequest {
  return { id: "", requestMetadata: undefined };
}

export const BatchDeleteLayerRequest = {
  encode(message: BatchDeleteLayerRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.id !== "") {
      writer.uint32(10).string(message.id);
    }
    if (message.requestMetadata !== undefined) {
      Value.encode(Value.wrap(message.requestMetadata), writer.uint32(802).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): BatchDeleteLayerRequest {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseBatchDeleteLayerRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.id = reader.string();
          break;
        case 100:
          message.requestMetadata = Value.unwrap(Value.decode(reader, reader.uint32()));
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): BatchDeleteLayerRequest {
    return {
      id: isSet(object.id) ? String(object.id) : "",
      requestMetadata: isSet(object?.requestMetadata) ? object.requestMetadata : undefined,
    };
  },

  toJSON(message: BatchDeleteLayerRequest): unknown {
    const obj: any = {};
    message.id !== undefined && (obj.id = message.id);
    message.requestMetadata !== undefined && (obj.requestMetadata = message.requestMetadata);
    return obj;
  },

  fromPartial(object: DeepPartial<BatchDeleteLayerRequest>): BatchDeleteLayerRequest {
    const message = createBaseBatchDeleteLayerRequest();
    message.id = object.id ?? "";
    message.requestMetadata = object.requestMetadata ?? undefined;
    return message;
  },
};

function createBaseBatchLayerRequest(): BatchLayerRequest {
  return { layoutId: "", layers: [], requestMetadata: undefined, requestAnimationMode: undefined };
}

export const BatchLayerRequest = {
  encode(message: BatchLayerRequest, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.layoutId !== "") {
      writer.uint32(10).string(message.layoutId);
    }
    for (const v of message.layers) {
      BatchLayerRequest_BatchItem.encode(v!, writer.uint32(18).fork()).ldelim();
    }
    if (message.requestMetadata !== undefined) {
      Value.encode(Value.wrap(message.requestMetadata), writer.uint32(802).fork()).ldelim();
    }
    if (message.requestAnimationMode !== undefined) {
      writer.uint32(808).int32(requestAnimationModeToNumber(message.requestAnimationMode));
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): BatchLayerRequest {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseBatchLayerRequest();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.layoutId = reader.string();
          break;
        case 2:
          message.layers.push(BatchLayerRequest_BatchItem.decode(reader, reader.uint32()));
          break;
        case 100:
          message.requestMetadata = Value.unwrap(Value.decode(reader, reader.uint32()));
          break;
        case 101:
          message.requestAnimationMode = requestAnimationModeFromJSON(reader.int32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): BatchLayerRequest {
    return {
      layoutId: isSet(object.layoutId) ? String(object.layoutId) : "",
      layers: Array.isArray(object?.layers)
        ? object.layers.map((e: any) => BatchLayerRequest_BatchItem.fromJSON(e))
        : [],
      requestMetadata: isSet(object?.requestMetadata) ? object.requestMetadata : undefined,
      requestAnimationMode: isSet(object.requestAnimationMode)
        ? requestAnimationModeFromJSON(object.requestAnimationMode)
        : undefined,
    };
  },

  toJSON(message: BatchLayerRequest): unknown {
    const obj: any = {};
    message.layoutId !== undefined && (obj.layoutId = message.layoutId);
    if (message.layers) {
      obj.layers = message.layers.map((e) => e ? BatchLayerRequest_BatchItem.toJSON(e) : undefined);
    } else {
      obj.layers = [];
    }
    message.requestMetadata !== undefined && (obj.requestMetadata = message.requestMetadata);
    message.requestAnimationMode !== undefined && (obj.requestAnimationMode = message.requestAnimationMode !== undefined
      ? requestAnimationModeToJSON(message.requestAnimationMode)
      : undefined);
    return obj;
  },

  fromPartial(object: DeepPartial<BatchLayerRequest>): BatchLayerRequest {
    const message = createBaseBatchLayerRequest();
    message.layoutId = object.layoutId ?? "";
    message.layers = object.layers?.map((e) => BatchLayerRequest_BatchItem.fromPartial(e)) || [];
    message.requestMetadata = object.requestMetadata ?? undefined;
    message.requestAnimationMode = object.requestAnimationMode ?? undefined;
    return message;
  },
};

function createBaseBatchLayerRequest_BatchItem(): BatchLayerRequest_BatchItem {
  return { create: undefined, update: undefined, delete: undefined };
}

export const BatchLayerRequest_BatchItem = {
  encode(message: BatchLayerRequest_BatchItem, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.create !== undefined) {
      PartialLayer.encode(message.create, writer.uint32(10).fork()).ldelim();
    }
    if (message.update !== undefined) {
      PartialLayerWithID.encode(message.update, writer.uint32(18).fork()).ldelim();
    }
    if (message.delete !== undefined) {
      BatchDeleteLayerRequest.encode(message.delete, writer.uint32(26).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): BatchLayerRequest_BatchItem {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseBatchLayerRequest_BatchItem();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.create = PartialLayer.decode(reader, reader.uint32());
          break;
        case 2:
          message.update = PartialLayerWithID.decode(reader, reader.uint32());
          break;
        case 3:
          message.delete = BatchDeleteLayerRequest.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): BatchLayerRequest_BatchItem {
    return {
      create: isSet(object.create) ? PartialLayer.fromJSON(object.create) : undefined,
      update: isSet(object.update) ? PartialLayerWithID.fromJSON(object.update) : undefined,
      delete: isSet(object.delete) ? BatchDeleteLayerRequest.fromJSON(object.delete) : undefined,
    };
  },

  toJSON(message: BatchLayerRequest_BatchItem): unknown {
    const obj: any = {};
    message.create !== undefined && (obj.create = message.create ? PartialLayer.toJSON(message.create) : undefined);
    message.update !== undefined &&
      (obj.update = message.update ? PartialLayerWithID.toJSON(message.update) : undefined);
    message.delete !== undefined &&
      (obj.delete = message.delete ? BatchDeleteLayerRequest.toJSON(message.delete) : undefined);
    return obj;
  },

  fromPartial(object: DeepPartial<BatchLayerRequest_BatchItem>): BatchLayerRequest_BatchItem {
    const message = createBaseBatchLayerRequest_BatchItem();
    message.create = (object.create !== undefined && object.create !== null)
      ? PartialLayer.fromPartial(object.create)
      : undefined;
    message.update = (object.update !== undefined && object.update !== null)
      ? PartialLayerWithID.fromPartial(object.update)
      : undefined;
    message.delete = (object.delete !== undefined && object.delete !== null)
      ? BatchDeleteLayerRequest.fromPartial(object.delete)
      : undefined;
    return message;
  },
};

function createBaseLayoutEvent(): LayoutEvent {
  return { create: undefined, update: undefined, delete: undefined };
}

export const LayoutEvent = {
  encode(message: LayoutEvent, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.create !== undefined) {
      Layout.encode(message.create, writer.uint32(10).fork()).ldelim();
    }
    if (message.update !== undefined) {
      Layout.encode(message.update, writer.uint32(18).fork()).ldelim();
    }
    if (message.delete !== undefined) {
      DeleteLayoutResponse.encode(message.delete, writer.uint32(26).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): LayoutEvent {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseLayoutEvent();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.create = Layout.decode(reader, reader.uint32());
          break;
        case 2:
          message.update = Layout.decode(reader, reader.uint32());
          break;
        case 3:
          message.delete = DeleteLayoutResponse.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): LayoutEvent {
    return {
      create: isSet(object.create) ? Layout.fromJSON(object.create) : undefined,
      update: isSet(object.update) ? Layout.fromJSON(object.update) : undefined,
      delete: isSet(object.delete) ? DeleteLayoutResponse.fromJSON(object.delete) : undefined,
    };
  },

  toJSON(message: LayoutEvent): unknown {
    const obj: any = {};
    message.create !== undefined && (obj.create = message.create ? Layout.toJSON(message.create) : undefined);
    message.update !== undefined && (obj.update = message.update ? Layout.toJSON(message.update) : undefined);
    message.delete !== undefined &&
      (obj.delete = message.delete ? DeleteLayoutResponse.toJSON(message.delete) : undefined);
    return obj;
  },

  fromPartial(object: DeepPartial<LayoutEvent>): LayoutEvent {
    const message = createBaseLayoutEvent();
    message.create = (object.create !== undefined && object.create !== null)
      ? Layout.fromPartial(object.create)
      : undefined;
    message.update = (object.update !== undefined && object.update !== null)
      ? Layout.fromPartial(object.update)
      : undefined;
    message.delete = (object.delete !== undefined && object.delete !== null)
      ? DeleteLayoutResponse.fromPartial(object.delete)
      : undefined;
    return message;
  },
};

function createBaseLayerEvent(): LayerEvent {
  return { create: undefined, update: undefined, delete: undefined, batch: undefined };
}

export const LayerEvent = {
  encode(message: LayerEvent, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.create !== undefined) {
      Layer.encode(message.create, writer.uint32(10).fork()).ldelim();
    }
    if (message.update !== undefined) {
      Layer.encode(message.update, writer.uint32(18).fork()).ldelim();
    }
    if (message.delete !== undefined) {
      DeleteLayerResponse.encode(message.delete, writer.uint32(26).fork()).ldelim();
    }
    if (message.batch !== undefined) {
      BatchLayerResponse.encode(message.batch, writer.uint32(34).fork()).ldelim();
    }
    return writer;
  },

  decode(input: _m0.Reader | Uint8Array, length?: number): LayerEvent {
    const reader = input instanceof _m0.Reader ? input : new _m0.Reader(input);
    let end = length === undefined ? reader.len : reader.pos + length;
    const message = createBaseLayerEvent();
    while (reader.pos < end) {
      const tag = reader.uint32();
      switch (tag >>> 3) {
        case 1:
          message.create = Layer.decode(reader, reader.uint32());
          break;
        case 2:
          message.update = Layer.decode(reader, reader.uint32());
          break;
        case 3:
          message.delete = DeleteLayerResponse.decode(reader, reader.uint32());
          break;
        case 4:
          message.batch = BatchLayerResponse.decode(reader, reader.uint32());
          break;
        default:
          reader.skipType(tag & 7);
          break;
      }
    }
    return message;
  },

  fromJSON(object: any): LayerEvent {
    return {
      create: isSet(object.create) ? Layer.fromJSON(object.create) : undefined,
      update: isSet(object.update) ? Layer.fromJSON(object.update) : undefined,
      delete: isSet(object.delete) ? DeleteLayerResponse.fromJSON(object.delete) : undefined,
      batch: isSet(object.batch) ? BatchLayerResponse.fromJSON(object.batch) : undefined,
    };
  },

  toJSON(message: LayerEvent): unknown {
    const obj: any = {};
    message.create !== undefined && (obj.create = message.create ? Layer.toJSON(message.create) : undefined);
    message.update !== undefined && (obj.update = message.update ? Layer.toJSON(message.update) : undefined);
    message.delete !== undefined &&
      (obj.delete = message.delete ? DeleteLayerResponse.toJSON(message.delete) : undefined);
    message.batch !== undefined && (obj.batch = message.batch ? BatchLayerResponse.toJSON(message.batch) : undefined);
    return obj;
  },

  fromPartial(object: DeepPartial<LayerEvent>): LayerEvent {
    const message = createBaseLayerEvent();
    message.create = (object.create !== undefined && object.create !== null)
      ? Layer.fromPartial(object.create)
      : undefined;
    message.update = (object.update !== undefined && object.update !== null)
      ? Layer.fromPartial(object.update)
      : undefined;
    message.delete = (object.delete !== undefined && object.delete !== null)
      ? DeleteLayerResponse.fromPartial(object.delete)
      : undefined;
    message.batch = (object.batch !== undefined && object.batch !== null)
      ? BatchLayerResponse.fromPartial(object.batch)
      : undefined;
    return message;
  },
};

function createBaseEvent(): Event {
  return { layout: undefined, layer: undefined };
}

export const Event = {
  encode(message: Event, writer: _m0.Writer = _m0.Writer.create()): _m0.Writer {
    if (message.layout !== undefined) {
      LayoutEvent.encode(message.layout, writer.uint32(10).fork()).ldelim();
    }
    if (message.layer !== undefined) {
      LayerEvent.encode(message.layer, writer.uint32(18).fork()).ldelim();
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
          message.layout = LayoutEvent.decode(reader, reader.uint32());
          break;
        case 2:
          message.layer = LayerEvent.decode(reader, reader.uint32());
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
      layout: isSet(object.layout) ? LayoutEvent.fromJSON(object.layout) : undefined,
      layer: isSet(object.layer) ? LayerEvent.fromJSON(object.layer) : undefined,
    };
  },

  toJSON(message: Event): unknown {
    const obj: any = {};
    message.layout !== undefined && (obj.layout = message.layout ? LayoutEvent.toJSON(message.layout) : undefined);
    message.layer !== undefined && (obj.layer = message.layer ? LayerEvent.toJSON(message.layer) : undefined);
    return obj;
  },

  fromPartial(object: DeepPartial<Event>): Event {
    const message = createBaseEvent();
    message.layout = (object.layout !== undefined && object.layout !== null)
      ? LayoutEvent.fromPartial(object.layout)
      : undefined;
    message.layer = (object.layer !== undefined && object.layer !== null)
      ? LayerEvent.fromPartial(object.layer)
      : undefined;
    return message;
  },
};

/** Layers */
export interface LayerService {
  /** List all layers */
  ListLayers(request: ListLayersRequest): Promise<ListLayersResponse>;
  /**
   * Create a layer
   * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
   * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
   */
  CreateLayer(request: CreateLayerRequest): Promise<Layer>;
  /**
   * Get a single layer
   * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
   * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
   */
  GetLayer(request: GetLayerRequest): Promise<Layer>;
  /**
   * Update a layer
   * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
   * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
   */
  UpdateLayer(request: UpdateLayerRequest): Promise<Layer>;
  /** Delete a layer */
  DeleteLayer(request: DeleteLayerRequest): Promise<DeleteLayerResponse>;
  /**
   * Batch update
   * buf:lint:ignore RPC_REQUEST_STANDARD_NAME
   * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
   */
  Batch(request: BatchLayerRequest): Promise<BatchLayerResponse>;
}

export class LayerServiceClientImpl implements LayerService {
  private readonly rpc: Rpc;
  private readonly service: string;
  constructor(rpc: Rpc, opts?: { service?: string }) {
    this.service = opts?.service || "apis.layout.v2.LayerService";
    this.rpc = rpc;
    this.ListLayers = this.ListLayers.bind(this);
    this.CreateLayer = this.CreateLayer.bind(this);
    this.GetLayer = this.GetLayer.bind(this);
    this.UpdateLayer = this.UpdateLayer.bind(this);
    this.DeleteLayer = this.DeleteLayer.bind(this);
    this.Batch = this.Batch.bind(this);
  }
  ListLayers(request: ListLayersRequest): Promise<ListLayersResponse> {
    const data = ListLayersRequest.encode(request).finish();
    const promise = this.rpc.request(this.service, "ListLayers", data);
    return promise.then((data) => ListLayersResponse.decode(new _m0.Reader(data)));
  }

  CreateLayer(request: CreateLayerRequest): Promise<Layer> {
    const data = CreateLayerRequest.encode(request).finish();
    const promise = this.rpc.request(this.service, "CreateLayer", data);
    return promise.then((data) => Layer.decode(new _m0.Reader(data)));
  }

  GetLayer(request: GetLayerRequest): Promise<Layer> {
    const data = GetLayerRequest.encode(request).finish();
    const promise = this.rpc.request(this.service, "GetLayer", data);
    return promise.then((data) => Layer.decode(new _m0.Reader(data)));
  }

  UpdateLayer(request: UpdateLayerRequest): Promise<Layer> {
    const data = UpdateLayerRequest.encode(request).finish();
    const promise = this.rpc.request(this.service, "UpdateLayer", data);
    return promise.then((data) => Layer.decode(new _m0.Reader(data)));
  }

  DeleteLayer(request: DeleteLayerRequest): Promise<DeleteLayerResponse> {
    const data = DeleteLayerRequest.encode(request).finish();
    const promise = this.rpc.request(this.service, "DeleteLayer", data);
    return promise.then((data) => DeleteLayerResponse.decode(new _m0.Reader(data)));
  }

  Batch(request: BatchLayerRequest): Promise<BatchLayerResponse> {
    const data = BatchLayerRequest.encode(request).finish();
    const promise = this.rpc.request(this.service, "Batch", data);
    return promise.then((data) => BatchLayerResponse.decode(new _m0.Reader(data)));
  }
}

/** Layers */
export type LayerServiceDefinition = typeof LayerServiceDefinition;
export const LayerServiceDefinition = {
  name: "LayerService",
  fullName: "apis.layout.v2.LayerService",
  methods: {
    /** List all layers */
    listLayers: {
      name: "ListLayers",
      requestType: ListLayersRequest,
      requestStream: false,
      responseType: ListLayersResponse,
      responseStream: false,
      options: {},
    },
    /**
     * Create a layer
     * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
     * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
     */
    createLayer: {
      name: "CreateLayer",
      requestType: CreateLayerRequest,
      requestStream: false,
      responseType: Layer,
      responseStream: false,
      options: {},
    },
    /**
     * Get a single layer
     * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
     * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
     */
    getLayer: {
      name: "GetLayer",
      requestType: GetLayerRequest,
      requestStream: false,
      responseType: Layer,
      responseStream: false,
      options: {},
    },
    /**
     * Update a layer
     * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
     * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
     */
    updateLayer: {
      name: "UpdateLayer",
      requestType: UpdateLayerRequest,
      requestStream: false,
      responseType: Layer,
      responseStream: false,
      options: {},
    },
    /** Delete a layer */
    deleteLayer: {
      name: "DeleteLayer",
      requestType: DeleteLayerRequest,
      requestStream: false,
      responseType: DeleteLayerResponse,
      responseStream: false,
      options: {},
    },
    /**
     * Batch update
     * buf:lint:ignore RPC_REQUEST_STANDARD_NAME
     * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
     */
    batch: {
      name: "Batch",
      requestType: BatchLayerRequest,
      requestStream: false,
      responseType: BatchLayerResponse,
      responseStream: false,
      options: {},
    },
  },
} as const;

/** Layouts */
export interface LayoutService {
  /** Get all layouts owned by the user. */
  ListLayouts(request: ListLayoutsRequest): Promise<ListLayoutsResponse>;
  /**
   * Create a new layout
   * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
   * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
   */
  CreateLayout(request: CreateLayoutRequest): Promise<Layout>;
  /**
   * Get a layout
   * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
   * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
   */
  GetLayout(request: GetLayoutRequest): Promise<Layout>;
  /**
   * Update a layout
   * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
   * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
   */
  UpdateLayout(request: UpdateLayoutRequest): Promise<Layout>;
  /** Delete a layout */
  DeleteLayout(request: DeleteLayoutRequest): Promise<DeleteLayoutResponse>;
}

export class LayoutServiceClientImpl implements LayoutService {
  private readonly rpc: Rpc;
  private readonly service: string;
  constructor(rpc: Rpc, opts?: { service?: string }) {
    this.service = opts?.service || "apis.layout.v2.LayoutService";
    this.rpc = rpc;
    this.ListLayouts = this.ListLayouts.bind(this);
    this.CreateLayout = this.CreateLayout.bind(this);
    this.GetLayout = this.GetLayout.bind(this);
    this.UpdateLayout = this.UpdateLayout.bind(this);
    this.DeleteLayout = this.DeleteLayout.bind(this);
  }
  ListLayouts(request: ListLayoutsRequest): Promise<ListLayoutsResponse> {
    const data = ListLayoutsRequest.encode(request).finish();
    const promise = this.rpc.request(this.service, "ListLayouts", data);
    return promise.then((data) => ListLayoutsResponse.decode(new _m0.Reader(data)));
  }

  CreateLayout(request: CreateLayoutRequest): Promise<Layout> {
    const data = CreateLayoutRequest.encode(request).finish();
    const promise = this.rpc.request(this.service, "CreateLayout", data);
    return promise.then((data) => Layout.decode(new _m0.Reader(data)));
  }

  GetLayout(request: GetLayoutRequest): Promise<Layout> {
    const data = GetLayoutRequest.encode(request).finish();
    const promise = this.rpc.request(this.service, "GetLayout", data);
    return promise.then((data) => Layout.decode(new _m0.Reader(data)));
  }

  UpdateLayout(request: UpdateLayoutRequest): Promise<Layout> {
    const data = UpdateLayoutRequest.encode(request).finish();
    const promise = this.rpc.request(this.service, "UpdateLayout", data);
    return promise.then((data) => Layout.decode(new _m0.Reader(data)));
  }

  DeleteLayout(request: DeleteLayoutRequest): Promise<DeleteLayoutResponse> {
    const data = DeleteLayoutRequest.encode(request).finish();
    const promise = this.rpc.request(this.service, "DeleteLayout", data);
    return promise.then((data) => DeleteLayoutResponse.decode(new _m0.Reader(data)));
  }
}

/** Layouts */
export type LayoutServiceDefinition = typeof LayoutServiceDefinition;
export const LayoutServiceDefinition = {
  name: "LayoutService",
  fullName: "apis.layout.v2.LayoutService",
  methods: {
    /** Get all layouts owned by the user. */
    listLayouts: {
      name: "ListLayouts",
      requestType: ListLayoutsRequest,
      requestStream: false,
      responseType: ListLayoutsResponse,
      responseStream: false,
      options: {},
    },
    /**
     * Create a new layout
     * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
     * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
     */
    createLayout: {
      name: "CreateLayout",
      requestType: CreateLayoutRequest,
      requestStream: false,
      responseType: Layout,
      responseStream: false,
      options: {},
    },
    /**
     * Get a layout
     * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
     * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
     */
    getLayout: {
      name: "GetLayout",
      requestType: GetLayoutRequest,
      requestStream: false,
      responseType: Layout,
      responseStream: false,
      options: {},
    },
    /**
     * Update a layout
     * buf:lint:ignore RPC_RESPONSE_STANDARD_NAME
     * buf:lint:ignore RPC_REQUEST_RESPONSE_UNIQUE
     */
    updateLayout: {
      name: "UpdateLayout",
      requestType: UpdateLayoutRequest,
      requestStream: false,
      responseType: Layout,
      responseStream: false,
      options: {},
    },
    /** Delete a layout */
    deleteLayout: {
      name: "DeleteLayout",
      requestType: DeleteLayoutRequest,
      requestStream: false,
      responseType: DeleteLayoutResponse,
      responseStream: false,
      options: {},
    },
  },
} as const;

interface Rpc {
  request(service: string, method: string, data: Uint8Array): Promise<Uint8Array>;
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
