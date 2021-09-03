FROM amazoncorretto:11-alpine-jdk
ARG JAR_FILE=target/*.jar
EXPOSE 8080
COPY ${JAR_FILE} project.jar
ENTRYPOINT ["java","-jar","/project.jar"]