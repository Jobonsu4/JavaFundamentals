# Nested Objects Exercises

Welcome to the Nested Objects exercises! This topic focuses on understanding how objects can contain other objects as fields, creating complex data structures and relationships between different classes.

## What You'll Learn

- Creating classes that contain other objects as fields
- Understanding object composition and aggregation
- Working with nested object structures and navigation
- Managing relationships between multiple objects
- Designing classes that work together to solve complex problems
- Understanding object ownership and lifecycle management

## Exercise Overview

These exercises focus on building complex systems where objects contain and interact with other objects. You'll learn to design classes that work together to model real-world scenarios.

## Exercises

### Exercise 1: Basic Object Composition
**Classes: `Address`, `Person`**
Create a Person class that contains an Address object.

**Address Requirements:**
- Fields: `String street`, `String city`, `String state`, `String zipCode`
- Constructor: Takes all fields as parameters
- Methods:
  - `getFullAddress()` - Return formatted address string
  - `isInState(String state)` - Check if address is in given state
  - `toString()` - Return readable address format

**Person Requirements:**
- Fields: `String name`, `int age`, `Address homeAddress`, `Address workAddress` (can be null)
- Constructor: Takes name, age, and home address
- Methods:
  - `setWorkAddress(Address workAddress)` - Set work address
  - `getDistanceToWork()` - Return 0.0 if same city, 10.0 if different city, 50.0 if different state
  - `relocate(Address newAddress)` - Change home address
  - `getAddressSummary()` - Return string with both addresses
  - `livesAndWorksInSameState()` - Return true if both addresses in same state

### Exercise 2: Collection of Objects
**Classes: `Course`, `Student`, `University`**
Create a university system with students enrolled in courses.

**Course Requirements:**
- Fields: `String courseCode`, `String courseName`, `int credits`, `ArrayList<Student> enrolledStudents`
- Constructor: Takes code, name, and credits
- Methods:
  - `enrollStudent(Student student)` - Add student to course (max 30 students)
  - `dropStudent(Student student)` - Remove student from course
  - `getEnrollmentCount()` - Return number of enrolled students
  - `getStudentNames()` - Return ArrayList of student names
  - `hasStudent(String studentName)` - Check if student is enrolled
  - `getAverageGPA()` - Return average GPA of enrolled students

**Student Requirements:**
- Fields: `String name`, `String studentId`, `double gpa`, `ArrayList<Course> enrolledCourses`
- Constructor: Takes name, student ID, and GPA
- Methods:
  - `enrollInCourse(Course course)` - Add course (max 6 courses)
  - `dropCourse(Course course)` - Remove course
  - `getTotalCredits()` - Sum credits from all courses
  - `getCourseList()` - Return ArrayList of course names
  - `isFullTimeStudent()` - Return true if >= 12 credits
  - `toString()` - Return student info with courses

**University Requirements:**
- Fields: `String name`, `ArrayList<Student> students`, `ArrayList<Course> courses`
- Constructor: Takes university name
- Methods:
  - `addStudent(Student student)` - Add student to university
  - `addCourse(Course course)` - Add course to university
  - `findStudent(String studentId)` - Return student or null
  - `findCourse(String courseCode)` - Return course or null
  - `getUniversityStats()` - Return string with total students, courses, enrollments
  - `getStudentsInCourse(String courseCode)` - Return list of students in course

### Exercise 3: Hierarchical Object Structure
**Classes: `Room`, `Floor`, `Building`**
Create a building management system with nested structure.

**Room Requirements:**
- Fields: `String roomNumber`, `String roomType`, `int capacity`, `boolean isOccupied`
- Constructor: Takes room number, type, and capacity
- Methods:
  - `occupyRoom()` - Set as occupied if not already occupied
  - `vacateRoom()` - Set as vacant
  - `canAccommodate(int people)` - Check if room can fit people
  - `getRoomInfo()` - Return formatted room information
  - `toString()` - Return "Room [number]: [type] (capacity: [capacity])"

**Floor Requirements:**
- Fields: `int floorNumber`, `ArrayList<Room> rooms`, `String floorType`
- Constructor: Takes floor number and type
- Methods:
  - `addRoom(Room room)` - Add room to floor
  - `removeRoom(String roomNumber)` - Remove room by number
  - `findRoom(String roomNumber)` - Return room or null
  - `getAvailableRooms()` - Return ArrayList of unoccupied rooms
  - `getTotalCapacity()` - Sum capacity of all rooms
  - `getOccupancyRate()` - Return percentage of occupied rooms
  - `getFloorSummary()` - Return string with floor stats

