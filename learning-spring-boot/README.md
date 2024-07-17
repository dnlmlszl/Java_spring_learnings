# Spring Boot REST API Example

This is a simple Spring Boot REST API example that demonstrates the basic functionalities of creating, retrieving, updating, and deleting courses.

## Table of Contents

- [Introduction](#introduction)
- [Features](#features)
- [Getting Started](#getting-started)
- [Endpoints](#endpoints)
- [Example Requests](#example-requests)
- [License](#license)

## Introduction

This project is a simple demonstration of how to use Spring Boot to build a REST API. It provides endpoints for managing courses, including creating, retrieving, updating, and deleting course records.

## Features

- RESTful endpoints for CRUD operations on courses.
- In-memory storage using a list.
- Easy to extend and integrate with databases.

## Getting Started

### Prerequisites

- Java 8 or higher
- Maven

### Installation

1. Clone the repository:
    ```sh
    git clone https://github.com/dnlmlszl/Java_spring_learnings/tree/main/learning-spring-boot.git
    cd spring-boot-rest-api-example
    ```

2. Build the project:
    ```sh
    mvn clean install
    ```

3. Run the application:
    ```sh
    mvn spring-boot:run
    ```

The application will start on `http://localhost:8080`.

## Endpoints

- `GET /courses`: Retrieve all courses.
- `GET /courses/{id}`: Retrieve a course by ID.
- `POST /courses`: Create a new course.
- `PUT /courses/{id}`: Update a course by ID.
- `DELETE /courses/{id}`: Delete a course by ID.

## Example Requests

### Retrieve All Courses

```sh
GET /courses
```
Response:

```JSON

[
    {
        "id": 1,
        "name": "AWS",
        "author": "LMD"
    },
    {
        "id": 2,
        "name": "DevOps",
        "author": "LMD"
    },
    {
        "id": 3,
        "name": "Spring Boot",
        "author": "John Doe"
    }
]
```
### Retrieve a Course by ID

```sh
GET /courses/1
```

Response:

```JSON

{
    "id": 1,
    "name": "AWS",
    "author": "LMD"
}
```

### Create a New Course

```sh
POST /courses
Content-Type: application/json

{
    "id": 4,
    "name": "Docker",
    "author": "Jane Doe"
}
```

Response:

```JSON

{
    "id": 4,
    "name": "Docker",
    "author": "Jane Doe"
}
```

### Update a Course by ID

```sh
PUT /courses/1
Content-Type: application/json

{
    "name": "AWS Advanced",
    "author": "LMD"
}
```

Response:

```JSON

{
    "id": 1,
    "name": "AWS Advanced",
    "author": "LMD"
}
```

### Delete a Course by ID

```sh
DELETE /courses/1
```

Response:

```JSON

HTTP 204 No Content
```

### notes.txt

The `notes.txt` file includes different profile types for console logging. You can select the default and active logging profile in the `application.properties` file.

```sh

spring.application.name=learning-spring-boot
logging.level.org.springframework=debug
spring.profiles.active=prod
```

You can add different logger settings with different properties files. Check the settings in `application-dev.properties` and `application-prod.properties` in the src/main/resources folder.