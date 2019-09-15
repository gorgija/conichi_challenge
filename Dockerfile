FROM openjdk:8-jdk-alpine
VOLUME /tmp
ARG JAR_FILE=target/convertor-1.jar
COPY ${JAR_FILE} convertor-1.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/convertor-1.jar"]