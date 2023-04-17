# Use keyword AS <stage-name> to define a stage
FROM maven:3.6.1-jdk-8-alpine AS builder
LABEL author="Phong Pham"
LABEL maintainer="pnqphong95@gmail.com"

RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app

COPY pom.xml /usr/src/app

RUN mvn -e -B dependency:resolve

COPY . /usr/src/app

RUN mvn clean package


# Define second stage, consume the artifact from stage "builder". This stage release final image.
FROM openjdk:8-jre-alpine

COPY --from=builder /usr/src/app/target/my-service.jar /

EXPOSE 8082
ENTRYPOINT ["java","-jar","target/my-service.jar"]

