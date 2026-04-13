/*Here is a simple **Java program** that demonstrates how to design a class using **abstract methods** and an **abstract class**. [w3schools](https://www.w3schools.com/java/java_abstract.asp)

### Example: Shape abstract class

*/

// Abstract class
abstract class Shape {
    // Abstract methods (no body)
    abstract void draw();        // must be implemented by subclasses
    abstract double calculateArea();

    // Concrete (non‑abstract) method
    void displayInfo() {
        System.out.println("This is a shape.");
    }
}

// Subclass 1: Rectangle
class Rectangle extends Shape {
    private double length, width;

    public Rectangle(double length, double width) {
        this.length = length;
        this.width = width;
    }

    // Implementing abstract method draw()
    void draw() {
        System.out.println("Drawing a rectangle.");
    }

    // Implementing abstract method calculateArea()
    double calculateArea() {
        return length * width;
    }
}

// Subclass 2: Circle
class Circle extends Shape {
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }

    // Implementing abstract method draw()
    void draw() {
        System.out.println("Drawing a circle.");
    }

    // Implementing abstract method calculateArea()
    double calculateArea() {
        return 3.14 * radius * radius;
    }
}

// Main class to test
public class AbstractDemo {
    public static void main(String[] args) {
        Rectangle rect = new Rectangle(5.0, 3.0);
        Circle circ = new Circle(4.0);

        rect.displayInfo();
        rect.draw();
        System.out.println("Area of rectangle = " + rect.calculateArea());

        System.out.println();  // blank line

        circ.displayInfo();
        circ.draw();
        System.out.println("Area of circle = " + circ.calculateArea());
    }
}

/*

### Key points

- Use the `abstract` keyword to define an **abstract class** (`abstract class Shape`) and **abstract methods** (`abstract void draw();`). [geeksforgeeks](https://www.geeksforgeeks.org/java/abstract-methods-in-java-with-examples/)
- Abstract classes **cannot be instantiated** directly; you must create objects of the **concrete subclasses** that override all abstract methods. [baeldung](https://www.baeldung.com/java-abstract-class)
- Abstract classes can mix **abstract methods** and **concrete methods** (with bodies) as shown with `displayInfo()`. [geeksforgeeks](https://www.geeksforgeeks.org/java/abstract-classes-in-java/)

Copy this code into a file `AbstractDemo.java`, compile with `javac AbstractDemo.java`, then run with `java AbstractDemo`. [programiz](https://www.programiz.com/java-programming/abstract-classes-methods)

*/
