#!/bin/sh
cd /Users/kabu/hashicorp/intellij/consul-intentions-demo/japanapp
pwd
./mvnw clean package -DskipTests
pwd
docker build -t tkaburagi/japanapp .
docker tag tkaburagi/japanapp gcr.io/se-kabu/japanapp
docker push gcr.io/se-kabu/japanapp
pwd