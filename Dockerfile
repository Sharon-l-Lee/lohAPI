#빌드
FROM gradle:8.5-jdk17 AS build
WORKDIR /app
COPY --chown=gradle:gradle . .
RUN gradle build -x test --no-daemon

#실행
FROM eclipse-temurin:17-jdk
WORKDIR /app
COPY --from=build /app/build/libs/*.jar app.jar
ENTRYPOINT ["java", "-jar", "app.jar"]
