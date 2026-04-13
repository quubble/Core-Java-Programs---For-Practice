//Here's a **simple, complete** Java **encapsulation** demo with **getters & setters** for beginners.

//## Complete Working Program




class Student {
    // PRIVATE fields - Data hiding (encapsulation)
    private String name;
    private int age;
    private double gpa;
    
    // DEFAULT CONSTRUCTOR
    public Student() {
        this.name = "Unknown";
        this.age = 0;
        this.gpa = 0.0;
    }
    
    // PARAMETERIZED CONSTRUCTOR
    public Student(String name, int age, double gpa) {
        this.setName(name);     // Use setter (with validation)
        this.setAge(age);       // Use setter (with validation)
        this.setGpa(gpa);       // Use setter (with validation)
    }
    
    // GETTER METHODS - Read data
    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
    
    public double getGpa() {
        return gpa;
    }
    
    // SETTER METHODS - Write data (with validation)
    public void setName(String name) {
        if (name != null && !name.trim().isEmpty()) {
            this.name = name;
        } else {
            this.name = "Invalid Name";
        }
    }
    
    public void setAge(int age) {
        if (age >= 0 && age <= 150) {
            this.age = age;
        } else {
            this.age = 0;
            System.out.println("Invalid age!");
        }
    }
    
    public void setGpa(double gpa) {
        if (gpa >= 0.0 && gpa <= 4.0) {
            this.gpa = gpa;
        } else {
            this.gpa = 0.0;
            System.out.println("Invalid GPA!");
        }
    }
    
    // Display method
    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpa);
        System.out.println("---");
    }
}

public class EncapsulationDemo {
    public static void main(String[] args) {
        // Create objects
        Student s1 = new Student();
        Student s2 = new Student("Alice", 20, 3.8);
        
        System.out.println("=== ORIGINAL STUDENT 1 ===");
        s1.display();
        
        System.out.println("=== ORIGINAL STUDENT 2 ===");
        s2.display();
        
        System.out.println("\n=== TESTING SETTERS (VALID) ===");
        s1.setName("Bob");
        s1.setAge(22);
        s1.setGpa(3.5);
        s1.display();
        
        System.out.println("\n=== TESTING SETTERS (INVALID) ===");
        s1.setAge(-5);    // Invalid age
        s1.setGpa(5.0);   // Invalid GPA
        s1.display();
        
        System.out.println("\n=== USING GETTERS ===");
        System.out.println("Name: " + s1.getName());
        System.out.println("Age: " + s1.getAge());
        System.out.println("GPA: " + s1.getGpa());
    }
}

/*

## Sample Output
```
=== ORIGINAL STUDENT 1 ===
Name: Unknown
Age: 0
GPA: 0.0
---
=== ORIGINAL STUDENT 2 ===
Name: Alice
Age: 20
GPA: 3.8
---

=== TESTING SETTERS (VALID) ===
Name: Bob
Age: 22
GPA: 3.5
---

=== TESTING SETTERS (INVALID) ===
Invalid age!
Invalid GPA!
Name: Bob
Age: 0
GPA: 0.0
---

=== USING GETTERS ===
Name: Bob
Age: 0
GPA: 0.0
```

## Encapsulation Rules (Super Simple)
```
1. PRIVATE fields = Hide data
2. PUBLIC getters = Read data safely  
3. PUBLIC setters = Write data with validation
4. NO direct access = person.age = -5  ❌ ERROR!
```

## Visual Flow
```
Outside World     Student Class
     |                 |
   getName()  ----->  name (private)
   setAge(25)  <-----  age (private) + validation
```

**Key Benefits:**
- **Data Protection** - Invalid data blocked
- **Controlled Access** - Only through methods
- **Easy Maintenance** - Change logic in one place

**✅ 100% Compiles & Runs Perfectly** 🟢

*/