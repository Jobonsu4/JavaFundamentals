# Understanding Integer and int in Java

## What are Integer Types?

Integer types represent whole numbers (no decimal points). In Java, you have two main ways to work with integers:

1. **Primitive int** (lowercase) - the basic integer type
2. **Integer Object** (uppercase) - a wrapper class around int

Think of integers as counting numbers: ..., -3, -2, -1, 0, 1, 2, 3, ...

## Primitive int vs Integer Object

### Primitive int (lowercase 'i')
- The basic, built-in type
- Stores whole numbers from -2,147,483,648 to 2,147,483,647
- Uses less memory (4 bytes)
- Cannot be `null`
- Faster performance

```java
int age = 25;
int temperature = -5;
int count = 0;
```

### Integer Object (uppercase 'I')
- A wrapper class around the primitive int
- Can hold the same range of values as int
- Uses more memory (16 bytes + overhead)
- Can be `null`
- Has useful methods

```java
Integer age = 25;
Integer temperature = -5;
Integer unknown = null;  // This is allowed!
```

## Creating Integer Values

### Direct Assignment
```java
int number = 42;
Integer objectNumber = 42;  // Autoboxing - Java automatically converts
```

### From Calculations
```java
int sum = 10 + 20;
int product = 5 * 6;
int remainder = 17 % 3;  // Modulo operator (remainder after division)
```

### From String Parsing
```java
int number = Integer.parseInt("123");
Integer objectNumber = Integer.valueOf("456");
```

## Basic Arithmetic Operations

Java supports standard math operations:

| Operator | Meaning | Example | Result |
|----------|---------|---------|---------|
| `+` | Addition | `5 + 3` | `8` |
| `-` | Subtraction | `5 - 3` | `2` |
| `*` | Multiplication | `5 * 3` | `15` |
| `/` | Division | `15 / 3` | `5` |
| `%` | Modulo (remainder) | `17 % 5` | `2` |

### Examples:
```java
int a = 10, b = 3;
int sum = a + b;        // 13
int difference = a - b;  // 7
int product = a * b;     // 30
int quotient = a / b;    // 3 (integer division!)
int remainder = a % b;   // 1 (10 divided by 3 leaves remainder 1)
```

## Integer Division vs Double Division

**Important**: When dividing integers, you get integer results (no decimal places):

```java
int result1 = 7 / 3;        // Result is 2 (not 2.33...)
double result2 = 7.0 / 3.0; // Result is 2.333...
double result3 = 7 / 3.0;   // Result is 2.333... (one double makes result double)
```

## Useful Integer Methods

### Math Class Methods
```java
int max = Math.max(10, 5);      // Returns 10
int min = Math.min(10, 5);      // Returns 5
int abs = Math.abs(-7);         // Returns 7 (absolute value)
double sqrt = Math.sqrt(16);    // Returns 4.0
```

### Integer Class Methods
```java
String binary = Integer.toBinaryString(10);  // Returns "1010"
String hex = Integer.toHexString(255);       // Returns "ff"
int parsed = Integer.parseInt("123");        // Returns 123
Integer valueOf = Integer.valueOf("456");    // Returns Integer object
```

## Working with Ranges and Limits

```java
// Integer limits
int maxInt = Integer.MAX_VALUE;  // 2,147,483,647
int minInt = Integer.MIN_VALUE;  // -2,147,483,648

// Overflow example - be careful!
int almostMax = Integer.MAX_VALUE;
int overflow = almostMax + 1;    // This wraps around to MIN_VALUE!
```

## Common Integer Patterns

### Counting Loop
```java
for (int i = 0; i < 10; i++) {
    System.out.println("Count: " + i);
}
```

### Accumulation
```java
int sum = 0;
for (int i = 1; i <= 100; i++) {
    sum += i;  // Same as sum = sum + i
}
```

### Finding Maximum
```java
int[] numbers = {3, 7, 2, 9, 1};
int max = numbers[0];
for (int i = 1; i < numbers.length; i++) {
    if (numbers[i] > max) {
        max = numbers[i];
    }
}
```

## Autoboxing and Unboxing

Java automatically converts between int and Integer:

