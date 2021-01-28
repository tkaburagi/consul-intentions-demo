#!/bin/sh
cd /Users/kabu/hashicorp/intellij/consul-intentions-demo/corpapp
pwd
./mvnw clean package -DskipTests
pwd
docker build -t tkaburagi/corxpapp .
docker tag tkaburagi/corxpapp gcr.io/se-kabu/corxpapp
docker push gcr.io/se-kabu/corxpapp
pwd