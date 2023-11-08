from openjdk:18-alpine
RUN echo Contrucao iniciada....
MAINTAINER javaaurelio/dadosfake_web
COPY ./target/demo-0.0.1-SNAPSHOT.jar /app/demo-0.0.1-SNAPSHOT.jar
RUN echo Copy com sucesso...
WORKDIR /app
ENTRYPOINT ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar -Dversao=1"]
EXPOSE 8080