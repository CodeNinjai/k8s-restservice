# Use an official OpenJDK runtime as a parent image
FROM openjdk:22-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the build artifact from the build context to the container
COPY build/libs/HelloWorldService-0.0.1-SNAPSHOT.jar app.jar

# Expose the port that the Spring Boot app listens on
EXPOSE 8080

# Run the Spring Boot application
CMD ["java", "-jar", "app.jar"]
