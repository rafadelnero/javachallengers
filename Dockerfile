FROM openjdk:13-slim

COPY . /usr/src/myapp
WORKDIR /usr/src/myapp

RUN javac --enable-preview --release 13 NeoSearch.java

ENTRYPOINT ["java", "--enable-preview", "NeoSearch"]




