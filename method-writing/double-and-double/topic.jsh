// Double and double Exercises - Complete the methods below
// Save this file and load it in jshell with: /open topic.jsh

// Exercise 1: Basic Double Operations
// Return the sum of two doubles
public double calculateSum(double a, double b) {
    // Your code here
    
}

// Return the average of three doubles
public double calculateAverage(double a, double b, double c) {
    // Your code here
    
}

// Exercise 2: Math Operations
// Return the larger of two doubles
public double findLarger(double a, double b) {
    // Your code here
    
}

// Return the absolute value of a double
public double calculateAbsolute(double number) {
    // Your code here
    
}

// Round double to nearest integer
public int roundToNearestInt(double number) {
    // Your code here
    
}

// Exercise 3: Precision and Comparison
// Check if two doubles are equal within tolerance
public boolean areDoublesEqual(double a, double b, double tolerance) {
    // Your code here
    
}

// Format double to string with 2 decimal places
public String formatToTwoDecimals(double number) {
    // Your code here
    
}

// Exercise 4: Mathematical Calculations
// Calculate area of circle (π × r²)
public double calculateCircleArea(double radius) {
    // Your code here
    
}

// Calculate distance between two points using distance formula
// √[(x2-x1)² + (y2-y1)²]
public double calculateDistance(double x1, double y1, double x2, double y2) {
    // Your code here
    
}

// Calculate compound interest: principal × (1 + rate)^years
public double calculateCompoundInterest(double principal, double rate, int years) {
    // Your code here
    
}

// Exercise 5: Range and Validation
// Check if value is between min and max (inclusive)
public boolean isInRange(double value, double min, double max) {
    // Your code here
    
}

// Constrain value to be within min and max bounds
public double clampValue(double value, double min, double max) {
    // Your code here
    
}

// Exercise 6: Double Object Practice
// Safely parse string to Double, return null if fails
public Double parseDoubleSafely(String text) {
    // Your code here
    
}

// Safely compare Double objects (handle nulls)
// Return: -1 if d1 < d2, 0 if equal, 1 if d1 > d2
// null is considered less than any number
public int compareDoubles(Double d1, Double d2) {
    // Your code here
    
}

// Exercise 7: Array Statistics
// Find maximum value in array
public double findMaximum(double[] numbers) {
    // Your code here
    
}

// Calculate arithmetic mean (average) of array
public double calculateMean(double[] numbers) {
    // Your code here
    
}

// Calculate standard deviation of array
public double calculateStandardDeviation(double[] numbers) {
    // Your code here
    // Hint: Standard deviation = √(Σ(x - mean)² / n)
    
}

// Test your methods here - uncomment and modify as needed
/*
System.out.println("Testing Basic Operations:");
System.out.println("3.5 + 2.7 = " + calculateSum(3.5, 2.7));           // Should print 6.2
System.out.println("Average of 1,2,3 = " + calculateAverage(1.0, 2.0, 3.0)); // Should print 2.0

System.out.println("\nTesting Math Operations:");
System.out.println("Larger of 3.14, 2.71: " + findLarger(3.14, 2.71)); // Should print 3.14
System.out.println("Absolute of -5.5: " + calculateAbsolute(-5.5));     // Should print 5.5
System.out.println("Round 3.7: " + roundToNearestInt(3.7));             // Should print 4
System.out.println("Round 3.2: " + roundToNearestInt(3.2));             // Should print 3

System.out.println("\nTesting Precision:");
System.out.println("0.1+0.2 equals 0.3? " + areDoublesEqual(0.1 + 0.2, 0.3, 0.0001)); // Should print true
System.out.println("Exact comparison: " + (0.1 + 0.2 == 0.3));          // Should print false!
System.out.println("3.14159 formatted: " + formatToTwoDecimals(3.14159)); // Should print "3.14"

System.out.println("\nTesting Mathematical Calculations:");
System.out.println("Circle area (r=5): " + calculateCircleArea(5.0));    // Should print ~78.54
System.out.println("Distance (0,0)-(3,4): " + calculateDistance(0, 0, 3, 4)); // Should print 5.0
System.out.println("Compound interest $1000 at 5% for 3 years: " + calculateCompoundInterest(1000, 0.05, 3)); // Should print ~1157.63

System.out.println("\nTesting Range Operations:");
System.out.println("2.5 in range [1,5]: " + isInRange(2.5, 1.0, 5.0));  // Should print true
System.out.println("10.0 in range [1,5]: " + isInRange(10.0, 1.0, 5.0)); // Should print false
System.out.println("Clamp 10.0 to [1,5]: " + clampValue(10.0, 1.0, 5.0)); // Should print 5.0
System.out.println("Clamp -2.0 to [1,5]: " + clampValue(-2.0, 1.0, 5.0)); // Should print 1.0

System.out.println("\nTesting Double Objects:");
System.out.println("Parse '3.14': " + parseDoubleSafely("3.14"));        // Should print 3.14
System.out.println("Parse 'abc': " + parseDoubleSafely("abc"));           // Should print null
System.out.println("Compare 3.5, 2.1: " + compareDoubles(3.5, 2.1));     // Should print 1
System.out.println("Compare null, 5.0: " + compareDoubles(null, 5.0));   // Should print -1

System.out.println("\nTesting Array Statistics:");
double[] testArray = {1.1, 3.3, 2.2, 4.4, 1.1};
System.out.println("Maximum: " + findMaximum(testArray));                 // Should print 4.4
System.out.println("Mean: " + calculateMean(testArray));                  // Should print 2.42
System.out.println("Standard deviation: " + calculateStandardDeviation(testArray));

// Test edge cases
double[] emptyArray = {};
// System.out.println("Mean of empty array: " + calculateMean(emptyArray)); // Test your error handling
*/
