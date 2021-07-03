FROM tomcat:8.5-jdk8-openjdk-slim

ARG WAR_FILE=ROOT.war
COPY target/${WAR_FILE} webapps/${WAR_FILE}

EXPOSE 8080/tcp
CMD ["catalina.sh", "run"]
