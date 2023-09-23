FROM ubuntu:20.04
RUN apt-get update 
RUN apt-get install -y wget
WORKDIR /opt
COPY ./apache-maven-3.9.4-bin.tar.gz .
RUN tar -zxvf apache-maven-3.9.4-bin.tar.gz
# RUN export PATH=$PATH:/opt/apache-maven/bin
RUN apt-get install openjdk-17-jre -y
# RUN export JAVA_HOME="/usr/lib/jvm/java-17-openjdk-amd64/"
# RUN export PATH=$PATH:$JAVA_HOME/bin
# RUN export PATH=$PATH:/opt/apache-maven/bin
WORKDIR /app
COPY . .
# CMD [ "/opt/apache-maven-3.9.4/bin/mvn", "spring-boot:run" ]
CMD [ "tail", "-f" ]