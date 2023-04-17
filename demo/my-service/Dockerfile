FROM ubuntu:latest

LABEL author="Hen"
LABEL maintainer="AAVN"

RUN apt-get update && apt-get install -y \
    maven \
    openjdk-8-jdk 

RUN mkdir -p /usr/src/app

WORKDIR /usr/src/app

COPY . /use/src/app

RUN mvn clean package

EXPOSE 8082
ENTRYPOINT [ "java", "-jar", "target/my-service.jar"]