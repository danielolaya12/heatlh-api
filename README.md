# Diabetes Prediction API
This API provides access to diabetes prediction data stored in a PostgreSQL database. The API offers a single GET endpoint to retrieve information from the database in JSON format.

## Getting Started
To get started with using this API, follow the instructions below.

### Prerequisites
Before using the API, ensure you have the following installed:
- PostgreSQL database

### Installation
1. Clone or download the repository to your local machine.
2. Set up your PostgreSQL connection details in the application.properties file located in the src/main/resources directory.

### Usage
1. Start the Spring Boot application. This can typically be done by running the main method in the Application class.
2. Make a GET request to the API endpoint to retrieve the diabetes prediction data.

GET /API/patients
Example
http://localhost:8080/api/patients

Example response:
[
    {
        "gender": "Female",
        "age": 80,
        "hypertension": 0,
        "heart_disease": 1,
        "smoking_history": "never",
        "bmi": 25.19,
        "HbA1c_level": 6.6,
        "blood_glucose_level": 140,
        "diabetes": 0
    }
]

### Getting started

1. Create a new Postgres database called `patien_data`.
2. Run the script `database/patien_data.sql` in pgAdmin to set up your database.
3. Launch this project by running it as a Spring Boot application.
4. In your browser or postman, navigate to http://localhost:8080/api/patients. You'll see a complete list of patients.
