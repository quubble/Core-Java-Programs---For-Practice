//Java classes define blueprints for objects, while objects are runtime instances with state (fields) and behavior (methods). Here's a complete working demo program.

//## Complete Demo Program



import java.util.Scanner;

// 1. Define a Student CLASS (blueprint)
class Student {
    // Fields (state/attributes)
    private String name;
    private int age;
    private double grade;
    
    // Constructor (initializes object)
    public Student(String name, int age, double grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
    
    // Methods (behavior)
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age + ", Grade: " + grade);
    }
    
    public void updateGrade(double newGrade) {
        this.grade = newGrade;
        System.out.println(name + "'s new grade: " + grade);
    }
    
    public String getName() {
        return name;
    }
}

// Main class to create and use objects
public class ClassObjectDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // 2. Create OBJECTS (instances of Student class)
        Student student1 = new Student("Alice", 20, 85.5);
        Student student2 = new Student("Bob", 22, 92.0);
        
        // 3. Use objects - call methods
        System.out.println("=== Student Information ===");
        student1.displayInfo();
        student2.displayInfo();
        
        // Update object state
        System.out.print("\nEnter new grade for " + student1.getName() + ": ");
        double newGrade = sc.nextDouble();
        student1.updateGrade(newGrade);
        
        // Demonstrate multiple objects have separate state
        System.out.println("\nBob's grade unchanged: ");
        student2.displayInfo();
        
        sc.close();
    }
}

/*

## Sample Output
```
=== Student Information ===
Name: Alice, Age: 20, Grade: 85.5
Name: Bob, Age: 22, Grade: 92.0

Enter new grade for Alice: 88.0
Alice's new grade: 88.0

Bob's grade unchanged: 
Name: Bob, Age: 22, Grade: 92.0
```

## Key Concepts Explained

**Class vs Object:**
- **Class** = Blueprint/Template (Student defines what all students have)
- **Object** = Actual instance (student1, student2 are real students)

**Key Components:**
1. **Fields** store data (`name`, `age`, `grade`)
2. **Constructor** initializes object (`new Student(...)`)
3. **Methods** define behavior (`displayInfo()`, `updateGrade()`)

**Important Points:**
- Each object has its own copy of fields (student1.grade ≠ student2.grade)
- `this` refers to current object
- `private` fields + `public` methods = encapsulation [datacamp](https://www.datacamp.com/doc/java/classes-and-objects)

**Real-world Analogy:** 
Class `Car` is like a car design. Objects `myCar`, `yourCar` are actual cars built from that design. Each has its own color, speed, etc.

*/

