# SpringBootWebProject

**Backend REST API built with Spring Boot 3.0, Java 17, and JPA/Hibernate**

This project was developed as an academic exercise (see the [Project Specification](./ProjectSpecification.pdf)), focusing on backend concepts and API development.

## Overview

* Implements CRUD operations for users, orders, categories, and products via REST endpoints.
* Uses an in-memory H2 database for easy testing.
* Business logic for order subtotals and totals encapsulated inside entities.
* Centralized error handling with custom exceptions.

> **Front-end:** None. All GET, POST, PUT, and DELETE requests were tested using Postman.

## Technologies and Tools

* **Java 17**
* **Spring Boot 3.x** (Web, Data JPA)
* **JPA/Hibernate**
* **H2 Database** (in-memory, test profile)
* **Maven**
* **JUnit 5**
* **Postman** (manual testing)

## Key Concepts and Skills

* **Project Setup:** Scaffolded via Spring Initializr and configured dependencies in `pom.xml`.
* **Data Modeling:** JPA entities and relationships:

  * *Many-to-Many* (Product ↔ Category)
  * *One-to-Many* (User → Order)
  * *One-to-One* (Order ↔ Payment)
* **Composite Key:** `OrderItem` with `@Embeddable` and `@EmbeddedId`.
* **Layered Architecture:** Controllers (Resources), Services, and Repositories.
* **Spring Profiles:** Configured a **test** profile using H2 (`application-test.properties`).
* **Data Seeding:** Automatically populates the database on startup in the test profile.
* **Exception Handling:** Custom `ResourceNotFoundException`, `DatabaseException`, and a global handler.
* **Date/Time Handling:** Used `Instant` with ISO 8601 formatting in JSON.
* **Business Logic in Entities:** Subtotal in `OrderItem` and total in `Order`.
* **Lazy vs Eager Loading:** Avoided serialization issues with `@JsonIgnore`.

## Commit History Overview

1. **Initial Setup:** Created Maven project and added core dependencies.
2. **User Entity & H2 Configuration:** Defined `User` entity and set up H2 test profile.
3. **User CRUD:** Implemented repository, service, and controller; added data seeding.
4. **Order Entity & OrderStatus:** Added `Order` entity with enum status and relationships.
5. **Product & Category:** Modeled many-to-many relationship between products and categories.
6. **OrderItem & Composite Key:** Implemented composite key for order items and subtotal logic.
7. **Payment Entity:** Added one-to-one payment entity with cascade operations.
8. **Error Handling:** Introduced custom exceptions and a global exception handler.
9. **Final Adjustments:** Tested all endpoints using Postman.

## Running the Application Locally

1. **Clone the repo:**

   ```bash
   git clone https://github.com/enzoconsulo/JAVA.SpringBoot.WebProject-jpa.git
   cd JAVA.SpringBoot.WebProject-jpa
   ```
2. **Build with Maven:**

   ```bash
   mvn clean install
   ```
3. **Run with the test profile (H2):**

   ```bash
   mvn spring-boot:run -Dspring-boot.run.profiles=test
   ```
4. **Access the H2 Console:**

   * URL: `http://localhost:8080/h2-console`
   * JDBC URL: `jdbc:h2:mem:testdb`
   * User: `sa`, Password: (leave blank)

## API Endpoints (prefix `/api`)

* **/users** — CRUD operations for users
* **/orders** — CRUD operations for orders
* **/categories** — CRUD operations for categories
* **/products** — CRUD operations for products

## Project Structure

```
src/
 ├─ main/
 │   ├─ java/com/enzoccs/
 │   │   ├─ controller/
 │   │   ├─ model/
 │   │   ├─ repository/
 │   │   ├─ service/
 │   │   └─ exceptions/
 │   └─ resources/
 │       ├─ application.properties
 │       └─ application-test.properties
 └─ test/
     └─ SpringBootWebProjectApplicationTests.java
pom.xml
README.txt
EnunciadoDoProjeto.pdf
```

---

Developed by a Computer Engineering student to deepen backend skills with Spring Boot.
