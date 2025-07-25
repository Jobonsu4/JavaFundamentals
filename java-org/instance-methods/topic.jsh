// Instance Methods Practice - Complete the method implementations

import java.util.ArrayList;

// Exercise 1: Calculator with instance methods
class Calculator {
    double result;
    
    public Calculator() {
        result = 0.0;
        
    }
    
    public void add(double value) {
        result += value;
        
    }
    
    public void subtract(double value) {
        result -= value;
        
    }
    
    public void multiply(double value) {
        result *= value;
    }
    
    public void divide(double value) {
       if (value != 0) {
            result /= value;
              } else {
            System.out.println("Error: Division by zero");
        }
    }
    
    
    public double getResult() {
        // TODO: Return the current result
        return result;
    }
    
    public void clear() {
        result = 0.0;
    }
}



// Exercise 2: Text processing with instance methods
class TextProcessor {
    String text;
    
    public TextProcessor(String initialText) {
         this.text = initialText;

        // TODO: Set the text field
    }
    
    public void setText(String newText) {
        this.text = newText;
        // TODO: Update the text
    }
    
    public String getText() {
        // TODO: Return the current text
        return text;
    }
    
    public int getLength() {
        // TODO: Return length of text
         return (text != null) ? text.length() : 0;
    }
    
    public String toUpperCase() {
        // TODO: Return text in uppercase (don't modify original)
          return (text != null) ? text.toUpperCase() : "";
    }
    
    public String toLowerCase() {
        // TODO: Return text in lowercase (don't modify original)
       return (text != null) ? text.toUpperCase() : "";
    }
    public String reverse() {
         StringBuilder sb = new StringBuilder(text);
        return sb.reverse().toString();
        // TODO: Return reversed text
    }
    
    public boolean contains(String substring) {
         if (text == null || substring == null) return false;
        return text.contains(substring);
       
    }
    
    public int getWordCount() {
          if (text == null || text.trim().isEmpty()) {
            return 0;
        }
        return text.trim().split("\\s+").length;
    }
        // TODO: Return number of words in text
        // Hint: Split by spaces and count non-empty parts
    }


// Exercise 3: Counter with state management
class Counter {
    int count;
    int step;
    
    public Counter(int initialCount, int stepValue) {
         this.count = initialCount;
        this.step = stepValue;
        // TODO: Initialize count and step
    }
    
    public void increment() {
        count += step;
        // TODO: Increase count by step
    }
    
    public void decrement() {
        count -= step;
        // TODO: Decrease count by step
    }
    
    public void reset() {
        count = 0;
        // TODO: Set count back to 0
    }
    
    public int getCount() {
        // TODO: Return current count
        return count;
    }
    
    public void setStep(int newStep) {
        step = newStep;
        // TODO: Change the step value
    }
    
    public int getStep() {
        // TODO: Return current step value
        return step;
    }
    
    public boolean isPositive() {
        // TODO: Return true if count > 0
        return count > 0;
    }
    
    public boolean isNegative() {
        // TODO: Return true if count < 0
        return count < 0;
    }
}

// Exercise 4: Temperature conversion and validation
class Temperature {
    double celsius;
    
    public Temperature(double temp, String unit) {
        if (unit.equalsIgnoreCase("C")) {
            celsius = temp;
        } else if (unit.equalsIgnoreCase("F")) {
            celsius = (temp - 32) * 5.0 / 9.0;
        } else if (unit.equalsIgnoreCase("K")) {
            celsius = temp - 273.15;
        } else {
            throw new IllegalArgumentException("Invalid unit. Use 'C', 'F', or 'K'.");
        }
    }
        // TODO: Convert temperature to Celsius and store
        // unit can be "C", "F", or "K"
        // Conversion formulas:
        // F to C: (F - 32) * 5/9
        // K to C: K - 273.15
    
    public double getCelsius() {
        // TODO: Return temperature in Celsius
        return celsius;
    }
    
