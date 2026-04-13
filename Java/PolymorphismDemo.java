//Here's a **simple, complete** Java **polymorphism** demo showing **runtime polymorphism** (method overriding).
//## Complete Working Program



// Parent class
class Animal {
    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class 1 - OVERRIDES parent method
class Dog extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Dog says: Woof!");
    }
}

// Child class 2 - OVERRIDES parent method
class Cat extends Animal {
    @Override
    public void makeSound() {
        System.out.println("Cat says: Meow!");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        // 1. Direct objects
        Animal animal = new Animal();
        Dog dog = new Dog();
        Cat cat = new Cat();
        
        animal.makeSound();  // Animal sound
        dog.makeSound();     // Dog sound
        cat.makeSound();     // Cat sound
        
        System.out.println("\n=== RUNTIME POLYMORPHISM === ");
        
        // 2. SAME reference type, DIFFERENT objects
        Animal pet1 = new Dog();  // Parent ref, Child object
        Animal pet2 = new Cat();  // Parent ref, Child object
        
        pet1.makeSound();  // Calls Dog's method (not Animal's!)
        pet2.makeSound();  // Calls Cat's method (not Animal's!)
        
        System.out.println("\n=== ARRAY POLYMORPHISM ===");
        Animal[] pets = {new Dog(), new Cat(), new Animal()};
        for (Animal pet : pets) {
            pet.makeSound();  // Calls correct overridden method
        }
    }
}


/* 
## Sample Output

Animal makes a sound
Dog says: Woof!
Cat says: Meow!

=== RUNTIME POLYMORPHISM === 
Dog says: Woof!
Cat says: Meow!

=== ARRAY POLYMORPHISM ===
Dog says: Woof!
Cat says: Meow!
Animal makes a sound
```
## Polymorphism Magic Explained
```
Animal pet = new Dog();  // Parent reference, Child object
pet.makeSound();         // Calls DOG's method at RUNTIME!


/*

## Key Points (Super Simple)
1. **Parent reference** can point to **child object**
2. **Runtime decision** - JVM calls correct child method
3. **One interface, many implementations**
4. **Array of parent type** holds mixed child objects
## Real-Life Analogy
```
Animal pet;           // Pet variable (general type)
pet = new Dog();      // Assign specific pet
pet.makeSound();      // Dog barks (not generic sound!)
```

**✅ 100% Compiles & Runs Perfectly** 🟢

**Polymorphism = "Many forms"** - Same method call, different behaviors!

*/