//Java constructors initialize objects. Here's a complete demo showing default, parameterized, and copy constructors.

//## Complete Working Program


import java.util.Scanner;

// Class demonstrating all constructor types

/* class Book {
    private String title;
    private String author;
    private double price;
    
    // 1. DEFAULT CONSTRUCTOR (no parameters)
    public Book() {
        this.title = "Unknown";
        this.author = "Anonymous";
        this.price = 0.0;
        System.out.println("Default constructor called");
    }
    
    // 2. PARAMETERIZED CONSTRUCTOR
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println("Parameterized constructor called");
    }
    
    // 3. COPY CONSTRUCTOR
    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
        System.out.println("Copy constructor called");
    }
    
    // Display method
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("---");
    }
    
    // Getters for copy constructor
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public double getPrice() { return price; }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. DEFAULT CONSTRUCTOR
        System.out.println("1. Default Constructor:");
        Book book1 = new Book();  // Calls default constructor
        book1.display();
        
        // 2. PARAMETERIZED CONSTRUCTOR
        System.out.println("\n2. Parameterized Constructor:");
        System.out.print("Enter title: ");
        String title = sc.nextLine();
        System.out.print("Enter author: ");
        String author = sc.nextLine();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        sc.nextLine(); // consume newline
        
        Book book2 = new Book(title, author, price);  // Calls parameterized
        book2.display();
        
        // 3. COPY CONSTRUCTOR
        System.out.println("\n3. Copy Constructor:");
        Book book3 = new Book(book2);  // Copies book2
        book3.display();
        
        // Modify copy to show independent objects
        book3.price = 25.99;
        System.out.println("\nAfter modifying copy:");
        System.out.println("Original price: $" + book2.getPrice());
        System.out.println("Copy price: $" + book3.getPrice());
        
        sc.close();
    }
}
*/




/*

import java.util.Scanner;

// Class demonstrating all constructor types
class Book {
    private String title;
    private String author;
    private double price;
    
    // 1. DEFAULT CONSTRUCTOR (no parameters)
    public Book() {
        this.title = "Unknown";
        this.author = "Anonymous";
        this.price = 0.0;
        System.out.println("Default constructor called");
    }
    
    // 2. PARAMETERIZED CONSTRUCTOR
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println("Parameterized constructor called");
    }
    
    // 3. COPY CONSTRUCTOR
    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
        System.out.println("Copy constructor called");
    }
    
    // Display method
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("---");
    }
    
    // Getters for copy constructor
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public double getPrice() { return price; }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. DEFAULT CONSTRUCTOR
        System.out.println("1. Default Constructor:");
        Book book1 = new Book();  // Calls default constructor
        book1.display();
        
        // 2. PARAMETERIZED CONSTRUCTOR
        System.out.println("\n2. Parameterized Constructor:");
        System.out.print("Enter title: ");
        String title = sc.nextLine();
        System.out.print("Enter author: ");
        String author = sc.nextLine();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        sc.nextLine(); // consume newline
        
        Book book2 = new Book(title, author, price);  // Calls parameterized
        book2.display();
        
        // 3. COPY CONSTRUCTOR
        System.out.println("\n3. Copy Constructor:");
        Book book3 = new Book(book2);  // Copies book2
        book3.display();
        
        // Modify copy to show independent objects
        book3.price = 25.99;
        System.out.println("\nAfter modifying copy:");
        System.out.println("Original price: $" + book2.getPrice());
        System.out.println("Copy price: $" + book3.getPrice());
        
        sc.close();
    }
}


*/



