FROM adoptopenjdk/maven-openjdk11:latest AS builder

COPY pom.xml /pom/
COPY spbadmin/settings.xml /pom/
COPY spbadmin/pom.xml /pom/spbadmin/
COPY samples/pom.xml /pom/samples/
COPY samples/hello-world/pom.xml /pom/samples/hello-world/

WORKDIR /pom
RUN mvn dependency:go-offline -s ./settings.xml
