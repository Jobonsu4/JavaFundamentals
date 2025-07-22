# Understanding Nested Objects in Java

## What are Nested Objects?

**Nested objects** are objects that contain other objects as fields. This creates a hierarchical structure where one object can "own" or "contain" other objects. This is a fundamental concept in object-oriented programming called **composition**.

Think of nested objects like:
- A **House** contains **Rooms**
- A **Car** contains an **Engine** and **Wheels**
- A **Person** has an **Address**
- A **Library** contains many **Books**

## Object Composition vs Inheritance

### Composition ("has-a" relationship)
Objects contain other objects as fields:

```java
class Car {
    Engine engine;    // Car HAS an Engine
    Wheel[] wheels;   // Car HAS Wheels
    Person driver;    // Car HAS a Driver
}
```

### Inheritance ("is-a" relationship)
Objects extend other objects:

```java
class SportsCar extends Car {  // SportsCar IS A Car
    // Inherits all Car properties and methods
}
```

**Composition is often preferred** because it's more flexible and creates clearer relationships.

## Types of Object Relationships

### 1. Simple Composition
One object contains another as a field:

```java
class Person {
    String name;
    Address address;  // Person contains an Address
    
    public Person(String name, Address address) {
        this.name = name;
        this.address = address;
    }
    
    public String getCity() {
        return address.getCity();  // Delegate to nested object
    }
}
```

### 2. Collection of Objects
One object contains multiple objects in collections:

```java
class Classroom {
    String roomNumber;
    ArrayList<Student> students;  // Classroom contains many Students
    Teacher teacher;              // Classroom contains one Teacher
    
    public void addStudent(Student student) {
        students.add(student);
    }
    
    public int getStudentCount() {
        return students.size();
    }
}
```

### 3. Hierarchical Structure
Objects containing objects that contain other objects:

```java
class University {
    ArrayList<Department> departments;
}

class Department {
    ArrayList<Course> courses;
    ArrayList<Professor> professors;
}

class Course {
    ArrayList<Student> enrolledStudents;
    Professor instructor;
}
```

### 4. Bidirectional Relationships
Objects that reference each other:

```java
class Course {
    ArrayList<Student> students;
    
    public void enrollStudent(Student student) {
        students.add(student);
        student.enrollInCourse(this);  // Update both objects
    }
}

class Student {
    ArrayList<Course> courses;
    
    public void enrollInCourse(Course course) {
        courses.add(course);
    }
}
```

## Creating and Managing Nested Objects

### 1. Constructor Injection
Pass nested objects to constructors:

```java
class Order {
    String orderId;
    Customer customer;
    ArrayList<OrderItem> items;
    
    public Order(String orderId, Customer customer) {
        this.orderId = orderId;
        this.customer = customer;
        this.items = new ArrayList<>();
    }
}
```

### 2. Factory Methods
Create complex nested structures:

```java
class PersonFactory {
    public static Person createPersonWithAddress(String name, String street, 
                                               String city, String state) {
        Address address = new Address(street, city, state);
        return new Person(name, address);
    }
}
```

### 3. Builder Pattern
Build complex objects step by step:

```java
class OrderBuilder {
    private Order order;
    
    public OrderBuilder(String orderId, Customer customer) {
        order = new Order(orderId, customer);
    }
    
    public OrderBuilder addItem(Product product, int quantity) {
        OrderItem item = new OrderItem(product, quantity);
        order.addItem(item);
        return this;
    }
    
    public Order build() {
        return order;
    }
}
```

## Navigating Nested Objects

### Accessing Nested Properties
```java
class Person {
    Address address;
    
    public String getCity() {
        if (address != null) {
            return address.getCity();
        }
        return "Unknown";
    }
}

// Usage
Person person = new Person("Alice", address);
String city = person.getCity();  // Accesses nested object property
```

### Method Chaining Through Objects
```java
class Account {
    Customer owner;
    
    public String getOwnerCity() {
        return owner.getAddress().getCity();  // Chain through nested objects
    }
}
```

