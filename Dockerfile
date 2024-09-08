FROM openjdk:17.0.2-jdk
LABEL authors="Fabiano SSantos"

RUN mkdir /app
WORKDIR /app
COPY target/screenmatch-0.0.1-SNAPSHOT.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/app/app.jar"]