from openjdk:12-alpine
MAINTAINER github.com/fmarquesg
COPY ./target/alticci-sequence-0.0.1-SNAPSHOT.jar /app/alticci-sequence-0.0.1-SNAPSHOT.jar
WORKDIR /app
ENTRYPOINT ["java", "-jar", "alticci-sequence-0.0.1-SNAPSHOT.jar"]
EXPOSE 8080