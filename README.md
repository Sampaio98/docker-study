# 🐳 Docker Study

[![Java](https://img.shields.io/badge/Java-25-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://openjdk.org/)
[![Spring Boot](https://img.shields.io/badge/Spring%20Boot-4.0.0-6DB33F?style=for-the-badge&logo=spring&logoColor=white)](https://spring.io/projects/spring-boot)
[![Docker](https://img.shields.io/badge/Docker-2496ED?style=for-the-badge&logo=docker&logoColor=white)](https://www.docker.com/)
[![Gradle](https://img.shields.io/badge/Gradle-02303A?style=for-the-badge&logo=gradle&logoColor=white)](https://gradle.org/)

> 📚 A practical project to learn and demonstrate Docker containerization with Spring Boot applications.

---

## 📋 Table of Contents

- [About](#-about)
- [Features](#-features)
- [Prerequisites](#-prerequisites)
- [Installation](#-installation)
- [Usage](#-usage)
- [Docker Commands](#-docker-commands)
- [Project Structure](#-project-structure)
- [Technologies](#️-technologies)
- [Contributing](#-contributing)
- [License](#-license)

---

## 📖 About

This project demonstrates how to containerize a Spring Boot application using Docker.

---

## ✨ Features

- ✅ Spring Boot REST API
- ✅ Docker containerization
- ✅ Health check endpoint (`/actuator/health`)

---

## 📦 Prerequisites

Before you begin, ensure you have the following installed:

| Tool               | Version         | Download                                                         |
|--------------------|-----------------|------------------------------------------------------------------|
| **Java**           | 25              | [OpenJDK](https://openjdk.org/)                                  |
| **Docker**         | 28.3.0          | [Docker Desktop](https://www.docker.com/products/docker-desktop) |
| **Docker Compose** | 2.0+ (optional) | Included with Docker Desktop                                     |

### Verify Installation

```
java -version
docker --version
docker-compose --version
```

---

## 🚀 Installation

### 1. Clone the repository

```
git clone https://github.com/seu-usuario/docker-study.git 
cd docker-study
```

### 2. Build the project (optional)

```
./gradlew clean build
```

---

## 💻 Usage

### Option 1: Using the Script (Recommended)

```
# Give execution permission
chmod +x docker-run.sh

# Run the script
./docker-run.sh
```

### Option 2: Manual Docker Commands

```
# Build the Docker image
docker build -t docker-study .

# Run the container
docker run -p 8080:8080 docker-study
```

### Option 3: Using Gradle

```
# Run locally (without Docker)
./gradlew bootRun
```

---

## 🐳 Docker Commands

### Basic Operations

```
# Build image
docker build -t docker-study .

# Run container
docker run -p 8080:8080 docker-study

# Run in background
docker run -d -p 8080:8080 --name my-app docker-study

# Stop container
docker stop my-app

# Start container
docker start my-app

# Remove container
docker rm my-app

# View logs
docker logs -f my-app

# Execute command inside container
docker exec -it my-app sh
```

### Cleanup
```
# Remove all stopped containers
docker container prune

# Remove unused images
docker image prune -a

# Remove everything (containers, images, volumes)
docker system prune -a --volumes
```

---

## 🛠️ Technologies

## Backend

- Java 25 - Programming language
- Spring Boot 4.0.0 - Application framework
- Spring Boot Actuator - Production-ready features
- Gradle - Build tool

---

## DevOps

- Docker - Containerization
- Docker Compose - Multi-container orchestration (optional)

---

## 🌐 API Endpoints

| Method  | Endpoint          | Description     |
|---------|-------------------|-----------------|
| **GET** | /api              | Welcome message |
| **GET** | /actuator/health  | Health check    |

## Example Request

```
# Health check
curl http://localhost:8080/actuator/health

# Response
{
  "status": "UP"
}
```

--- 

## 🔧 Configuration

### Environment Variables

You can customize the application using environment variables:

```
docker run -p 8080:8080 \
  -e SPRING_PROFILES_ACTIVE=prod \
  -e JAVA_OPTS="-Xmx512m" \
  docker-study
```

--- 

## 🧪 Testing

```
# Run tests
./gradlew test

# Run tests with coverage
./gradlew test jacocoTestReport

# Run integration tests
./gradlew integrationTest
```

---

<div align="center">

🚀 A guide for containerize a Spring Boot application using Docker

</div> ```