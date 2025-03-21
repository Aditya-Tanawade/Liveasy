# Load Management System

This project is a Spring Boot application for managing loads and their associated facilities. It provides RESTful APIs to create, read, update, and delete load details. 

---

## Features

- CRUD operations for managing loads and facilities.
- Query filtering for retrieving loads based on various parameters.
- Proper error handling with custom exceptions.
- Validation for user inputs.
- Integrated Hibernate for ORM and JPA repositories.

---

## Tech Stack

- **Java**: Core programming language.
- **Spring Boot**: Framework for developing REST APIs.
- **Hibernate**: ORM tool for database interactions.
- **JPA**: Java Persistance API .
- **PostgreSQL Database**: Relational database for development.
- **Lombok**: Reduces boilerplate code.
- **Maven**: Dependency management.

---

## Prerequisites

- Java 21+
- Maven 3+
- IDE (e.g., IntelliJ, Eclipse)
- Postman (for testing APIs)

---




## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/your-username/LoadManagementSystem.git


2. Navigate to the project directory:
     ```bash
   cd LoadManagementSystem

3. Build the project:
   ```bash
   mvn clean install

4. Run the application:
      ```bash
   mvn spring-boot:run

5. Access the application at:
   ```bash
   http://localhost:8080

API Endpoints
   1. Create a Load
      URL: /load
      Method: POST
      Request Body:
                  {
              "facility": {
                "loadingPoint": "Mumbai",
                "unloadingPoint": "Delhi",
                "loadingDate": "2025-03-21",
                "unloadingDate": "2025-03-25"
              },
              "productType": "Electronics",
              "truckType": "Container",
              "noOfTrucks": 3,
              "weight": 12000,
              "comment": "Handle with care",
              "shipperId": "SHIP123",
              "date": "2025-03-20"
            }

   
