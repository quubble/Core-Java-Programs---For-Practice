//Here's a **complete working program** with **user-defined exception**, **`throw`**, **`catch`**, and **`finally`**.

//## Complete Working Program





import java.util.Scanner;

// 1. USER-DEFINED EXCEPTION CLASS
class InvalidAgeException extends Exception {
    public InvalidAgeException(String message) {
        super(message);
    }
}

class InsufficientSalaryException extends Exception {
    public InsufficientSalaryException(String message) {
        super(message);
    }
}

public class CustomExceptionDemo {
    
    // Method using THROWS with user-defined exceptions
    public static void validateEmployee(int age, double salary) 
            throws InvalidAgeException, InsufficientSalaryException {
        
        // THROW user-defined exception
        if (age < 18 || age > 65) {
            throw new InvalidAgeException("Age must be 18-65: " + age);
        }
        
        if (salary < 10000) {
            throw new InsufficientSalaryException("Salary too low: " + salary);
        }
        
        System.out.println("✅ Valid employee: Age=" + age + ", Salary=₹" + salary);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter employee age: ");
        int age = sc.nextInt();
        
        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();
        
        // TRY-CATCH-FINALLY with user-defined exceptions
        try {
            validateEmployee(age, salary);
        } 
        // CATCH user-defined exceptions
        catch (InvalidAgeException e) {
            System.out.println("❌ AGE ERROR: " + e.getMessage());
        }
        catch (InsufficientSalaryException e) {
            System.out.println("❌ SALARY ERROR: " + e.getMessage());
        }
        // General catch
        catch (Exception e) {
            System.out.println("❌ GENERAL ERROR: " + e.getMessage());
        }
        finally {
            System.out.println("🔄 FINALLY: Database connection closed");
            System.out.println("--- END ---");
        }
        
        sc.close();
    }
}



/*

## Sample Output 1 (Invalid Age)
```
Enter employee age: 15
Enter salary: 50000
❌ AGE ERROR: Age must be 18-65: 15
🔄 FINALLY: Database connection closed
--- END ---
```

## Sample Output 2 (Valid Input)
```
Enter employee age: 30
Enter salary: 25000
✅ Valid employee: Age=30, Salary=₹25000.0
🔄 FINALLY: Database connection closed
--- END ---
```

## **Complete Flow**
```
1. User-defined class extends Exception
2. Method throws custom exceptions  
3. throw creates exception object
4. try-catch handles specific exceptions
5. finally ALWAYS executes (cleanup)
```

## **User-Defined Exception Structure**
```java
class MyException extends Exception {
    public MyException(String msg) {
        super(msg);  // Pass message to parent
    }
}
```

**Key Benefits:**
- **Specific errors** - `InvalidAgeException` vs generic `Exception`
- **Clean code** - Separate catch blocks
- **Business logic** - Custom validation rules

**✅ 100% Compiles & Runs Perfectly** 🟢

**Real-world**: Bank `InsufficientBalanceException`, Login `InvalidCredentialsException`!

*/