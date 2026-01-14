# 📦 Smart Inventory Management System

## 📌 Project Description

The **Smart Inventory Management System** is a Java-based console
application that manages product inventory using a **SQLite database**.
The project demonstrates how Java applications interact with databases
through **JDBC**, enabling persistent storage and retrieval of inventory
data such as product name, quantity, and price.

This project is ideal for learning **database connectivity, SQL
operations, and backend logic** in Java.

------------------------------------------------------------------------

## 🚀 Features

-   Create and manage an inventory database\
-   Store product details (name, quantity, price)\
-   Retrieve and display inventory records\
-   Uses SQLite (lightweight, serverless database)\
-   Demonstrates JDBC connectivity and SQL operations

------------------------------------------------------------------------

## 🛠️ Technologies Used

-   **Java**
-   **JDBC (Java Database Connectivity)**
-   **SQLite**
-   **SQL**

------------------------------------------------------------------------

## 📂 Project Structure

    SmartInventoryManagement.java
    inventory.db   (auto-created when program runs)

------------------------------------------------------------------------

## 🧩 Database Schema

**Table Name:** `inventory`

  Column Name    Data Type   Description
  -------------- ----------- ------------------------------
  id             INTEGER     Primary Key (Auto Increment)
  product_name   TEXT        Name of the product
  quantity       INTEGER     Available stock
  price          REAL        Product price

------------------------------------------------------------------------

## ⚙️ How It Works

1.  Loads the SQLite JDBC driver\
2.  Establishes a connection to the SQLite database\
3.  Creates the inventory table if it does not exist\
4.  Inserts sample product records\
5.  Retrieves and displays inventory data\
6.  Closes the database connection

------------------------------------------------------------------------

## ▶️ How to Run the Project

1.  Install **Java (JDK 8 or higher)**

2.  Download the **SQLite JDBC Driver**

3.  Add the JDBC driver to your project classpath

4.  Compile and run the Java file:

    ``` bash
    javac SmartInventoryManagement.java
    java SmartInventoryManagement
    ```

------------------------------------------------------------------------

## 📌 Sample Output

    1 | Laptop | 10 | 75000.0
    2 | Mouse  | 50 | 500.0

------------------------------------------------------------------------

## 💡 Use Cases

-   Small business inventory tracking\
-   Learning JDBC and database operations\
-   Academic and mini-project submissions\
-   Backend foundation for larger systems

------------------------------------------------------------------------

## 🔮 Future Enhancements

-   Add update and delete functionality\
-   Menu-driven user interface\
-   GUI using Java Swing or JavaFX\
-   Low stock alerts\
-   Convert to REST API using Spring Boot

------------------------------------------------------------------------

## 👨‍💻 Author

**Shree**\
Aspiring Software Engineer \| Java \| SQL \| Machine Learning

------------------------------------------------------------------------

## 📜 License

This project is open-source and available for learning and educational
purposes.
