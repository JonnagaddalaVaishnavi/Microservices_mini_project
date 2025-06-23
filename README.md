# Microservices Mini Project

## Description
This project showcases a microservices-based architecture using **Spring Boot** and **Spring Cloud**. It includes multiple independently deployable services that communicate via REST APIs, with centralized configuration and service discovery.

## Features
- **Eureka Server**: Service registry for microservice discovery.
- **Config Server**: Centralized configuration management.
- **Zuul API Gateway**: Routes and filters requests to backend services.
- **IPL Team Service**: Manages IPL team data.
- **IPL Player Service**: Manages IPL player data.
- **Admin Server**: Provides monitoring and management UI.

## Technologies Used
- **Java**
- **Spring Boot**
- **Spring Cloud (Eureka, Config, Zuul)**

## Getting Started

### Prerequisites
- Java 8 or higher
- Maven
- Oracle Database
- Git

### Running the Application
1. Clone the repository:
    ```sh
    git clone https://github.com/JonnagaddalaVaishnavi/Microservices_mini_project.git
    ```
2. Navigate to each module and build using Maven:
    ```sh
    cd BootMS-Proj15-MiniProject-EurekaServer
    mvn clean install
    ```
3. Start services in the following order:
    - Eureka Server
    - Config Server
    - Zipkin Server
    - API Gateway
    - Welcome-api
    - Greet-api
    - Admin Server

## Usage
- Register services with Eureka.
- Use the API Gateway to route requests
- Monitor services via the Admin Server dashboard.

## Code Explanation
## 🎥 Project Demo

[![Watch the video](https://drive.google.com/file/d/1B-9d1vbUa523CDO9wDn2U7Pd-061lPEW/view?usp=sharing)
---

Built with 💡 by [Vaishnavi Jonnagaddala](https://github.com/JonnagaddalaVaishnavi)
