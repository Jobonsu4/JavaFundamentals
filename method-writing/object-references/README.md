# Object References Exercises

This directory contains exercises to help you practice working with object references in Java using jshell.

## Setup
1. Open your terminal/command prompt
2. Navigate to this directory
3. Start jshell: `jshell`
4. Load the exercise file: `/open topic.jsh`

## Exercises

### Exercise 1: Reference Basics
Write a method `createStringArray()` that creates and returns an array of 3 Strings.
Write a method `areReferencesEqual(String str1, String str2)` that checks if two String references point to the same object (using ==).
Write a method `areContentsEqual(String str1, String str2)` that checks if two String references have the same content (using equals).

### Exercise 2: Null Handling
Write a method `isNullReference(Object obj)` that returns true if the reference is null.
Write a method `safeToString(Object obj)` that converts an object to string, returning "null" if the object is null.
Write a method `safeLength(String str)` that returns the length of a string, or 0 if null.

### Exercise 3: Array References
Write a method `copyArrayReference(int[] original)` that copies the reference (not the content) of an array.
Write a method `copyArrayContent(int[] original)` that creates a new array with the same content.
Write a method `modifyArray(int[] array, int index, int newValue)` that changes a value in the array.

### Exercise 4: Object State Changes
Write a method `createStringBuilder(String initial)` that creates a StringBuilder with initial text.
Write a method `appendToBuilder(StringBuilder sb, String text)` that adds text to the StringBuilder.
Write a method `getBuilderContent(StringBuilder sb)` that returns the current content as a String.

### Exercise 5: Reference Comparison
Write a method `findStringInArray(String[] array, String target)` that finds the first String that has the same content as target.
Write a method `countNullReferences(Object[] array)` that counts how many elements in the array are null.
Write a method `replaceNulls(String[] array, String replacement)` that replaces all null elements with the replacement string.

### Exercise 6: Multiple References
Write a method `demonstrateStringPool()` that creates two String literals with the same value and shows they reference the same object.
Write a method `demonstrateNewString()` that creates two String objects with `new` keyword and shows they are different objects.
Write a method `swapReferences(StringBuilder[] array, int index1, int index2)` that swaps two references in an array.

### Exercise 7: Object Creation and References
Write a method `createArrayList()` that creates and returns a new ArrayList<String>.
Write a method `addToList(java.util.ArrayList<String> list, String item)` that adds an item to the list.
Write a method `getListReference(java.util.ArrayList<String> list)` that returns the same list reference.

## Testing Your Code
After completing each exercise, test your methods with different inputs:

```java
// Example tests
String[] array = createStringArray();
String str1 = "Hello";
String str2 = "Hello";
String str3 = new String("Hello");

areReferencesEqual(str1, str2)      // Should return true (string pool)
areReferencesEqual(str1, str3)      // Should return false (different objects)
areContentsEqual(str1, str3)        // Should return true (same content)

isNullReference(null)               // Should return true
safeLength(null)                    // Should return 0
safeLength("Hello")                 // Should return 5
```

## Tips
- Read the NOTES.md file first to understand object references
- Remember the difference between == (reference equality) and .equals() (content equality)
- Always check for null before calling methods on objects
- Understand that arrays and objects are passed by reference
- Objects created with `new` are always different from each other
- String literals may reference the same object due to string pooling
