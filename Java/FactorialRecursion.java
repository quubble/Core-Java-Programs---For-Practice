/*Here's a Java program to calculate factorial using **recursion** with user input.

## Complete Factorial Program (Recursion)

*/


import java.util.Scanner;

public class FactorialRecursion {
    
    // Recursive function to calculate factorial
    public static long factorial(int n) {
        // Base case: factorial of 0 and 1 is 1
        if (n == 0 || n == 1) {
            return 1;
        }
        // Recursive case: n * factorial(n-1)
        return n * factorial(n - 1);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a non-negative integer: ");
        int number = sc.nextInt();
        
        // Input validation
        if (number < 0) {
            System.out.println("Error: Factorial is not defined for negative numbers!");
        } else if (number > 20) {
            System.out.println("Error: Number too large! (Use smaller number ≤ 20)");
        } else {
            long result = factorial(number);
            System.out.printf("Factorial of %d = %d\n", number, result);
        }
        
        sc.close();
    }
}


/*
## How Recursion Works (Step-by-Step)

**For `factorial(5)`:**
```
factorial(5) = 5 * factorial(4)
             = 5 * (4 * factorial(3))
             = 5 * 4 * (3 * factorial(2))
             = 5 * 4 * 3 * (2 * factorial(1))
             = 5 * 4 * 3 * 2 * 1 = 120
```

**Call Stack:**
```
factorial(5) calls → factorial(4)
factorial(4) calls → factorial(3) 
factorial(3) calls → factorial(2)
factorial(2) calls → factorial(1)
factorial(1) returns 1 (BASE CASE - stops recursion)
```

## Sample Output

```
Enter a non-negative integer: 5
Factorial of 5 = 120

Enter a non-negative integer: 0
Factorial of 0 = 1

Enter a non-negative integer: -3
Error: Factorial is not defined for negative numbers!
```

## Key Points

- **Base Case** (`n == 0 || n == 1`): Stops infinite recursion
- **Recursive Case**: `n * factorial(n-1)` calls itself with smaller input
- **`long`** return type handles larger factorials (up to 20!)
- **Input validation** prevents errors and stack overflow

**Compile & Run:** `javac FactorialRecursion.java` then `java FactorialRecursion`


*/
