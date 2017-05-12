FROM openjdk
MAINTAINER Alexander Schmidt <work@alaxat.com>
ADD build/libs/ml-zipkin-0.0.1-SNAPSHOT.jar ml-zipkin.jar
ENTRYPOINT ["java", "-jar", "/ml-zipkin.jar"]
EXPOSE 9411