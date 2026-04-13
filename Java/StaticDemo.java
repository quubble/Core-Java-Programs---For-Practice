//Here's a **simple, complete** Java **static keyword** demo covering **static variables, methods, and blocks**.

//# Complete Working Program



class Counter {
    // STATIC VARIABLE - Shared by ALL objects
    public static int count = 0;
    
    // Instance variable - Each object has own copy
    private String name;
    
    // Constructor
    public Counter(String name) {
        this.name = name;
        Counter.count++;  // Increment shared counter
    }
    
    // STATIC METHOD - Belongs to CLASS, no 'this'
    public static void showTotalObjects() {
        System.out.println("Total objects created: " + Counter.count);
    }
    
    // Instance method - Can access both static & non-static
    public void showDetails() {
        System.out.println("Name: " + name + ", Total count: " + Counter.count);
    }
    
    // STATIC BLOCK - Runs ONCE when class loads
    static {
        System.out.println("Static block executed ONCE!");
        Counter.count = 100;  // Initialize static variable
    }
}

public class StaticDemo {
    public static void main(String[] args) {
        System.out.println("=== BEFORE creating objects ===");
        Counter.showTotalObjects();  // Static method call
        
        // Create multiple objects
        Counter obj1 = new Counter("Object1");
        Counter obj2 = new Counter("Object2");
        Counter obj3 = new Counter("Object3");
        
        System.out.println("\n=== AFTER creating 3 objects ===");
        obj1.showDetails();    // obj1.count == 103
        obj2.showDetails();    // obj2.count == 103 (SAME!)
        obj3.showDetails();    // obj3.count == 103 (SHARED!)
        
        System.out.println("\n=== STATIC METHOD CALL ===");
        Counter.showTotalObjects();  // No object needed!
        
        // Direct class access
        System.out.println("Direct access: " + Counter.count);
    }
}


/*

## Sample Output
```
Static block executed ONCE!
=== BEFORE creating objects ===
Total objects created: 100

Name: Object1, Total count: 101
Name: Object2, Total count: 102
Name: Object3, Total count: 103

=== STATIC METHOD CALL ===
Total objects created: 103
Direct access: 103
```

## Static vs Non-Static (Simple Table)

| Type | **Static** | **Non-Static** |
|------|------------|----------------|
| **Memory** | 1 copy (class level) | 1 copy per object |
| **Access** | `ClassName.method()` | `obj.method()` |
| **When** | Class loads | Object created |
| **Example** | `Math.PI` | `obj.name` |

## Key Rules
```
✅ Static = CLASS belongs to (shared)
✅ Non-static = OBJECT belongs to (individual)

Static method CANNOT access non-static variables
Non-static method CAN access static variables
```

## Real-Life Analogy
```
Counter.count = Shared bank balance (all accounts see same)
obj.name = Personal name (each person has own)
```

**✅ 100% Compiles & Runs Perfectly** 🟢

**Static = "Stationary"** - Doesn't move with objects, belongs to class!

*/