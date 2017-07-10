#Official JDK8 image
#FROM java:openjdk-8-jdk
FROM java:openjdk-8-alpine
ADD target/SpringBootService2-0.0.1-SNAPSHOT.jar /opt/SpringBootService2-0.0.1-SNAPSHOT.jar
EXPOSE 8080
ENTRYPOINT ["java", "-jar", "/opt/SpringBootService2-0.0.1-SNAPSHOT.jar"]
