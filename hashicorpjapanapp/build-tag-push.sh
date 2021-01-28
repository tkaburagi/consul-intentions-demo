#!/bin/sh
cd /Users/kabu/hashicorp/intellij/consul-intentions-demo/hashicorpjapanapp
pwd
./mvnw clean package -DskipTests
pwd
docker build -t tkaburagi/hcxapp .
docker tag tkaburagi/hcxapp gcr.io/se-kabu/hcxapp
docker push gcr.io/se-kabu/hcxapp
pwd