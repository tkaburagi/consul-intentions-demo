#!/bin/sh
cd /Users/kabu/hashicorp/intellij/consul-intentions-demo/franceapp
pwd
./mvnw clean package -DskipTests
pwd
docker build -t tkaburagi/franceapp .
docker tag tkaburagi/franceapp gcr.io/se-kabu/franceapp
docker push gcr.io/se-kabu/franceapp
pwd