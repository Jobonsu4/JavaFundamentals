// ArrayList Exercises - Complete the methods below
// Save this file and load it in jshell with: /open topic.jsh
import java.util.ArrayList;
import java.util.Collections;

// Exercise 1: ArrayList Basics
// Create and return a new ArrayList of Strings
public ArrayList<String> createStringList() {
    ArrayList<String> list = new ArrayList<>();
    return new ArrayList<>();
    // Your code here
    
}

// Return size of ArrayList (handle null)
public int getListSize(ArrayList<String> list) {
    if (list == null) {
        return 0;
    }
    return list.size();

    // Your code here
    
}

// Exercise 2: Adding Elements
// Add item to the end of the list
public void addToEnd(ArrayList<String> list, String item) {
    if (list != null) {
        list.add(item);
    }
    // Your code here
    
}

// Add item to the beginning of the list
public void addToBeginning(ArrayList<String> list, String item) {
    if (list != null) {
        list.add(0, item);
    // Your code here
    }
}

// Add item at specific position
public void addAtPosition(ArrayList<String> list, int index, String item) {
     if (list != null && index >= 0 && index <= list.size()) {
        list.add(index, item);
    }
    // Your code here
    
}

// Exercise 3: Accessing Elements
// Return first item (null if empty)
public String getFirstItem(ArrayList<String> list) {
     if (list == null || list.isEmpty()) return null;
    return list.get(0);
    // Your code here
    
}

// Return last item (null if empty)
public String getLastItem(ArrayList<String> list) {
    if (list == null || list.isEmpty()) return null;
    return list.get(list.size() - 1);
}
    // Your code here
    


// Return item at specific index (null if out of bounds)
public String getItemAt(ArrayList<String> list, int index) {
     if (list == null || index < 0 || index >= list.size()) return null;
    return list.get(index);
}
    // Your code here
    


// Exercise 4: Searching and Contains
// Return true if list contains the item
public boolean containsItem(ArrayList<String> list, String item) {
    return list != null && list.contains(item);
    // Your code here
    
}

// Return index of first occurrence (-1 if not found)
public int findPosition(ArrayList<String> list, String item) {
    if (list == null) return -1;
    return list.indexOf(item);
    // Your code here
    
}

// Count how many times item appears in list
public int countOccurrences(ArrayList<String> list, String item) {
      int count = 0;
    if (list != null) {
        for (String str : list) {
            if (str.equals(item)) {
                count++;
    // Your code here
            }
}
    }
    return count;
}

// Exercise 5: Removing Elements
// Remove and return first item (null if empty)
public String removeFirstItem(ArrayList<String> list) {
      if (list == null || list.isEmpty()) return null;
    return list.remove(0);

    // Your code here
    
}

// Remove and return last item (null if empty)
public String removeLastItem(ArrayList<String> list) {
    if (list == null || list.isEmpty()) return null;
    return list.remove(list.size() - 1);
    // Your code here
    
}

// Remove item at specific index (null if out of bounds)
public String removeAtPosition(ArrayList<String> list, int index) {
     if (list == null || index < 0 || index >= list.size()) return null;
    return list.remove(index);
    // Your code here
    
}

// Remove all occurrences of an item
public void removeAllOccurrences(ArrayList<String> list, String item) {
    if (list != null) {
        list.removeIf(str -> str.equals(item));
    // Your code here
    
}
}

// Exercise 6: List Operations
// Remove all items from list
public void clearList(ArrayList<String> list) {
     if (list != null) {
        list.clear();
    }
    // Your code here
    
}

// Create a copy of the list
public ArrayList<String> copyList(ArrayList<String> original) {
     if (original == null) return new ArrayList<>();
    return new ArrayList<>(original);
    // Your code here
    
}

// Combine two lists into one new list
public ArrayList<String> mergeLists(ArrayList<String> list1, ArrayList<String> list2) {
     ArrayList<String> result = new ArrayList<>();
    if (list1 != null) result.addAll(list1);
    if (list2 != null) result.addAll(list2);
    return result;
    // Your code here
    
}

// Exercise 7: List Analysis
// Find and return the longest string in the list
public String findLongestString(ArrayList<String> list) {
    if (list == null || list.isEmpty()) return null;
    String longest = "";
    for (String str : list) {
        if (str != null && str.length() > longest.length()) {
            longest = str;
        }
    }
    return longest;
    // Your code here
    
}

// Sort the list alphabetically (modifies the original list)
public void sortList(ArrayList<String> list) {
     if (list != null) {
        Collections.sort(list);
    }

    // Your code here
    
}

// Convert ArrayList to String array
public String[] convertToArray(ArrayList<String> list) {
    if (list == null) return new String[0];
    return list.toArray(new String[0]);
    // Your code here
    
}

// Test your methods here - uncomment and modify as needed

System.out.println("Testing ArrayList Basics:");
ArrayList<String> list = createStringList();
System.out.println("Empty list size: " + getListSize(list));        // Should print 0

System.out.println("\nTesting Adding Elements:");
addToEnd(list, "Apple");
addToEnd(list, "Banana");
addToBeginning(list, "Cherry");
System.out.println("List size after adding: " + getListSize(list)); // Should print 3
System.out.println("List contents: " + list);                       // Should show [Cherry, Apple, Banana]

System.out.println("\nTesting Accessing Elements:");
System.out.println("First item: " + getFirstItem(list));            // Should print "Cherry"
System.out.println("Last item: " + getLastItem(list));              // Should print "Banana"
System.out.println("Item at index 1: " + getItemAt(list, 1));       // Should print "Apple"

System.out.println("\nTesting Searching:");
System.out.println("Contains 'Apple': " + containsItem(list, "Apple"));     // Should print true
System.out.println("Contains 'Orange': " + containsItem(list, "Orange"));   // Should print false
System.out.println("Position of 'Banana': " + findPosition(list, "Banana")); // Should print 2

addToEnd(list, "Apple");  // Add duplicate
System.out.println("Count of 'Apple': " + countOccurrences(list, "Apple")); // Should print 2

System.out.println("\nTesting Removing Elements:");
String removed = removeFirstItem(list);
System.out.println("Removed first: " + removed);                    // Should print "Cherry"
System.out.println("List after removal: " + list);

System.out.println("\nTesting List Operations:");
ArrayList<String> copy = copyList(list);
System.out.println("Original: " + list);
System.out.println("Copy: " + copy);

ArrayList<String> list2 = createStringList();
addToEnd(list2, "Orange");
addToEnd(list2, "Grape");
ArrayList<String> merged = mergeLists(list, list2);
System.out.println("Merged list: " + merged);

System.out.println("\nTesting List Analysis:");
System.out.println("Longest string: " + findLongestString(merged));
sortList(merged);
System.out.println("Sorted list: " + merged);

String[] array = convertToArray(merged);
System.out.print("Converted to array: ");
for (int i = 0; i < array.length; i++) {
    System.out.print(array[i]);
    if (i < array.length - 1) System.out.print(", ");
}
System.out.println("");

