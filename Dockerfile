# Use official Java image
FROM openjdk:17

# Set working directory
WORKDIR /app

# Copy Java file
COPY Fibonacci.java .

# Compile
RUN javac Fibonacci.java

# Run program (default argument)
CMD ["java", "Fibonacci", "7"]
