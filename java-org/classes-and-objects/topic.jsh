 //Classes and Objects Exercises - Complete the classes and methods below
 //Save this file and load it in jshell with: /open topic.jsh
import java.util.ArrayList;

// Exercise 1: Basic Class Creation
// Create a Person class with name and age fields
class Person {
    String name;
    int age;

   
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }
   
    public String introduce() {
        return "Hello, I'm " + name + " and I'm " + age + " years old.";
    }

    

}

    


// Exercise 2: Class with Methods
class BankAccount {
    String accountNumber;
    double balance;

   
    public BankAccount(String accountNumber) {
        this.accountNumber = accountNumber;
        this.balance = 0.0;
    }
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("Deposit amount must be positive.");
        }
    }


    public boolean withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
            return true;
        } else {
            System.out.println("Insufficient funds or invalid amount.");
            return false;
        }
    }

   
    public double getBalance() {
        return balance;
    }

   
    public String getAccountInfo() {
        return "Account Number: " + accountNumber + ", Balance: $" + balance;
    }
}


//Exercise 3: Object Creation and Usage
// Creates and returns a Person object
public Person createPerson(String name, int age) {
    return new Person(name, age);
}

// Creates and returns a BankAccount object
public BankAccount createBankAccount(String accountNumber) {
    return new BankAccount(accountNumber);
}

// Demonstrates creating and using a Person object
public void demonstratePersonUsage() {
    Person person = createPerson("Alice", 30);
    String intro = person.introduce();
    System.out.println(intro);
}



// Exercise 4: Working with Multiple Objects
// Create a Car class
class Car {
    // Your fields here
    String brand;
    String model;
    int year;
    
    // Your constructor here
    public Car(String brand, String model, int year) {
        this.brand = brand;
        this.model = model;
        this.year = year;
    }
    // Your getCarInfo method here
 public String getCarInfo() {
        return brand + " " + model + " (" + year + ")";
    }

    
    // Your isClassic method here (car is classic if > 25 years old)
     public boolean isClassic() {
        int currentYear = java.time.Year.now().getValue();  // Get current year
        return (currentYear - year) > 25;
}
}

// Compare two cars and return which is older
public Car compareCars(Car car1, Car car2) {
    // Your code here
    if (car1.year < car2.year) {
        return car1;
    } else if (car2.year < car1.year) {
        return car2;
    } else {
        return null; // Both cars are the same year
    }
}



// Exercise 5: Object State and Behavior
// Create a Counter class that can increment/decrement
class Counter {
    // Your fields here
    private int count;

    
    // Your constructor here
      public Counter() {
        this.count = 0;
    }
    
    // Your increment method here
     public void increment() {
        count++;
    }

    
    // Your decrement method here
     public void decrement() {
        count--;
    }
    
    // Your reset method here
     public void reset() {
        count = 0;
    }
    
    // Your getCount method here
     public int getCount() {
        return count;
    }
    
}

// Exercise 6: Class with Validation
// Create a Student class with input validation
class Student {
    // Your fields here
     private String name;
    private int grade;
    private double gpa;

    
    // Your constructor with validation here
    public Student(String name, int grade, double gpa) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Name cannot be null or empty.");
        }

        if (grade < 1 || grade > 12) {
            throw new IllegalArgumentException("Grade must be between 1 and 12.");
        }

        if (gpa < 0.0 || gpa > 4.0) {
            throw new IllegalArgumentException("GPA must be between 0.0 and 4.0.");
        }

        this.name = name;
        this.grade = grade;
        this.gpa = gpa;
    }
    
    // Your isHonorStudent method here
     public boolean isHonorStudent() {
        return gpa >= 3.5;
    }

    
    // Your getStudentInfo method here
     public String getStudentInfo() {
        return "Name: " + name + ", Grade: " + grade + ", GPA: " + gpa;
    }
    
}

// Exercise 7: Object Interaction
// Create a Book class
class Book {
    // Your fields here
    class Book {
    String title;
    String author;
    boolean isCheckedOut;

