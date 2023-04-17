# FROM ubuntu:latest
FROM maven:3.6.1-jdk-8-alpine
LABEL author="Phong Pham"
LABEL maintainer="pnqphong95@gmail.com"

## Install jdk, maven
# RUN apt-get update && apt-get install -y --no-install-recommends \
#     maven \
#     openjdk-8-jdk \
#     && rm -rf /var/lib/apt/lists/*

RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app

COPY . /usr/src/app

RUN mvn clean package

EXPOSE 8082
ENTRYPOINT ["java","-jar","target/my-service.jar"]