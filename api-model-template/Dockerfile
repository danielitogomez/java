FROM openjdk:11
COPY . .
RUN ./mvnw clean package
EXPOSE 8181
ENTRYPOINT ["java", "-jar", "/target/calculator-0.0.1-SNAPSHOT.jar"]