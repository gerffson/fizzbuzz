FROM openjdk:8-jdk-alpine
VOLUME /tmp
COPY target/*.jar fizzbuzz.jar
ENTRYPOINT ["java","-jar","/fizzbuzz.jar"]