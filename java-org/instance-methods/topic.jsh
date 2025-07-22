// Instance Methods Practice - Complete the method implementations

import java.util.ArrayList;

// Exercise 1: Calculator with instance methods
class Calculator {
    double result;
    
    public Calculator() {
        // TODO: Initialize result to 0.0
    }
    
    public void add(double value) {
        // TODO: Add value to result
    }
    
    public void subtract(double value) {
        // TODO: Subtract value from result
    }
    
    public void multiply(double value) {
        // TODO: Multiply result by value
    }
    
    public void divide(double value) {
        // TODO: Divide result by value (check for division by zero)
    }
    
    public double getResult() {
        // TODO: Return the current result
        return 0.0;
    }
    
    public void clear() {
        // TODO: Reset result to 0.0
    }
}

// Exercise 2: Text processing with instance methods
class TextProcessor {
    String text;
    
    public TextProcessor(String initialText) {
        // TODO: Set the text field
    }
    
    public void setText(String newText) {
        // TODO: Update the text
    }
    
    public String getText() {
        // TODO: Return the current text
        return "";
    }
    
    public int getLength() {
        // TODO: Return length of text
        return 0;
    }
    
    public String toUpperCase() {
        // TODO: Return text in uppercase (don't modify original)
        return "";
    }
    
    public String toLowerCase() {
        // TODO: Return text in lowercase (don't modify original)
        return "";
    }
    
    public String reverse() {
        // TODO: Return reversed text
        return "";
    }
    
    public boolean contains(String substring) {
        // TODO: Check if text contains substring
        return false;
    }
    
    public int getWordCount() {
        // TODO: Return number of words in text
        // Hint: Split by spaces and count non-empty parts
        return 0;
    }
}

// Exercise 3: Counter with state management
class Counter {
    int count;
    int step;
    
    public Counter(int initialCount, int stepValue) {
        // TODO: Initialize count and step
    }
    
    public void increment() {
        // TODO: Increase count by step
    }
    
    public void decrement() {
        // TODO: Decrease count by step
    }
    
    public void reset() {
        // TODO: Set count back to 0
    }
    
    public int getCount() {
        // TODO: Return current count
        return 0;
    }
    
    public void setStep(int newStep) {
        // TODO: Change the step value
    }
    
    public int getStep() {
        // TODO: Return current step value
        return 0;
    }
    
    public boolean isPositive() {
        // TODO: Return true if count > 0
        return false;
    }
    
    public boolean isNegative() {
        // TODO: Return true if count < 0
        return false;
    }
}

// Exercise 4: Temperature conversion and validation
class Temperature {
    double celsius;
    
    public Temperature(double temp, String unit) {
        // TODO: Convert temperature to Celsius and store
        // unit can be "C", "F", or "K"
        // Conversion formulas:
        // F to C: (F - 32) * 5/9
        // K to C: K - 273.15
    }
    
    public double getCelsius() {
        // TODO: Return temperature in Celsius
        return 0.0;
    }
    
    public double getFahrenheit() {
        // TODO: Return temperature in Fahrenheit
        // C to F: C * 9/5 + 32
        return 0.0;
    }
    
    public double getKelvin() {
        // TODO: Return temperature in Kelvin
        // C to K: C + 273.15
        return 0.0;
    }
    
    public void setCelsius(double temp) {
        // TODO: Set temperature in Celsius
    }
    
    public void setFahrenheit(double temp) {
        // TODO: Set temperature in Fahrenheit (convert to Celsius)
    }
    
    public void setKelvin(double temp) {
        // TODO: Set temperature in Kelvin (convert to Celsius)
    }
    
    public boolean isFreezingWater() {
        // TODO: Return true if water would freeze (0°C or below)
        return false;
    }
    
    public boolean isBoilingWater() {
        // TODO: Return true if water would boil (100°C or above)
        return false;
    }
    
    public String getTemperatureCategory() {
        // TODO: Return category based on Celsius
        // Below 0: "Cold"
        // 0-20: "Mild"
        // 21-35: "Hot"
        // Above 35: "Extreme"
        return "";
    }
}

// Exercise 5: Shopping cart with item management
class ShoppingCart {
    ArrayList<String> items;
    ArrayList<Double> prices;
    
    public ShoppingCart() {
        // TODO: Initialize empty lists
    }
    
    public void addItem(String item, double price) {
        // TODO: Add item and price to respective lists
    }
    
    public void removeItem(String item) {
        // TODO: Remove first occurrence of item and its corresponding price
    }
    
    public int getItemCount() {
        // TODO: Return total number of items
        return 0;
    }
    
    public double calculateTotal() {
        // TODO: Return sum of all prices
        return 0.0;
    }
    
