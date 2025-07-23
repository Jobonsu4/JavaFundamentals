// Integer and int Exercises - Complete the methods below
// Save this file and load it in jshell with: /open topic.jsh

// Exercise 1: Basic Math Operations
// Return the sum of two integers
public int calculateSum(int a, int b) {
    return a + b;
    // Your code here
    
}

// Return the product of two integers
public int calculateProduct(int a, int b) {
    // Your code here
    return a * b;
    
}

// Exercise 2: Number Analysis
// Return the larger of two integers
public int findLarger(int a, int b) {
    return (a > b) ? a : b;
    // Your code here
    
}

// Return the absolute value (always positive)
public int findAbsoluteValue(int number) {
     return (number < 0) ? -number : number;
    // Your code here
    
}

// Exercise 3: Digit Operations
// Count how many digits are in a positive integer
public int countDigits(int number) {
     int count = 0;
    do {
        count++;
        number /= 10;
    } while (number > 0);
    return count;
}
    
    

// Reverse the digits of a positive integer (123 becomes 321)
public int reverseDigits(int number) {
        int reversed = 0;
    while (number > 0) {
        reversed = reversed * 10 + (number % 10);
        number /= 10;
    }
    return reversed;
    // Your code here
    
}

// Exercise 4: Number Classification
// Return true if number is prime (only divisible by 1 and itself)
public boolean isPrime(int number) {
    if (number <= 1) return false;
    if (number == 2) return true;
    if (number % 2 == 0) return false;
    for (int i = 3; i * i <= number; i += 2) {
        if (number % i == 0) return false;
    }
    return true;
}
    // Your code here
    


// Return true if number is a perfect square
public boolean isPerfectSquare(int number) {
    if (number < 0) return false;
    int sqrt = (int) Math.sqrt(number);
    return sqrt * sqrt == number;
    // Your code here
    
}

// Exercise 5: Range Operations
// Calculate sum of all integers from start to end (inclusive)
public int sumRange(int start, int end) {
       int sum = 0;
    for (int i = start; i <= end; i++) {
        sum += i;
    }
    return sum;
}

    


// Count how many multiples of 'number' exist up to 'limit'
public int countMultiples(int number, int limit) {
     if (number == 0) return 0;
    return limit / number;
    // Your code here
    
}

// Exercise 6: Integer Object Practice
// Safely compare two Integer objects, handling nulls
// Return: -1 if num1 < num2, 0 if equal, 1 if num1 > num2
// Handle null cases: null is considered less than any number
public int compareIntegers(Integer num1, Integer num2) {
    if (num1 == null && num2 == null) return 0;
    if (num1 == null) return -1;
    if (num2 == null) return 1;
    return Integer.compare(num1, num2);
    // Your code here
    
}

// Try to parse string to Integer, return null if it fails
public Integer parseIntegerSafely(String text) {
    try {
        return Integer.parseInt(text);
    } catch (NumberFormatException e) {
        return null;
    }
}
    // Your code here
    


// Exercise 7: Mathematical Sequences
// Return the nth Fibonacci number (0, 1, 1, 2, 3, 5, 8, 13...)
public int fibonacci(int n) {
      if (n < 0) throw new IllegalArgumentException("n must be non-negative");
    if (n == 0) return 0;
    if (n == 1) return 1;
    int a = 0, b = 1;
    for (int i = 2; i <= n; i++) {
        int temp = a + b;
        a = b;
        b = temp;
    }
    return b;
}
    // Your code here
    


// Calculate n! (n factorial)
public long factorial(int n) {
     if (n < 0) throw new IllegalArgumentException("n must be non-negative");
    long result = 1;
    for (int i = 2; i <= n; i++) {
        result *= i;
    }
    return result;
}
    // Your code here
    


// Exercise 8: Number Conversion
// Convert integer to binary string representation
public String toBinaryString(int number) {
      return Integer.toBinaryString(number);
}
    // Your code here
    


