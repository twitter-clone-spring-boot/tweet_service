How to run the service:


Run Eureka Server
Run Config Server
Build spec and app:
    mvn clean compile
    mvn install

Run the db using docker compose (Directly running docker file for db won;t work)

Run the app:

    cd tweet_service_app
    mvn spring-boot:run
