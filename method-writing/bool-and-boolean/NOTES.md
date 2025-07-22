# Understanding Boolean Types in Java

## What are Boolean Types?

Boolean types represent truth values - they can only be `true` or `false`. These are fundamental to all programming because computers make decisions based on whether conditions are true or false.

Think of boolean values like yes/no questions or on/off switches - there are only two possible states.

## Two Types of Booleans in Java

### 1. Primitive boolean (lowercase 'b')
- The basic, built-in type
- Can only hold `true` or `false`
- Uses less memory
- Cannot be `null`

```java
boolean isReady = true;
boolean isFinished = false;
```

### 2. Boolean Object (uppercase 'B')
- A wrapper class around the primitive boolean
- Can hold `true`, `false`, or `null`
- Uses more memory
- Has useful methods

```java
Boolean isReady = true;
Boolean isFinished = false;
Boolean unknown = null;  // This is allowed!
```

## Creating Boolean Values

### Direct Assignment
```java
boolean result = true;
boolean finished = false;
```

### From Comparisons
```java
boolean isAdult = age >= 18;
boolean isEqual = (x == y);
boolean isPositive = number > 0;
```

### From Method Calls
```java
boolean isEmpty = text.isEmpty();
boolean contains = list.contains(item);
```

## Comparison Operators

These operators return boolean values:

| Operator | Meaning | Example |
|----------|---------|---------|
| `==` | Equal to | `x == 5` |
| `!=` | Not equal to | `x != 5` |
| `<` | Less than | `x < 5` |
| `<=` | Less than or equal | `x <= 5` |
| `>` | Greater than | `x > 5` |
| `>=` | Greater than or equal | `x >= 5` |

### Examples:
```java
int age = 20;
boolean canVote = age >= 18;        // true
boolean isChild = age < 13;         // false
boolean isExactly20 = age == 20;    // true
```

## Logical Operators

Combine boolean values with logical operators:

### AND Operator (`&&`)
- Returns `true` only if **both** conditions are true
- If the first condition is false, the second isn't even checked (short-circuiting)

```java
boolean canDrive = age >= 16 && hasLicense;
boolean isWeekend = day.equals("Saturday") && day.equals("Sunday");  // This is wrong!
boolean isWeekend = day.equals("Saturday") || day.equals("Sunday");  // This is correct!
```

### OR Operator (`||`)
- Returns `true` if **at least one** condition is true
- If the first condition is true, the second isn't checked (short-circuiting)

```java
boolean canEnter = hasTicket || isVip;
boolean isWeekend = day.equals("Saturday") || day.equals("Sunday");
```

### NOT Operator (`!`)
- Flips the boolean value
- `!true` becomes `false`
- `!false` becomes `true`

```java
boolean isNotReady = !isReady;
boolean isNotEmpty = !text.isEmpty();
```

## Truth Tables

Understanding how logical operators work:

### AND (`&&`) Truth Table
| A | B | A && B |
|---|---|--------|
| true | true | true |
| true | false | false |
| false | true | false |
| false | false | false |

### OR (`||`) Truth Table
| A | B | A \|\| B |
|---|---|----------|
| true | true | true |
| true | false | true |
| false | true | true |
| false | false | false |

### NOT (`!`) Truth Table
| A | !A |
|---|-----|
| true | false |
| false | true |

## Complex Boolean Expressions

You can combine multiple operators:

```java
boolean canRideRollerCoaster = age >= 12 && height >= 48 && !hasHeartCondition;

boolean isValidUser = (username != null && !username.isEmpty()) && 
                      (password != null && password.length() >= 8);

boolean isBusinessDay = !day.equals("Saturday") && !day.equals("Sunday");
```

## Common Boolean Methods

### String Methods that Return boolean
```java
String text = "Hello World";
boolean isEmpty = text.isEmpty();           // false
boolean isBlank = text.isBlank();          // false
boolean startsWith = text.startsWith("H"); // true
boolean endsWith = text.endsWith("d");     // true
boolean contains = text.contains("World"); // true
```