**Building Requirements:**
- Fields: `String buildingName`, `String address`, `ArrayList<Floor> floors`
- Constructor: Takes building name and address
- Methods:
  - `addFloor(Floor floor)` - Add floor to building
  - `removeFloor(int floorNumber)` - Remove floor by number
  - `findFloor(int floorNumber)` - Return floor or null
  - `findRoom(String roomNumber)` - Search all floors for room
  - `getBuildingStats()` - Return comprehensive building statistics
  - `getAllAvailableRooms()` - Return all unoccupied rooms in building
  - `reserveRoom(String roomNumber)` - Find and occupy specific room

### Exercise 4: Financial System with Nested Objects
**Classes: `Transaction`, `Account`, `Customer`, `Bank`**
Create a banking system with nested financial objects.

**Transaction Requirements:**
- Fields: `String transactionId`, `String type`, `double amount`, `String date`, `String description`
- Constructor: Takes all fields
- Methods:
  - `isDebit()` - Return true if type is "DEBIT"
  - `isCredit()` - Return true if type is "CREDIT"
  - `getTransactionSummary()` - Return formatted transaction string
  - `toString()` - Return transaction details

**Account Requirements:**
- Fields: `String accountNumber`, `String accountType`, `double balance`, `ArrayList<Transaction> transactions`
- Constructor: Takes account number and type, balance starts at 0
- Methods:
  - `deposit(double amount, String description)` - Add money, create transaction
  - `withdraw(double amount, String description)` - Remove money if sufficient funds, create transaction
  - `getBalance()` - Return current balance
  - `getTransactionHistory()` - Return copy of transactions list
  - `getTransactionCount()` - Return number of transactions
  - `getMonthlyStatement()` - Return string summary of recent transactions
  - `calculateInterest(double rate)` - Return interest amount for current balance

**Customer Requirements:**
- Fields: `String customerId`, `String name`, `String email`, `ArrayList<Account> accounts`
- Constructor: Takes customer ID, name, and email
- Methods:
  - `addAccount(Account account)` - Add account to customer
  - `removeAccount(String accountNumber)` - Remove account by number
  - `findAccount(String accountNumber)` - Return account or null
  - `getTotalBalance()` - Sum balances of all accounts
  - `getAccountSummary()` - Return string with all account info
  - `hasAccount(String accountNumber)` - Check if customer has account
  - `transferBetweenAccounts(String fromAccount, String toAccount, double amount)` - Transfer within customer accounts

**Bank Requirements:**
- Fields: `String bankName`, `ArrayList<Customer> customers`, `HashMap<String, Account> allAccounts`
- Constructor: Takes bank name
- Methods:
  - `addCustomer(Customer customer)` - Add customer to bank
  - `findCustomer(String customerId)` - Return customer or null
  - `findAccount(String accountNumber)` - Return account from any customer
  - `getTotalDeposits()` - Sum all account balances
  - `getCustomerCount()` - Return number of customers
  - `getAccountCount()` - Return total number of accounts
  - `getBankReport()` - Return comprehensive bank statistics
  - `processInterPayment(String fromAccount, String toAccount, double amount)` - Transfer between any accounts

### Exercise 5: Order Management System
**Classes: `Item`, `OrderLine`, `Order`, `OrderManager`**
Create an e-commerce order system with nested product relationships.

**Item Requirements:**
- Fields: `String itemId`, `String name`, `double price`, `int stockQuantity`
- Constructor: Takes all fields
- Methods:
  - `reduceStock(int quantity)` - Decrease stock if available
  - `increaseStock(int quantity)` - Add to stock
  - `isInStock(int quantity)` - Check if requested quantity available
  - `getItemValue()` - Return price * stockQuantity
  - `toString()` - Return item details

**OrderLine Requirements:**
- Fields: `Item item`, `int quantity`, `double unitPrice`
- Constructor: Takes item and quantity, captures current price
- Methods:
  - `getLineTotal()` - Return quantity * unitPrice
  - `getItemName()` - Return name from item
  - `getItemId()` - Return ID from item
  - `increaseQuantity(int amount)` - Add to quantity
  - `decreaseQuantity(int amount)` - Subtract from quantity (min 1)
  - `toString()` - Return line item details

**Order Requirements:**
- Fields: `String orderId`, `String customerId`, `ArrayList<OrderLine> orderLines`, `String status`, `String orderDate`
- Constructor: Takes order ID, customer ID, and date
- Methods:
  - `addOrderLine(OrderLine line)` - Add line to order
  - `removeOrderLine(String itemId)` - Remove line by item ID
  - `findOrderLine(String itemId)` - Return order line or null
  - `getOrderTotal()` - Sum all line totals
  - `getItemCount()` - Total quantity of all items
  - `setStatus(String status)` - Update order status
  - `getOrderSummary()` - Return formatted order details
  - `hasItem(String itemId)` - Check if order contains item

