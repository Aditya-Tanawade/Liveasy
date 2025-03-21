Liveasy Internship Project

This project implements a load management system that includes CRUD operations for managing loads and their associated facilities. It provides APIs for creating, retrieving, updating, and deleting loads, with filters for advanced querying.

Features

Load Management: Create, read, update, and delete load entries.

Facility Management: Associate facility details (loading and unloading points, dates) with loads.

Filter Loads: Query loads using optional filters such as shipperId, truckType, productType, loadingPoint, and unloadingPoint.

Exception Handling: Graceful handling of resource not found and validation errors.

Technology Stack

Java (Backend Logic)

Spring Boot (Web Framework)

Hibernate/JPA (ORM)

H2/MySQL (Database)

Lombok (Simplify Boilerplate Code)

Postman/Swagger (API Testing)

Installation and Setup

Clone the repository:

git clone https://github.com/your-username/Liveasy-Internship-Project.git
cd Liveasy-Internship-Project

Configure the database in application.properties:

spring.datasource.url=jdbc:mysql://localhost:3306/liveasy_db
spring.datasource.username=root
spring.datasource.password=yourpassword
spring.jpa.hibernate.ddl-auto=update
``


Run the application:

./mvnw spring-boot:run

Access the application at:

API Base URL: http://localhost:8080/load

API Endpoints

1. Create a Load

Endpoint: POST /load

Request Body:

{
  "facility": {
    "loadingPoint": "Mumbai",
    "unloadingPoint": "Delhi",
    "loadingDate": "2025-03-25",
    "unloadingDate": "2025-03-30"
  },
  "productType": "Electronics",
  "truckType": "Container",
  "noOfTrucks": 2,
  "weight": 500.5,
  "comment": "Handle with care",
  "shipperId": "SHIP123",
  "date": "2025-03-20"
}

Response:

{
  "loadId": 1,
  "facility": {
    "id": 1,
    "loadingPoint": "Mumbai",
    "unloadingPoint": "Delhi",
    "loadingDate": "2025-03-25",
    "unloadingDate": "2025-03-30"
  },
  "productType": "Electronics",
  "truckType": "Container",
  "noOfTrucks": 2,
  "weight": 500.5,
  "comment": "Handle with care",
  "shipperId": "SHIP123",
  "date": "2025-03-20"
}

2. Get All Loads

Endpoint: GET /load

Query Parameters:

shipperId (optional)

truckType (optional)

productType (optional)

loadingPoint (optional)

unloadingPoint (optional)

Example Request: GET /load?shipperId=SHIP123&truckType=Container

Response:

[
  {
    "loadId": 1,
    "facility": {
      "id": 1,
      "loadingPoint": "Mumbai",
      "unloadingPoint": "Delhi",
      "loadingDate": "2025-03-25",
      "unloadingDate": "2025-03-30"
    },
    "productType": "Electronics",
    "truckType": "Container",
    "noOfTrucks": 2,
    "weight": 500.5,
    "comment": "Handle with care",
    "shipperId": "SHIP123",
    "date": "2025-03-20"
  }
]

3. Get Load by ID

Endpoint: GET /load/{loadId}

Example Request: GET /load/1

Response:

{
  "loadId": 1,
  "facility": {
    "id": 1,
    "loadingPoint": "Mumbai",
    "unloadingPoint": "Delhi",
    "loadingDate": "2025-03-25",
    "unloadingDate": "2025-03-30"
  },
  "productType": "Electronics",
  "truckType": "Container",
  "noOfTrucks": 2,
  "weight": 500.5,
  "comment": "Handle with care",
  "shipperId": "SHIP123",
  "date": "2025-03-20"
}

4. Update a Load

Endpoint: PUT /load/{loadId}

Request Body:

{
  "facility": {
    "loadingPoint": "Pune",
    "unloadingPoint": "Bangalore",
    "loadingDate": "2025-04-01",
    "unloadingDate": "2025-04-05"
  },
  "productType": "Furniture",
  "truckType": "Open",
  "noOfTrucks": 3,
  "weight": 1200.75,
  "comment": "Fragile",
  "shipperId": "SHIP456",
  "date": "2025-03-22"
}

Response:

{
  "loadId": 1,
  "facility": {
    "id": 1,
    "loadingPoint": "Pune",
    "unloadingPoint": "Bangalore",
    "loadingDate": "2025-04-01",
    "unloadingDate": "2025-04-05"
  },
  "productType": "Furniture",
  "truckType": "Open",
  "noOfTrucks": 3,
  "weight": 1200.75,
  "comment": "Fragile",
  "shipperId": "SHIP456",
  "date": "2025-03-22"
}

5. Delete a Load

Endpoint: DELETE /load/{loadId}

Example Request: DELETE /load/1

Response:

Status: 204 No Content

Exception Handling

Resource Not Found

Response:

{
  "error": "Resource Not Found",
  "message": "Load not found with ID: {loadId}"
}

Validation Errors

Response:

{
  "fieldName": "Validation Error Message"
}

Internal Server Error

Response:

{
  "error": "Internal Server Error",
  "message": "Detailed error message."
}

License

This project is open-source and available under the MIT License.

Contributing

Feel free to fork the repository, make changes, and submit a pull request. Contributions are welcome!

