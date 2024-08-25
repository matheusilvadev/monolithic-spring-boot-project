# Projeto Monolítico de Gerenciamento de Clientes

Este é um projeto monolítico desenvolvido em Java com Spring Boot para gerenciamento de clientes. O projeto permite criar, ler, atualizar e excluir informações de clientes, com os seguintes atributos: nome, email e número.

## Estrutura do Projeto

- **src/main/java/com/exemplo/cliente**: Contém o código-fonte da aplicação.
  - **controller**: Controladores REST para gerenciar as requisições.
  - **model**: Classes de modelo que representam as entidades.
  - **repository**: Interfaces para acesso ao banco de dados.
  - **service**: Classes de serviço que contêm a lógica de negócios.
- **src/main/resources**: Contém arquivos de configuração e recursos.
  - **application.properties**: Configurações da aplicação.

## Pré-requisitos

- Java 11 ou superior
- Maven
- PostgreSQL (ou outro banco de dados compatível)
