FROM openjdk:8
ENV APP_HOME /app
ENV APP_FILE sample-demo.jar
WORKDIR $APP_HOME
COPY ./target/$APP_FILE $APP_HOME
EXPOSE 8080

ENTRYPOINT exec java \
-Dspring.profiles.active=sg \
-Dregion=sg \
-jar sample-demo.jar
