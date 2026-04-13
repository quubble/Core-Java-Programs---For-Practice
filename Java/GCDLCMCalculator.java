/*Here's a Java program to find **GCD** (Greatest Common Divisor) and **LCM** (Least Common Multiple) of two numbers using separate functions and user input.

## Complete GCD & LCM Program

*/

import java.util.Scanner;

public class GCDLCMCalculator {
    
    // GCD using Euclidean Algorithm (Recursive)
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    
    // LCM using formula: LCM(a, b) = (a * b) / GCD(a, b)
    public static long lcm(int a, int b) {
        return Math.abs((long) a * b) / gcd(a, b);
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = sc.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = sc.nextInt();
        
        // Input validation
        if (num1 <= 0 || num2 <= 0) {
            System.out.println("Please enter positive integers only!");
            sc.close();
            return;
        }
        
        // Calculate GCD and LCM
        int gcdResult = gcd(num1, num2);
        long lcmResult = lcm(num1, num2);
        
        // Display results
        System.out.println("\n=== GCD & LCM RESULTS ===");
        System.out.printf("GCD(%d, %d) = %d%n", num1, num2, gcdResult);
        System.out.printf("LCM(%d, %d) = %d%n", num1, num2, lcmResult);
        
        sc.close();
    }
}


/*
## How It Works

**GCD Function (Euclidean Algorithm):**
```
gcd(48, 18):
48 % 18 = 12 → gcd(18, 12)
18 % 12 = 6  → gcd(12, 6) 
12 % 6  = 0  → gcd(6, 0) = 6 ✓
```

**LCM Formula:**
```
LCM(a, b) = |a × b| / GCD(a, b)
LCM(48, 18) = (48 × 18) / 6 = 144
```

## Sample Output

```
Enter first number: 48
Enter second number: 18

=== GCD & LCM RESULTS ===
GCD(48, 18) = 6
LCM(48, 18) = 144

Enter first number: 15
Enter second number: 25

=== GCD & LCM RESULTS ===
GCD(15, 25) = 5
LCM(15, 25) = 75
```

## Key Features

- **Euclidean Algorithm**: Efficient recursive GCD calculation
- **Overflow Protection**: Uses `long` for LCM calculation
- **Input Validation**: Checks for positive integers
- **Absolute Value**: Handles negative numbers safely with `Math.abs()`

**Compile & Run:** `javac GCDLCMCalculator.java` then `java GCDLCMCalculator` [geeksforgeeks](https://www.geeksforgeeks.org/java/java-program-to-find-gcd-and-lcm-of-two-numbers-using-euclids-algorithm/


*/