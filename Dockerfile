FROM openjdk:8-alpine
MAINTAINER hieutt
COPY ./target/*.jar personal.jar
ENTRYPOINT ["java", "-jar", "/personal.jar"]