/*
import java.util.Scanner;

// Class demonstrating all constructor types
class Book {
    private String title;
    private String author;
    private double price;
    
    // 1. DEFAULT CONSTRUCTOR (no parameters)
    public Book() {
        this.title = "Unknown";
        this.author = "Anonymous";
        this.price = 0.0;
        System.out.println("Default constructor called");
    }
    
    // 2. PARAMETERIZED CONSTRUCTOR
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println("Parameterized constructor called");
    }
    
    // 3. COPY CONSTRUCTOR
    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
        System.out.println("Copy constructor called");
    }
    
    // Display method
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("---");
    }
    
    // Getters for copy constructor
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public double getPrice() { return price; }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. DEFAULT CONSTRUCTOR
        System.out.println("1. Default Constructor:");
        Book book1 = new Book();  // Calls default constructor
        book1.display();
        
        // 2. PARAMETERIZED CONSTRUCTOR
        System.out.println("\n2. Parameterized Constructor:");  // Fixed: \n
        System.out.print("Enter title: ");
        String title = sc.nextLine();
        System.out.print("Enter author: ");
        String author = sc.nextLine();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        sc.nextLine(); // consume newline
        
        Book book2 = new Book(title, author, price);  // Calls parameterized
        book2.display();
        
        // 3. COPY CONSTRUCTOR
        System.out.println("\n3. Copy Constructor:");  // Fixed: \n
        Book book3 = new Book(book2);  // Copies book2
        book3.display();
        
        // Modify copy to show independent objects
        book3.price = 25.99;
        System.out.println("\nAfter modifying copy:");  // Fixed: \n
        System.out.println("Original price: $" + book2.getPrice());
        System.out.println("Copy price: $" + book3.getPrice());
        
        sc.close();
    }
}

*/



import java.util.Scanner;

class Book {
    private String title;
    private String author;
    private double price;
    
    // 1. DEFAULT CONSTRUCTOR
    public Book() {
        this.title = "Unknown";
        this.author = "Anonymous";
        this.price = 0.0;
        System.out.println("Default constructor called");
    }
    
    // 2. PARAMETERIZED CONSTRUCTOR
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
        System.out.println("Parameterized constructor called");
    }
    
    // 3. COPY CONSTRUCTOR
    public Book(Book other) {
        this.title = other.title;
        this.author = other.author;
        this.price = other.price;
        System.out.println("Copy constructor called");
    }
    
    // Display method
    public void display() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: $" + price);
        System.out.println("---");
    }
    
    // GETTERS
    public String getTitle() { return title; }
    public String getAuthor() { return author; }
    public double getPrice() { return price; }
    
    // ADD SETTER (Fix for private access error)
    public void setPrice(double price) {
        this.price = price;
    }
}

public class ConstructorDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 1. DEFAULT CONSTRUCTOR
        System.out.println("1. Default Constructor:");
        Book book1 = new Book();
        book1.display();
        
        // 2. PARAMETERIZED CONSTRUCTOR
        System.out.println("\n2. Parameterized Constructor:");
        System.out.print("Enter title: ");
        String title = sc.nextLine();
        System.out.print("Enter author: ");
        String author = sc.nextLine();
        System.out.print("Enter price: ");
        double price = sc.nextDouble();
        sc.nextLine();
        
        Book book2 = new Book(title, author, price);
        book2.display();
        
        // 3. COPY CONSTRUCTOR
        System.out.println("\n3. Copy Constructor:");
        Book book3 = new Book(book2);
        book3.display();
        
        // FIXED: Use setter instead of direct access
        book3.setPrice(25.99);
        System.out.println("\nAfter modifying copy:");
        System.out.println("Original price: $" + book2.getPrice());
        System.out.println("Copy price: $" + book3.getPrice());
        
        sc.close();
    }
}











/*


## Sample Output
```
1. Default Constructor:
Default constructor called
Title: Unknown
Author: Anonymous
Price: $0.0
---

2. Parameterized Constructor:
Enter title: Java Programming
Enter author: John Doe
Enter price: 29.99
Parameterized constructor called
Title: Java Programming
Author: John Doe
Price: $29.99
---

3. Copy Constructor:
Copy constructor called
Title: Java Programming
Author: John Doe
Price: $29.99
---

After modifying copy:
Original price: $29.99
Copy price: $25.99
```

## Constructor Types Explained

| Type | Syntax | Purpose |
|------|--------|---------|
| **Default** | `Book()` | Provides default values when no args passed |
| **Parameterized** | `Book(String t, String a, double p)` | Initialize with specific values |
| **Copy** | `Book(Book other)` | Creates duplicate of existing object |

## Key Points
- **Default**: Java provides automatically if no constructors exist
- **Parameterized**: Must define manually, disables default
- **Copy**: Takes same class object as parameter
- Each object maintains separate state despite copy constructor
- Constructor name = class name, no return type

*/