### Safe Navigation (Null Checking)
```java
class Employee {
    Department department;
    
    public String getDepartmentName() {
        if (department != null) {
            return department.getName();
        }
        return "No Department";
    }
    
    // Or more concise:
    public String getDepartmentNameSafe() {
        return department != null ? department.getName() : "No Department";
    }
}
```

## Common Patterns with Nested Objects

### 1. Delegation Pattern
Delegate method calls to nested objects:

```java
class Car {
    Engine engine;
    
    public void start() {
        engine.start();  // Delegate to engine
    }
    
    public int getHorsepower() {
        return engine.getHorsepower();  // Delegate to engine
    }
}
```

### 2. Aggregate Operations
Perform operations across collections of nested objects:

```java
class ShoppingCart {
    ArrayList<CartItem> items;
    
    public double calculateTotal() {
        double total = 0.0;
        for (CartItem item : items) {
            total += item.getSubtotal();  // Each item calculates its own total
        }
        return total;
    }
    
    public int getTotalQuantity() {
        return items.stream().mapToInt(CartItem::getQuantity).sum();
    }
}
```

### 3. Object Graph Traversal
Navigate through complex object structures:

```java
class Company {
    ArrayList<Department> departments;
    
    public ArrayList<Employee> getAllEmployees() {
        ArrayList<Employee> allEmployees = new ArrayList<>();
        for (Department dept : departments) {
            allEmployees.addAll(dept.getEmployees());
        }
        return allEmployees;
    }
    
    public Employee findEmployee(String employeeId) {
        for (Department dept : departments) {
            Employee emp = dept.findEmployee(employeeId);
            if (emp != null) {
                return emp;
            }
        }
        return null;
    }
}
```

### 4. Composite Pattern
Treat individual objects and collections uniformly:

```java
interface FileSystemComponent {
    int getSize();
    void display();
}

class File implements FileSystemComponent {
    String name;
    int size;
    
    public int getSize() { return size; }
    public void display() { System.out.println("File: " + name); }
}

class Directory implements FileSystemComponent {
    String name;
    ArrayList<FileSystemComponent> components = new ArrayList<>();
    
    public int getSize() {
        return components.stream().mapToInt(FileSystemComponent::getSize).sum();
    }
    
    public void display() {
        System.out.println("Directory: " + name);
        for (FileSystemComponent component : components) {
            component.display();
        }
    }
}
```

## Managing Object Relationships

### 1. One-to-One Relationships
```java
class Person {
    Passport passport;  // One person has one passport
    
    public void setPassport(Passport passport) {
        this.passport = passport;
        passport.setOwner(this);  // Bidirectional relationship
    }
}
```

### 2. One-to-Many Relationships
```java
class Author {
    ArrayList<Book> books;  // One author has many books
    
    public void addBook(Book book) {
        books.add(book);
        book.setAuthor(this);  // Set reverse relationship
    }
}
```

### 3. Many-to-Many Relationships
```java
class Student {
    ArrayList<Course> courses;
    
    public void enrollInCourse(Course course) {
        if (!courses.contains(course)) {
            courses.add(course);
            course.addStudent(this);  // Update both sides
        }
    }
}

class Course {
    ArrayList<Student> students;
    
    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            student.enrollInCourse(this);  // Update both sides
        }
    }
}
```

## Best Practices for Nested Objects

### 1. Encapsulation
Don't expose nested objects directly:

```java
class BankAccount {
    private ArrayList<Transaction> transactions;
    
    // Don't do this - exposes internal collection
    public ArrayList<Transaction> getTransactions() {
        return transactions;  // Dangerous!
    }
    
    // Better - return copy or read-only view
    public ArrayList<Transaction> getTransactionHistory() {
        return new ArrayList<>(transactions);  // Return copy
    }
    
    // Even better - provide specific operations
    public int getTransactionCount() {
        return transactions.size();
    }
    
    public Transaction getLatestTransaction() {
        return transactions.isEmpty() ? null : transactions.get(transactions.size() - 1);
    }
}
```

### 2. Null Safety
Always check for null nested objects:

```java
class Employee {
    Department department;
    
    public String getDepartmentBudget() {
        if (department != null && department.getBudget() != null) {
            return department.getBudget().toString();
        }
        return "No budget information";
    }
}
```

