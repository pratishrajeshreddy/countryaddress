# Get Address by Country Code Application

This microservice is developed to retrieve all the address fields based on the country code (USA or CAN).

Address will have ID  ID, country, addressLine1, addressLine2, street, city, state, country, countryCode, zipCode

## Getting Started

This application was developed using Spring Boot, Mysql, JPA and Hibernate.

## Requirements

Java - 1.8.x

Maven - 3.x.x

Mysql - 5.x.x

## Steps to Setup

**1. Configure MySQL Database

+ open `src/main/resources/application.properties`

+ change `spring.datasource.url` value as per your mysql installation. Currently the value provided is "CountryAddress"

Create Mysql database if there is no existing database**
```bash
create database test
```

+ change `spring.datasource.username` and `spring.datasource.password` as per your mysql installation

**2. Build and run the app using maven**

```bash
mvn clean install
java -jar target/country-address-0.0.1-SNAPSHOT.jar```

Alternatively, you can run the app without packaging it using -

```bash
mvn spring-boot:run
```

The app will start running at <http://localhost:8080>.

## Explore Rest APIs

The app defines following CRUD APIs.

API
GET - /address - Get All Address
GET - /address/{countryCode} - Get Address for given Country Code


You can test them using postman or any other rest client.
