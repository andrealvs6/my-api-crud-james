FROM openjdk:17-jdk-slim
WORKDIR /app
COPY target/minha-api-crud-0.0.1-SNAPSHOT.jar myapp.jar
EXPOSE 8080
CMD ["java", "-jar", "myapp.jar"]