# Usar a imagem OpenJDK 17 como base
FROM openjdk:17

# Definir o diretório de trabalho
WORKDIR /app

# Copiar os arquivos do Maven Wrapper
COPY .mvn/ .mvn
COPY mvnw pom.xml ./

# Dar permissão de execução para o Maven Wrapper
RUN chmod +x mvnw

# Baixar as dependências para uso offline
RUN ./mvnw dependency:go-offline

# Copiar o código-fonte da aplicação
COPY src ./src

# Compilar a aplicação
RUN ./mvnw package

# Expor a porta 80
EXPOSE 80

# Definir o comando de inicialização da aplicação
CMD ["./mvnw", "spring-boot:run"]
