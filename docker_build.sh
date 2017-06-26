#!/usr/bin/env bash
./gradlew clean build
docker rmi alaxat/ml-zipkin alaxat/ml-customer alaxat/ml-order alaxat/ml-discovery
docker build -t alaxat/ml-discovery     ./ml-discovery
docker build -t alaxat/ml-order         ./ml-order
docker build -t alaxat/ml-customer      ./ml-customer
docker build -t alaxat/ml-zipkin        ./ml-zipkin






