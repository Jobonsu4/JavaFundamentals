# Parameters and Return Values Exercises

Welcome to the Parameters and Return Values exercises! This topic focuses on understanding how methods receive input through parameters and provide output through return values, building on your knowledge of classes, objects, and instance methods.

## What You'll Learn

- Understanding different parameter types and how to use them effectively
- Working with multiple parameters and parameter validation
- Understanding return types and when to use different return strategies
- Method overloading with different parameter signatures
- Best practices for designing method interfaces
- Handling edge cases and error conditions through return values

## Exercise Overview

These exercises focus specifically on the input/output aspects of methods, exploring different ways to pass data in and get results out. You'll work with various parameter patterns and return value strategies.

## Exercises

### Exercise 1: Parameter Validation and Multiple Returns
**Class: `DataValidator`**
Create a class that validates different types of data with detailed feedback.

**Requirements:**
- Methods that take parameters and return different types of validation results
- Methods:
  - `validateEmail(String email)` - Return `String` with validation message ("Valid" or specific error)
  - `validatePassword(String password, int minLength, boolean requireSpecial)` - Return `boolean`
  - `validateAge(int age, int minAge, int maxAge)` - Return `int` status code (-1: too young, 0: valid, 1: too old)
  - `validatePhoneNumber(String phone, String countryCode)` - Return `String` formatted number or "INVALID"
  - `validateCreditCard(String cardNumber, String expiryDate)` - Return `boolean[]` array [isValidNumber, isNotExpired]
  - `getValidationSummary(String email, String password, int age)` - Return `String` summary of all validations

### Exercise 2: Mathematical Operations with Various Parameters
**Class: `MathEngine`**
Create a mathematical calculator that handles different types of calculations with various parameter combinations.

**Requirements:**
- Methods with different parameter counts and types
- Methods:
  - `calculate(double a, double b, String operation)` - Return `double` result of operation (+, -, *, /, %)
  - `findRange(double[] numbers)` - Return `double[]` with [min, max]
  - `statisticalSummary(double[] values)` - Return `String` with "Mean: X, Median: Y, Mode: Z"
  - `compound(double principal, double rate, int years, boolean isAnnual)` - Return `double` compound interest
  - `distance(double x1, double y1, double x2, double y2)` - Return `double` distance between points
  - `quadraticRoots(double a, double b, double c)` - Return `String[]` with solutions or ["NO_REAL_ROOTS"]
  - `isPrime(long number)` - Return `boolean` with prime check for large numbers

### Exercise 3: String Processing with Parameter Variations
**Class: `TextAnalyzer`**
Create a text analysis tool that processes strings with various parameter options.

**Requirements:**
- Methods with optional behavior through parameters
- Methods:
  - `extractWords(String text, boolean removePunctuation, boolean toLowerCase)` - Return `String[]`
  - `findPattern(String text, String pattern, boolean ignoreCase)` - Return `int[]` positions of matches
  - `replaceText(String original, String find, String replace, int maxReplacements)` - Return `String`
  - `summarizeText(String text, int maxSentences, boolean preserveOrder)` - Return `String`
  - `compareTexts(String text1, String text2, boolean ignoreCase, boolean ignoreSpaces)` - Return `double` similarity (0.0-1.0)
  - `formatText(String text, int lineLength, String alignment, boolean addNumbers)` - Return `String[]` formatted lines
  - `extractEmails(String text, String domain)` - Return `ArrayList<String>` emails (empty domain = all domains)

### Exercise 4: Collection Operations with Return Collections
**Class: `CollectionProcessor`**
Create a utility class for processing collections with various parameter configurations.

**Requirements:**
- Methods that work with collections and return processed collections
- Methods:
  - `filterNumbers(ArrayList<Integer> numbers, int min, int max, boolean inclusive)` - Return `ArrayList<Integer>`
  - `sortStrings(ArrayList<String> strings, boolean ascending, boolean ignoreCase)` - Return `ArrayList<String>`
  - `mergeLists(ArrayList<Integer> list1, ArrayList<Integer> list2, boolean removeDuplicates)` - Return `ArrayList<Integer>`
  - `groupByLength(ArrayList<String> words, int targetLength, String comparison)` - Return `HashMap<String, ArrayList<String>>`
  - `findCommonElements(ArrayList<String> list1, ArrayList<String> list2, boolean caseSensitive)` - Return `Set<String>`
  - `processNumbers(ArrayList<Double> numbers, String operation, Double operand)` - Return `ArrayList<Double>`
  - `partitionData(ArrayList<Integer> data, int partitionSize, boolean allowPartial)` - Return `ArrayList<ArrayList<Integer>>`

