# API - Cartão Virtual

Este projeto é uma API REST simples para **cadastro de clientes** e **geração de números de cartão virtual únicos**, desenvolvido com Java e Spring Boot.

## Funcionalidades
- POST/casdastrar- cadastro do novo cliente (nome, email) e geração do número do cartão (16 dígitos)
- GET/buscar - busca do cliente pelo email, retornando todos os cartões associados ao email fornecido

## Tecnologias Utilizadas
- Java 17
- Maven
- Spring Boot
- Spring Web
- Spring JPA
- H2 Database
- Postman (teste)
- Apidog Fast Request (teste)

## Estrutura do Projeto
<pre>
  cartao-api/
  ├── controller/ #Endpoints (ClienteController)
  ├── model/ #Modelo da entidade (Cliente)
  ├── repository/ #Integração com banco de dados (ClienteRepository)
  ├── service/ #Lógica de negócio (ClienteService)
  └── CartaoApiApplication.java #Classe principal
</pre>
