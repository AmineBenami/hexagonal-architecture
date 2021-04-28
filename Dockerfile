FROM maven:3-jdk-11
COPY ./pom.xml ./pom.xml
COPY ./frontend/pom.xml ./frontend/pom.xml
COPY ./backend/pom.xml ./backend/pom.xml
RUN mvn dependency:go-offline -B


ADD . /demo
WORKDIR /demo

RUN mvn clean install -DskipTests

FROM openjdk:11-jdk

COPY --from=0 "/demo/backend/target/backend-0.0.1-SNAPSHOT.jar" app.jar

ENV JAVA_OPTS=""

ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]