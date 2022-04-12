FROM openjdk:8
ADD target/micro2-0.0.1-snapshot.jar micro2-0.0.1-snapshot.jar
ENTRYPOINT ["java", "-jar","micro2-0.0.1-snapshot.jar"]