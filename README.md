# 🥝 CRUD Application with H2 Database (Spring Boot)

## 📄 Description

This project is part of a multi-level assignment where the goal is to build a **CRUD (Create, Read, Update, Delete)** API using **three different databases**. This specific level (Level 1) focuses on implementing the CRUD functionality with an **H2 in-memory database**.

You will learn how to properly use **HTTP verbs** and manage **HTTP response codes**.

---

## 📦 Project Setup

To start, go to 👉 [https://start.spring.io](https://start.spring.io) and generate a Spring Boot project with the following settings:

### 💡 Project Metadata

- **Project**: Maven
- **Language**: Java
- **Spring Boot**: Latest stable version
- **Group**: `cat.itacademy.s04.t02.n01`
- **Artifact**: `S04T02N01`
- **Name**: `S04T02N01`
- **Description**: `S04T02N01LastnameFirstname`
- **Package name**: `cat.itacademy.s04.t02.n01`
- **Packaging**: Jar
- **Java version**: 11 or higher

### 📚 Dependencies

- Spring Boot DevTools  
- Spring Web  
- Spring Data JPA  
- H2 Database  

---

## 🍎 Entity: Fruit

We will work with an entity called `Fruit`, which contains the following fields:

```java

##Package Structure
int id;
String nom;
int quantitatQuilos;

cat.itacademy.s04.t02.n01.controllers
cat.itacademy.s04.t02.n01.model
cat.itacademy.s04.t02.n01.services
cat.itacademy.s04.t02.n01.repository
cat.itacademy.s04.t02.n01.exception

##⚠️ Best Practices
Use ResponseEntity to handle all HTTP responses.

Follow REST API standards for naming and HTTP status codes.

Implement centralized error handling using a GlobalExceptionHandler.

GlobalExceptionHandler
Implement a global exception handler to ensure that:

All errors are caught and returned in a consistent format.

The application remains robust and easier to deb