    public double getFahrenheit() {
        // TODO: Return temperature in Fahrenheit
        // C to F: C * 9/5 + 32
        return (celsius * 9.0 / 5.0) + 32;
    }
    
    public double getKelvin() {
        // TODO: Return temperature in Kelvin
        // C to K: C + 273.15
        return celsius + 273.15;
    }
    
    public void setCelsius(double temp) {
          celsius = temp;
        // TODO: Set temperature in Celsius
    }
    
    public void setFahrenheit(double temp) {
          celsius = (temp - 32) * 5.0 / 9.0;
        // TODO: Set temperature in Fahrenheit (convert to Celsius)
    }
    
    public void setKelvin(double temp) {
          celsius = temp - 273.15;
        // TODO: Set temperature in Kelvin (convert to Celsius)
    }
    
    public boolean isFreezingWater() {
      return celsius <= 0.0;
        // TODO: Return true if water would freeze (0°C or below)
        
    }
    
    public boolean isBoilingWater() {
         return celsius >= 100.0;
        // TODO: Return true if water would boil (100°C or above)
    }
    
    public String getTemperatureCategory() {
         if (celsius < 0) {
            return "Cold";
        } else if (celsius <= 20) {
            return "Mild";
        } else if (celsius <= 35) {
            return "Hot";
        } else {
            return "Extreme";
        }
    }
}
        // TODO: Return category based on Celsius
        // Below 0: "Cold"
        // 0-20: "Mild"
        // 21-35: "Hot"
        // Above 35: "Extreme"
      
    
    


// Exercise 5: Shopping cart with item management
class ShoppingCart {
    ArrayList<String> items;
    ArrayList<Double> prices;
    
    public ShoppingCart() {
        items = new ArrayList<>();
        prices = new ArrayList<>();
        // TODO: Initialize empty lists
    }
    
    public void addItem(String item, double price) {
              items.add(item);
              prices.add(price);

        // TODO: Add item and price to respective lists
    }
    
    public void removeItem(String item) {
         int index = items.indexOf(item);
       
        if (index != -1) {
            items.remove(index);
            prices.remove(index);
        // TODO: Remove first occurrence of item and its corresponding price
    }
    
    
    public int getItemCount() {
        // TODO: Return total number of items
        return items.size();
    }
    
    public double calculateTotal() {
          double total = 0.0;
        for (double price : prices) {
            total += price;
        }
        return total;
    }
    
    public double calculateAverage() {
        // TODO: Return average price per item
              if (prices.isEmpty()) {
            return 0.0;
        }
        return calculateTotal() / prices.size();
    }
    
    public String getMostExpensive() {
        // TODO: Return name of most expensive item
         if (prices.isEmpty()) return "";
        double maxPrice = prices.get(0);
        int index = 0;
        for (int i = 1; i < prices.size(); i++) {
            if (prices.get(i) > maxPrice) {
                maxPrice = prices.get(i);
                index = i;
            }
        }
        return items.get(index);
    }
    
    public String getCheapest() {
        if (prices.isEmpty()) return "";
        double minPrice = prices.get(0);
        int index = 0;
        for (int i = 1; i < prices.size(); i++) {
            if (prices.get(i) < minPrice) {
                minPrice = prices.get(i);
                index = i;
            }
        }
        return items.get(index);
        // TODO: Return name of cheapest item
    }
    
    public boolean containsItem(String item) {
       return items.contains(item);
        // TODO: Check if item exists in cart
    }
    
    public void clear() {
        items.clear();
        prices.clear();
        // TODO: Remove all items and prices
    }
}
}
   
