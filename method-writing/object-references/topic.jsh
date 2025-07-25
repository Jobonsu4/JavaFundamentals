// Object References Exercises - Complete the methods below
// Save this file and load it in jshell with: /open topic.jsh
import java.util.ArrayList;

// Exercise 1: Reference Basics
// Create and return array of 3 Strings
public String[] createStringArray(){
    return new String[] {"Apple", "Banana", "Cherry"};
}

// Check if two String references point to same object (using ==)
public boolean areReferencesEqual(String str1, String str2) {
      return str1 == str2;
    // Your code here
    
}

// Check if two String references have same content (using equals)
public boolean areContentsEqual(String str1, String str2) {
    return str1 != null && str1.equals(str2);
    // Your code here
    
}

// Exercise 2: Null Handling
// Return true if reference is null
public boolean isNullReference(Object obj) {
    return obj == null;
    // Your code here
    
}

// Convert object to string, return "null" if object is null
public String safeToString(Object obj) {
      return (obj == null) ? "null" : obj.toString();
    
}

// Return length of string, or 0 if null
public int safeLength(String str) {
    return (str == null) ? 0 : str.length();
    // Your code here
    
}

// Exercise 3: Array References
// Copy the reference (not content) of an array
public int[] copyArrayReference(int[] original) {
     return original;
    // Your code here
    
}

// Create new array with same content
public int[] copyArrayContent(int[] original) {
     if (original == null) return null;
        int[] copy = new int[original.length];
        for (int i = 0; i < original.length; i++) {
            copy[i] = original[i];
    
        }

        return copy;
}

// Change value in array at specified index
public void modifyArray(int[] array, int index, int newValue) {
     if (array != null && index >= 0 && index < array.length) {
            array[index] = newValue;
        }

    
}

// Exercise 4: Object State Changes
// Create StringBuilder with initial text
public StringBuilder createStringBuilder(String initial) {
     return new StringBuilder(initial);
    // Your code here
    
}

// Add text to StringBuilder
public void appendToBuilder(StringBuilder sb, String text) {
     if (sb != null && text != null) {
            sb.append(text);
        }
    
}

// Get current content as String
public String getBuilderContent(StringBuilder sb) {
    return (sb == null) ? "" : sb.toString();
    // Your code here
    
}

// Exercise 5: Reference Comparison
// Find first String with same content as target
public String findStringInArray(String[] array, String target) {
    if (array == null || target == null) return null;
        for (String s : array) {
            if (target.equals(s)) return s;
        }
        return null;
    
    
}

// Count how many elements are null
public int countNullReferences(Object[] array) {
     if (array == null) return 0;
        int count = 0;
        for (Object obj : array) {
            if (obj == null) count++;
        }
        return count;
    
}

// Replace all null elements with replacement string
public void replaceNulls(String[] array, String replacement) {
     if (array == null || replacement == null) return;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == null) {
                array[i] = replacement;
            }
        }
    // Your code here
    
}

// Exercise 6: Multiple References
// Create two String literals and show they reference same object
public boolean demonstrateStringPool() {
     String a = "hello";
        String b = "hello";
        return a == b;
    // Your code here - create two string literals with same value
    // Return true if they reference the same object
    
}

// Create two String objects with 'new' and show they're different
public boolean demonstrateNewString() {
      String a = new String("world");
        String b = new String("world");
        return a != b && a.equals(b);
    // Your code here - create two strings with new String()
    // Return true if they are different objects (but same content)
    
}

// Swap two references in an array
public void swapReferences(StringBuilder[] array, int index1, int index2) {
     if (array != null &&
            index1 >= 0 && index1 < array.length &&
            index2 >= 0 && index2 < array.length) {
            StringBuilder temp = array[index1];
            array[index1] = array[index2];
            array[index2] = temp;
    // Your code here
            }
}

// Exercise 7: Object Creation and References
// Create and return new ArrayList<String>
public ArrayList<String> createArrayList() {
     return new ArrayList<>();
    // Your code here
    
}

// Add item to list
public void addToList(ArrayList<String> list, String item) {
    if (list != null && item != null) {
            list.add(item);
        }
    
}

// Return the same list reference
public ArrayList<String> getListReference(ArrayList<String> list) {
     return list;
    // Your code here
    
}

// Test your methods here - uncomment and modify as needed

System.out.println("Testing Reference Basics:");
String[] array = createStringArray();
System.out.println("Array created with length: " + array.length);

String str1 = "Hello";
String str2 = "Hello";
String str3 = new String("Hello");

System.out.println("str1 == str2 (literals): " + areReferencesEqual(str1, str2));     // Should be true
System.out.println("str1 == str3 (new object): " + areReferencesEqual(str1, str3));  // Should be false
System.out.println("str1.equals(str3): " + areContentsEqual(str1, str3));            // Should be true

System.out.println("\nTesting Null Handling:");
System.out.println("null is null: " + isNullReference(null));              // Should be true
System.out.println("'Hello' is null: " + isNullReference("Hello"));        // Should be false
System.out.println("Safe toString of null: " + safeToString(null));        // Should be "null"
System.out.println("Safe toString of 'Hi': " + safeToString("Hi"));        // Should be "Hi"
System.out.println("Safe length of null: " + safeLength(null));            // Should be 0
System.out.println("Safe length of 'Hello': " + safeLength("Hello"));      // Should be 5

System.out.println("\nTesting Array References:");
int[] original = {1, 2, 3};
int[] refCopy = copyArrayReference(original);
int[] contentCopy = copyArrayContent(original);

System.out.println("Original == reference copy: " + (original == refCopy));      // Should be true
System.out.println("Original == content copy: " + (original == contentCopy));   // Should be false

modifyArray(original, 0, 99);
System.out.println("Original after modify: " + java.util.Arrays.toString(original));     // [99, 2, 3]
System.out.println("Reference copy after modify: " + java.util.Arrays.toString(refCopy)); // [99, 2, 3]
System.out.println("Content copy after modify: " + java.util.Arrays.toString(contentCopy)); // [1, 2, 3]

System.out.println("\nTesting Object State Changes:");
StringBuilder sb = createStringBuilder("Hello");
System.out.println("Initial content: " + getBuilderContent(sb));
appendToBuilder(sb, " World");
System.out.println("After append: " + getBuilderContent(sb));

System.out.println("\nTesting Reference Comparison:");
String[] strings = {"Apple", null, "Banana", null, "Cherry"};
System.out.println("Found string: " + findStringInArray(strings, "Banana"));
System.out.println("Null count: " + countNullReferences(strings));
replaceNulls(strings, "REPLACED");
System.out.println("After replacing nulls: " + java.util.Arrays.toString(strings));

System.out.println("\nTesting String Pool:");
System.out.println("String pool demo: " + demonstrateStringPool());      // Should be true
System.out.println("New String demo: " + demonstrateNewString());        // Should be true

System.out.println("\nTesting ArrayList References:");
ArrayList<String> list1 = createArrayList();
addToList(list1, "First");
addToList(list1, "Second");
ArrayList<String> list2 = getListReference(list1);
System.out.println("Same list reference: " + (list1 == list2));          // Should be true
System.out.println("List content: " + list1);

