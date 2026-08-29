#  Software Development Internship – Task Projects

## 📌 About the Internship

This repository contains the tasks and projects completed as part of my **Software Development / Java Development Internship**.

The internship provided practical exposure to Java programming, problem-solving, algorithms, backtracking, web scraping, Maven project management, CSV file processing, and software development fundamentals.

The tasks were designed to progressively improve programming knowledge, logical thinking, algorithm implementation, and the ability to develop small real-world applications using Java.

---

# 🎯 Internship Objectives

The main objectives of this internship were:

* To strengthen Java programming fundamentals.
* To improve logical and problem-solving skills.
* To understand object-oriented programming concepts.
* To implement algorithms using Java.
* To learn how to handle user input and program output.
* To understand recursion and backtracking.
* To gain practical knowledge of web scraping.
* To learn how to create and manage Maven projects.
* To process and store data in CSV format.
* To understand project organization and clean coding practices.
* To gain experience using Git and GitHub for project management.
* To develop practical software-development skills through task-based projects.

---

# 📋 Tasks Overview

| Task    | Project                    | Description                                                                                                  | Technologies                |
| ------- | -------------------------- | ------------------------------------------------------------------------------------------------------------ | --------------------------- |
| Task 01 | Temperature Converter      | Converts temperature values between Celsius, Fahrenheit, and Kelvin.                                         | Java                        |
| Task 02 | Number Guessing Game       | Generates a random number and allows the user to guess it with hints.                                        | Java                        |
| Task 03 | Sudoku Solver              | Solves an unsolved Sudoku puzzle using recursion and backtracking.                                           | Java, Backtracking          |
| Task 04 | E-commerce Product Scraper | Extracts product names, prices, and ratings from an e-commerce website and stores the results in a CSV file. | Java, Maven, Jsoup, OpenCSV |

---

# 🗂️ Repository Structure

```text
Software-Development-Internship
│
├── Task-01-Temperature-Converter
│   ├── TemperatureConverter.java
│   └── README.md
│
├── Task-02-Number-Guessing-Game
│   ├── NumberGuessingGame.java
│   └── README.md
│
├── Task-03-Sudoku-Solver
│   ├── SudokuSolver.java
│   └── README.md
│
├── Task-04-Ecommerce-Product-Scraper
│   ├── src
│   │   └── main
│   │       └── java
│   │           └── com
│   │               └── skillcraft
│   │                   └── EcommerceScraper
│   │                       ├── App.java
│   │                       ├── Product.java
│   │                       ├── ProductScraper.java
│   │                       └── CsvWriter.java
│   │
│   ├── products.csv
│   ├── pom.xml
│   └── README.md
│
└── README.md
```

---

# 🟢 Task 01 – Temperature Converter

## 📌 Description

The **Temperature Converter** is a Java console application that converts temperature values between different temperature scales.

The application supports:

* Celsius
* Fahrenheit
* Kelvin

The user enters a temperature and selects the required conversion. The program performs the appropriate mathematical calculation and displays the converted temperature.

---

## 🎯 Objectives

* Understand Java input handling.
* Practice arithmetic operations.
* Use conditional statements.
* Implement mathematical formulas.
* Create a simple menu-driven console application.

---

## 🌡️ Supported Conversions

### Celsius to Fahrenheit

```text
°F = (°C × 9/5) + 32
```

### Fahrenheit to Celsius

```text
°C = (°F − 32) × 5/9
```

### Celsius to Kelvin

```text
K = °C + 273.15
```

### Kelvin to Celsius

```text
°C = K − 273.15
```

### Fahrenheit to Kelvin

```text
K = (°F − 32) × 5/9 + 273.15
```

### Kelvin to Fahrenheit

```text
°F = (K − 273.15) × 9/5 + 32
```

---

## 🛠️ Technologies Used

* Java
* Scanner
* Conditional Statements
* Arithmetic Operators

---

## ▶️ How to Run

1. Open the project in Eclipse or any Java IDE.
2. Open `TemperatureConverter.java`.
3. Compile the program.
4. Run the program.
5. Enter the temperature value.
6. Select the required conversion.
7. View the converted result.

---

## 💻 Sample Output