// Convert binary string back to integer
public int fromBinaryString(String binary) {
     return Integer.parseInt(binary, 2);
    // Your code here
    
}

// Exercise 9: Array Statistics
// Find the maximum value in an array
public int findMax(int[] numbers) {
    if (numbers == null || numbers.length == 0) {
        throw new IllegalArgumentException("Array must not be null or empty");
    }
    int max = numbers[0];
    for (int i = 1; i < numbers.length; i++) {
        if (numbers[i] > max) {
            max = numbers[i];
        }
    }
    return max;
    // Your code here
    
}

// Calculate the average as a double
public double calculateAverage(int[] numbers) {
     if (numbers == null || numbers.length == 0) {
        throw new IllegalArgumentException("Array must not be null or empty");
    }
    double sum = 0;
    for (int num : numbers) {
        sum += num;
    }
    return sum / numbers.length;
}

    


// Test your methods here - uncomment and modify as needed
/*
System.out.println("Testing Basic Math:");
System.out.println("5 + 3 = " + calculateSum(5, 3));           // Should print 8
System.out.println("4 * 6 = " + calculateProduct(4, 6));       // Should print 24

System.out.println("\nTesting Number Analysis:");
System.out.println("Larger of 10, 7: " + findLarger(10, 7));   // Should print 10
System.out.println("Absolute of -5: " + findAbsoluteValue(-5)); // Should print 5
System.out.println("Absolute of 3: " + findAbsoluteValue(3));   // Should print 3

System.out.println("\nTesting Digit Operations:");
System.out.println("Digits in 12345: " + countDigits(12345));   // Should print 5
System.out.println("Digits in 7: " + countDigits(7));           // Should print 1
System.out.println("Reverse 123: " + reverseDigits(123));       // Should print 321
System.out.println("Reverse 1000: " + reverseDigits(1000));     // Should print 1

System.out.println("\nTesting Number Classification:");
System.out.println("Is 17 prime? " + isPrime(17));              // Should print true
System.out.println("Is 15 prime? " + isPrime(15));              // Should print false
System.out.println("Is 16 perfect square? " + isPerfectSquare(16)); // Should print true
System.out.println("Is 15 perfect square? " + isPerfectSquare(15)); // Should print false

System.out.println("\nTesting Range Operations:");
System.out.println("Sum 1 to 5: " + sumRange(1, 5));           // Should print 15
System.out.println("Sum 3 to 7: " + sumRange(3, 7));           // Should print 25
System.out.println("Multiples of 3 up to 10: " + countMultiples(3, 10)); // Should print 3 (3,6,9)

System.out.println("\nTesting Integer Objects:");
System.out.println("Compare 5, 3: " + compareIntegers(5, 3));   // Should print 1
System.out.println("Compare null, 5: " + compareIntegers(null, 5)); // Should print -1
System.out.println("Parse '123': " + parseIntegerSafely("123")); // Should print 123
System.out.println("Parse 'abc': " + parseIntegerSafely("abc")); // Should print null

System.out.println("\nTesting Mathematical Sequences:");
System.out.println("Fibonacci(0): " + fibonacci(0));            // Should print 0
System.out.println("Fibonacci(6): " + fibonacci(6));            // Should print 8
System.out.println("Factorial(5): " + factorial(5));            // Should print 120

System.out.println("\nTesting Number Conversion:");
System.out.println("10 in binary: " + toBinaryString(10));      // Should print "1010"
System.out.println("Binary 1010: " + fromBinaryString("1010")); // Should print 10

System.out.println("\nTesting Array Statistics:");
int[] testArray = {1, 5, 3, 9, 2};
System.out.println("Max of [1,5,3,9,2]: " + findMax(testArray)); // Should print 9
System.out.println("Average of [1,5,3,9,2]: " + calculateAverage(testArray)); // Should print 4.0
*/
