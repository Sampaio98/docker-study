FROM openjdk:14
MAINTAINER Allisson Sampaio
VOLUME /tmp
EXPOSE 8080
ADD target/app-0.0.1-SNAPSHOT.jar spring-docker.jar
ENTRYPOINT ["java","-jar","/spring-docker.jar"]