FROM openjdk:8-alpine
MAINTAINER hieutt
COPY ./target/* personal.jar
ENTRYPOINT ["java", "-jar", "/personal.jar"]