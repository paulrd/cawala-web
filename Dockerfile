FROM java:8-alpine
MAINTAINER Your Name <you@example.com>

ADD target/uberjar/unstate.jar /unstate/app.jar

EXPOSE 3000

CMD ["java", "-jar", "/unstate/app.jar"]