    public double calculateAverage() {
        // TODO: Return average price per item
        return 0.0;
    }
    
    public String getMostExpensive() {
        // TODO: Return name of most expensive item
        return "";
    }
    
    public String getCheapest() {
        // TODO: Return name of cheapest item
        return "";
    }
    
    public boolean containsItem(String item) {
        // TODO: Check if item exists in cart
        return false;
    }
    
    public void clear() {
        // TODO: Remove all items and prices
    }
}

// Exercise 6: Bank account with transaction management
class BankAccount {
    String accountNumber;
    double balance;
    ArrayList<String> transactionHistory;
    
    public BankAccount(String accountNumber) {
        // TODO: Initialize account number, set balance to 0, create empty history
    }
    
    public boolean deposit(double amount) {
        // TODO: Add money (validate amount > 0)
        // Add transaction to history: "Deposited $XX.XX"
        // Return true if successful
        return false;
    }
    
    public boolean withdraw(double amount) {
        // TODO: Remove money if sufficient funds (amount > 0 and balance >= amount)
        // Add transaction to history: "Withdrew $XX.XX" or "Failed withdrawal $XX.XX"
        // Return true if successful
        return false;
    }
    
    public boolean transfer(BankAccount toAccount, double amount) {
        // TODO: Transfer money to another account
        // Should withdraw from this account and deposit to other account
        // Add transaction to history for both accounts
        // Return true if successful
        return false;
    }
    
    public double getBalance() {
        // TODO: Return current balance
        return 0.0;
    }
    
    public String getAccountNumber() {
        // TODO: Return account number
        return "";
    }
    
    public ArrayList<String> getTransactionHistory() {
        // TODO: Return copy of transaction history
        return new ArrayList<>();
    }
    
    public int getTransactionCount() {
        // TODO: Return number of transactions
        return 0;
    }
    
    public boolean hasInsufficientFunds(double amount) {
        // TODO: Check if withdrawal would overdraft
        return false;
    }
    
    public double calculateInterest(double rate) {
        // TODO: Return interest amount for given rate
        // Interest = balance * rate
        return 0.0;
    }
}

// Exercise 7: Student grade book
class StudentGradeBook {
    String studentName;
    ArrayList<Double> grades;
    
    public StudentGradeBook(String name) {
        // TODO: Set student name and initialize empty grades list
    }
    
    public boolean addGrade(double grade) {
        // TODO: Add grade (validate 0-100 range)
        // Return true if valid and added
        return false;
    }
    
    public boolean removeLowestGrade() {
        // TODO: Remove the lowest grade
        // Return true if grade was removed
        return false;
    }
    
    public int getGradeCount() {
        // TODO: Return number of grades
        return 0;
    }
    
    public double calculateAverage() {
        // TODO: Return average of all grades
        return 0.0;
    }
    
    public double getHighestGrade() {
        // TODO: Return highest grade
        return 0.0;
    }
    
    public double getLowestGrade() {
        // TODO: Return lowest grade
        return 0.0;
    }
    
    public String getLetterGrade() {
        // TODO: Return letter grade based on average
        // A: 90-100, B: 80-89, C: 70-79, D: 60-69, F: below 60
        return "";
    }
    
    public boolean isPassingGrade() {
        // TODO: Return true if average >= 60
        return false;
    }
    
    public String getGradesSummary() {
        // TODO: Return string with key statistics
        // Format: "Student: [name], Grades: [count], Average: [avg], Letter: [letter]"
        return "";
    }
    
    public boolean hasGradeAbove(double threshold) {
        // TODO: Check if any grade exceeds threshold
        return false;
    }
}

// Test your implementations below:

// Test Calculator
System.out.println("=== Testing Calculator ===");
Calculator calc = new Calculator();
System.out.println("Initial result: " + calc.getResult()); // Should be 0.0

calc.add(10);
System.out.println("After adding 10: " + calc.getResult()); // Should be 10.0

calc.multiply(2);
System.out.println("After multiplying by 2: " + calc.getResult()); // Should be 20.0

calc.subtract(5);
System.out.println("After subtracting 5: " + calc.getResult()); // Should be 15.0

calc.divide(3);
System.out.println("After dividing by 3: " + calc.getResult()); // Should be 5.0

calc.clear();
System.out.println("After clear: " + calc.getResult()); // Should be 0.0

// Test TextProcessor
System.out.println("\n=== Testing TextProcessor ===");
TextProcessor processor = new TextProcessor("Hello World");
System.out.println("Original text: " + processor.getText()); // "Hello World"
System.out.println("Length: " + processor.getLength()); // 11
System.out.println("Uppercase: " + processor.toUpperCase()); // "HELLO WORLD"
System.out.println("Lowercase: " + processor.toLowerCase()); // "hello world"
System.out.println("Reversed: " + processor.reverse()); // "dlroW olleH"
System.out.println("Contains 'World': " + processor.contains("World")); // true
System.out.println("Word count: " + processor.getWordCount()); // 2