// Exercise 6: Bank account with transaction management
class BankAccount {
    String accountNumber;
    double balance;
    ArrayList<String> transactionHistory;

    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
        this.transactionHistory = new ArrayList<>();
    }

    public boolean deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            transactionHistory.add(String.format("Deposited $%.2f", amount));
            return true;
        } else {
            transactionHistory.add(String.format("Failed deposit $%.2f", amount));
            return false;
        }
    }

    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            transactionHistory.add(String.format("Withdrew $%.2f", amount));
            return true;
        } else {
            transactionHistory.add(String.format("Failed withdrawal $%.2f", amount));
            return false;
        }
    }

    public boolean transfer(BankAccount toAccount, double amount) {
        if (this.withdraw(amount)) {
            boolean success = toAccount.deposit(amount);
            if (success) {
                transactionHistory.add(String.format("Transferred $%.2f to account %s", amount, toAccount.getAccountNumber()));
                toAccount.transactionHistory.add(String.format("Received $%.2f from account %s", amount, this.accountNumber));
                return true;
            } else {
                // Rollback withdrawal if deposit fails
                this.deposit(amount);
            }
        }
        transactionHistory.add(String.format("Failed transfer $%.2f to account %s", amount, toAccount.getAccountNumber()));
        return false;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public ArrayList<String> getTransactionHistory() {
        return new ArrayList<>(transactionHistory); // Defensive copy
    }

    public int getTransactionCount() {
        return transactionHistory.size();
    }

    public boolean hasInsufficientFunds(double amount) {
        return balance < amount;
    }

    public double calculateInterest(double rate) {
        return balance * rate;
    }
}



// Exercise 7: Student grade book
class StudentGradeBook {
    String studentName;
    ArrayList<Double> grades;
    
    public StudentGradeBook(String name) {
         studentName = name;
        grades = new ArrayList<>();
        // TODO: Set student name and initialize empty grades list
    }
    
    public boolean addGrade(double grade) {
         if (grade >= 0 && grade <= 100) {
            grades.add(grade);
            return true;
        }
        return false;
        // TODO: Add grade (validate 0-100 range)
        // Return true if valid and added
    }
    
    public boolean removeLowestGrade() {
        if (grades.isEmpty()) return false;

        double lowest = grades.get(0);
        int index = 0;
        for (int i = 1; i < grades.size(); i++) {
            if (grades.get(i) < lowest) {
                lowest = grades.get(i);
                index = i;
            }
        }
        grades.remove(index);
        return true;
    }
        // TODO: Remove the lowest grade
        // Return true if grade was removed
    
    
    public int getGradeCount() {
        return grades.size();
        // TODO: Return number of grades
    }
    
    public double calculateAverage() {
        // TODO: Return average of all grades
        if (grades.isEmpty()) return 0.0;

        double sum = 0.0;
        for (double g : grades) {
            sum += g;
        }
        return sum / grades.size();
    }
    
    
    public double getHighestGrade() {
        // TODO: Return highest grade
       if (grades.isEmpty()) return 0.0;

        double highest = grades.get(0);
        for (double g : grades) {
            if (g > highest) highest = g;
        }
        return highest;
    }
    
    public double getLowestGrade() {
        if (grades.isEmpty()) return 0.0;

        double lowest = grades.get(0);
        for (double g : grades) {
            if (g < lowest) lowest = g;
        }
        return lowest;
        // TODO: Return lowest grade
    }
    
    public String getLetterGrade() {
        double avg = calculateAverage();
        if (avg >= 90) return "A";
        else if (avg >= 80) return "B";
        else if (avg >= 70) return "C";
        else if (avg >= 60) return "D";
        else return "F";
        // TODO: Return letter grade based on average
        // A: 90-100, B: 80-89, C: 70-79, D: 60-69, F: below 60
        
    }
    
    public boolean isPassingGrade() {
        return calculateAverage() >= 60;
        // TODO: Return true if average >= 60
        
    }
    
    public String getGradesSummary() {
          return String.format("Student: %s, Grades: %d, Average: %.2f, Letter: %s",
                studentName, getGradeCount(), calculateAverage(), getLetterGrade());
        // TODO: Return string with key statistics
        // Format: "Student: [name], Grades: [count], Average: [avg], Letter: [letter]"
    }
    
    public boolean hasGradeAbove(double threshold) {
        for (double g : grades) {
            if (g > threshold) return true;
        }
        return false;
    }
        // TODO: Check if any grade exceeds threshold
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
