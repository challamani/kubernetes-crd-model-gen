
## Kubernetes CRD Generation

### Generate using crd-model-gen docker images

The `ghcr.io/kubernetes-client/java/crd-model-gen` Docker image, it requires the respective CRDs and `openAPIV3Schema`. 

#### Manifest generation using `ghcr.io/kubernetes-client/java/crd-model-gen` docker image
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

### Generate using json-patch

#### Json/Yaml patch using `json-patch` lib

An example yaml resource before applying the patch

```yaml
apiVersion: apps/v1
kind: Deployment
metadata:
  name: nginx-deployment
  labels:
    app: nginx
spec:
  replicas: 1
  selector:
    matchLabels:
      app: nginx
  template:
    metadata:
      labels:
        app: nginx
    spec:
      containers:
        - name: nginx
          image: nginx:latest
          ports:
            - containerPort: 80
```

You can use the `ObjectMapper from jackson` to transform Yaml to Json, and vice versa.

An example patch will apply to above specified resource
```json
[
  {
    "op": "replace",
    "path": "/metadata/labels/app",
    "value": "nginx-patch"
  },
  {
    "op": "replace",
    "path": "/spec/replicas",
    "value": 3
  },
  {
    "op": "add",
    "path": "/spec/template/metadata/labels",
    "value": {
      "sampleKey": "sampleValue",
      "instance": "nginx-patch"
    }
  },
  {
    "op": "replace",
    "path": "/spec/template/spec/containers/0/ports/0/containerPort",
    "value": 443
  }
]
```

After applying the patch

```yaml
apiVersion: "apps/v1"
kind: "Deployment"
metadata:
  name: "nginx-deployment"
  labels:
    app: "nginx-patch"
spec:
  replicas: 3
  selector:
    matchLabels:
      app: "nginx"
  template:
    metadata:
      labels:
        sampleKey: "sampleValue"
        instance: "nginx-patch"
    spec:
      containers:
      - name: "nginx"
        image: "nginx:latest"
        ports:
        - containerPort: 443
```