### Exercise 5: Object Factory with Constructor Parameters
**Class: `PersonFactory`**
Create a factory class that creates Person objects with different parameter combinations and returns them.

**Requirements:**
- Methods that create objects with different parameter sets
- Inner class: `Person` with fields: `String name, int age, String email, String city, boolean isEmployed`
- Methods:
  - `createBasicPerson(String name, int age)` - Return `Person` with basic info
  - `createDetailedPerson(String name, int age, String email, String city)` - Return `Person` with full info
  - `createEmployedPerson(String name, int age, String email, String city, boolean isEmployed)` - Return `Person`
  - `createPersonFromCsv(String csvLine)` - Return `Person` parsed from "name,age,email,city,employed"
  - `createRandomPerson(String[] namePool, int minAge, int maxAge)` - Return `Person` with random data
  - `validateAndCreatePerson(String name, Integer age, String email)` - Return `Person` or `null` if invalid
  - `batchCreatePeople(String[] names, int[] ages, String[] emails)` - Return `ArrayList<Person>`

### Exercise 6: Configuration and Settings Management
**Class: `ConfigManager`**
Create a configuration manager that handles different types of settings with flexible parameters.

**Requirements:**
- Methods that manage configuration with various parameter types
- Fields: `HashMap<String, Object> settings`
- Methods:
  - `setSetting(String key, Object value, boolean overwrite)` - Return `boolean` success
  - `getSetting(String key, Object defaultValue)` - Return `Object` setting or default
  - `getStringSetting(String key, String defaultValue, boolean trim)` - Return `String`
  - `getIntSetting(String key, int defaultValue, int minValue, int maxValue)` - Return `int` clamped value
  - `getBooleanSetting(String key, boolean defaultValue)` - Return `boolean`
  - `exportSettings(String[] keys, String format)` - Return `String` in JSON or XML format
  - `importSettings(String data, String format, boolean replaceExisting)` - Return `int` count of imported settings

### Exercise 7: Advanced Parameter Patterns
**Class: `DatabaseQuery`**
Create a database query builder that demonstrates advanced parameter usage patterns.

**Requirements:**
- Methods with complex parameter combinations and conditional logic
- Methods:
  - `select(String table, String[] columns, String whereClause, Object[] parameters)` - Return `String` SQL
  - `insert(String table, HashMap<String, Object> data, boolean ignoreConflicts)` - Return `String` SQL
  - `update(String table, HashMap<String, Object> updates, String whereClause, Object[] whereParams)` - Return `String` SQL
  - `join(String leftTable, String rightTable, String joinType, String[] conditions)` - Return `String` SQL
  - `buildQuery(String operation, String table, Object... parameters)` - Return `String` using varargs
  - `executeQuery(String sql, Object[] parameters, boolean returnResults)` - Return `QueryResult` (create simple result class)
  - `batchExecute(String[] queries, Object[][] allParameters, boolean stopOnError)` - Return `int[]` affected counts

## Getting Started

1. Open the `topic.jsh` file
2. Start with Exercise 1 (`DataValidator`)
3. Focus on understanding how each parameter affects the method's behavior
4. Pay attention to return types and what they communicate to the caller
5. Test each method with different parameter combinations
6. Move through exercises progressively

## Key Concepts to Focus On

- **Parameter Types**: Understand when to use different parameter types
- **Parameter Order**: Logical ordering of parameters for usability
- **Return Types**: Choose return types that best serve the method's purpose
- **Null Handling**: How to handle null parameters and return null appropriately
- **Parameter Validation**: Check parameters and return appropriate error indicators
- **Method Overloading**: Same method name with different parameter signatures
- **Optional Parameters**: Simulating optional parameters through method overloading

## Parameter Design Principles

- **Required vs Optional**: Put required parameters first, optional ones last
- **Logical Grouping**: Group related parameters together
- **Meaningful Names**: Parameter names should clearly indicate their purpose
- **Type Safety**: Use specific types rather than generic Object when possible
- **Validation**: Always validate parameters, especially public method parameters

## Return Value Strategies

- **Success/Failure**: Use boolean for simple success/failure operations
- **Status Codes**: Use int for operations with multiple possible outcomes
- **Null vs Exception**: Decide when to return null vs throw exceptions
- **Collection Returns**: Return empty collections rather than null when no results
- **Complex Results**: Use custom classes or arrays for multiple return values

## Testing Your Code

Each exercise has comprehensive tests that check:
- Different parameter combinations
- Edge cases (null, empty, extreme values)
- Return value correctness
- Parameter validation behavior
- Method overloading works correctly

Make sure all tests pass and understand why each parameter and return value choice was made!
