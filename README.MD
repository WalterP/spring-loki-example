# Spring-Loki-Example

## Introduction

Spring-Loki-Example is a simple demonstration project that shows how to integrate a Spring Boot application with Loki for effective log management. Loki is a horizontally-scalable, highly-available, multi-tenant log aggregation system inspired by Prometheus. This project can help you understand how to configure and use Loki in a Spring Boot application.

## Prerequisites

- Java 17 or later
- Docker and Docker Compose
- Gradle

## Setup and Running

### Application

* Clone the repository

```shell
https://github.com/WalterP/spring-loki-example.git
```

* Navigate into the project directory:

```shell
cd spring-loki-example

```

* Compile the project

```shell
gradle build

```

* Run the Spring Boot application:

```shell
gradle bootRun

```

## Docker Compose

* To spin up Grafana, Prometheus, and Loki, run:
```shell
docker-compose up
```

### Usage

After you've got the application up and running, it will start to generate logs and send them to Loki. You can then use Grafana to view these logs.

To do this:

1. Open your web browser and navigate to http://localhost:3000 to open Grafana.
2. Log in using the default Grafana credentials: admin for both the username and password.
3. Go to the "Explore" section and select "Loki" from the dropdown to start viewing your logs.

### Conclusion
The Spring-Loki-Example project provides a simple yet illustrative example of how you can manage your logs in a Spring Boot application using Loki. You can use this as a starting point and expand it according to the needs of your larger, more complex applications. Contributions to this project are most welcome!
