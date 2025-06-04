# ✅ Todo List CRUD

## 📋 Descrição do Projeto (PT-BR)

Este é um projeto de lista de tarefas (Todo List) desenvolvido com Spring Boot, implementando operações CRUD completas para gerenciar tarefas. Ele utiliza Java 21, Spring Data JPA com banco de dados em memória H2, e faz uso de boas práticas como DTOs, mapeamento entre entidades e DTOs, e separação em camadas (controller, service, repository). A aplicação segue o padrão RESTful, além de oferecer páginas HTML simples com Thymeleaf para interação com o usuário.

### Principais funcionalidades:
- ✅ Cadastro, listagem, atualização e exclusão de tarefas.  
- 🧩 Estrutura clara e pronta para expansão.  
- ✨ Uso de Lombok para reduzir o código repetitivo.  
- 🌐 Interface com Thymeleaf.  
- 📡 API estruturada seguindo o padrão RESTful.  

## 🚀 Como executar

1. Clone o repositório:
   ```bash
   git clone <URL_DO_REPOSITORIO>
   cd Todo-main
   ```

2. Compile e execute o projeto:
   ```bash
   ./mvnw spring-boot:run
   ```

3. Acesse a aplicação:
   - Interface Web: `http://localhost:8080/todo`
   - H2 Console: `http://localhost:8080/h2-console` (JDBC URL: `jdbc:h2:mem:testdb`)

---

## ✅ Todo List CRUD - Project Description (EN)

This is a Todo List project built with Spring Boot, implementing full CRUD operations to manage tasks. It uses Java 21, Spring Data JPA with an in-memory H2 database, and follows best practices like DTO usage, entity-DTO mapping, and layer separation (controller, service, repository). The application follows the RESTful pattern and also includes simple HTML pages with Thymeleaf for user interaction.

### Main features:
- ✅ Create, read, update, and delete tasks.  
- 🧩 Clean and extensible architecture.  
- ✨ Uses Lombok to reduce boilerplate code.  
- 🌐 Thymeleaf-based web interface.  
- 📡 RESTful API structure.  

## 🚀 How to run

1. Clone the repository:
   ```bash
   git clone <REPOSITORY_URL>
   cd Todo-main
   ```

2. Compile and run the project:
   ```bash
   ./mvnw spring-boot:run
   ```

3. Access the application:
   - Web interface: `http://localhost:8080/todo`
   - H2 Console: `http://localhost:8080/h2-console` (JDBC URL: `jdbc:h2:mem:testdb`)