```java
// Autoboxing: int → Integer
int primitive = 42;
Integer object = primitive;  // Java automatically converts

// Unboxing: Integer → int
Integer object = 42;
int primitive = object;      // Java automatically converts

// Be careful with null!
Integer nullInteger = null;
// int value = nullInteger;  // This would throw NullPointerException!
```

## String to Integer Conversion

### Safe Parsing
```java
try {
    int number = Integer.parseInt("123");
    System.out.println("Parsed: " + number);
} catch (NumberFormatException e) {
    System.out.println("Invalid number format");
}
```

### Using Integer.valueOf()
```java
Integer number = Integer.valueOf("123");  // Returns Integer object
// Integer.valueOf("abc");  // Throws NumberFormatException
```

## Common Mistakes to Avoid

### 1. Integer Division Surprise
```java
// Might expect 2.5, but gets 2
int result = 5 / 2;

// To get decimal result:
double result = 5.0 / 2.0;  // 2.5
```

### 2. Null Pointer with Integer Objects
```java
Integer number = null;
// int value = number;  // NullPointerException!

// Safe approach:
if (number != null) {
    int value = number;
}
```

### 3. Comparing Integer Objects with ==
```java
Integer a = 128;
Integer b = 128;
// a == b might be false! (for values outside -128 to 127)

// Correct way:
if (a.equals(b)) { ... }
// Or convert to primitives:
if (a.intValue() == b.intValue()) { ... }
```

### 4. Integer Overflow
```java
int max = Integer.MAX_VALUE;
int overflow = max + 1;  // Wraps to Integer.MIN_VALUE!

// Use long for larger values:
long bigNumber = (long)max + 1;
```

## Number Systems

### Binary (Base 2)
- Uses only 0 and 1
- Each position represents a power of 2
- Example: 1010₂ = 8 + 0 + 2 + 0 = 10₁₀

### Hexadecimal (Base 16)
- Uses 0-9 and A-F
- Each position represents a power of 16
- Example: FF₁₆ = 15×16 + 15 = 255₁₀

```java
int decimal = 255;
String binary = Integer.toBinaryString(decimal);   // "11111111"
String hex = Integer.toHexString(decimal);         // "ff"
```

## What You Need to Know for the Exercises

1. **Basic Operations**: +, -, *, /, % (modulo)
2. **Comparisons**: <, >, <=, >=, ==, !=
3. **Math Methods**: Math.abs(), Math.max(), Math.min()
4. **Integer Methods**: parseInt(), toBinaryString(), valueOf()
5. **Null Handling**: Working safely with Integer objects
6. **Loops with Integers**: for loops, while loops with counters
7. **Array Processing**: Finding max, sum, average of integer arrays

## Practical Applications

Integers are used everywhere in programming:
- **Counting**: Loop counters, array indices
- **Calculations**: Math operations, statistics
- **IDs and Keys**: User IDs, database keys
- **Coordinates**: Screen positions, game coordinates
- **Time**: Timestamps, durations in seconds
- **Money**: Amounts in cents to avoid decimal precision issues

## Tips for Success

1. **Think in Whole Numbers**: Integers can't hold fractions
2. **Watch for Overflow**: Large calculations might exceed int limits
3. **Use Appropriate Types**: int for most cases, long for very large numbers
4. **Handle Nulls**: Check for null when using Integer objects
5. **Test Edge Cases**: 0, negative numbers, maximum values
6. **Use Meaningful Names**: `count`, `age`, `index` instead of `x`, `y`, `z`

## Mathematical Concepts

### Prime Numbers
- Only divisible by 1 and themselves
- Examples: 2, 3, 5, 7, 11, 13, 17...
- 1 is not considered prime

### Perfect Squares
- Numbers that are squares of integers
- Examples: 1, 4, 9, 16, 25, 36...
- Test: `Math.sqrt(n) == (int)Math.sqrt(n)`

### Fibonacci Sequence
- Each number is sum of previous two
- Sequence: 0, 1, 1, 2, 3, 5, 8, 13, 21...

### Factorial
- n! = n × (n-1) × (n-2) × ... × 1
- 5! = 5 × 4 × 3 × 2 × 1 = 120
- 0! = 1 by definition

Remember: Integers are the foundation of most programming calculations. Master the basics, understand the difference between primitives and objects, and you'll be able to handle a wide variety of programming challenges!
