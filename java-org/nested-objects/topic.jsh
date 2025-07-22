// Nested Objects Practice - Objects containing other objects

import java.util.ArrayList;
import java.util.HashMap;

// Exercise 1: Basic Object Composition - Address and Person
class Address {
    String street;
    String city;
    String state;
    String zipCode;
    
    public Address(String street, String city, String state, String zipCode) {
        // TODO: Initialize all fields
    }
    
    public String getFullAddress() {
        // TODO: Return formatted address: "123 Main St, Springfield, IL 62701"
        return "";
    }
    
    public boolean isInState(String state) {
        // TODO: Check if address is in given state (case insensitive)
        return false;
    }
    
    public String toString() {
        // TODO: Return readable address format
        return "";
    }
}

class Person {
    String name;
    int age;
    Address homeAddress;
    Address workAddress;  // Can be null
    
    public Person(String name, int age, Address homeAddress) {
        // TODO: Initialize name, age, homeAddress
    }
    
    public void setWorkAddress(Address workAddress) {
        // TODO: Set work address
    }
    
    public double getDistanceToWork() {
        // TODO: Return 0.0 if same city, 10.0 if different city, 50.0 if different state
        // Return 0.0 if no work address
        return 0.0;
    }
    
    public void relocate(Address newAddress) {
        // TODO: Change home address
    }
    
    public String getAddressSummary() {
        // TODO: Return string with both addresses
        // Format: "Home: [address], Work: [address]" or "Home: [address], Work: None"
        return "";
    }
    
    public boolean livesAndWorksInSameState() {
        // TODO: Return true if both addresses in same state
        // Return false if no work address
        return false;
    }
}

// Exercise 2: Collection of Objects - Course, Student, University
class Course {
    String courseCode;
    String courseName;
    int credits;
    ArrayList<Student> enrolledStudents;
    
    public Course(String courseCode, String courseName, int credits) {
        // TODO: Initialize fields, create empty student list
    }
    
    public boolean enrollStudent(Student student) {
        // TODO: Add student if not already enrolled and under 30 students
        // Return true if successful
        return false;
    }
    
    public boolean dropStudent(Student student) {
        // TODO: Remove student from course
        // Return true if student was enrolled
        return false;
    }
    
    public int getEnrollmentCount() {
        // TODO: Return number of enrolled students
        return 0;
    }
    
    public ArrayList<String> getStudentNames() {
        // TODO: Return list of student names
        return new ArrayList<>();
    }
    
    public boolean hasStudent(String studentName) {
        // TODO: Check if student is enrolled by name
        return false;
    }
    
    public double getAverageGPA() {
        // TODO: Return average GPA of enrolled students
        // Return 0.0 if no students
        return 0.0;
    }
}

class Student {
    String name;
    String studentId;
    double gpa;
    ArrayList<Course> enrolledCourses;
    
    public Student(String name, String studentId, double gpa) {
        // TODO: Initialize fields, create empty course list
    }
    
    public boolean enrollInCourse(Course course) {
        // TODO: Add course if not already enrolled and under 6 courses
        // Also enroll this student in the course
        // Return true if successful
        return false;
    }
    
    public boolean dropCourse(Course course) {
        // TODO: Remove course and drop student from course
        // Return true if student was enrolled in course
        return false;
    }
    
    public int getTotalCredits() {
        // TODO: Sum credits from all enrolled courses
        return 0;
    }
    
    public ArrayList<String> getCourseList() {
        // TODO: Return list of course names
        return new ArrayList<>();
    }
    
    public boolean isFullTimeStudent() {
        // TODO: Return true if >= 12 credits
        return false;
    }
    
    public String toString() {
        // TODO: Return student info with courses
        return "";
    }
}

class University {
    String name;
    ArrayList<Student> students;
    ArrayList<Course> courses;
    
    public University(String name) {
        // TODO: Initialize name and empty lists
    }
    
    public void addStudent(Student student) {
        // TODO: Add student to university
    }
    
    public void addCourse(Course course) {
        // TODO: Add course to university
    }
    
    public Student findStudent(String studentId) {
        // TODO: Return student with matching ID or null
        return null;
    }
    
    public Course findCourse(String courseCode) {
        // TODO: Return course with matching code or null
        return null;
    }
    
    public String getUniversityStats() {
        // TODO: Return string with total students, courses, and total enrollments
        return "";
    }
    
    public ArrayList<Student> getStudentsInCourse(String courseCode) {
        // TODO: Return list of students enrolled in specific course
        return new ArrayList<>();
    }
}

// Exercise 3: Hierarchical Object Structure - Room, Floor, Building
class Room {
    String roomNumber;
    String roomType;
    int capacity;
    boolean isOccupied;
    
    public Room(String roomNumber, String roomType, int capacity) {
        // TODO: Initialize fields, set isOccupied to false
    }
    
    public boolean occupyRoom() {
        // TODO: Set as occupied if not already occupied
        // Return true if successful
        return false;
    }
    
    public boolean vacateRoom() {
        // TODO: Set as vacant if currently occupied
        // Return true if successful
        return false;
    }
    
