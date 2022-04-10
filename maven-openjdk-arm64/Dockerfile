### STAGE 1: Build ###
# FROM adoptopenjdk/maven-openjdk11:latest AS build
FROM arm64v8/openjdk:11-jdk AS build

MAINTAINER Dinakar Guniguntala <dinakar.g@in.ibm.com> (@dinogun)
ARG MAVEN_VERSION=3.6.3
ARG USER_HOME_DIR=/root
ARG SHA=26ad91d751b3a9a53087aefa743f4e16a17741d3915b219cf74112bf87a438c5
ARG BASE_URL=https://apache.osuosl.org/maven/maven-3/3.6.3/binaries
ARG MAVEN_VERSION=3.6.3
ARG SHA=26ad91d751b3a9a53087aefa743f4e16a17741d3915b219cf74112bf87a438c5
ARG USER_HOME_DIR=/root

RUN mkdir -p /usr/share/maven \
         && curl -Lso  /tmp/maven.tar.gz ${BASE_URL}/apache-maven-${MAVEN_VERSION}-bin.tar.gz \
         && echo "${SHA}  /tmp/maven.tar.gz" | sha256sum -c - \
         && tar -xzC /usr/share/maven --strip-components=1 -f /tmp/maven.tar.gz \
         && rm -v /tmp/maven.tar.gz \
         && ln -s /usr/share/maven/bin/mvn /usr/bin/mvn

ENV MAVEN_HOME=/usr/share/maven
ENV MAVEN_CONFIG=/root/.m2
CMD ["/usr/bin/mvn"]