```text
===== Temperature Converter =====

1. Celsius to Fahrenheit
2. Fahrenheit to Celsius
3. Celsius to Kelvin
4. Kelvin to Celsius
5. Fahrenheit to Kelvin
6. Kelvin to Fahrenheit

Enter your choice: 1
Enter temperature: 25

Result: 77.0 °F
```

---

## 📚 Concepts Learned

* Java variables
* Data types
* Scanner class
* Arithmetic operations
* Conditional statements
* Menu-driven programming
* Mathematical formulas

---

# 🟡 Task 02 – Number Guessing Game

## 📌 Description

The **Number Guessing Game** is an interactive Java console application.

The computer generates a random number within a predefined range. The player repeatedly enters guesses until the correct number is identified.

After every guess, the program provides a hint:

* The guessed number is too high.
* The guessed number is too low.
* The guessed number is correct.

---

## 🎯 Objectives

* Generate random numbers.
* Handle user input.
* Use loops and conditional statements.
* Build an interactive console application.
* Improve logical thinking and problem-solving skills.

---

## ⚙️ Working Principle

The program follows these steps:

```text
Start
  ↓
Generate a random number
  ↓
Ask the user for a guess
  ↓
Compare the guess with the generated number
  ↓
Is the guess correct?
  ├── Yes → Display success message
  │
  └── No
       ↓
   Give a hint
       ↓
   Ask for another guess
       ↓
      Repeat
```

---

## 🛠️ Technologies Used

* Java
* Random number generation
* Scanner
* While loop
* If-else statements

---

## ▶️ How to Run

1. Open `NumberGuessingGame.java`.
2. Compile the program.
3. Run the application.
4. Enter a number when prompted.
5. Follow the hints.
6. Continue guessing until the correct number is found.

---

## 💻 Sample Output

```text
===== Number Guessing Game =====

I have selected a number between 1 and 100.

Enter your guess: 50
Too high! Try again.

Enter your guess: 25
Too low! Try again.

Enter your guess: 37
Congratulations!
You guessed the correct number.

Number of attempts: 3
```

---

## 📚 Concepts Learned

* Random number generation
* Loops
* Conditional statements
* User input
* Counters
* Interactive programming
* Logical problem solving

---

# 🔵 Task 03 – Sudoku Solver

## 📌 Description

The **Sudoku Solver** is a Java application that automatically solves an incomplete Sudoku puzzle.

The project uses **recursion and backtracking** to find a valid solution.

A standard Sudoku puzzle contains a **9 × 9 grid**. The objective is to fill the empty cells while following the Sudoku rules.

---

## 🎯 Objectives

* Understand recursion.
* Learn backtracking algorithms.
* Work with two-dimensional arrays.
* Validate possible solutions.
* Develop algorithmic problem-solving skills.

---

## 🧩 Sudoku Rules

A valid Sudoku solution must satisfy three conditions:

### 1. Row Rule

Every row must contain numbers from **1 to 9** without repetition.

### 2. Column Rule

Every column must contain numbers from **1 to 9** without repetition.

### 3. 3 × 3 Grid Rule

Every 3 × 3 sub-grid must contain numbers from **1 to 9** without repetition.

---

## ⚙️ Algorithm Used

The project uses the **Backtracking Algorithm**.

The basic process is:

```text
Find an empty cell
      ↓
Try a number from 1 to 9
      ↓
Check whether the number is valid
      ↓
If valid → place the number
      ↓
Recursively solve the remaining puzzle
      ↓
If solution fails → remove the number
      ↓
Try another number
      ↓
Continue until the puzzle is solved
```

---

## 🛠️ Technologies Used

* Java
* Two-dimensional arrays
* Recursion
* Backtracking
* Conditional statements

---

## ▶️ How to Run

1. Open `SudokuSolver.java`.
2. Enter or use the provided Sudoku puzzle.
3. Compile the program.
4. Run the application.
5. The program checks the puzzle and attempts to find a valid solution.
6. The solved Sudoku grid is displayed.

---

## 💻 Sample Input

```text
5 3 0 0 7 0 0 0 0
6 0 0 1 9 5 0 0 0
0 9 8 0 0 0 0 6 0
8 0 0 0 6 0 0 0 3
4 0 0 8 0 3 0 0 1
7 0 0 0 2 0 0 0 6
0 6 0 0 0 0 2 8 0
0 0 0 4 1 9 0 0 5
0 0 0 0 8 0 0 7 9
```

