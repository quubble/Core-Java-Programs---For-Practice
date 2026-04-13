//Here's a **simple, complete** Java **interface** program for beginners with **zero compilation errors**.
// ## Complete Working Program




// INTERFACE - 100% abstract contract
interface Animal {
    // All methods are public abstract by default (no body)
    void eat();
    void sleep();
    
    // Constant (public static final by default)
    int MAX_AGE = 15;
}

// Multiple classes implement interface
class Dog implements Animal {
    public void eat() {
        System.out.println("Dog eats bones");
    }
    
    public void sleep() {
        System.out.println("Dog sleeps at night");
    }
}

class Cat implements Animal {
    public void eat() {
        System.out.println("Cat eats fish");
    }
    
    public void sleep() {
        System.out.println("Cat sleeps 16 hours");
    }
}

public class InterfaceDemo {
    public static void main(String[] args) {
        // Cannot create interface objects directly
        // Animal a = new Animal();  // ERROR!
        
        Dog dog = new Dog();
        Cat cat = new Cat();
        
        System.out.println("=== DOG ===");
        dog.eat();
        dog.sleep();
        System.out.println("Max age: " + Animal.MAX_AGE);
        
        System.out.println("\n=== CAT ===");
        cat.eat();
        cat.sleep();
        
        // Polymorphism with interface reference
        Animal pet = new Dog();
        pet.eat();
        pet.sleep();
    }
}



/*
## Sample Output
```
=== DOG ===
Dog eats bones
Dog sleeps at night
Max age: 15

=== CAT ===
Cat eats fish
Cat sleeps 16 hours

Dog eats bones
Dog sleeps at night
```
## Interface vs Abstract Class (Simple)
| Feature | **Interface** | **Abstract Class** |
|---------|---------------|-------------------|
| Methods | 100% abstract | Mix concrete + abstract |
| Variables | Only constants | Regular variables |
| Keyword | `implements` | `extends` |
| Multiple | ✅ YES | ❌ NO |
| Objects | ❌ Cannot create | ❌ Cannot create |
## Key Rules
1. **`interface`** = Contract (what to do, not how)
2. **`implements`** = Class promises to follow contract
3. **All methods** = `public abstract` by default
4. **All variables** = `public static final` by default
5. **Multiple interfaces** possible (`implements A, B`)
## Real-Life Analogy
```
Interface = Job description (must do these tasks)
Dog/Cat = Employees (each does tasks their way)
```

**✅ 100% Compiles & Runs Perfectly** 🟢

**Abstract Class** = Partial recipe (some steps given)
**Interface** = Complete recipe checklist (you fill all steps)

*/