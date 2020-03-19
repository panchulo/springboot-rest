LABEL maintainer="francisco.raposo@consorcio.cl"
FROM openjdk:8-jdk-alpine
VOLUME /tmp
EXPOSE 5000
ADD target/*.jar app.jar