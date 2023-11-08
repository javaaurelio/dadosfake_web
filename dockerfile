RUN echo 'Contrucao iniciada....'
from openjdk:18-alpine
MAINTAINER javaaurelio/dadosfake_web
COPY ./target/demo-0.0.1-SNAPSHOT.jar /app/demo-0.0.1-SNAPSHOT.jar
RUN echo 'Copy com sucesso...'
WORKDIR /app
ARG versao
ENTRYPOINT ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar", "-Dversao=$versao"]
RUN echo 'Cmd argumento: ' -Dversao=$versao
EXPOSE 8080