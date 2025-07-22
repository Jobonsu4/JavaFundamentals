# Understanding Double and double in Java

## What are Double Types?

Double types represent decimal numbers (floating-point numbers) in Java. They can store numbers with fractional parts like 3.14, -2.5, or 0.001.

In Java, you have two ways to work with decimal numbers:
1. **Primitive double** (lowercase) - the basic decimal type
2. **Double Object** (uppercase) - a wrapper class around double

Think of doubles as numbers that can have decimal points: prices ($19.99), measurements (5.75 inches), scientific data (3.14159), etc.

## Primitive double vs Double Object

### Primitive double (lowercase 'd')
- The basic, built-in type
- Stores decimal numbers with ~15 digits of precision
- Uses 8 bytes of memory
- Cannot be `null`
- Faster performance

```java
double price = 19.99;
double temperature = -5.5;
double pi = 3.14159;
```

### Double Object (uppercase 'D')
- A wrapper class around the primitive double
- Same precision as primitive double
- Uses more memory (24+ bytes)
- Can be `null`
- Has useful methods

```java
Double price = 19.99;
Double temperature = -5.5;
Double unknown = null;  // This is allowed!
```

## Creating Double Values

### Direct Assignment
```java
double number = 3.14;
double scientific = 1.23e-4;  // Scientific notation: 0.000123
double negative = -45.67;
```

### From Calculations
```java
double sum = 10.5 + 20.3;
double average = (a + b + c) / 3.0;
double area = Math.PI * radius * radius;
```

### From String Parsing
```java
double number = Double.parseDouble("3.14");
Double objectNumber = Double.valueOf("2.71");
```

## Basic Arithmetic Operations

Standard math operations work with doubles:

```java
double a = 10.5, b = 3.2;
double sum = a + b;          // 13.7
double difference = a - b;    // 7.3
double product = a * b;       // 33.6
double quotient = a / b;      // 3.28125
double remainder = a % b;     // 1.1 (modulo works with doubles too!)
```

## Floating-Point Precision Issues

**Important**: Computers cannot always represent decimal numbers exactly:

```java
double result = 0.1 + 0.2;
System.out.println(result);        // Prints 0.30000000000000004, not 0.3!
System.out.println(result == 0.3); // false!

// Solution: Use tolerance-based comparison
double tolerance = 0.0001;
boolean equal = Math.abs(result - 0.3) < tolerance; // true
```

## Special Double Values

Doubles have special values for edge cases:

```java
double positiveInfinity = Double.POSITIVE_INFINITY;  // 1.0 / 0.0
double negativeInfinity = Double.NEGATIVE_INFINITY;  // -1.0 / 0.0
double notANumber = Double.NaN;                      // 0.0 / 0.0

// Check for special values
boolean isInfinite = Double.isInfinite(value);
boolean isNaN = Double.isNaN(value);
boolean isFinite = Double.isFinite(value);  // Not infinite or NaN
```

## Useful Math Class Methods

The Math class provides many operations for doubles:

```java
// Basic operations
double max = Math.max(3.14, 2.71);        // 3.14
double min = Math.min(3.14, 2.71);        // 2.71
double abs = Math.abs(-5.5);              // 5.5

// Rounding
double ceil = Math.ceil(3.2);             // 4.0 (round up)
double floor = Math.floor(3.8);           // 3.0 (round down)
long rounded = Math.round(3.6);           // 4 (round to nearest)

// Powers and roots
double squared = Math.pow(3.0, 2.0);      // 9.0 (3²)
double sqrt = Math.sqrt(16.0);            // 4.0
double cubeRoot = Math.pow(8.0, 1.0/3.0); // 2.0

// Trigonometry (angles in radians)
double sin = Math.sin(Math.PI / 2);       // 1.0
double cos = Math.cos(0);                 // 1.0
double tan = Math.tan(Math.PI / 4);       // 1.0

// Logarithms
double ln = Math.log(Math.E);             // 1.0 (natural log)
double log10 = Math.log10(100);           // 2.0 (base-10 log)
```

## Number Formatting

### Using String.format()
```java
double number = 3.14159;
String formatted = String.format("%.2f", number);  // "3.14"
String currency = String.format("$%.2f", 19.99);   // "$19.99"
String scientific = String.format("%.2e", 1234.5); // "1.23e+03"
```

### Using DecimalFormat
```java
import java.text.DecimalFormat;

DecimalFormat df = new DecimalFormat("#.##");
String formatted = df.format(3.14159);  // "3.14"

DecimalFormat currency = new DecimalFormat("$#.00");
String price = currency.format(19.9);   // "$19.90"
```

