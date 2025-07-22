# Instance Methods Exercises

Welcome to the Instance Methods exercises! This topic focuses on understanding what instance methods are, how they work, and how to write effective methods for your classes.

## What You'll Learn

- Understanding the difference between instance methods and static methods
- Writing methods that operate on object data (fields)
- Creating methods with different return types and parameters
- Using methods to encapsulate behavior and maintain object state
- Method naming conventions and best practices

## Exercise Overview

You'll work with several classes to practice writing instance methods. Each exercise builds on the previous one, introducing new concepts and complexity.

## Exercises

### Exercise 1: Basic Instance Methods
**Class: `Calculator`**
Create a `Calculator` class with basic arithmetic methods that work with internal state.

**Requirements:**
- Fields: `double result` (to store the current result)
- Constructor: Initialize `result` to 0.0
- Methods:
  - `add(double value)` - Add value to result
  - `subtract(double value)` - Subtract value from result
  - `multiply(double value)` - Multiply result by value
  - `divide(double value)` - Divide result by value (check for division by zero)
  - `getResult()` - Return the current result
  - `clear()` - Reset result to 0.0

### Exercise 2: String Manipulation Methods
**Class: `TextProcessor`**
Create a class that processes text using various instance methods.

**Requirements:**
- Fields: `String text` (the text to process)
- Constructor: Takes initial text as parameter
- Methods:
  - `setText(String newText)` - Update the text
  - `getText()` - Return the current text
  - `getLength()` - Return length of text
  - `toUpperCase()` - Return text in uppercase (don't modify original)
  - `toLowerCase()` - Return text in lowercase (don't modify original)
  - `reverse()` - Return reversed text
  - `contains(String substring)` - Check if text contains substring
  - `getWordCount()` - Return number of words in text

### Exercise 3: State Management Methods
**Class: `Counter`**
Create a counter class with methods that manage internal state.

**Requirements:**
- Fields: `int count`, `int step` (increment/decrement amount)
- Constructor: Takes initial count and step values
- Methods:
  - `increment()` - Increase count by step
  - `decrement()` - Decrease count by step
  - `reset()` - Set count back to 0
  - `getCount()` - Return current count
  - `setStep(int newStep)` - Change the step value
  - `getStep()` - Return current step value
  - `isPositive()` - Return true if count > 0
  - `isNegative()` - Return true if count < 0

### Exercise 4: Validation and Business Logic
**Class: `Temperature`**
Create a temperature class with conversion methods and validation.

**Requirements:**
- Fields: `double celsius` (store temperature in Celsius)
- Constructor: Takes temperature value and unit ("C", "F", or "K")
- Methods:
  - `getCelsius()` - Return temperature in Celsius
  - `getFahrenheit()` - Return temperature in Fahrenheit
  - `getKelvin()` - Return temperature in Kelvin
  - `setCelsius(double temp)` - Set temperature in Celsius
  - `setFahrenheit(double temp)` - Set temperature in Fahrenheit
  - `setKelvin(double temp)` - Set temperature in Kelvin
  - `isFreezingWater()` - Return true if water would freeze
  - `isBoilingWater()` - Return true if water would boil
  - `getTemperatureCategory()` - Return "Cold", "Mild", "Hot", or "Extreme"

### Exercise 5: Object Interaction Methods
**Class: `ShoppingCart`**
Create a shopping cart that manages items and calculates totals.

**Requirements:**
- Fields: `ArrayList<String> items`, `ArrayList<Double> prices`
- Constructor: Initialize empty lists
- Methods:
  - `addItem(String item, double price)` - Add item with price
  - `removeItem(String item)` - Remove first occurrence of item and its price
  - `getItemCount()` - Return total number of items
  - `calculateTotal()` - Return sum of all prices
  - `calculateAverage()` - Return average price per item
  - `getMostExpensive()` - Return name of most expensive item
  - `getCheapest()` - Return name of cheapest item
  - `containsItem(String item)` - Check if item exists in cart
  - `clear()` - Remove all items

### Exercise 6: Complex State Methods
**Class: `BankAccount`**
Create a bank account with comprehensive transaction methods.

**Requirements:**
- Fields: `String accountNumber`, `double balance`, `ArrayList<String> transactionHistory`
- Constructor: Takes account number, sets balance to 0, initializes history
- Methods:
  - `deposit(double amount)` - Add money (validate amount > 0)
  - `withdraw(double amount)` - Remove money if sufficient funds
  - `transfer(BankAccount toAccount, double amount)` - Transfer money to another account
  - `getBalance()` - Return current balance
  - `getAccountNumber()` - Return account number
  - `getTransactionHistory()` - Return copy of transaction history
  - `getTransactionCount()` - Return number of transactions
  - `hasInsufficientFunds(double amount)` - Check if withdrawal would overdraft
  - `calculateInterest(double rate)` - Return interest amount for given rate

### Exercise 7: Advanced Method Design
**Class: `StudentGradeBook`**
Create a grade book that manages student scores and calculations.

**Requirements:**
- Fields: `String studentName`, `ArrayList<Double> grades`
- Constructor: Takes student name, initializes empty grades list
- Methods:
  - `addGrade(double grade)` - Add grade (validate 0-100 range)
  - `removeLowestGrade()` - Remove the lowest grade
  - `getGradeCount()` - Return number of grades
  - `calculateAverage()` - Return average of all grades
  - `getHighestGrade()` - Return highest grade
  - `getLowestGrade()` - Return lowest grade
  - `getLetterGrade()` - Return letter grade based on average
  - `isPassingGrade()` - Return true if average >= 60
  - `getGradesSummary()` - Return string with key statistics
  - `hasGradeAbove(double threshold)` - Check if any grade exceeds threshold

## Getting Started

1. Open the `topic.jsh` file
2. Find the class template for Exercise 1 (`Calculator`)
3. Implement the required methods according to the specifications
4. Run your code in jshell to test: `jshell topic.jsh`
5. Verify all tests pass before moving to the next exercise
6. Repeat for each exercise

## Key Concepts to Remember

- **Instance methods** operate on specific object instances and can access instance fields
- Methods should have **clear, descriptive names** that indicate what they do
- **Return types** should match what the method actually returns
- **Parameter validation** helps prevent errors and maintains data integrity
- **Encapsulation** means controlling access to object data through methods
- Methods can **modify object state** or **return information** about the object

## Testing Your Code

Each class has test code at the bottom of the file. Make sure:
- All tests pass without errors
- Methods return the expected values
- Object state changes correctly when methods are called
- Validation works as expected (e.g., division by zero, invalid grades)

Good luck with your instance methods practice!
