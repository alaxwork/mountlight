FROM openjdk
MAINTAINER Alexander Schmidt <work@alaxat.com>
ADD build/libs/ml-service-0.0.1-SNAPSHOT.jar ml-service.jar
ENTRYPOINT ["java", "-jar", "/ml-service.jar"]
EXPOSE 2222