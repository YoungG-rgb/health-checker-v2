FROM openjdk:17.0.2-slim-buster

WORKDIR /app

COPY /target/health-checker.jar /app

CMD ["java", "-jar", "/app/health-checker.jar"]