// Test Counter
System.out.println("\n=== Testing Counter ===");
Counter counter = new Counter(5, 2);
System.out.println("Initial count: " + counter.getCount()); // 5
System.out.println("Step: " + counter.getStep()); // 2
System.out.println("Is positive: " + counter.isPositive()); // true

counter.increment();
System.out.println("After increment: " + counter.getCount()); // 7

counter.decrement();
counter.decrement();
counter.decrement();
counter.decrement();
System.out.println("After decrements: " + counter.getCount()); // -1
System.out.println("Is negative: " + counter.isNegative()); // true

counter.reset();
System.out.println("After reset: " + counter.getCount()); // 0

// Test Temperature
System.out.println("\n=== Testing Temperature ===");
Temperature temp = new Temperature(32, "F");
System.out.println("32°F in Celsius: " + temp.getCelsius()); // 0.0
System.out.println("In Kelvin: " + temp.getKelvin()); // 273.15
System.out.println("Is freezing water: " + temp.isFreezingWater()); // true
System.out.println("Category: " + temp.getTemperatureCategory()); // "Mild"

temp.setCelsius(25);
System.out.println("After setting to 25°C: " + temp.getFahrenheit()); // 77.0
System.out.println("Is boiling water: " + temp.isBoilingWater()); // false

// Test ShoppingCart
System.out.println("\n=== Testing ShoppingCart ===");
ShoppingCart cart = new ShoppingCart();
cart.addItem("Apple", 1.50);
cart.addItem("Banana", 0.75);
cart.addItem("Orange", 2.00);

System.out.println("Item count: " + cart.getItemCount()); // 3
System.out.println("Total: $" + cart.calculateTotal()); // 4.25
System.out.println("Average: $" + cart.calculateAverage()); // 1.42 (approximately)
System.out.println("Most expensive: " + cart.getMostExpensive()); // "Orange"
System.out.println("Cheapest: " + cart.getCheapest()); // "Banana"
System.out.println("Contains Apple: " + cart.containsItem("Apple")); // true

cart.removeItem("Banana");
System.out.println("After removing Banana, count: " + cart.getItemCount()); // 2

// Test BankAccount
System.out.println("\n=== Testing BankAccount ===");
BankAccount account1 = new BankAccount("123-456");
BankAccount account2 = new BankAccount("789-012");

System.out.println("Account 1 number: " + account1.getAccountNumber()); // "123-456"
System.out.println("Initial balance: $" + account1.getBalance()); // 0.0

account1.deposit(100.0);
System.out.println("After deposit: $" + account1.getBalance()); // 100.0

boolean withdrawn = account1.withdraw(30.0);
System.out.println("Withdrawal successful: " + withdrawn); // true
System.out.println("Balance after withdrawal: $" + account1.getBalance()); // 70.0

boolean transferred = account1.transfer(account2, 20.0);
System.out.println("Transfer successful: " + transferred); // true
System.out.println("Account 1 balance: $" + account1.getBalance()); // 50.0
System.out.println("Account 2 balance: $" + account2.getBalance()); // 20.0

System.out.println("Transaction count: " + account1.getTransactionCount()); // 3
System.out.println("Interest on $50 at 5%: $" + account1.calculateInterest(0.05)); // 2.5

// Test StudentGradeBook
System.out.println("\n=== Testing StudentGradeBook ===");
StudentGradeBook gradebook = new StudentGradeBook("Alice Johnson");

gradebook.addGrade(85.0);
gradebook.addGrade(92.0);
gradebook.addGrade(78.0);
gradebook.addGrade(96.0);

System.out.println("Grade count: " + gradebook.getGradeCount()); // 4
System.out.println("Average: " + gradebook.calculateAverage()); // 87.75
System.out.println("Highest: " + gradebook.getHighestGrade()); // 96.0
System.out.println("Lowest: " + gradebook.getLowestGrade()); // 78.0
System.out.println("Letter grade: " + gradebook.getLetterGrade()); // "B"
System.out.println("Is passing: " + gradebook.isPassingGrade()); // true
System.out.println("Has grade above 90: " + gradebook.hasGradeAbove(90.0)); // true

System.out.println("Summary: " + gradebook.getGradesSummary());

gradebook.removeLowestGrade();
System.out.println("After removing lowest, average: " + gradebook.calculateAverage()); // 91.0

System.out.println("\n=== All Tests Complete! ===");
