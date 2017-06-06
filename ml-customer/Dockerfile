FROM openjdk
MAINTAINER Alexander Schmidt <work@alaxat.com>
ADD build/libs/ml-customer-0.0.1-SNAPSHOT.jar ml-customer.jar
ENTRYPOINT ["java", "-jar", "-Dspring.profiles.active=dev", "/ml-customer.jar"]
EXPOSE 2222