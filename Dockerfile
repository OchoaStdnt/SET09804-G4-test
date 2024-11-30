FROM openjdk:latest
COPY ./target/SET09804-G4-test-0.3.0.1-jar-with-dependencies.jar /tmp
WORKDIR /tmp
ENTRYPOINT ["java", "-jar", "SET09804-G4-test-0.3.0.1-jar-with-dependencies.jar"]