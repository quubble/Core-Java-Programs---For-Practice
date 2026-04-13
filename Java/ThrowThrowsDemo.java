//Here's a **complete working Java program** using **BOTH `throw` and `throws`** with user input validation.

//## Complete Working Program



import java.util.Scanner;

public class ThrowThrowsDemo {
    
    // Method using THROWS (declares it might throw exceptions)
    public static void validateAndProcess(int age, int salary) 
            throws IllegalArgumentException, ArithmeticException {
        
        // Using THROW to manually throw exception
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Invalid age: " + age + " (must be 0-120)");
        }
        
        if (salary <= 0) {
            throw new ArithmeticException("Salary cannot be zero or negative: " + salary);
        }
        
        double tax = calculateTax(salary);
        System.out.println("Age: " + age + ", Salary: $" + salary + ", Tax: $" + tax);
    }
    
    // Another method with throws
    public static double calculateTax(int salary) throws ArithmeticException {
        if (salary <= 0) {
            throw new ArithmeticException("Cannot calculate tax on invalid salary");
        }
        return salary * 0.3;  // 30% tax
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("=== THROW + THROWS DEMO ===");
        
        try {
            System.out.print("Enter age: ");
            int age = sc.nextInt();
            
            System.out.print("Enter salary: ");
            int salary = sc.nextInt();
            
            // Calls method with throws - must handle or declare
            validateAndProcess(age, salary);
            
        } catch (IllegalArgumentException e) {
            System.out.println("❌ VALIDATION ERROR: " + e.getMessage());
        } catch (ArithmeticException e) {
            System.out.println("❌ MATH ERROR: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("❌ GENERAL ERROR: " + e.getMessage());
        }
        
        System.out.println("\n=== SECOND TEST (VALID INPUT) ===");
        try {
            validateAndProcess(25, 50000);  // Valid input
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        
        sc.close();
    }
}


/*

## Sample Output
```
=== THROW + THROWS DEMO ===
Enter age: -5
Enter salary: 30000
❌ VALIDATION ERROR: Invalid age: -5 (must be 0-120)

=== SECOND TEST (VALID INPUT) ===
Age: 25, Salary: $50000, Tax: $15000.0
```

## **How It Works Together**
```
1. validateAndProcess() uses THROWS = "I might throw these exceptions"
2. Inside method, THROW creates and throws actual exception
3. main() CATCHES exceptions declared by throws
```

## **Perfect Flow**
```
main() calls → validateAndProcess() [throws]
               ↓
          Bad input? → throw Exception  [throw]
               ↓
            main() catches → Handles error gracefully
```

## **Key Points**
- **`throws`** in method signature = **Warning** to caller
- **`throw`** inside method = **Action** of throwing exception
- **Caller must handle** (try-catch) or **declare throws**

**✅ 100% Compiles & Runs Perfectly** 🟢

**Real-world**: Bank won't accept negative balance (`throw`) + API warns it might fail (`throws`)!

*/