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


## API Endpoints

### 1. Create a Load
- **Method**: `POST`
- **URL**: `/load`
- **Request Body**:
  ```json
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
  ```
- **Response**:
  ```json
  {
    "loadId": 1,
    "facility": {
      "id": 1,
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
  ```
- **cURL Command**:
  ```bash
  curl -X POST http://localhost:8080/load   -H "Content-Type: application/json"   -d '{
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
  }'
  ```

---

### 2. Get All Loads
- **Method**: `GET`
- **URL**: `/load`
- **Query Parameters** (Optional):
  - `shipperId`: Filter loads by `shipperId`.
  - `truckType`: Filter loads by `truckType`.
  - `productType`: Filter loads by `productType`.
  - `loadingPoint`: Filter loads by `loadingPoint`.
  - `unloadingPoint`: Filter loads by `unloadingPoint`.

- **Response**:
  ```json
  [
    {
      "loadId": 1,
      "facility": {
        "id": 1,
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
  ]
  ```
- **cURL Command**:
  ```bash
  curl -X GET "http://localhost:8080/load?shipperId=SHIP123&truckType=Container"
  ```

---

### 3. Get a Load by ID
- **Method**: `GET`
- **URL**: `/load/{loadId}`

- **Response**:
  ```json
  {
    "loadId": 1,
    "facility": {
      "id": 1,
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
  ```
- **cURL Command**:
  ```bash
  curl -X GET http://localhost:8080/load/1
  ```

---

### 4. Update a Load
- **Method**: `PUT`
- **URL**: `/load/{loadId}`
- **Request Body**:
  ```json
  {
    "facility": {
      "loadingPoint": "Pune",
      "unloadingPoint": "Kolkata",
      "loadingDate": "2025-03-22",
      "unloadingDate": "2025-03-26"
    },
    "productType": "Furniture",
    "truckType": "Open",
    "noOfTrucks": 2,
    "weight": 8000,
    "comment": "Urgent",
    "shipperId": "SHIP456",
    "date": "2025-03-21"
  }
  ```
- **Response**:
  ```json
  {
    "loadId": 1,
    "facility": {
      "id": 1,
      "loadingPoint": "Pune",
      "unloadingPoint": "Kolkata",
      "loadingDate": "2025-03-22",
      "unloadingDate": "2025-03-26"
    },
    "productType": "Furniture",
    "truckType": "Open",
    "noOfTrucks": 2,
    "weight": 8000,
    "comment": "Urgent",
    "shipperId": "SHIP456",
    "date": "2025-03-21"
  }
  ```
- **cURL Command**:
  ```bash
  curl -X PUT http://localhost:8080/load/1   -H "Content-Type: application/json"   -d '{
    "facility": {
      "loadingPoint": "Pune",
      "unloadingPoint": "Kolkata",
      "loadingDate": "2025-03-22",
      "unloadingDate": "2025-03-26"
    },
    "productType": "Furniture",
    "truckType": "Open",
    "noOfTrucks": 2,
    "weight": 8000,
    "comment": "Urgent",
    "shipperId": "SHIP456",
    "date": "2025-03-21"
  }'
  ```

---

### 5. Delete a Load
- **Method**: `DELETE`
- **URL**: `/load/{loadId}`

- **Response**:
  - **Status Code**: `204 No Content`

- **cURL Command**:
  ```bash
  curl -X DELETE http://localhost:8080/load/1
  ```

---

## Technologies Used
- Java 17
- Spring Boot
- Hibernate (JPA)
- RESTful APIs

---

## Setup Instructions
1. Clone the repository.
2. Configure the database in `application.properties`.
3. Run the project using your IDE or with `mvn spring-boot:run`.



## API Endpoints

### 1. Create a Load
- **Method**: `POST`
- **URL**: `/load`
- **Request Body**:
  ```json
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
  ```
- **Response**:
  ```json
  {
    "loadId": 1,
    "facility": {
      "id": 1,
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
  ```
- **cURL Command**:
  ```bash
  curl -X POST http://localhost:8080/load   -H "Content-Type: application/json"   -d '{
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
  }'
  ```

---

### 2. Get All Loads
- **Method**: `GET`
- **URL**: `/load`
- **Query Parameters** (Optional):
  - `shipperId`: Filter loads by `shipperId`.
  - `truckType`: Filter loads by `truckType`.
  - `productType`: Filter loads by `productType`.
  - `loadingPoint`: Filter loads by `loadingPoint`.
  - `unloadingPoint`: Filter loads by `unloadingPoint`.

- **Response**:
  ```json
  [
    {
      "loadId": 1,
      "facility": {
        "id": 1,
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
  ]
  ```
- **cURL Command**:
  ```bash
  curl -X GET "http://localhost:8080/load?shipperId=SHIP123&truckType=Container"
  ```

---

### 3. Get a Load by ID
- **Method**: `GET`
- **URL**: `/load/{loadId}`

- **Response**:
  ```json
  {
    "loadId": 1,
    "facility": {
      "id": 1,
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
  ```
- **cURL Command**:
  ```bash
  curl -X GET http://localhost:8080/load/1
  ```

---

### 4. Update a Load
- **Method**: `PUT`
- **URL**: `/load/{loadId}`
- **Request Body**:
  ```json
  {
    "facility": {
      "loadingPoint": "Pune",
      "unloadingPoint": "Kolkata",
      "loadingDate": "2025-03-22",
      "unloadingDate": "2025-03-26"
    },
    "productType": "Furniture",
    "truckType": "Open",
    "noOfTrucks": 2,
    "weight": 8000,
    "comment": "Urgent",
    "shipperId": "SHIP456",
    "date": "2025-03-21"
  }
  ```
- **Response**:
  ```json
  {
    "loadId": 1,
    "facility": {
      "id": 1,
      "loadingPoint": "Pune",
      "unloadingPoint": "Kolkata",
      "loadingDate": "2025-03-22",
      "unloadingDate": "2025-03-26"
    },
    "productType": "Furniture",
    "truckType": "Open",
    "noOfTrucks": 2,
    "weight": 8000,
    "comment": "Urgent",
    "shipperId": "SHIP456",
    "date": "2025-03-21"
  }
  ```
- **cURL Command**:
  ```bash
  curl -X PUT http://localhost:8080/load/1   -H "Content-Type: application/json"   -d '{
    "facility": {
      "loadingPoint": "Pune",
      "unloadingPoint": "Kolkata",
      "loadingDate": "2025-03-22",
      "unloadingDate": "2025-03-26"
    },
    "productType": "Furniture",
    "truckType": "Open",
    "noOfTrucks": 2,
    "weight": 8000,
    "comment": "Urgent",
    "shipperId": "SHIP456",
    "date": "2025-03-21"
  }'
  ```

---

### 5. Delete a Load
- **Method**: `DELETE`
- **URL**: `/load/{loadId}`

- **Response**:
  - **Status Code**: `204 No Content`

- **cURL Command**:
  ```bash
  curl -X DELETE http://localhost:8080/load/1
  ```
---

## Setup Instructions
1. Clone the repository.
2. Configure the database in `application.properties`.
3. Run the project using your IDE or with `mvn spring-boot:run`
