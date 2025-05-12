# Use the official OpenJDK image from the Docker Hub as the base image
FROM openjdk:17-jdk-slim as builder

# Set the working directory inside the container
WORKDIR /app

# Copy the pom.xml, mvnw, and .mvn directory to the container
COPY pom.xml .
COPY mvnw .
COPY .mvn .mvn

# Copy the source code to the container
COPY src ./src

# Run Maven build to create the JAR file using Maven Wrapper
RUN chmod +x mvnw && ./mvnw clean package -DskipTests

# Create a new stage to reduce image size (multi-stage build)
FROM openjdk:17-jdk-slim

# Set the working directory inside the container
WORKDIR /app

# Copy the JAR file from the builder stage
COPY --from=builder /app/target/registration-form-0.0.1-SNAPSHOT.jar /app/app.jar

# Expose the port the Spring Boot application will run on
EXPOSE 8080

# Command to run the application
ENTRYPOINT ["java", "-jar", "app.jar"]

