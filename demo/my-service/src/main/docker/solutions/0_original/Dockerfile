FROM pnqphong/aaworkshop:ubuntu-18.04
LABEL author="Phong Pham"
LABEL maintainer="pnqphong95@gmail.com"

# Install jdk, maven
RUN apt-get update && apt-get install -y \
    maven openjdk-8-jdk

# Create a directory where our app will be placed
RUN mkdir -p /usr/src/app
WORKDIR /usr/src/app

# Copy all the code needed to build the app
COPY . /usr/src/app

# Build application
RUN mvn clean package

# Define entry point which can be executed when container start
EXPOSE 8082
ENTRYPOINT ["java","-jar","target/my-service.jar"]