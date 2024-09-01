# Expense Tracker API

This is a simple Expense Tracker API built using Spring Boot. The application allows users to manage their expenses by providing basic CRUD (Create, Read, Update, Delete) operations. 

## Features

- *Create Expense*: Add a new expense to the tracker.
- *View Expenses*: Retrieve a list of all expenses.
- *Update Expense*: Modify details of an existing expense.
- *Delete Expense*: Remove an expense from the tracker.
- *Search and Filter*: Search expenses by various criteria such as date, category, or amount.
- *Expense Reporting*: Generate reports based on expenses.

## Getting Started

### Prerequisites

- Java 8 or higher
- Maven or Gradle
- A code editor or IDE (e.g., VS Code, IntelliJ IDEA)
- Git

### Installation

1. *Clone the Repository*:
   ```bash
   git clone https://github.com/pranav-gupta12/expense.git
   cd Expense-Tracker
   ```
2. Build the Project: Using Maven:

```bash
mvn clean install
```
3. Using Gradle:

```bash

gradle clean build
```
4. Run the Application:

```bash
mvn spring-boot:run
```
or

```bash

gradle bootRun
```
## Usage
Create a New Expense: Send a POST request to /api/expenses with the expense details (e.g., name, amount, category, date).

View All Expenses: Send a GET request to /api/expenses to retrieve a list of all expenses.

Update an Expense: Send a PUT request to /api/expenses/{id} with the updated details of the expense.

Delete an Expense: Send a DELETE request to /api/expenses/{id} to remove an expense from the tracker.

Search and Filter Expenses: Use query parameters (e.g., /api/expenses?category=Food) to search or filter expenses.

## Project Structure
Model: Contains the Expense class, which represents the data structure for an expense.
Repository: Interfaces with the database.
Service: Contains the business logic for managing expenses.
Controller: Handles incoming HTTP requests and maps them to the appropriate service methods.
