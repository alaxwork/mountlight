#!/usr/bin/env bash
./gradlew clean build
docker build -t alaxat/ml-discovery ./ml-discovery
docker build -t alaxat/ml-order ./ml-order
docker build -t alaxat/ml-service ./ml-service
docker build -t alaxat/ml-zipkin ./ml-zipkin