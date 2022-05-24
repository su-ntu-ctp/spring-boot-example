# Spring Boot Example

## Database Setup

1. Install the latest PostgreSQL

2. Apply the follow commands to create database, user and permission.

```sql
CREATE DATABASE exampledb;
CREATE USER exampleuser WITH ENCRYPTED PASSWORD 'password';
GRANT ALL PRIVILEGES ON DATABASE exampleuser to exampledb;
```