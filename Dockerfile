# Use official Java image
FROM openjdk:17

# Set working directory
WORKDIR /app

# Copy Java file
COPY Fibonacciseries.java .

# Compile
RUN javac Fibonacciseries.java

# Run program (default argument)
CMD ["java", "Fibonacciseries", "7"]
