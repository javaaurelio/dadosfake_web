CMD ["echo", "Construcao iniciada...."]
from openjdk:18-alpine
MAINTAINER javaaurelio/dadosfake_web
COPY ./target/demo-0.0.1-SNAPSHOT.jar /app/demo-0.0.1-SNAPSHOT.jar
CMD ["echo", "copia OK...."]
WORKDIR /app
ARG versao
ENTRYPOINT ["java", "-jar", "demo-0.0.1-SNAPSHOT.jar", "-Dversao=$versao"]
CMD ["paramentro:", "-Dversao=$versao"]
EXPOSE 8080