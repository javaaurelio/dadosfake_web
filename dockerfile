from openjdk:18-alpine
RUN echo Contrucao iniciada....
MAINTAINER javaaurelio/dadosfake_web
COPY ./target/demo-0.0.1-SNAPSHOT.jar /app/demo-0.0.1-SNAPSHOT.jar
RUN echo Copy com sucesso...
WORKDIR /app
ARG versao
ENV versao_env=$versao
ENTRYPOINT ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar -Dversao=\" $versao  ${versao_env}  \""]
RUN echo Cmd argumento:  -Dversao=$versao
EXPOSE 8080