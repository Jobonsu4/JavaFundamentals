# Understanding Strings in Java

## What are Strings?

A String in Java is an object that represents a sequence of characters (letters, numbers, symbols, spaces). Strings are one of the most commonly used data types in programming.

Think of a String like a word, sentence, or any text you might type - "Hello", "Java Programming", "user@email.com", "123-456-7890".

## Creating Strings

### String Literals
```java
String name = "John";
String message = "Hello World!";
String empty = "";
```

### Using the new Keyword
```java
String name = new String("John");  // Less common, usually unnecessary
```

### From Other Data Types
```java
String number = String.valueOf(42);     // "42"
String bool = String.valueOf(true);     // "true"
String character = String.valueOf('A'); // "A"
```

## Important String Characteristics

### 1. Strings are Immutable
Once created, a String cannot be changed. Operations that seem to modify a String actually create a new String:

```java
String original = "Hello";
String modified = original + " World";  // Creates new String
// original is still "Hello"
// modified is "Hello World"
```

### 2. Strings are Objects
Unlike primitives (int, boolean), Strings are objects with methods and properties:

```java
String text = "Hello";
int length = text.length();        // 5
char firstChar = text.charAt(0);   // 'H'
```

### 3. String Pool
Java optimizes String storage using a "String pool":

```java
String a = "Hello";
String b = "Hello";
// a and b might reference the same object in memory
```

## Top String Operations

### 1. Getting String Information
```java
String text = "Hello World";

// Length
int length = text.length();              // 11

// Check if empty
boolean isEmpty = text.isEmpty();        // false
boolean isBlank = text.isBlank();       // false (Java 11+)

// Get characters
char first = text.charAt(0);             // 'H'
char last = text.charAt(text.length()-1); // 'd'
```

### 2. String Comparison
```java
String str1 = "Hello";
String str2 = "hello";

// WRONG way - don't use == for strings!
// boolean same = str1 == str2;  // This compares references, not content

// CORRECT ways:
boolean same = str1.equals(str2);           // false (case sensitive)
boolean sameIgnoreCase = str1.equalsIgnoreCase(str2);  // true
```

### 3. Searching Within Strings
```java
String text = "Hello World";

// Check if contains
boolean hasWorld = text.contains("World");     // true
boolean hasJava = text.contains("Java");       // false

// Find position
int index = text.indexOf("World");             // 6
int notFound = text.indexOf("Java");           // -1

// Check start/end
boolean startsHello = text.startsWith("Hello"); // true
boolean endsWorld = text.endsWith("World");     // true
```

### 4. Extracting Parts of Strings
```java
String text = "Hello World";

// Substring (from index to end)
String world = text.substring(6);         // "World"

// Substring (from start to end index)
String hello = text.substring(0, 5);      // "Hello"

// Get individual characters
char h = text.charAt(0);                  // 'H'
```

### 5. Modifying Strings (Creates New Strings)
```java
String text = "  Hello World  ";

// Case conversion
String upper = text.toUpperCase();        // "  HELLO WORLD  "
String lower = text.toLowerCase();        // "  hello world  "

// Remove whitespace
String trimmed = text.trim();             // "Hello World"

// Replace characters/substrings
String replaced = text.replace("World", "Java");  // "  Hello Java  "
String noSpaces = text.replace(" ", "");          // "HelloWorld"
```

### 6. Building and Combining Strings
```java
// Simple concatenation
String greeting = "Hello" + " " + "World";  // "Hello World"

// Using concat method
String result = "Hello".concat(" World");   // "Hello World"

// For multiple concatenations, StringBuilder is more efficient:
StringBuilder sb = new StringBuilder();
sb.append("Hello");
sb.append(" ");
sb.append("World");
String result = sb.toString();  // "Hello World"
```

### 7. String Validation and Analysis
```java
String email = "user@domain.com";

// Basic email validation
boolean hasAt = email.contains("@");
boolean hasDot = email.contains(".");
boolean validEmail = hasAt && hasDot;

// Character analysis
String text = "Hello123";
for (int i = 0; i < text.length(); i++) {
    char c = text.charAt(i);
    boolean isLetter = Character.isLetter(c);     // H,e,l,l,o = true
    boolean isDigit = Character.isDigit(c);       // 1,2,3 = true
    boolean isUpperCase = Character.isUpperCase(c); // H = true
}
```

