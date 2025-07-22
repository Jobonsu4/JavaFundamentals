# Bool and Boolean Exercises

This directory contains exercises to help you practice working with boolean values and Boolean objects in Java using jshell.

## Setup
1. Open your terminal/command prompt
2. Navigate to this directory
3. Start jshell: `jshell`
4. Load the exercise file: `/open topic.jsh`

## Exercises

### Exercise 1: Basic Boolean Methods
Write a method `isAdult(int age)` that returns `true` if the person is 18 or older, `false` otherwise.

### Exercise 2: Number Range Checker
Write a method `isInRange(int number, int min, int max)` that returns `true` if the number is between min and max (inclusive), `false` otherwise.

### Exercise 3: String Validation
Write a method `isValidEmail(String email)` that returns `true` if the email contains both "@" and "." characters, `false` otherwise.

### Exercise 4: Even/Odd Checker
Write a method `isEven(int number)` that returns `true` if the number is even, `false` if it's odd.

### Exercise 5: Leap Year Calculator
Write a method `isLeapYear(int year)` that returns `true` if the year is a leap year. A leap year is divisible by 4, but not by 100, unless it's also divisible by 400.

### Exercise 6: Password Strength Validator
Write a method `isStrongPassword(String password)` that returns `true` if the password is at least 8 characters long AND contains at least one uppercase letter.

### Exercise 7: Triangle Validator
Write a method `isValidTriangle(int a, int b, int c)` that returns `true` if three sides can form a valid triangle (the sum of any two sides must be greater than the third side).

### Exercise 8: Boolean Object Practice
Write a method `compareBoolean(Boolean b1, Boolean b2)` that returns `true` if both Boolean objects have the same value (handling null cases).

### Exercise 9: Logic Gate Simulator
Write methods to simulate basic logic gates:
- `andGate(boolean a, boolean b)` - returns a AND b
- `orGate(boolean a, boolean b)` - returns a OR b
- `notGate(boolean a)` - returns NOT a
- `xorGate(boolean a, boolean b)` - returns a XOR b (true if exactly one is true)

## Testing Your Code
After completing each exercise, test your methods with different inputs:

```java
// Example tests
isAdult(17)                     // Should return false
isAdult(18)                     // Should return true
isInRange(5, 1, 10)            // Should return true
isValidEmail("user@domain.com") // Should return true
isEven(4)                      // Should return true
isLeapYear(2024)               // Should return true
isStrongPassword("MyPass123")   // Should return true
isValidTriangle(3, 4, 5)       // Should return true
andGate(true, false)           // Should return false
```

## Tips
- Read the NOTES.md file first to understand boolean types
- Remember the difference between `boolean` (primitive) and `Boolean` (object)
- Practice combining conditions with &&, ||, and !
- Test edge cases and boundary conditions
- Be careful with null values when using Boolean objects