 // Your constructor here
     public Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isCheckedOut = false; // default: available
    }

  
    // Add any helpful methods here
        public void checkOut() {
        isCheckedOut = true;
    }

    public void returnBook() {
        isCheckedOut = false;
    }

    public boolean isAvailable() {
        return !isCheckedOut;
    }

    public String getInfo() {
        return title + " by " + author + (isCheckedOut ? " [Checked Out]" : " [Available]");
    }
}
}

// Create a Library class that manages books
class Library {
    private ArrayList<Book> books;

    public Library() {
        books = new ArrayList<>();
    }

    
    public void addBook(Book book) {
        books.add(book);
    }

    
    public boolean checkOutBook(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title) && book.isAvailable()) {
                book.checkOut();
                return true;
            }
        }
        return false; 
    }

    
    public boolean returnBook(String title) {
        for (Book book : books) {
            if (book.title.equalsIgnoreCase(title) && !book.isAvailable()) {
                book.returnBook();
                return true;
            }
        }
        return false; 
    }

   
    public int getAvailableBooks() {
        int count = 0;
        for (Book book : books) {
            if (book.isAvailable()) {
                count++;
            }
        }
        return count;
    }

    public void listAllBooks() {
        for (Book book : books) {
            System.out.println(book.getInfo());
        }
    }
}

    
    


// Test your classes here - uncomment and modify as needed

System.out.println("Testing Person class:");
Person person1 = createPerson("Alice", 30);
Person person2 = new Person("Bob", 25);
System.out.println(person1.introduce());
System.out.println(person2.introduce());

System.out.println("\nTesting BankAccount class:");
BankAccount account = createBankAccount("123456");
System.out.println("Initial: " + account.getAccountInfo());
account.deposit(100.0);
System.out.println("After deposit: Balance = " + account.getBalance());
account.withdraw(30.0);
System.out.println("After withdrawal: Balance = " + account.getBalance());
account.withdraw(100.0); // Should fail - insufficient funds
System.out.println("Final: " + account.getAccountInfo());

System.out.println("\nTesting Car class:");
Car car1 = new Car("Toyota", "Camry", 1995);
Car car2 = new Car("Honda", "Civic", 2020);
System.out.println(car1.getCarInfo());
System.out.println("Is classic: " + car1.isClassic());
System.out.println(car2.getCarInfo());
System.out.println("Is classic: " + car2.isClassic());
Car older = compareCars(car1, car2);
System.out.println("Older car: " + older.getCarInfo());

System.out.println("\nTesting Counter class:");
Counter counter = new Counter();
System.out.println("Initial count: " + counter.getCount());
counter.increment();
counter.increment();
counter.increment();
System.out.println("After 3 increments: " + counter.getCount());
counter.decrement();
System.out.println("After 1 decrement: " + counter.getCount());
counter.reset();
System.out.println("After reset: " + counter.getCount());

System.out.println("\nTesting Student class:");
try {
    Student student1 = new Student("John", 10, 3.8);
    System.out.println(student1.getStudentInfo());
    System.out.println("Is honor student: " + student1.isHonorStudent());
    
    Student student2 = new Student("Jane", 12, 2.5);
    System.out.println(student2.getStudentInfo());
    System.out.println("Is honor student: " + student2.isHonorStudent());
} catch (Exception e) {
    System.out.println("Validation error: " + e.getMessage());
}

System.out.println("\nTesting Library system:");
Library library = new Library();
Book book1 = new Book("1984", "George Orwell", false);
Book book2 = new Book("To Kill a Mockingbird", "Harper Lee", false);

library.addBook(book1);
library.addBook(book2);
System.out.println("Available books: " + library.getAvailableBooks());

library.checkOutBook("1984");
System.out.println("After checking out 1984: " + library.getAvailableBooks());

library.returnBook("1984");
System.out.println("After returning 1984: " + library.getAvailableBooks());

