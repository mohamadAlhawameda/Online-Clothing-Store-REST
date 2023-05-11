# Overview of the Main Application: 

The clothing management system is a web application designed to manage and organise clothes in a catalogue. 
 


This application allows users to add, edit, delete and search for clothes based on various criteria such as brand, name, and year of creation. 
 
It provides a login and registration system for users to access the application securely. 
 
This report focuses on the main components of the application, which are organised into the following directories: config, controller, model, repository and the ClotheswarehouseApplication file.



Looking into the directory structure and their contents: 


## config: 

The config directory contains the configuration files that define the settings and behaviour of the application 
 
These files include database connection settings, security configurations, and other application specific settings. 

## controller: 

The controller directory houses the files responsible for handling the HTTP requests, and coordinating the flow of data between front end and the backend. 
These controllers interact with the model layer, and then return the appropriate views. 

## model: 

The model directory contains the application's data models. These models represent the objects used in the application and define their properties and relationships. 

The model classes are also used to interact with the database and store or retrieve data.


## repository: 

The repository directory contains the interfaces that define the data access layer. These interfaces extend JpaRepository, which provides a set of standard CRUD (Create, Read, Update, and Delete) operations.

 The repository layer is responsible for abstracting the underlying data storage and retrieval mechanisms, allowing the application to interact with the database without being tied to a specific implementation.
 

Main Application File: ClotheswarehouseApplication.java 

The ClotheswarehouseApplication.java file is the entry point of the application. It contains the main method, which initialises the Spring Boot application and starts the embedded web server. This file also includes other configurations such as setting up Thymeleaf as the template engine and specifying the location of the templates.

Example code snippet from ClotheswarehouseApplication.java

@SpringBootApplication
public class ClotheswarehouseApplication {

    public static void main(String[] args) {
        SpringApplication.run(ClotheswarehouseApplication.class, args);
    }
}
# Communication with Distribution Centre or REST API

The Clothing Management System communicates with the Distribution Centre through a RESTful API.

 The API allows the system to send and retrieve data from the Distribution Centre in a structured and standardised manner. 

This section describes how the communication with the Distribution Centre is implemented in the application.

5.1. Distribution Centre Model

In the model directory, a DistributionCentre class is defined, which represents a distribution centre with properties such as name, latitude, and longitude. 

This model class is used to store and manipulate distribution centre data within the application.

5.2. Distribution Centre Repository

The repository directory contains the DistributionCentreRepository interface, which extends JpaRepository and provides standard CRUD operations for the DistributionCentre model.

 This allows the application to interact with the database and manage distribution centre data.

5.3. Distribution Centre Controller

In the controller directory, a DistributionCentreController class is responsible for handling HTTP requests related to the Distribution Centre. 

It defines various endpoints for operations such as listing all distribution centres, adding a new centre, updating an existing one, and deleting a centre. These endpoints communicate with the Distribution Centre API to perform the desired actions and return the appropriate response to the client.



## Conclusion of Report:

The Clothing Management System is a well-organised web application that utilises a modular directory structure to separate concerns and improve maintainability. 

Each directory serves a specific purpose, making it easy to locate and modify specific components of the application. The main application file, ClotheswarehouseApplication.java, serves as the entry point and initialises the necessary configurations to run the application.




 list all distributioncentres
![image](https://user-images.githubusercontent.com/32995324/232350343-e48db9ce-eab3-48c5-991b-e14526e32694.png)


![image](https://user-images.githubusercontent.com/32995324/232350355-7bc61be3-fef6-4099-8c16-80bdd4470029.png)

delete item
![image](https://user-images.githubusercontent.com/32995324/232350365-5aca5413-d1cf-4986-a7a0-81ab4f109d8d.png)

add item to distribution centre
![image](https://user-images.githubusercontent.com/32995324/232350375-f4d9eaa0-6dfc-4522-aec8-07de596a3af2.png)

request item by brand 

http://localhost:8082/api/DistributionCentre/1/items/by-brand/Balenciaga

![image](https://user-images.githubusercontent.com/32995324/232350508-06c45529-eecd-4cdf-94fe-a03ebe6c0b5a.png)


request item by name

http://localhost:8082/api/DistributionCentre/1/items/by-name/T-Shirt

![image](https://user-images.githubusercontent.com/32995324/232350476-eb5b348a-bda7-4a78-8b3a-8e5873c150a3.png)


[http://localhost:8082/h2-console
JDBC URL:jdbc:h2:mem:distributioncentre
![image](https://user-images.githubusercontent.com/32995324/232786402-32c04867-1856-4c5b-9de9-fa7c382f38f2.png)


