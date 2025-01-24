# Enviro Waste Management System

## Overview
The Enviro Waste Management System is a Spring Boot application designed to manage waste categories. It provides CRUD operations for waste categories, including adding, updating, retrieving, and deleting waste categories.

## Technologies Used
- Java
- Spring Boot
- Spring Data JDBC
- H2 Database
- Maven

## Prerequisites
- Java 17 or higher
- Maven 3.6.0 or higher

## Getting Started

### Clone the Repository
```bash
git clone git@github.com:mosa-retha/Enviro365.git
cd Enviro365
```

### Build the Project
```bash
mvn clean install
```

### Run the Application
```bash
mvn spring-boot:run
```

The application will start on `http://localhost:8080`.

## Database Schema
The application uses an H2 in-memory database. The schema is defined in the `src/main/resources/schema.sql` file:
```sql
CREATE TABLE IF NOT EXISTS ENVIRO (
    ID INT PRIMARY KEY AUTO_INCREMENT,
    CATEGORY VARCHAR(255),
    DESCRIPTION VARCHAR(255),
    CATEGORY_TYPE VARCHAR(255)
);
```

## API waste Endpoints

### Get All Waste Categories
- **URL**: `/wastecategories`
- **Method**: `GET`
- **Response**: List of all waste categories

### Get Waste Category by ID
- **URL**: `/wastecategories/{id}`
- **Method**: `GET`
- **Response**: Waste category with the specified ID

### Add a New Waste Category
- **URL**: `/wastecategories`
- **Method**: `POST`
- **Request Body**: JSON object representing the new waste category
- **Response**: The created waste category

### Update an Existing Waste Category
- **URL**: `/wastecategories/{id}`
- **Method**: `PUT`
- **Request Body**: JSON object representing the updated waste category
- **Response**: The updated waste category

### Delete a Waste Category
- **URL**: `/wastecategories/{id}`
- **Method**: `DELETE`
- **Response**: HTTP 204 No Content



## API disposal Endpoints

### Get All Disposal Categories

- **URL**: `/disposalcategories`
- **Method**: `GET`
- **Response**: List of all disposal categories

### Get Disposal Category by ID

- **URL**: `/disposalcategories/{id}`
- **Method**: `GET`
- **Response**: Disposal category with the specified ID

### Add a New Disposal Category

- **URL**: `/disposalcategories`
- **Method**: `POST`
- **Request Body**: JSON object representing the new disposal category
- **Response**: The created disposal category

### Update an Existing Disposal Category

- **URL**: `/disposalcategories/{id}`
- **Method**: `PUT`
- **Request Body**: JSON object representing the updated disposal category
- **Response**: The updated disposal category

### Delete a Disposal Category

- **URL**: `/disposalcategories/{id}`
- **Method**: `DELETE`
- **Response**: HTTP 204 No Content
- 