`0` represents an empty cell.

---

## 💻 Sample Output

```text
Solved Sudoku:

5 3 4 6 7 8 9 1 2
6 7 2 1 9 5 3 4 8
1 9 8 3 4 2 5 6 7
8 5 9 7 6 1 4 2 3
4 2 6 8 5 3 7 9 1
7 1 3 9 2 4 8 5 6
9 6 1 5 3 7 2 8 4
2 8 7 4 1 9 6 3 5
3 4 5 2 8 6 1 7 9
```

---

## 📚 Concepts Learned

* Recursion
* Backtracking
* Two-dimensional arrays
* Algorithm design
* Constraint checking
* Logical reasoning
* Problem-solving

---

# 🔴 Task 04 – E-commerce Product Scraper

## 📌 Description

The **E-commerce Product Scraper** is a Java-based web scraping application developed using **Maven and Jsoup**.

The application extracts product information from an e-commerce website and stores the collected data in a CSV file.

For this project, the scraper is designed to work with:

```text
https://books.toscrape.com/
```

The project extracts information such as:

* Product name
* Product price
* Product rating

The scraped data is then written to:

```text
products.csv
```

---

## 🎯 Objectives

* Understand Java web scraping.
* Learn how to use external Java libraries.
* Create a Maven project.
* Parse HTML documents.
* Extract information using CSS selectors.
* Create Java model classes.
* Write data to CSV files.
* Understand basic data-processing workflows.

---

## 🛠️ Technologies Used

| Technology | Purpose                           |
| ---------- | --------------------------------- |
| Java       | Application development           |
| Maven      | Dependency and project management |
| Jsoup      | HTML parsing and web scraping     |
| OpenCSV    | CSV file generation               |
| Eclipse    | Development environment           |
| Git/GitHub | Version control                   |

---

# 🏗️ Project Architecture

```text
Website
   ↓
Jsoup Connection
   ↓
HTML Document
   ↓
ProductScraper
   ↓
Product Objects
   ↓
CsvWriter
   ↓
products.csv
```

---

# 📁 Project Structure

```text
EcommerceScraper
│
├── src
│   └── main
│       └── java
│           └── com.skillcraft.EcommerceScraper
│               │
│               ├── App.java
│               ├── Product.java
│               ├── ProductScraper.java
│               └── CsvWriter.java
│
├── products.csv
├── pom.xml
└── README.md
```

---

# 📄 Description of Java Classes

## App.java

`App.java` is the main entry point of the application.

Responsibilities:

* Starts the application.
* Calls the product scraper.
* Receives the scraped product data.
* Displays the products.
* Calls the CSV writer.

---

## Product.java

`Product.java` is the model class used to represent a product.

Typical fields include:

```text
name
price
rating
```

The class contains constructors, getters, setters, and methods required to represent product information.

---

## ProductScraper.java

`ProductScraper.java` contains the web scraping logic.

Responsibilities:

* Connect to the target website.
* Download the HTML page.
* Parse the HTML using Jsoup.
* Identify product elements.
* Extract product names.
* Extract prices.
* Extract ratings.
* Create `Product` objects.
* Return the collected product list.

---

## CsvWriter.java

`CsvWriter.java` handles CSV file creation.

Responsibilities:

* Create the CSV file.
* Write column headers.
* Write product information.
* Save the final dataset.

---

# 📦 Maven Dependencies

The project uses Maven to manage external libraries.

The important dependencies are:

### Jsoup

Used for:

* Connecting to websites.
* Downloading HTML.
* Parsing HTML.
* Selecting elements.

### OpenCSV

Used for:

* Creating CSV files.
* Writing structured data.
* Handling CSV records.

The dependencies are configured inside:

```text
pom.xml
```

---

# ⚙️ How the Scraper Works

### Step 1 – Connect to Website

Jsoup establishes a connection to the target website.

### Step 2 – Retrieve HTML

The HTML content of the webpage is downloaded.

### Step 3 – Parse HTML

Jsoup converts the HTML into a document that can be searched.

### Step 4 – Locate Products

CSS selectors are used to identify product containers.

### Step 5 – Extract Product Information

The scraper extracts:

```text
Product Name
Price
Rating
```

### Step 6 – Create Product Objects

Each product is represented as a Java object.

### Step 7 – Store Data

The product objects are written to a CSV file.

---

# 💻 Sample Console Output

```text
Total products: 20

A Light in the Attic | £51.77 | Three
Tipping the Velvet | £53.74 | One
Soumission | £50.10 | One
Sharp Objects | £47.82 | Four
Sapiens: A Brief History of Humankind | £54.23 | Five
The Requiem Red | £22.65 | One
The Dirty Little Secrets of Getting Your Dream Job | £33.34 | Four
The Coming Woman | £17.93 | Three
The Boys in the Boat | £22.60 | Four
The Black Maria | £52.15 | One
Starving Hearts | £13.99 | Two
Shakespeare’s Sonnets | £20.66 | Four
Set Me Free | £17.46 | Five
Scott Pilgrim’s Precious Little Life | £52.29 | Five

CSV file created successfully!
```

---

# 📊 CSV Output

The scraper creates:

```text
products.csv
```

Example structure:

```csv
Product Name,Price,Rating
A Light in the Attic,£51.77,Three
Tipping the Velvet,£53.74,One
Soumission,£50.10,One
Sharp Objects,£47.82,Four
Sapiens: A Brief History of Humankind,£54.23,Five
```

The CSV file can be opened using:

* Microsoft Excel
* Google Sheets
* Notepad
* Any CSV-compatible application

---

# ▶️ How to Run the E-commerce Scraper

## Prerequisites

Install the following:

* Java JDK
* Eclipse IDE
* Maven
* Internet connection

---

## Step 1 – Import Project

Open Eclipse and select:

```text
File
→ Import
→ Maven
→ Existing Maven Projects
```

Select the `EcommerceScraper` project.

---

## Step 2 – Update Maven Project

Right-click the project:

```text
Maven
→ Update Project
```

Select the project and click **OK**.

---

## Step 3 – Verify Dependencies

Open:

```text
pom.xml
```

Make sure the required dependencies are downloaded successfully.

---

## Step 4 – Run the Application

Open:

```text
App.java
```

Right-click:

```text
Run As
→ Java Application
```

---

## Step 5 – Check Output

The scraped product information will appear in the Eclipse console.

After successful execution:

```text
CSV file created successfully!
```

The `products.csv` file will contain the scraped product data.

---

# 🧪 Testing

Each project was tested using different input conditions.

## Temperature Converter

Test cases include:

* Positive temperatures.
* Zero.
* Negative temperatures.
* Different conversion choices.

## Number Guessing Game

Test cases include:

* Guess lower than target.
* Guess higher than target.
* Correct guess.
* Multiple attempts.

## Sudoku Solver

Test cases include:

* Valid Sudoku puzzle.
* Puzzle with multiple empty cells.
* Solvable puzzle.
* Puzzle requiring backtracking.

## E-commerce Product Scraper

Test cases include:

* Successful website connection.
* Product extraction.
* Price extraction.
* Rating extraction.
* CSV file generation.

---

### Development Tools

* Eclipse IDE
* Git
* GitHub

---

---

# 📈 Project Highlights

This internship repository demonstrates the progression from basic programming to more advanced development concepts:

```text
Java Fundamentals
       ↓
Problem Solving
       ↓
Interactive Applications
       ↓
Recursion & Backtracking
       ↓
Web Scraping
       ↓
Data Processing
       ↓
Maven Project Management
       ↓
Git & GitHub
```

---

# 🏆 Conclusion

The Software Development Internship provided valuable hands-on experience in Java programming and software development.

The four tasks helped build skills progressively, starting with basic temperature conversion and interactive programming, followed by algorithmic problem-solving using Sudoku backtracking, and finally moving toward practical web scraping and CSV data processing.

These projects strengthened my understanding of:

* Java programming
* Problem solving
* Algorithms
* Recursion
* Backtracking
* Web scraping
* Maven
* CSV processing
* Git and GitHub

The experience gained through these tasks provides a strong foundation for developing larger Java applications and pursuing software development opportunities.

---

# 👩‍💻 Author

**Gopavaram Suchithra.**

### Software Development Intern

This repository contains the projects and tasks completed as part of my internship.

---

```