    public boolean canAccommodate(int people) {
        // TODO: Check if room can fit people and is not occupied
        return false;
    }
    
    public String getRoomInfo() {
        // TODO: Return formatted room information with all details
        return "";
    }
    
    public String toString() {
        // TODO: Return "Room [number]: [type] (capacity: [capacity])"
        return "";
    }
}

class Floor {
    int floorNumber;
    ArrayList<Room> rooms;
    String floorType;
    
    public Floor(int floorNumber, String floorType) {
        // TODO: Initialize fields, create empty room list
    }
    
    public void addRoom(Room room) {
        // TODO: Add room to floor
    }
    
    public boolean removeRoom(String roomNumber) {
        // TODO: Remove room by number, return true if found and removed
        return false;
    }
    
    public Room findRoom(String roomNumber) {
        // TODO: Return room with matching number or null
        return null;
    }
    
    public ArrayList<Room> getAvailableRooms() {
        // TODO: Return list of unoccupied rooms
        return new ArrayList<>();
    }
    
    public int getTotalCapacity() {
        // TODO: Sum capacity of all rooms on floor
        return 0;
    }
    
    public double getOccupancyRate() {
        // TODO: Return percentage of occupied rooms (0.0 to 1.0)
        return 0.0;
    }
    
    public String getFloorSummary() {
        // TODO: Return string with floor stats
        return "";
    }
}

class Building {
    String buildingName;
    String address;
    ArrayList<Floor> floors;
    
    public Building(String buildingName, String address) {
        // TODO: Initialize fields, create empty floor list
    }
    
    public void addFloor(Floor floor) {
        // TODO: Add floor to building
    }
    
    public boolean removeFloor(int floorNumber) {
        // TODO: Remove floor by number, return true if found and removed
        return false;
    }
    
    public Floor findFloor(int floorNumber) {
        // TODO: Return floor with matching number or null
        return null;
    }
    
    public Room findRoom(String roomNumber) {
        // TODO: Search all floors for room with matching number
        return null;
    }
    
    public String getBuildingStats() {
        // TODO: Return comprehensive building statistics
        return "";
    }
    
    public ArrayList<Room> getAllAvailableRooms() {
        // TODO: Return all unoccupied rooms in entire building
        return new ArrayList<>();
    }
    
    public boolean reserveRoom(String roomNumber) {
        // TODO: Find and occupy specific room
        // Return true if room was found and successfully occupied
        return false;
    }
}

// Exercise 4: Financial System - Transaction, Account, Customer, Bank
class Transaction {
    String transactionId;
    String type;  // "DEBIT" or "CREDIT"
    double amount;
    String date;
    String description;
    
    public Transaction(String transactionId, String type, double amount, String date, String description) {
        // TODO: Initialize all fields
    }
    
    public boolean isDebit() {
        // TODO: Return true if type is "DEBIT"
        return false;
    }
    
    public boolean isCredit() {
        // TODO: Return true if type is "CREDIT"
        return false;
    }
    
    public String getTransactionSummary() {
        // TODO: Return formatted transaction string
        return "";
    }
    
    public String toString() {
        // TODO: Return transaction details
        return "";
    }
}

class Account {
    String accountNumber;
    String accountType;
    double balance;
    ArrayList<Transaction> transactions;
    
    public Account(String accountNumber, String accountType) {
        // TODO: Initialize fields, balance starts at 0, create empty transaction list
    }
    
    public void deposit(double amount, String description) {
        // TODO: Add money, create CREDIT transaction
        // Transaction ID can be simple: "TXN" + transaction count
    }
    
    public boolean withdraw(double amount, String description) {
        // TODO: Remove money if sufficient funds, create DEBIT transaction
        // Return true if successful
        return false;
    }
    
    public double getBalance() {
        // TODO: Return current balance
        return 0.0;
    }
    
    public ArrayList<Transaction> getTransactionHistory() {
        // TODO: Return copy of transactions list
        return new ArrayList<>();
    }
    
    public int getTransactionCount() {
        // TODO: Return number of transactions
        return 0;
    }
    
    public String getMonthlyStatement() {
        // TODO: Return string summary of recent transactions
        return "";
    }
    
    public double calculateInterest(double rate) {
        // TODO: Return interest amount for current balance
        return 0.0;
    }
}

class Customer {
    String customerId;
    String name;
    String email;
    ArrayList<Account> accounts;
    
    public Customer(String customerId, String name, String email) {
        // TODO: Initialize fields, create empty account list
    }
    
    public void addAccount(Account account) {
        // TODO: Add account to customer
    }
    
    public boolean removeAccount(String accountNumber) {
        // TODO: Remove account by number, return true if found and removed
        return false;
    }
    
    public Account findAccount(String accountNumber) {
        // TODO: Return account with matching number or null
        return null;
    }
    
    public double getTotalBalance() {
        // TODO: Sum balances of all accounts
        return 0.0;
    }
    
    public String getAccountSummary() {
        // TODO: Return string with all account info
        return "";
    }
    
    public boolean hasAccount(String accountNumber) {
        // TODO: Check if customer has account with given number
        return false;
    }
    
