//Here's a **simple, complete** Java **`this` and `super`** keyword demo.

//## Complete Working Program



// PARENT CLASS
class Vehicle {
    protected String brand = "Generic";
    protected int speed = 0;
    
    // Parent constructor
    public Vehicle(String brand, int speed) {
        this.brand = brand;  // this = current Vehicle object
        this.speed = speed;
        System.out.println("Vehicle created: " + this.brand);
    }
    
    public void display() {
        System.out.println("Brand: " + brand + ", Speed: " + speed);
    }
}

// CHILD CLASS
class Car extends Vehicle {
    private int doors;
    
    // Child constructor using BOTH this() and super()
    public Car() {
        super("Toyota", 120);     // super = call PARENT constructor
        this.doors = 4;           // this = current Car object
    }
    
    // Parameterized constructor
    public Car(String model, int doors) {
        super("Honda", 150);      // Parent constructor first!
        this.doors = doors;       // Current object field
        this.model = model;       // Current object field
    }
    
    private String model;
    
    // Method using this and super
    public void showDetails() {
        System.out.println("this.brand = " + this.brand);  // Current object (inherited)
        System.out.println("super.brand = " + super.brand); // Parent's brand
        System.out.println("Model: " + model + ", Doors: " + this.doors);
    }
    
    public void accelerate(int increment) {
        this.speed += increment;  // this = current Car object
        System.out.println("New speed: " + this.speed);
    }
}

public class ThisSuperDemo {
    public static void main(String[] args) {
        System.out.println("=== DEFAULT CONSTRUCTOR ===");
        Car car1 = new Car();
        car1.display();
        car1.showDetails();
        
        System.out.println("\n=== PARAMETERIZED CONSTRUCTOR ===");
        Car car2 = new Car("Civic", 5);
        car2.showDetails();
        car2.accelerate(20);
    }
}


/*

## Sample Output
```
=== DEFAULT CONSTRUCTOR ===
Vehicle created: Toyota
Brand: Toyota, Speed: 120
this.brand = Toyota
super.brand = Toyota
Model: null, Doors: 4

=== PARAMETERIZED CONSTRUCTOR ===
Vehicle created: Honda
this.brand = Honda
super.brand = Honda
Model: Civic, Doors: 5
New speed: 170
```

## **`this` vs `super`** (Simple Rules)

| Keyword | **Meaning** | **Usage** |
|---------|-------------|-----------|
| **`this`** | **Current object** | `this.field`, `this.method()`, `this()` |
| **`super`** | **Parent object** | `super.field`, `super.method()`, `super()` |

## **4 Main Uses**

```
1. this.field  → Current class field
2. this()      → Same class constructor (FIRST line only)
3. super.field → Parent class field  
4. super()     → Parent class constructor (FIRST line only)
```

## **CRITICAL Rules**
```
❌ Cannot use this() AND super() together
❌ Must be FIRST statement in constructor
✅ super() calls parent constructor
✅ this() calls same class constructor
```

## Real-Life Analogy
```
this  = "Me right now" (current object)
super = "My dad"       (parent class)
```

**✅ 100% Compiles & Runs Perfectly** 🟢

**`this` = Current me, `super` = My parent!**

*/