## Common Double Patterns

### Safe Equality Comparison
```java
public boolean equals(double a, double b, double tolerance) {
    return Math.abs(a - b) < tolerance;
}

// Usage
boolean same = equals(0.1 + 0.2, 0.3, 0.0001); // true
```

### Finding Average
```java
public double calculateAverage(double[] numbers) {
    if (numbers.length == 0) return 0.0;
    
    double sum = 0.0;
    for (double num : numbers) {
        sum += num;
    }
    return sum / numbers.length;
}
```

### Distance Between Points
```java
public double distance(double x1, double y1, double x2, double y2) {
    double dx = x2 - x1;
    double dy = y2 - y1;
    return Math.sqrt(dx * dx + dy * dy);
}
```

### Clamping Values to Range
```java
public double clamp(double value, double min, double max) {
    return Math.max(min, Math.min(max, value));
}
```

## Working with Double Objects

### Autoboxing and Unboxing
```java
// Autoboxing: double → Double
double primitive = 3.14;
Double object = primitive;  // Automatic conversion

// Unboxing: Double → double
Double object = 2.71;
double primitive = object;   // Automatic conversion

// Be careful with null!
Double nullDouble = null;
// double value = nullDouble;  // NullPointerException!
```

### Safe Null Handling
```java
public double safeUnbox(Double value, double defaultValue) {
    return (value == null) ? defaultValue : value;
}
```

## Common Mistakes to Avoid

### 1. Exact Equality Comparison
```java
// Wrong - unreliable due to precision
if (result == 0.3) { ... }

// Right - use tolerance
if (Math.abs(result - 0.3) < 0.0001) { ... }
```

### 2. Division by Zero
```java
double result = 10.0 / 0.0;  // Results in Infinity, not exception!

// Check for zero before dividing
if (divisor != 0.0) {
    double result = dividend / divisor;
}
```

### 3. Not Handling NaN
```java
double result = Math.sqrt(-1);  // NaN
// if (result > 0) { ... }     // This is false, but result isn't negative!

// Check for NaN first
if (!Double.isNaN(result) && result > 0) { ... }
```

### 4. Precision Loss in Calculations
```java
// Can lose precision with very different magnitudes
double big = 1e20;
double small = 1.0;
double result = big + small - big;  // Might not equal 1.0!
```

## What You Need to Know for the Exercises

1. **Basic Operations**: +, -, *, /, % with doubles
2. **Math Methods**: Math.max(), Math.min(), Math.abs(), Math.sqrt()
3. **Rounding**: Math.round(), Math.ceil(), Math.floor()
4. **Comparison**: Tolerance-based equality, not exact equality
5. **Formatting**: String.format() for decimal places
6. **Special Values**: Handling NaN, Infinity
7. **Null Safety**: Working with Double objects safely

## Practical Applications

Doubles are used for:
- **Money**: Prices, taxes, calculations (though BigDecimal is better for exact money)
- **Measurements**: Distances, weights, temperatures
- **Science**: Physical constants, formulas, data analysis
- **Graphics**: Coordinates, colors, transformations
- **Statistics**: Averages, standard deviation, percentages
- **Games**: Player positions, physics calculations

## Tips for Success

1. **Use Tolerance for Equality**: Never use == with doubles for equality
2. **Format for Display**: Use String.format() for user-friendly output  
3. **Check for Special Values**: Test for NaN and Infinity when appropriate
4. **Handle Null**: Check Double objects for null before using
5. **Understand Precision Limits**: Doubles have ~15 digits of precision
6. **Use Appropriate Range**: Doubles can be very large or very small
7. **Consider BigDecimal**: For exact decimal arithmetic (like money)

## Double Ranges and Limits

```java
double maxValue = Double.MAX_VALUE;      // ~1.8 × 10^308
double minValue = Double.MIN_VALUE;      // ~4.9 × 10^-324 (smallest positive)
double minNormal = Double.MIN_NORMAL;    // ~2.2 × 10^-308
```

## Scientific Notation

```java
double large = 1.23e6;    // 1,230,000
double small = 4.56e-3;   // 0.00456
double scientific = 6.022e23; // Avogadro's number
```

Remember: Doubles are essential for any calculations involving decimal numbers. Master the basics, understand precision limitations, and always use tolerance-based comparisons for equality. With these skills, you'll be able to handle mathematical calculations, measurements, and scientific data effectively in Java!
