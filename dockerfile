FROM openjdk:17-jdk-slim
COPY build/libs/productService-0.0.1-SNAPSHOT.war /app/productService.war
CMD ["java", "-jar", "/app/productService.war"]