**OrderManager Requirements:**
- Fields: `ArrayList<Order> orders`, `HashMap<String, Item> inventory`
- Constructor: Initializes empty collections
- Methods:
  - `addItem(Item item)` - Add item to inventory
  - `createOrder(String orderId, String customerId)` - Create new order
  - `addItemToOrder(String orderId, String itemId, int quantity)` - Add item to existing order
  - `processOrder(String orderId)` - Validate stock and complete order
  - `findOrder(String orderId)` - Return order or null
  - `getOrdersByCustomer(String customerId)` - Return list of customer orders
  - `getTotalSales()` - Sum value of all completed orders
  - `getInventoryValue()` - Sum value of all items in stock

### Exercise 6: Library Management System
**Classes: `Author`, `Book`, `Member`, `Library`**
Create a comprehensive library system with complex object relationships.

**Author Requirements:**
- Fields: `String authorId`, `String name`, `String nationality`, `ArrayList<Book> books`
- Constructor: Takes author ID, name, and nationality
- Methods:
  - `addBook(Book book)` - Add book to author's collection
  - `getBookCount()` - Return number of books by author
  - `getBookTitles()` - Return ArrayList of book titles
  - `hasWrittenBook(String title)` - Check if author wrote specific book
  - `toString()` - Return author info with book count

**Book Requirements:**
- Fields: `String isbn`, `String title`, `Author author`, `String genre`, `boolean isAvailable`, `Member borrowedBy`
- Constructor: Takes ISBN, title, author, and genre
- Methods:
  - `borrowBook(Member member)` - Set as borrowed if available
  - `returnBook()` - Set as available, clear borrower
  - `getBorrowedBy()` - Return member who borrowed book or null
  - `getBookInfo()` - Return comprehensive book information
  - `isBorrowedBy(Member member)` - Check if borrowed by specific member
  - `toString()` - Return book details with availability

**Member Requirements:**
- Fields: `String memberId`, `String name`, `String email`, `ArrayList<Book> borrowedBooks`, `int borrowLimit`
- Constructor: Takes member ID, name, email, and borrow limit
- Methods:
  - `borrowBook(Book book)` - Add book if under limit and book is available
  - `returnBook(Book book)` - Remove book from borrowed list
  - `getBorrowedCount()` - Return number of currently borrowed books
  - `canBorrowMore()` - Check if member can borrow additional books
  - `getBorrowedTitles()` - Return ArrayList of borrowed book titles
  - `hasBook(String isbn)` - Check if member has borrowed specific book
  - `getMemberSummary()` - Return member info with borrowed books

**Library Requirements:**
- Fields: `String libraryName`, `ArrayList<Book> books`, `ArrayList<Member> members`, `ArrayList<Author> authors`
- Constructor: Takes library name
- Methods:
  - `addBook(Book book)` - Add book to library collection
  - `addMember(Member member)` - Add member to library
  - `addAuthor(Author author)` - Add author to library
  - `findBook(String isbn)` - Return book or null
  - `findMember(String memberId)` - Return member or null
  - `searchBooksByTitle(String title)` - Return ArrayList of matching books
  - `searchBooksByAuthor(String authorName)` - Return books by author
  - `getAvailableBooks()` - Return list of books available for borrowing
  - `processBookReturn(String isbn)` - Handle book return process
  - `getLibraryStatistics()` - Return comprehensive library stats

## Getting Started

1. Open the `topic.jsh` file
2. Start with Exercise 1 (`Address` and `Person`)
3. Pay attention to how objects reference other objects
4. Test the relationships between nested objects
5. Understand how changes in nested objects affect the containing object
6. Progress through exercises, building more complex nested structures

## Key Concepts to Focus On

- **Object Composition**: Objects containing other objects as fields
- **Object References**: Understanding how objects reference other objects
- **Navigation**: Accessing nested object properties and methods
- **Lifecycle Management**: Creating and managing related objects
- **Bidirectional Relationships**: Objects that reference each other
- **Collection Management**: Objects containing collections of other objects

## Design Principles for Nested Objects

- **Clear Ownership**: Understand which object "owns" which other objects
- **Proper Encapsulation**: Provide methods to access nested objects safely
- **Consistency**: Keep related objects in consistent states
- **Null Safety**: Handle cases where nested objects might be null
- **Dependency Management**: Understand how objects depend on each other

## Testing Your Code

Each exercise has comprehensive tests that verify:
- Object creation and initialization
- Nested object navigation and access
- Collection management within objects
- Relationships between different objects
- Complex scenarios involving multiple nested objects

Focus on understanding how the objects work together as a system, not just individually!
