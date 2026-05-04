# Use official Java image
FROM eclipse-temurin:17-jdk
# Set working directory
WORKDIR /app

# Copy build files
COPY build/libs/*.jar app.jar

# Run application
ENTRYPOINT ["java", "-jar", "app.jar"]