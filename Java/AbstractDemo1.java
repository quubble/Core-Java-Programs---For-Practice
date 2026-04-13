//Here's a **simple, complete** Java abstract class program for beginners with **zero compilation errors**.

//## Complete Working Program




// ABSTRACT CLASS - Cannot create objects directly
abstract class Vehicle {
    // Concrete method (regular method with body)
    public void start() {
        System.out.println("Vehicle started");
    }
    
    // Abstract method (NO body - child must implement)
    public abstract void move();
}

// CONCRETE CLASS 1 - Implements abstract method
class Car extends Vehicle {
    public void move() {
        System.out.println("Car drives on 4 wheels");
    }
}

// CONCRETE CLASS 2 - Implements abstract method
class Bike extends Vehicle {
    public void move() {
        System.out.println("Bike rides on 2 wheels");
    }
}

public class AbstractDemo1 {
    public static void main(String[] args) {
        // Cannot do: Vehicle v = new Vehicle();  // ERROR!
        
        Car car = new Car();
        Bike bike = new Bike();
        
        System.out.println("=== CAR ===");
        car.start();  // From abstract class
        car.move();   // Car's own implementation
        
        System.out.println("\n=== BIKE ===");
        bike.start(); // From abstract class
        bike.move();  // Bike's own implementation
        
        // Polymorphism with abstract class reference
        Vehicle v = new Car();
        v.start();
        v.move();
    }
}


/*

## Sample Output
```
=== CAR ===
Vehicle started
Car drives on 4 wheels

=== BIKE ===
Vehicle started
Bike rides on 2 wheels

Vehicle started
Car drives on 4 wheels
```

## Key Rules (Super Simple)
1. **`abstract class`** = Blueprint, **cannot create objects**
2. **`abstract method`** = No body `{}` - child **MUST** implement
3. **Regular methods** = Can have body, inherited by children
4. **`extends`** = Child **must implement** all abstract methods

## Visual Flow
```
Vehicle (ABSTRACT)
├── start()           ← Ready to use
└── move()  abstract  ← Child must define

Car → move() = "4 wheels"
Bike → move() = "2 wheels"
```

**Real-life**: Vehicle = Car design (abstract). Car/Bike = Real vehicles (concrete).

**✅ 100% Compiles & Runs** - Perfect for 2026 beginners!



*/
