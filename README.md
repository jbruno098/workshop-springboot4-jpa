# 🚀 API REST com Spring Boot - Sistema de Pedidos

## 📌 Sobre o projeto

Este projeto consiste no desenvolvimento de uma API REST utilizando **Spring Boot**, com foco em gerenciamento de usuários, produtos, categorias e pedidos.

A aplicação implementa operações CRUD, relacionamentos entre entidades e tratamento adequado de exceções, retornando respostas HTTP padronizadas.

Projeto desenvolvido com base no curso de Java do professor Nélio Alves, com o objetivo de consolidar conhecimentos em desenvolvimento backend.

---

## 🧠 Objetivo

O principal objetivo deste projeto foi colocar em prática conceitos fundamentais de desenvolvimento backend, como:

* Criação de APIs REST
* Persistência de dados com JPA/Hibernate
* Modelagem de entidades e relacionamentos
* Tratamento de exceções de forma padronizada
* Testes de endpoints com Postman

---

## 🚀 Tecnologias utilizadas

* Java
* Spring Boot
* Spring Data JPA
* Hibernate
* H2 Database (ambiente de teste)
* Maven
* Postman

---

## 📚 Funcionalidades

* CRUD completo de usuários
* CRUD de produtos
* CRUD de categorias
* CRUD de pedidos
* Relacionamento **Many-to-Many** (Produto ↔ Categoria)
* Relacionamento **One-to-Many** (Pedido ↔ Itens do Pedido)
* Cálculo automático de subtotal e total de pedidos
* Tratamento de exceções com `@ControllerAdvice`
* Retorno padronizado de erros (JSON)

---

## ⚙️ Como executar o projeto

### Pré-requisitos

* Java 17 ou superior
* Maven

### Passos

```bash
# Clonar o repositório
git clone https://github.com/jbruno098/SEU-REPOSITORIO.git

# Entrar na pasta do projeto
cd NOME-DO-PROJETO

# Executar a aplicação
./mvnw spring-boot:run
```

A aplicação estará disponível em:

```
http://localhost:8080
```

---

## 🔗 Endpoints principais

### 👤 Usuários

* GET /users
* GET /users/{id}
* POST /users
* DELETE /users/{id}

### 📦 Produtos

* GET /products
* GET /products/{id}

### 🗂️ Categorias

* GET /categories
* GET /categories/{id}

### 🧾 Pedidos

* GET /orders
* GET /orders/{id}

---

## 📸 Exemplos de requisição

### 🔹 GET /users

```json
[
  {
    "id": 1,
    "name": "Maria Brown",
    "email": "maria@gmail.com"
  }
]
```

---

## ⚠️ Tratamento de erros

A API possui tratamento global de exceções utilizando `@ControllerAdvice`, garantindo respostas padronizadas.

Exemplo de erro:

```json
{
  "timestamp": "2026-04-14T12:00:00Z",
  "status": 404,
  "error": "Resource not found",
  "message": "Resource not found. Id 10",
  "path": "/users/10"
}
```

---

## 🧠 Aprendizados

Durante o desenvolvimento deste projeto, adquiri conhecimentos importantes como:

* Estruturação de APIs REST com Spring Boot
* Uso do JPA e Hibernate para persistência de dados
* Mapeamento de relacionamentos entre entidades
* Uso de `@EmbeddedId` em chaves compostas
* Tratamento global de exceções com `@ControllerAdvice`
* Conversão automática de objetos para JSON com Jackson
* Testes de endpoints utilizando Postman

---

## 🔮 Melhorias futuras

* Implementar DTOs para melhor controle das respostas
* Adicionar validações com Bean Validation
* Implementar paginação e filtros
* Integração com banco de dados PostgreSQL
* Deploy da aplicação em ambiente online

---

## 👨‍💻 Autor

**Joelson Bruno Costa Rodrigues**

* 🔗 GitHub: https://github.com/jbruno098
* 🔗 LinkedIn: https://linkedin.com/in/joelson-bruno-734106389

---

## 📌 Observação

Este projeto foi desenvolvido para fins de estudo e aprimoramento das habilidades em desenvolvimento backend com Java e Spring Boot.
