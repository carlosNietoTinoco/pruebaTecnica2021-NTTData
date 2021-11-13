FROM maven:3.8.1-openjdk-11-slim AS build
ENV DB_SERVER='goyaservidor.database.windows.net'
ENV SQL_SERVER_DB='Goya'
ENV SQL_SERVER_USER='pruebas2'
ENV SQL_SERVER_PASSWORD='1234567A%'
RUN mkdir -p /workspace
WORKDIR /workspace
COPY pom.xml /workspace
COPY src /workspace/src
#MSSQL SERVER JDBC DRIVER INSTALL
COPY lib /camunda/lib/
RUN mvn -f pom.xml clean package

FROM azul/zulu-openjdk-alpine:11.0.12
COPY --from=build /workspace/target/*.jar app.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","app.jar"]
