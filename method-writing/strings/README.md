# String Exercises

This directory contains exercises to help you practice working with String objects in Java using jshell.

## Setup
1. Open your terminal/command prompt
2. Navigate to this directory
3. Start jshell: `jshell`
4. Load the exercise file: `/open topic.jsh`

## Exercises

### Exercise 1: String Basics
Write a method `getStringLength(String text)` that returns the length of a string (handle null strings).
Write a method `isStringEmpty(String text)` that returns true if the string is null or empty.

### Exercise 2: String Comparison
Write a method `areStringsEqual(String str1, String str2)` that safely compares two strings for equality (handle nulls).
Write a method `compareStringsIgnoreCase(String str1, String str2)` that compares strings ignoring case differences.

### Exercise 3: String Search and Contains
Write a method `containsSubstring(String text, String search)` that returns true if text contains the search string.
Write a method `findFirstPosition(String text, String search)` that returns the index of the first occurrence of search in text (-1 if not found).

### Exercise 4: String Extraction
Write a method `getFirstCharacter(String text)` that returns the first character of a string (handle empty strings).
Write a method `getLastCharacter(String text)` that returns the last character of a string.
Write a method `getSubstring(String text, int start, int end)` that returns a substring from start to end index.

### Exercise 5: String Modification
Write a method `makeUpperCase(String text)` that converts a string to uppercase (handle null).
Write a method `makeLowerCase(String text)` that converts a string to lowercase (handle null).
Write a method `trimWhitespace(String text)` that removes leading and trailing spaces.

### Exercise 6: String Building and Joining
Write a method `concatenateStrings(String str1, String str2)` that joins two strings together (handle nulls).
Write a method `repeatString(String text, int count)` that repeats a string the specified number of times.
Write a method `joinWithSeparator(String[] words, String separator)` that joins an array of strings with a separator.

### Exercise 7: String Validation and Analysis
Write a method `isValidEmail(String email)` that returns true if email contains "@" and "." characters.
Write a method `countVowels(String text)` that counts the number of vowels (a, e, i, o, u) in a string.
Write a method `isPalindrome(String text)` that returns true if the string reads the same forwards and backwards.

## Testing Your Code
After completing each exercise, test your methods with different inputs:

```java
// Example tests
getStringLength("Hello")                    // Should return 5
isStringEmpty("")                          // Should return true
areStringsEqual("Hello", "hello")          // Should return false
compareStringsIgnoreCase("Hello", "HELLO") // Should return true
containsSubstring("Hello World", "World")  // Should return true
getFirstCharacter("Java")                  // Should return 'J'
makeUpperCase("hello")                     // Should return "HELLO"
concatenateStrings("Hello", " World")      // Should return "Hello World"
countVowels("Hello")                       // Should return 2
isPalindrome("racecar")                    // Should return true
```

## Tips
- Read the NOTES.md file first to understand String objects
- Remember that Strings are immutable (cannot be changed)
- Always handle null strings to avoid NullPointerException
- Use .equals() to compare strings, not ==
- String indices start at 0
- Be careful with substring bounds to avoid StringIndexOutOfBoundsException
