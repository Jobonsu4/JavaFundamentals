# ArrayList Exercises

This directory contains exercises to help you practice working with ArrayList collections in Java using jshell.

## Setup
1. Open your terminal/command prompt
2. Navigate to this directory
3. Start jshell: `jshell`
4. Load the exercise file: `/open topic.jsh`

## Exercises

### Exercise 1: ArrayList Basics
Write a method `createStringList()` that creates and returns a new ArrayList of Strings.
Write a method `getListSize(ArrayList<String> list)` that returns the size of an ArrayList (handle null).

### Exercise 2: Adding Elements
Write a method `addToEnd(ArrayList<String> list, String item)` that adds an item to the end of the list.
Write a method `addToBeginning(ArrayList<String> list, String item)` that adds an item to the beginning of the list.
Write a method `addAtPosition(ArrayList<String> list, int index, String item)` that adds an item at a specific position.

### Exercise 3: Accessing Elements
Write a method `getFirstItem(ArrayList<String> list)` that returns the first item (return null if empty).
Write a method `getLastItem(ArrayList<String> list)` that returns the last item (return null if empty).
Write a method `getItemAt(ArrayList<String> list, int index)` that returns the item at a specific index (handle out of bounds).

### Exercise 4: Searching and Contains
Write a method `containsItem(ArrayList<String> list, String item)` that returns true if the list contains the item.
Write a method `findPosition(ArrayList<String> list, String item)` that returns the index of the first occurrence (-1 if not found).
Write a method `countOccurrences(ArrayList<String> list, String item)` that counts how many times an item appears.

### Exercise 5: Removing Elements
Write a method `removeFirstItem(ArrayList<String> list)` that removes and returns the first item.
Write a method `removeLastItem(ArrayList<String> list)` that removes and returns the last item.
Write a method `removeAtPosition(ArrayList<String> list, int index)` that removes the item at a specific index.
Write a method `removeAllOccurrences(ArrayList<String> list, String item)` that removes all occurrences of an item.

### Exercise 6: List Operations
Write a method `clearList(ArrayList<String> list)` that removes all items from the list.
Write a method `copyList(ArrayList<String> original)` that creates a copy of the list.
Write a method `mergeLists(ArrayList<String> list1, ArrayList<String> list2)` that combines two lists into one.

### Exercise 7: List Analysis
Write a method `findLongestString(ArrayList<String> list)` that returns the longest string in the list.
Write a method `sortList(ArrayList<String> list)` that sorts the list alphabetically.
Write a method `convertToArray(ArrayList<String> list)` that converts the ArrayList to a String array.

## Testing Your Code
After completing each exercise, test your methods with different inputs:

```java
// Example tests
ArrayList<String> list = createStringList();
addToEnd(list, "Apple");
addToEnd(list, "Banana");
getListSize(list)                          // Should return 2
getFirstItem(list)                         // Should return "Apple"
containsItem(list, "Apple")                // Should return true
findPosition(list, "Banana")               // Should return 1
removeFirstItem(list)                      // Should return "Apple"
```

## Tips
- Read the NOTES.md file first to understand ArrayList collections
- Remember that ArrayList indices start at 0
- Always check for null and empty lists to avoid exceptions
- Use generics (ArrayList<String>) for type safety
- ArrayList automatically resizes as you add/remove elements
- Be careful with index bounds when accessing elements