### Character Methods
```java
char c = 'A';
boolean isLetter = Character.isLetter(c);      // true
boolean isDigit = Character.isDigit(c);        // false
boolean isUpperCase = Character.isUpperCase(c); // true
boolean isLowerCase = Character.isLowerCase(c); // false
```

## Boolean Object vs Primitive

### When to Use Primitive boolean
- Most of the time
- When you need simple true/false values
- For local variables and parameters
- Better performance

### When to Use Boolean Object
- When you need to represent "unknown" (null)
- When working with collections that don't allow primitives
- When you need the utility methods

```java
// Primitive - cannot be null
boolean isReady = getStatus();  // Must be true or false

// Object - can be null
Boolean isReady = getOptionalStatus();  // Could be true, false, or null
if (isReady != null && isReady) {
    // Safe to check
}
```

## Common Mistakes to Avoid

### 1. Comparing booleans with == true/false
```java
// Unnecessary and verbose
if (isReady == true) { ... }

// Better - just use the boolean directly
if (isReady) { ... }

// For false comparisons
if (!isReady) { ... }  // Better than isReady == false
```

### 2. Confusing = and ==
```java
// Wrong! This assigns, doesn't compare
if (isReady = true) { ... }

// Correct! This compares
if (isReady == true) { ... }

// Best! Just use the boolean
if (isReady) { ... }
```

### 3. Complex conditions without parentheses
```java
// Hard to read and understand
boolean result = a && b || c && d;

// Clearer with parentheses
boolean result = (a && b) || (c && d);
```

### 4. Not handling null with Boolean objects
```java
Boolean status = getStatus();  // Might return null

// Dangerous! Could throw NullPointerException
if (status) { ... }

// Safe approaches
if (status != null && status) { ... }
if (Boolean.TRUE.equals(status)) { ... }
```

## What You Need to Know for the Exercises

1. **Basic boolean operations**: true, false, comparisons
2. **Logical operators**: &&, ||, ! and how they combine
3. **Comparison operators**: ==, !=, <, >, <=, >=
4. **String methods**: contains(), isEmpty(), etc.
5. **Null handling**: Working safely with Boolean objects
6. **Complex conditions**: Combining multiple boolean expressions

## Practical Applications

Boolean logic is used everywhere:
- **User Authentication**: Is the password correct?
- **Input Validation**: Is the data valid?
- **Game Logic**: Has the player won? Can they make this move?
- **Business Rules**: Is the customer eligible for a discount?
- **Data Filtering**: Does this record match our criteria?
- **Control Flow**: Should we execute this code path?

## Tips for Success

1. **Think in Yes/No Terms**: Boolean questions should have clear yes/no answers
2. **Use Meaningful Names**: `isValid`, `canAccess`, `hasPermission`
3. **Keep Conditions Simple**: Break complex conditions into smaller parts
4. **Test All Cases**: true, false, and edge cases
5. **Use Parentheses**: Make complex expressions clear and unambiguous
6. **Avoid Redundancy**: Don't write `if (boolean == true)`

## Boolean Naming Conventions

Good boolean variable names often start with:
- `is`: isValid, isReady, isEmpty
- `has`: hasPermission, hasData, hasError
- `can`: canAccess, canEdit, canDelete
- `should`: shouldSave, shouldContinue

## De Morgan's Laws

Useful for simplifying boolean expressions:
- `!(A && B)` is the same as `!A || !B`
- `!(A || B)` is the same as `!A && !B`

```java
// These are equivalent:
boolean result1 = !(isReady && isValid);
boolean result2 = !isReady || !isValid;
```

Remember: Boolean logic is the foundation of all computer decision-making. Master these concepts, and you'll be able to write programs that can make intelligent decisions based on conditions!
