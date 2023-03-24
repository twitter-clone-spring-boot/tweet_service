FROM maven:3.8.5-jdk-11 AS build
COPY src /usr/src/app/src
COPY pom.xml /usr/src/app
RUN mvn -f /usr/src/app/pom.xml clean package

FROM gcr.io/distroless/java
COPY --from=build /usr/src/app/target/tweet_service_app-0.0.1-SNAPSHOT.jar /usr/app/tweet_service_app-0.0.1-SNAPSHOT.jar
#Do something about this hardcoded PORT
EXPOSE 8761
ENTRYPOINT ["java","-jar","/usr/app/tweet_service_app-0.0.1-SNAPSHOT.jar"]