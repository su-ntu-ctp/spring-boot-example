# Spring Boot Example

## Database Setup

1. Install the latest PostgreSQL

2. Apply the follow commands to create database, user and permission.

```sql
CREATE DATABASE exampledb;
CREATE USER exampleuser WITH ENCRYPTED PASSWORD 'password';
GRANT ALL PRIVILEGES ON DATABASE exampleuser to exampledb;
```

## Migration

Look at the property file [here](./src/main/resources/application.properties).

Whenever the project is started, the database will emptied and starting from fresh. This is due to `spring.jpa.hibernate.ddl-auto=create` settings. Check out the other options [here](https://docs.spring.io/spring-boot/docs/1.1.0.M1/reference/html/howto-database-initialization.html#howto-initialize-a-database-using-hibernate).

## Start the project

The `mvnw` is a maven wrapper. You do not need to install maven to run it. Just enter the command below on Terminal to start project.

```sh
./mvnw spring-boot:run
```

## APIs

Base URL: http://localhost:8080

|Path|Method|Data|Remarks|
|---|------|----|-------|
|/catalogues|POST|{"name":"Item A","price":9.9,"shortDesc":"This is a short description of Item"}| Add item to catalogue|
|/catalogues|GET|N/A|Get all catalogues|
|/carts|POST|{"itemId":1,"quantity":20}|Add item with ID 1 into the cart|
|/carts|GET|N/A|Get all catalogues (items) in the cart.|
