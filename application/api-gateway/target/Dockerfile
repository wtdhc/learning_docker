FROM openjdk:8-jre-alpine

# environment
EXPOSE 8080

# executable ADD api-gateway-5.0.0-SNAPSHOT.jar app.jar
ADD api-gateway.jar app.jar

# run app as user 'booter'
RUN /bin/sh -c 'touch /app.jar'
ENTRYPOINT ["java", "-Xmx256m", "-Xss32m", "-Djava.security.egd=file:/dev/./urandom","-jar","/app.jar"]
