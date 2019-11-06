FROM java:8
COPY target/auto-build-demo-0.0.1-SNAPSHOT.jar /
WORKDIR /
CMD ["java","-jar","auto-build-demo-0.0.1-SNAPSHOT.jar"]