    public boolean transferBetweenAccounts(String fromAccount, String toAccount, double amount) {
        // TODO: Transfer within customer's accounts
        // Return true if successful
        return false;
    }
}

class Bank {
    String bankName;
    ArrayList<Customer> customers;
    HashMap<String, Account> allAccounts;
    
    public Bank(String bankName) {
        // TODO: Initialize fields
    }
    
    public void addCustomer(Customer customer) {
        // TODO: Add customer to bank and add all customer accounts to allAccounts map
    }
    
    public Customer findCustomer(String customerId) {
        // TODO: Return customer with matching ID or null
        return null;
    }
    
    public Account findAccount(String accountNumber) {
        // TODO: Return account from allAccounts map
        return null;
    }
    
    public double getTotalDeposits() {
        // TODO: Sum all account balances
        return 0.0;
    }
    
    public int getCustomerCount() {
        // TODO: Return number of customers
        return 0;
    }
    
    public int getAccountCount() {
        // TODO: Return total number of accounts
        return 0;
    }
    
    public String getBankReport() {
        // TODO: Return comprehensive bank statistics
        return "";
    }
    
    public boolean processInterPayment(String fromAccount, String toAccount, double amount) {
        // TODO: Transfer between any accounts in the bank
        // Return true if successful
        return false;
    }
}

// Test your nested object implementations:

// Test Exercise 1: Address and Person
System.out.println("=== Testing Address and Person ===");
Address homeAddr = new Address("123 Main St", "Springfield", "IL", "62701");
Address workAddr = new Address("456 Oak Ave", "Chicago", "IL", "60601");
Person person = new Person("Alice Johnson", 30, homeAddr);
person.setWorkAddress(workAddr);

System.out.println("Full home address: " + homeAddr.getFullAddress());
System.out.println("Is home in IL: " + homeAddr.isInState("IL"));
System.out.println("Distance to work: " + person.getDistanceToWork());
System.out.println("Address summary: " + person.getAddressSummary());
System.out.println("Same state: " + person.livesAndWorksInSameState());

// Test Exercise 2: Course, Student, University
System.out.println("\n=== Testing Course, Student, University ===");
University university = new University("State University");
Course javaCourse = new Course("CS101", "Introduction to Java", 3);
Course mathCourse = new Course("MATH201", "Calculus I", 4);
Student student1 = new Student("Bob Smith", "S001", 3.5);
Student student2 = new Student("Carol Brown", "S002", 3.8);

university.addCourse(javaCourse);
university.addCourse(mathCourse);
university.addStudent(student1);
university.addStudent(student2);

student1.enrollInCourse(javaCourse);
student1.enrollInCourse(mathCourse);
student2.enrollInCourse(javaCourse);

System.out.println("Java course enrollment: " + javaCourse.getEnrollmentCount());
System.out.println("Student1 total credits: " + student1.getTotalCredits());
System.out.println("Student1 is full-time: " + student1.isFullTimeStudent());
System.out.println("Java course average GPA: " + javaCourse.getAverageGPA());
System.out.println("University stats: " + university.getUniversityStats());

// Test Exercise 3: Room, Floor, Building
System.out.println("\n=== Testing Room, Floor, Building ===");
Building building = new Building("Office Tower", "789 Business Ave");
Floor floor1 = new Floor(1, "Office");
Floor floor2 = new Floor(2, "Conference");
Room room101 = new Room("101", "Office", 4);
Room room102 = new Room("102", "Office", 2);
Room room201 = new Room("201", "Conference", 20);

floor1.addRoom(room101);
floor1.addRoom(room102);
floor2.addRoom(room201);
building.addFloor(floor1);
building.addFloor(floor2);

room101.occupyRoom();
System.out.println("Room 101 info: " + room101.getRoomInfo());
System.out.println("Floor 1 occupancy rate: " + floor1.getOccupancyRate());
System.out.println("Building stats: " + building.getBuildingStats());
System.out.println("Available rooms count: " + building.getAllAvailableRooms().size());
System.out.println("Reserve room 102: " + building.reserveRoom("102"));

// Test Exercise 4: Financial System
System.out.println("\n=== Testing Financial System ===");
Bank bank = new Bank("First National Bank");
Customer customer1 = new Customer("C001", "David Wilson", "david@email.com");
Account checking = new Account("ACC001", "Checking");
Account savings = new Account("ACC002", "Savings");

customer1.addAccount(checking);
customer1.addAccount(savings);
bank.addCustomer(customer1);

checking.deposit(1000.0, "Initial deposit");
checking.withdraw(200.0, "ATM withdrawal");
savings.deposit(500.0, "Transfer from checking");

System.out.println("Checking balance: $" + checking.getBalance());
System.out.println("Customer total balance: $" + customer1.getTotalBalance());
System.out.println("Transaction count: " + checking.getTransactionCount());
System.out.println("Bank total deposits: $" + bank.getTotalDeposits());
System.out.println("Transfer between accounts: " + customer1.transferBetweenAccounts("ACC001", "ACC002", 100.0));

System.out.println("\n=== All Nested Object Tests Complete! ===");
