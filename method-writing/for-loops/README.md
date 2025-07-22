# For Loops Exercises

This directory contains exercises to help you practice writing for loops in Java using jshell.

## Setup
1. Open your terminal/command prompt
2. Navigate to this directory
3. Start jshell: `jshell`
4. Load the exercise file: `/open topic.jsh`

## Exercises

### Exercise 1: Number Sequence
Write a method `printNumbers(int start, int end)` that prints all numbers from start to end (inclusive).

### Exercise 2: Sum Calculator
Write a method `calculateSum(int n)` that calculates and returns the sum of all integers from 1 to n using a for loop.

### Exercise 3: Multiplication Table
Write a method `multiplicationTable(int number)` that prints the multiplication table for the given number (1 through 10).

### Exercise 4: Even Numbers Only
Write a method `printEvenNumbers(int limit)` that prints all even numbers from 2 up to the limit (inclusive).

### Exercise 5: String Repeater
Write a method `repeatString(String text, int times)` that returns a string with the given text repeated the specified number of times.

### Exercise 6: Factorial Calculator
Write a method `calculateFactorial(int n)` that calculates n! (n factorial) using a for loop.

### Exercise 7: Array Sum
Write a method `sumArray(int[] numbers)` that calculates and returns the sum of all numbers in an array using a for loop.

### Exercise 8: Character Counter
Write a method `countCharacter(String text, char target)` that counts how many times a specific character appears in a string.

### Exercise 9: Pattern Printer
Write a method `printStars(int rows)` that prints a triangle pattern of stars. For example, printStars(4) should print:
```
*
**
***
****
```

## Testing Your Code
After completing each exercise, test your methods with different inputs:

```java
// Example tests
printNumbers(1, 5)           // Should print 1 2 3 4 5
calculateSum(4)              // Should return 10 (1+2+3+4)
multiplicationTable(3)       // Should print 3x1=3, 3x2=6, etc.
printEvenNumbers(10)         // Should print 2 4 6 8 10
repeatString("Hi", 3)        // Should return "HiHiHi"
calculateFactorial(5)        // Should return 120
sumArray(new int[]{1,2,3,4}) // Should return 10
countCharacter("hello", 'l') // Should return 2
printStars(3)               // Should print triangle pattern
```

## Tips
- Read the NOTES.md file first to understand for loops
- Pay attention to the loop bounds (start and end conditions)
- Practice with small values first, then try larger ones
- Remember that arrays use 0-based indexing
- Use meaningful variable names for your loop counters
