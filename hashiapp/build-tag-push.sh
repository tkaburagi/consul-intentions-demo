#!/bin/sh
cd /Users/kabu/hashicorp/intellij/consul-intentions-demo/hashiapp
pwd
./mvnw clean package -DskipTests
pwd
docker build -t tkaburagi/hashiapp .
docker tag tkaburagi/hashiapp gcr.io/se-kabu/hashiapp
docker push gcr.io/se-kabu/hashiapp
pwd