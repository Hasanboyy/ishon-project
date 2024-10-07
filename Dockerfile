# 1. Base image
# ARM arxitekturasi uchun Java 17 OpenJDK imaji
FROM arm64v8/openjdk:17

# 2. Application jar file qo'shish
ARG JAR_FILE=target/*.jar

# 3. Jar faylni image ichiga joylash
COPY ${JAR_FILE} app.jar


# 4. Portni expose qilish (Spring Web default porti 8080)
EXPOSE 8080

# 5. App-ni ishga tushirish
ENTRYPOINT ["java", "-jar", "/app.jar"]
