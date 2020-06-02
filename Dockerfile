FROM openjdk:8-jdk-alpine
ADD ./target/univerapi.jar univerapi.jar
EXPOSE 8085
CMD java -jar univerapi.jar