### 3. Consistency Maintenance
Keep related objects in consistent states:

```java
class Order {
    Customer customer;
    ArrayList<OrderLine> orderLines;
    double total;
    
    public void addOrderLine(OrderLine line) {
        orderLines.add(line);
        updateTotal();  // Maintain consistency
    }
    
    private void updateTotal() {
        total = orderLines.stream().mapToDouble(OrderLine::getTotal).sum();
    }
}
```

### 4. Lazy Loading
Create nested objects only when needed:

```java
class Report {
    private ArrayList<ReportSection> sections;
    
    public ArrayList<ReportSection> getSections() {
        if (sections == null) {
            sections = generateSections();  // Create only when needed
        }
        return sections;
    }
}
```

## Common Mistakes to Avoid

### 1. Circular References Without Control
```java
// Dangerous - can cause infinite loops
class Parent {
    ArrayList<Child> children;
    
    public String toString() {
        return "Parent with " + children.toString();  // Calls Child.toString()
    }
}

class Child {
    Parent parent;
    
    public String toString() {
        return "Child of " + parent.toString();  // Calls Parent.toString() - INFINITE LOOP!
    }
}
```

### 2. Not Handling Null Nested Objects
```java
// Dangerous
public String getEmployeeDepartmentName(Employee emp) {
    return emp.getDepartment().getName();  // NullPointerException if department is null
}

// Safe
public String getEmployeeDepartmentName(Employee emp) {
    Department dept = emp.getDepartment();
    return dept != null ? dept.getName() : "No Department";
}
```

### 3. Breaking Encapsulation
```java
// Poor - exposes internal structure
class Team {
    public ArrayList<Player> players;  // Public field - anyone can modify
}

// Better - controlled access
class Team {
    private ArrayList<Player> players;
    
    public void addPlayer(Player player) {
        players.add(player);
    }
    
    public ArrayList<Player> getPlayers() {
        return new ArrayList<>(players);  // Return copy
    }
}
```

### 4. Not Maintaining Bidirectional Relationships
```java
class Course {
    ArrayList<Student> students;
    
    public void addStudent(Student student) {
        students.add(student);
        // FORGOT: student.addCourse(this);  // Relationship is now inconsistent
    }
}
```

## Testing Nested Objects

When testing nested objects, consider:

### 1. Object Creation
```java
@Test
public void testPersonWithAddress() {
    Address address = new Address("123 Main St", "Springfield", "IL");
    Person person = new Person("Alice", address);
    
    assertEquals("Alice", person.getName());
    assertEquals("Springfield", person.getAddress().getCity());
}
```

### 2. Relationship Management
```java
@Test
public void testStudentCourseEnrollment() {
    Student student = new Student("Bob", "S001");
    Course course = new Course("CS101", "Programming");
    
    student.enrollInCourse(course);
    
    assertTrue(student.isEnrolledIn(course));
    assertTrue(course.hasStudent(student));
}
```

### 3. Null Handling
```java
@Test
public void testNullNestedObject() {
    Person person = new Person("Charlie", null);  // No address
    
    assertEquals("Unknown", person.getCity());  // Should handle null gracefully
}
```

## Real-World Applications

Nested objects are everywhere in real applications:

### E-commerce
- **Order** contains **Customer**, **OrderLines**, **ShippingAddress**
- **OrderLine** contains **Product**, quantity, price

### Banking
- **Bank** contains **Customers**, **Accounts**
- **Customer** contains **Accounts**, **Transactions**
- **Account** contains **Transactions**, **Customer**

### Social Media
- **User** contains **Posts**, **Friends**, **Profile**
- **Post** contains **Comments**, **Likes**, **Author**

### Gaming
- **Game** contains **Players**, **Levels**
- **Player** contains **Inventory**, **Stats**, **Character**
- **Inventory** contains **Items**

### Document Systems
- **Document** contains **Sections**, **Author**, **Metadata**
- **Section** contains **Paragraphs**, **Images**

Remember: Nested objects help you model complex real-world relationships in your code. They make your programs more organized, maintainable, and closer to how we naturally think about systems!
