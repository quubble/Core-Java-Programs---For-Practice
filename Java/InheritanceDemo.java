//Here's a **simple, beginner-friendly** Java program demonstrating **single, multilevel, and hierarchical inheritance** with **zero compilation errors**.

// ## Complete Working Program (Copy-Paste Ready)



// SINGLE INHERITANCE: Animal -> Dog
class Animal {
    public void eat() {
        System.out.println("Animal eats food");
    }
}

class Dog extends Animal {
    public void bark() {
        System.out.println("Dog barks");
    }
}

// MULTILEVEL INHERITANCE: Animal -> Dog -> BabyDog
class BabyDog extends Dog {
    public void weep() {
        System.out.println("BabyDog cries");
    }
}

// HIERARCHICAL INHERITANCE: Animal -> Dog, Cat (multiple children)
class Cat extends Animal {
    public void meow() {
        System.out.println("Cat meows");
    }
}

public class InheritanceDemo {
    public static void main(String[] args) {
        System.out.println("=== SINGLE INHERITANCE ===");
        Dog d1 = new Dog();
        d1.eat();  // Inherited from Animal
        d1.bark(); // Own method
        
        System.out.println("\n=== MULTILEVEL INHERITANCE ===");
        BabyDog b1 = new BabyDog();
        b1.eat();  // Grandparent (Animal)
        b1.bark(); // Parent (Dog)
        b1.weep(); // Own (BabyDog)
        
        System.out.println("\n=== HIERARCHICAL INHERITANCE ===");
        Dog d2 = new Dog();
        Cat c1 = new Cat();
        d2.eat();  // Both inherit from same Animal
        c1.eat();
        d2.bark();
        c1.meow();
    }
}



/*

## Sample Output
```
=== SINGLE INHERITANCE ===
Animal eats food
Dog barks

=== MULTILEVEL INHERITANCE ===
Animal eats food
Dog barks
BabyDog cries

=== HIERARCHICAL INHERITANCE ===
Animal eats food
Animal eats food
Dog barks
Cat meows
```

## Simple Visual Explanation

```
SINGLE:        Animal
                |
              Dog

MULTILEVEL:    Animal
                |
               Dog
                |
             BabyDog

HIERARCHICAL:  Animal
              /     \
             Dog    Cat
```

## Beginner Key Points (2026 Style)
- **`extends`** = "I inherit everything from parent"
- **Single**: 1 parent → 1 child
- **Multilevel**: Chain (grandparent → parent → child)
- **Hierarchical**: 1 parent → many children
- Child **automatically gets** all parent methods
- No `super`, no complexity - pure basics!

**100% Guaranteed to compile & run** 🟢

## Real-Life Analogy
```
Animal = Grandfather (can eat)
Dog = Father (can eat + bark)  
BabyDog = You (can eat + bark + cry)
Cat = Cousin (can eat + meow)


*/
