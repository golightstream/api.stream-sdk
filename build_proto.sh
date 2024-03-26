# ---------------------------------------------------------------------------------------------
# Copyright (c) Infiniscene, Inc. All rights reserved.
# Licensed under the MIT License. See License.txt in the project root for license information.
# ---------------------------------------------------------------------------------------------

# todo: expose proto directly, but for now use local repo
LIGHTSTREAM_PROTO_ROOT=$PWD/../lightstream/proto/idl
OUTPUT_DIR=$PWD/js/sdk/src/liveapi/proto/ts

# Copy proto files from source
rm -rf $PWD/proto/common $PWD/proto/live
mkdir -p $PWD/proto/common/v21 $PWD/proto/live/v21 
cp -r $LIGHTSTREAM_PROTO_ROOT/common/v21/* $PWD/proto/common/v21
cp -r $LIGHTSTREAM_PROTO_ROOT/live/v21/api.proto $PWD/proto/live/v21

# Generate everything
(cd proto && buf generate)

# Cleanup
rm -rf $OUTPUT_DIR/protoc-gen-openapiv2

# Add license headers to new files
npx license-check-and-add add -f build/license-header.json
