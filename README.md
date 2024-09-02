# Job Portal

## Setup Instructions

Follow these steps to set up and run the Job Portal application:

### Step 1: Unzip or Clone

- **Unzip the project**: If you have a zip file of the project, unzip it to your desired location.
- **Clone the repository**: If you prefer to clone the repository, use the following command:

    ```bash
    git clone <repository-url>
    ```

### Step 2: Create the Database

Create a MySQL database named `job_db`. You can do this using a MySQL client or command line:

```sql
CREATE DATABASE job_db;
```

### Step 3: Configure Application Properties
Update the application.properties file with the following properties:

```
properties
Copy code
# Application Name and Port
spring.application.name=Job-Portal
server.port=8080

# DataSource Configuration
spring.datasource.driver-class-name=com.mysql.cj.jdbc.Driver
spring.datasource.url=jdbc:mysql://localhost:3306/job_db
spring.datasource.username=root
spring.datasource.password=12345678

# JPA Configuration
spring.jpa.hibernate.ddl-auto=update

# SpringDoc Configuration
springdoc.api-docs.path = /Job Portal
springdoc.swagger-ui.path = /swagger.html
springdoc.swagger-ui.operationsSorter = method
```

### Step 4: Run the Application
Build and run the application. If you're using Maven, you can do this with the following commands:

```
bash
Copy code
mvn clean install
mvn spring-boot:run
```

### Step 5: Verify Database Tables
Check whether the tables have been created in the job_db database. You should see tables for address, business, customer, job, user, and worker.

### Step 6: Access the Application
API Documentation: Visit http://localhost:8080/swagger.html to access the Swagger UI and explore the API endpoints.
