# Understanding If Statements in Java

## What is an If Statement?

An if statement is a fundamental control structure in Java that allows your program to make decisions. It lets you execute different pieces of code based on whether certain conditions are true or false.

Think of it like a fork in the road - depending on the condition, your program will take one path or another.

## Basic Syntax

The simplest if statement looks like this:

```java
if (condition) {
    // code to execute if condition is true
}
```

## How If Statements Work

1. **Condition Evaluation**: Java evaluates the condition inside the parentheses
2. **Boolean Result**: The condition must result in either `true` or `false`
3. **Code Execution**: If the condition is `true`, the code inside the curly braces runs
4. **Skip if False**: If the condition is `false`, the code inside the curly braces is skipped

## Types of If Statements

### 1. Simple If Statement
```java
if (age >= 18) {
    System.out.println("You can vote!");
}
```

### 2. If-Else Statement
```java
if (age >= 18) {
    System.out.println("You can vote!");
} else {
    System.out.println("You cannot vote yet.");
}
```

### 3. If-Else If-Else Chain
```java
if (score >= 90) {
    grade = "A";
} else if (score >= 80) {
    grade = "B";
} else if (score >= 70) {
    grade = "C";
} else {
    grade = "F";
}
```

## Comparison Operators

If statements use comparison operators to create conditions:

- `==` : Equal to
- `!=` : Not equal to
- `<`  : Less than
- `<=` : Less than or equal to
- `>`  : Greater than
- `>=` : Greater than or equal to

## Logical Operators

You can combine conditions using logical operators:

- `&&` : AND (both conditions must be true)
- `||` : OR (at least one condition must be true)
- `!`  : NOT (reverses true/false)

### Examples:
```java
// AND operator
if (age >= 18 && hasLicense) {
    System.out.println("You can drive!");
}

// OR operator
if (day.equals("Saturday") || day.equals("Sunday")) {
    System.out.println("It's the weekend!");
}

// NOT operator
if (!isRaining) {
    System.out.println("Let's go to the park!");
}
```

## Common Mistakes to Avoid

1. **Using = instead of ==**
   ```java
   // Wrong!
   if (age = 18) { ... }
   
   // Correct!
   if (age == 18) { ... }
   ```

2. **Comparing Strings with ==**
   ```java
   // Wrong!
   if (name == "John") { ... }
   
   // Correct!
   if (name.equals("John")) { ... }
   ```

3. **Forgetting curly braces for multiple statements**
   ```java
   // This only applies the if to the first line!
   if (condition)
       System.out.println("First line");
       System.out.println("This always runs!");
   
   // Better to always use braces:
   if (condition) {
       System.out.println("First line");
       System.out.println("Second line");
   }
   ```

## What You Need to Know for the Exercises

1. **Basic Syntax**: How to write if, else if, and else statements
2. **Comparison Operators**: Using `<`, `>`, `<=`, `>=`, `==`, `!=`
3. **Logical Operators**: Combining conditions with `&&`, `||`, `!`
4. **String Comparison**: Using `.equals()` for string comparison
5. **Null Checking**: Checking if a variable is `null` before using it
6. **Method Return Values**: Using if statements to return different values

## Practical Applications

If statements are used everywhere in programming:
- **User Input Validation**: Check if user input is valid
- **Game Logic**: Determine if a player wins, loses, or continues
- **Business Rules**: Apply different pricing, discounts, or access levels
- **Error Handling**: Respond differently to different types of errors
- **Data Processing**: Filter, categorize, or transform data based on conditions

## Tips for Success

1. **Think Step by Step**: Break down complex conditions into smaller, simpler ones
2. **Test Edge Cases**: What happens at boundary values (like exactly 18 for voting age)?
3. **Use Meaningful Names**: Write conditions that clearly express what you're checking
4. **Start Simple**: Begin with basic if-else, then add complexity as needed
5. **Debug with Print Statements**: Add temporary print statements to see which conditions are being met

Remember: If statements are the foundation of decision-making in programming. Master them, and you'll be able to write programs that can respond intelligently to different situations!
