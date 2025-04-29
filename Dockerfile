FROM openjdk:17-jdk

EXPOSE 8081

COPY ./build/libs/spring-boot-kotlin-crud-with-ci-cd-0.0.1-SNAPSHOT.jar /usr/app/

WORKDIR /usr/app

ENTRYPOINT ["java", "-jar", "spring-boot-kotlin-crud-with-ci-cd-0.0.1-SNAPSHOT.jar"]
