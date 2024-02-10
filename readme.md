# Local generation
```shell
LOCAL_MANIFEST_FILE=/Users/mani/workspace/kubernetes-crd-model-gen/src/main/resources/tetrate-crd.yaml
docker run \
  --rm \
  -v "$LOCAL_MANIFEST_FILE":"$LOCAL_MANIFEST_FILE" \
  -v /var/run/docker.sock:/var/run/docker.sock \
  -v "$(pwd)":"$(pwd)" \
  -ti \
  --network host \
  ghcr.io/kubernetes-client/java/crd-model-gen:v1.0.6 \
  /generate.sh \
  -u $LOCAL_MANIFEST_FILE \
  -n io.tetrate.tsb.gateway \
  -p io.tetrate.tsb.gateway \
  -o "$(pwd)"
```
