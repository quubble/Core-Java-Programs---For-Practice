/*Here's a Java program demonstrating **inheritance** with `super` and `this` keywords to calculate area and perimeter of **Rectangle** (parent) and **Box** (child).

## Complete Inheritance Program
*/


import java.util.Scanner;

class Rectangle {
    protected int length, breadth;  // Protected for child class access
    
    // Constructor using 'this' keyword
    public Rectangle(int length, int breadth) {
        this.length = length;     // 'this' refers to current class instance
        this.breadth = breadth;
    }
    
    // Rectangle area
    public int area() {
        return length * breadth;
    }
    
    // Rectangle perimeter
    public int perimeter() {
        return 2 * (length + breadth);
    }
}

class Box extends Rectangle {
    private int height;
    
    // Constructor using 'super' to call parent constructor
    public Box(int length, int breadth, int height) {
        super(length, breadth);   // 'super' calls Rectangle constructor
        this.height = height;     // 'this' refers to Box class variable
    }
    
    // Box surface area = 2(l*b + b*h + h*l)
    public int surfaceArea() {
        return 2 * (length * breadth + breadth * height + height * length);
    }
    
    // Box volume
    public int volume() {
        return length * breadth * height;
    }
    
    // Override rectangle perimeter for box edges
    @Override
    public int perimeter() {
        return 4 * (length + breadth + height);  // Box edge length
    }
}

public class ShapeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Rectangle input
        System.out.print("Enter Rectangle Length & Breadth: ");
        int l1 = sc.nextInt(), b1 = sc.nextInt();
        Rectangle rect = new Rectangle(l1, b1);
        
        // Box input  
        System.out.print("Enter Box Length, Breadth & Height: ");
        int l2 = sc.nextInt(), b2 = sc.nextInt(), h = sc.nextInt();
        Box box = new Box(l2, b2, h);
        
        // Display Rectangle results
        System.out.println("\n=== RECTANGLE ===");
        System.out.printf("Area: %d sq units%n", rect.area());
        System.out.printf("Perimeter: %d units%n", rect.perimeter());
        
        // Display Box results
        System.out.println("\n=== BOX (3D RECTANGLE) ===");
        System.out.printf("Surface Area: %d sq units%n", box.surfaceArea());
        System.out.printf("Volume: %d cubic units%n", box.volume());
        System.out.printf("Edge Perimeter: %d units%n", box.perimeter());
        
        sc.close();
    }
}

/*

## Sample Output

```
Enter Rectangle Length & Breadth: 10 5
Enter Box Length, Breadth & Height: 4 3 2

=== RECTANGLE ===
Area: 50 sq units
Perimeter: 30 units

=== BOX (3D RECTANGLE) ===
Surface Area: 52 sq units
Volume: 24 cubic units
Edge Perimeter: 36 units
```

## Keyword Usage Explained

**`this` keyword:**
- `this.length = length` distinguishes instance variable from parameter
- Refers to **current object**

**`super` keyword:**
- `super(length, breadth)` calls **parent class constructor**
- Required when parent constructor has parameters

**Inheritance Benefits:**
- Box **inherits** `length`, `breadth`, `area()`, `perimeter()` from Rectangle
- **Code reuse** + **extends functionality** (adds height, volume)

**Compile & Run:** Save as `ShapeDemo.java`, then `javac ShapeDemo.java` and `java ShapeDemo` [scribd](https://www.scribd.com/document/891443234/DiplomaPracticalFileJava)

*/