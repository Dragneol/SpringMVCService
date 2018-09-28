FROM java:8
EXPOSE 8080:8080
ADD target/dockerservice.jar dockerservice.jar
ENTRYPOINT ["java","-jar","dockerservice.jar"]