## Common String Patterns

### Counting Characters
```java
public int countVowels(String text) {
    int count = 0;
    String vowels = "aeiouAEIOU";
    for (int i = 0; i < text.length(); i++) {
        if (vowels.indexOf(text.charAt(i)) >= 0) {
            count++;
        }
    }
    return count;
}
```

### Checking Palindromes
```java
public boolean isPalindrome(String text) {
    String cleaned = text.toLowerCase().replace(" ", "");
    String reversed = new StringBuilder(cleaned).reverse().toString();
    return cleaned.equals(reversed);
}
```

### Building Repeated Strings
```java
public String repeat(String text, int times) {
    StringBuilder result = new StringBuilder();
    for (int i = 0; i < times; i++) {
        result.append(text);
    }
    return result.toString();
}
```

## Handling Null Strings Safely

### The Problem
```java
String text = null;
// int length = text.length();  // NullPointerException!
```

### Safe Approaches
```java
// Check for null first
if (text != null) {
    int length = text.length();
}

// Use defensive programming
public int safeLength(String text) {
    return (text == null) ? 0 : text.length();
}

// Use Objects.equals for safe comparison
import java.util.Objects;
boolean same = Objects.equals(str1, str2);  // Handles nulls safely
```

## Common Mistakes to Avoid

### 1. Using == Instead of .equals()
```java
// WRONG!
String a = new String("Hello");
String b = new String("Hello");
if (a == b) { ... }  // This is false!

// CORRECT!
if (a.equals(b)) { ... }  // This is true!
```

### 2. Not Handling Null
```java
// Dangerous
public boolean isEmpty(String text) {
    return text.isEmpty();  // Crashes if text is null
}

// Safe
public boolean isEmpty(String text) {
    return text == null || text.isEmpty();
}
```

### 3. String Index Errors
```java
String text = "Hello";  // indices: 0,1,2,3,4
// char c = text.charAt(5);  // StringIndexOutOfBoundsException!
// String sub = text.substring(2, 10);  // StringIndexOutOfBoundsException!

// Safe approach
if (index >= 0 && index < text.length()) {
    char c = text.charAt(index);
}
```

### 4. Inefficient String Building
```java
// Inefficient for many concatenations
String result = "";
for (int i = 0; i < 1000; i++) {
    result += "text";  // Creates new string each time!
}

// Efficient
StringBuilder sb = new StringBuilder();
for (int i = 0; i < 1000; i++) {
    sb.append("text");
}
String result = sb.toString();
```

## What You Need to Know for the Exercises

1. **Basic Operations**: length(), isEmpty(), charAt()
2. **Comparison**: equals(), equalsIgnoreCase()
3. **Searching**: contains(), indexOf(), startsWith(), endsWith()
4. **Extraction**: substring(), charAt()
5. **Modification**: toUpperCase(), toLowerCase(), trim()
6. **Building**: concatenation with +, StringBuilder for efficiency
7. **Validation**: Basic patterns like email checking
8. **Null Safety**: Always check for null before using String methods

## String vs StringBuilder vs StringBuffer

- **String**: Immutable, good for few operations
- **StringBuilder**: Mutable, efficient for building strings, not thread-safe
- **StringBuffer**: Like StringBuilder but thread-safe (slower)

For the exercises, focus on String operations. Use StringBuilder when you need to build strings in loops.

## Tips for Success

1. **Always Check for Null**: Prevent NullPointerException
2. **Use .equals() for Comparison**: Never use == for String content comparison
3. **Remember 0-based Indexing**: First character is at index 0
4. **Test Boundary Cases**: Empty strings, single characters, null values
5. **Use Meaningful Variable Names**: `firstName`, `email`, `message` instead of `s1`, `s2`
6. **Chain Methods When Appropriate**: `text.trim().toLowerCase()`

## Practical Applications

Strings are used everywhere in programming:
- **User Input**: Names, addresses, search terms
- **Data Processing**: Reading files, parsing CSV, JSON
- **Web Development**: URLs, HTML content, form data
- **Communication**: Email addresses, phone numbers, messages
- **Display**: Formatting output, creating reports
- **Validation**: Checking passwords, email formats, data integrity

Remember: Strings are objects in Java, not primitives. Master the common operations, always handle null safely, and you'll be able to process text data effectively in any Java program!
