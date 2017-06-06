FROM openjdk
MAINTAINER Alexander Schmidt <work@alaxat.com>
ADD build/libs/ml-order-0.0.1-SNAPSHOT.jar ml-order.jar
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=dev", "/ml-order.jar"]
EXPOSE 3001