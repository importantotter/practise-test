FROM gradle:7.4-jdk17-alpine AS build

COPY --chown=gradle:gradle . /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon

FROM openjdk:17-alpine

EXPOSE 8080 8443
RUN mkdir /app
COPY --from=build /home/gradle/src/build/libs/*.jar /app/

CMD ["java", "-jar", "/app/practise-test-1.0-SNAPSHOT.jar"]