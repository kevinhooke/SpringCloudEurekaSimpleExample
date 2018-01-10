#Official JDK8 image
#FROM java:openjdk-8-jdk
FROM java:openjdk-8-alpine
ADD target/SpringCloudEureka-0.0.1-SNAPSHOT.jar /opt/SpringCloudEureka-0.0.1-SNAPSHOT.jar
EXPOSE 8761
ENTRYPOINT ["java", "-jar", "/opt/SpringCloudEureka-0.0.1-SNAPSHOT.jar"]
