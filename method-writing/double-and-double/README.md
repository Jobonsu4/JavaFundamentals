# Double and double Exercises

This directory contains exercises to help you practice working with double primitives and Double objects in Java using jshell.

## Setup
1. Open your terminal/command prompt
2. Navigate to this directory
3. Start jshell: `jshell`
4. Load the exercise file: `/open topic.jsh`

## Exercises

### Exercise 1: Basic Double Operations
Write a method `calculateSum(double a, double b)` that returns the sum of two doubles.
Write a method `calculateAverage(double a, double b, double c)` that returns the average of three doubles.

### Exercise 2: Math Operations
Write a method `findLarger(double a, double b)` that returns the larger of two doubles.
Write a method `calculateAbsolute(double number)` that returns the absolute value of a double.
Write a method `roundToNearestInt(double number)` that rounds a double to the nearest integer.

### Exercise 3: Precision and Comparison
Write a method `areDoublesEqual(double a, double b, double tolerance)` that checks if two doubles are equal within a tolerance.
Write a method `formatToTwoDecimals(double number)` that returns a string with the number formatted to 2 decimal places.

### Exercise 4: Mathematical Calculations
Write a method `calculateCircleArea(double radius)` that calculates the area of a circle (π × r²).
Write a method `calculateDistance(double x1, double y1, double x2, double y2)` that calculates distance between two points.
Write a method `calculateCompoundInterest(double principal, double rate, int years)` that calculates compound interest.

### Exercise 5: Range and Validation
Write a method `isInRange(double value, double min, double max)` that checks if a value is within a range.
Write a method `clampValue(double value, double min, double max)` that constrains a value to be within min and max.

### Exercise 6: Double Object Practice
Write a method `parseDoubleSafely(String text)` that safely parses a string to Double, returning null if it fails.
Write a method `compareDoubles(Double d1, Double d2)` that safely compares two Double objects (handle nulls).

### Exercise 7: Array Statistics
Write a method `findMaximum(double[] numbers)` that finds the maximum value in an array.
Write a method `calculateMean(double[] numbers)` that calculates the arithmetic mean of an array.
Write a method `calculateStandardDeviation(double[] numbers)` that calculates the standard deviation.

## Testing Your Code
After completing each exercise, test your methods with different inputs:

```java
// Example tests
calculateSum(3.5, 2.7)                     // Should return 6.2
calculateAverage(1.0, 2.0, 3.0)           // Should return 2.0
findLarger(3.14, 2.71)                     // Should return 3.14
areDoublesEqual(0.1 + 0.2, 0.3, 0.0001)   // Should return true
calculateCircleArea(5.0)                   // Should return ~78.54
formatToTwoDecimals(3.14159)               // Should return "3.14"
isInRange(2.5, 1.0, 5.0)                  // Should return true
findMaximum(new double[]{1.1, 3.3, 2.2})  // Should return 3.3
```

## Tips
- Read the NOTES.md file first to understand double precision
- Be careful with floating-point precision issues
- Use tolerance-based comparison for equality checks
- Remember that double cannot be null, but Double can
- Use Math class methods for common mathematical operations
- Be aware of special values: NaN, POSITIVE_INFINITY, NEGATIVE_INFINITY
