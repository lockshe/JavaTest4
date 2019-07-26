# Pull base image  
FROM registry.saas.hand-china.com/tools/javabase:0.5.0

MAINTAINER yzj "yeah_59@126.com"

ADD mavena.jar app.jar
# Define default command.
ENTRYPOINT ["java","-jar","/app.jar"]

