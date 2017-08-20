FROM java:8-jre-alpine
ARG VERSION=1.0.0
COPY ./target/spring-template-app-$VERSION.jar /home/spring-template-app.jar
CMD ["java","-jar","/home/spring-template-app.jar"]
EXPOSE 8080
