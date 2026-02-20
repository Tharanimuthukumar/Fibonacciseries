FROM eclipse-temurin:17

WORKDIR /app

COPY Fibonacciseries.java .

RUN javac Fibonacciseries.java

CMD ["java", "Fibonacciseries", "7"]
