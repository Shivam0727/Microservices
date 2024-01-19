# Microservices Project - User Service

## Overview

This project is part of a microservices architecture and focuses on the User Service. The system is designed to include three microservices: User, Hotel, and Rating Service. The User Service is responsible for managing user-related functionalities.

## Dependencies

- Spring Web: Provides basic web functionalities and RESTful services.

- Spring Data JPA: Simplifies database operations using Java Persistence API.

- MySQL: Database system for storing user-related data.

- Spring Boot DevTools: Enhances development experience with automatic application restarts and other tools.

- Lombok: Reduces boilerplate code through annotations.

## Project Structure

The project is organized into the following components:

- User Entity Class: Represents the user entity with attributes like username, password, email, etc. This class is annotated with JPA annotations to map it to the database.

- User Controller: Handles incoming HTTP requests related to user operations. It communicates with the User Service to perform actions on user data.

- User Service Interface: Defines the contract for user-related operations. It is implemented by the User Service Implementation class.

- User Service Implementation: Implements the business logic for user-related operations, such as user creation, retrieval, and updates.

- User Repository: Interface that extends JpaRepository to perform CRUD operations on the User entity.

- Exceptions Files: Contains custom exception classes to handle specific errors related to user operations.

- application.yml: Configuration file for the application, including database connection details and other settings.

## Getting Started

### Clone the Repository:

    bash
    Copy code
    
    git clone <repository_url>
    cd microservices-project

### Build and Run:

    bash
    Copy code

    ./mvnw clean install
    ./mvnw spring-boot:run

## Database Configuration:

Update the application.yml file with your MySQL database configuration.

## API Documentation:

Once the application is running, access the Swagger API documentation at http://localhost:8080/swagger-ui.html to explore and test the user service endpoints.

## Configuration

Ensure to update the database configuration, such as URL, username, and password, in the application.yml file according to your MySQL setup.

    yaml
    Copy code
    
    spring:
      datasource:
        url: jdbc:mysql://localhost:3306/your_database
        username: your_username
        password: your_password
        driver-class-name: com.mysql.cj.jdbc.Driver
     jpa:
      hibernate:
        ddl-auto: update
        show-sql: true

## Contributing

Feel free to contribute to the development of this microservices project by submitting issues or pull requests. Your feedback and enhancements are highly appreciated.
