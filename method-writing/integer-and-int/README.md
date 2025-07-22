# Integer and int Exercises

This directory contains exercises to help you practice working with int primitives and Integer objects in Java using jshell.

## Setup
1. Open your terminal/command prompt
2. Navigate to this directory
3. Start jshell: `jshell`
4. Load the exercise file: `/open topic.jsh`

## Exercises

### Exercise 1: Basic Math Operations
Write a method `calculateSum(int a, int b)` that returns the sum of two integers.
Write a method `calculateProduct(int a, int b)` that returns the product of two integers.

### Exercise 2: Number Analysis
Write a method `findLarger(int a, int b)` that returns the larger of two integers.
Write a method `findAbsoluteValue(int number)` that returns the absolute value (always positive).

### Exercise 3: Digit Operations
Write a method `countDigits(int number)` that counts how many digits are in a positive integer.
Write a method `reverseDigits(int number)` that reverses the digits of a positive integer.

### Exercise 4: Number Classification
Write a method `isPrime(int number)` that returns true if the number is prime (only divisible by 1 and itself).
Write a method `isPerfectSquare(int number)` that returns true if the number is a perfect square.

### Exercise 5: Range Operations
Write a method `sumRange(int start, int end)` that calculates the sum of all integers from start to end (inclusive).
Write a method `countMultiples(int number, int limit)` that counts how many multiples of `number` exist up to `limit`.

### Exercise 6: Integer Object Practice
Write a method `compareIntegers(Integer num1, Integer num2)` that safely compares two Integer objects, handling null values.
Write a method `parseIntegerSafely(String text)` that tries to parse a string to Integer, returning null if it fails.

### Exercise 7: Mathematical Sequences
Write a method `fibonacci(int n)` that returns the nth Fibonacci number (0, 1, 1, 2, 3, 5, 8, 13...).
Write a method `factorial(int n)` that calculates n! (n factorial).

### Exercise 8: Number Conversion
Write a method `toBinaryString(int number)` that converts an integer to its binary representation as a string.
Write a method `fromBinaryString(String binary)` that converts a binary string back to an integer.

### Exercise 9: Array Statistics
Write a method `findMax(int[] numbers)` that finds the maximum value in an array.
Write a method `calculateAverage(int[] numbers)` that calculates the average as a double.

## Testing Your Code
After completing each exercise, test your methods with different inputs:

```java
// Example tests
calculateSum(5, 3)              // Should return 8
findLarger(10, 7)              // Should return 10
countDigits(12345)             // Should return 5
isPrime(17)                    // Should return true
sumRange(1, 5)                 // Should return 15 (1+2+3+4+5)
compareIntegers(null, 5)       // Should handle null safely
fibonacci(6)                   // Should return 8
toBinaryString(10)             // Should return "1010"
findMax(new int[]{1,5,3,9,2})  // Should return 9
```

## Tips
- Read the NOTES.md file first to understand int vs Integer
- Remember that int cannot be null, but Integer can
- Practice with edge cases like 0, negative numbers, and large values
- Be careful with integer overflow for large calculations
- Use Integer.parseInt() for string to int conversion
