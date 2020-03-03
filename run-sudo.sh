#!/bin/sh

cd japanapp 

./mvnw clean package -DskipTests

cd ../corpapp

./mvnw clean package -DskipTests

cd ../hashiapp

./mvnw clean package -DskipTests

cd ../hashicorpjapanapp

./mvnw clean package -DskipTests

cd ..

sudo docker-compose build --no-cache

sudo docker-compose up