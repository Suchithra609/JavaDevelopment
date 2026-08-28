# JavaDevelopment
SkillCraft Technology – Java Development Internship
This repository contains the Java programming tasks completed as part of my SkillCraft Technology Java Development Internship.

The tasks cover fundamental Java programming, problem-solving, algorithms, and web scraping.
🗂️ Tasks Overview

Task

Project

Description

Technologies

Task 01

Temperature Converter

Converts temperatures between Celsius, Fahrenheit, and Kelvin scales.

Java

Task 02

Number Guessing Game

Generates a random number and challenges the user to guess it.

Java

Task 03

Sudoku Solver

Automatically solves an unsolved Sudoku puzzle using an algorithm.

Java, Backtracking

Task 04

E-commerce Product Scraper

Extracts product names, prices, and ratings from an online e-commerce website and stores them in a CSV file.

Java, Maven, Jsoup, OpenCSV
Task 01 – Temperature Converter

📋 Description

Create a Java program that converts temperatures between:

Celsius

Fahrenheit

Kelvin

🔄 Conversion Formulas

Celsius to Fahrenheit

°F = (°C × 9/5) + 32

Fahrenheit to Celsius

°C = (°F - 32) × 5/9

Celsius to Kelvin

K = °C + 273.15

Kelvin to Celsius

°C = K - 273.15

🎯 Concepts Used

Variables

Data types

User input

Arithmetic operators

Conditional statements

Methods
 Task 02 – Number Guessing Game

📋 Description

Build a program that generates a random number and challenges the user to guess it.

The program:

Generates a random number.

Prompts the user to enter a guess.

Compares the user's guess with the generated number.

Provides feedback until the correct number is guessed.

🎯 Concepts Used

Random

Scanner

Loops

Conditional statements

User input

Comparison operators

💻 Example

Guess the number: 50
Too high!

Guess the number: 25
Too low!

Guess the number: 37
Congratulations! You guessed the correct number.
Task 03 – Sudoku Solver

📋 Description

Create a program that solves Sudoku puzzles automatically.

The program takes an input grid representing an unsolved Sudoku puzzle and uses an algorithm to fill in the missing numbers.

⚙️ How It Works

The Sudoku solver:

Takes an unsolved Sudoku grid as input.

Finds an empty cell.

Tries valid numbers from 1 to 9.

Checks whether the number is valid in the row.

Checks whether the number is valid in the column.

Checks whether the number is valid in the 3×3 box.

Uses backtracking to continue solving.

Backtracks when a chosen number leads to an invalid solution.

Continues until the Sudoku is solved.

🎯 Concepts Used

Two-dimensional arrays

Recursion

Backtracking

Conditional statements

Problem-solving

Algorithms
Task 04 – E-commerce Product Scraper

📋 Description

Create a program that extracts product information, such as names, prices, and ratings, from an online e-commerce website and stores the data in a structured format such as a CSV file.

For this project, the Books to Scrape website is used as the practice e-commerce website.

🌐 Website

https://books.toscrape.com/

📊 Data Extracted

The scraper extracts:

Product Name

Price

Rating

⚙️ Technologies Used

Java – Programming language

Maven – Dependency and project management

Jsoup – HTML parsing and web scraping

OpenCSV – CSV file generation

Eclipse IDE – Development environment

📁 Project Structure

EcommerceScraper
│
├── src
│   └── main
│       └── java
│           └── com.skillcraft.EcommerceScraper
│               ├── App.java
│               ├── Product.java
│               ├── ProductScraper.java
│               └── CsvWriter.java
│
├── products.csv
├── pom.xml
└── README.md

🔄 Scraping Process

Online E-commerce Website
          ↓
        Jsoup
          ↓
     HTML Document
          ↓
   Extract Product Data
          ↓
 ┌────────┼─────────┐
 ↓        ↓         ↓
Name    Price     Rating
 └────────┼─────────┘
          ↓
    Product Objects
          ↓
      Java List
          ↓
      OpenCSV
          ↓
     products.csv

📄 CSV Output

The extracted data is stored in:

products.csv

The CSV contains:

Product Name,Price,Rating
A Light in the Attic,£51.77,Three
Tipping the Velvet,£53.74,One
Soumission,£50.10,One
Sharp Objects,£47.82,Four
Sapiens: A Brief History of Humankind,£54.23,Five

✅ Sample Output

Total products: 20

A Light in the Attic | £51.77 | Three

Tipping the Velvet | £53.74 | One

Soumission | £50.10 | One

Sharp Objects | £47.82 | Four

Sapiens: A Brief History of Humankind | £54.23 | Five

...

CSV file created successfully!
Requirements

To run these projects, install:

Java JDK

Eclipse IDE

Apache Maven (or Maven support in Eclipse)

For Task 04, Maven dependencies are required.

Jsoup Dependency

<dependency>
    <groupId>org.jsoup</groupId>
    <artifactId>jsoup</artifactId>
    <version>1.18.3</version>
</dependency>

OpenCSV Dependency

<dependency>
    <groupId>com.opencsv</groupId>
    <artifactId>opencsv</artifactId>
    <version>5.9</version>
</dependency>
How to Run

Task 01

Open the project in Eclipse.

Open the temperature converter Java file.

Run the program as a Java Application.

Enter the required temperature and conversion option.

Task 02

Open the Number Guessing Game Java file.

Run it as a Java Application.

Enter guesses until the correct number is found.

Task 03

Open the Sudoku Solver Java file.

Provide the unsolved Sudoku grid.

Run the program.

The program fills the missing numbers and displays the solved Sudoku.

Task 04

Open the Maven project in Eclipse.

Make sure Maven dependencies are downloaded.

Open App.java.

Run it as a Java Application.

The scraper extracts product information.

The extracted data is displayed in the console.

products.csv is created.

Author

Suchithra

Java Development Intern – SkillCraft Technology
