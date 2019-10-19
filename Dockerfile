FROM openjdk
COPY . /usr/src/myapp
WORKDIR /usr/src/myapp

RUN javac --enable-preview --release 13 CompletableFutureChallenge.java

ENTRYPOINT ["java", "--enable-preview", "CompletableFutureChallenge"]




