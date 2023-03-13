FROM amazoncorretto:11-alpine-jdk
MAINTAINER Brasat
COPY target/Springboott-0.0.1-SNAPSHOT.jar Springboott-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/Springboott-0.0.1-SNAPSHOT.jar"]