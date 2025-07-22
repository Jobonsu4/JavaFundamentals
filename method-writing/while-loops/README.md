# While Loops Exercises

This directory contains exercises to help you practice writing while loops in Java using jshell.

## Setup
1. Open your terminal/command prompt
2. Navigate to this directory
3. Start jshell: `jshell`
4. Load the exercise file: `/open topic.jsh`

## Exercises

### Exercise 1: Countdown
Write a method `countdown(int start)` that prints numbers from the start value down to 1, then prints "Blast off!".

### Exercise 2: Sum Calculator
Write a method `sumUpTo(int n)` that calculates and returns the sum of all positive integers from 1 up to n (inclusive).

### Exercise 3: Number Guessing Helper
Write a method `findNumber(int target, int start)` that starts from the start value and keeps adding 1 until it reaches the target. Return how many steps it took.

### Exercise 4: Digit Counter
Write a method `countDigits(int number)` that counts and returns how many digits are in a positive integer. For example, 12345 has 5 digits.

### Exercise 5: Password Strength Checker
Write a method `checkPasswordStrength(String password)` that returns:
- `"Strong"` if password has 8 or more characters
- `"Medium"` if password has 5-7 characters  
- `"Weak"` if password has less than 5 characters

Use a while loop to count the characters in the password.

### Exercise 6: Factorial Calculator
Write a method `factorial(int n)` that calculates n! (n factorial). For example, 5! = 5 × 4 × 3 × 2 × 1 = 120.

### Exercise 7: Power Calculator
Write a method `power(int base, int exponent)` that calculates base raised to the power of exponent using a while loop (don't use Math.pow).

## Testing Your Code
After completing each exercise, test your methods with different inputs:

```java
// Example tests
countdown(5)        // Should print 5, 4, 3, 2, 1, Blast off!
sumUpTo(4)         // Should return 10 (1+2+3+4)
findNumber(10, 5)  // Should return 5 (5->6->7->8->9->10)
countDigits(12345) // Should return 5
factorial(5)       // Should return 120
power(2, 3)        // Should return 8 (2³)
```

## Tips
- Read the NOTES.md file first to understand while loops
- Be careful with your loop conditions to avoid infinite loops
- Test with small values first, then try larger ones
- Make sure your loop variable changes inside the loop
- Consider edge cases like 0 or 1
