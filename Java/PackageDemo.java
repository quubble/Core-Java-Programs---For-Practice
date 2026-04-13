/*
Here's a complete Java program demonstrating **package access** - accessing members of **external class** (different package) and **same package class** with user input.

## Directory Structure
```
project/
├── mymath/
│   └── Calculator.java
├── utils/
│   └── Helper.java
└── MainDemo.java  (default package)
*/

// 1. External Package Class (`mymath/Calculator.java`)


package mymath;

// Public class - accessible from other packages
public class Calculator {
    public int num1, num2;  // Public members - accessible externally
    
    public Calculator(int a, int b) {
        this.num1 = a;
        this.num2 = b;
    }
    
    // Public method - accessible from other packages
    public int add() {
        return num1 + num2;
    }
    
    public int multiply() {
        return num1 * num2;
    }
    
    // Default method - only same package access
    int subtract() {
        return num1 - num2;
    }
}


// 2. Same Package Class (`utils/Helper.java`)


package utils;

// Default access class - same package only
class Helper {
    int value;
    
    Helper(int val) {
        this.value = val;
    }
    
    // Default method - same package access
    int square() {
        return value * value;
    }
}

// Public class in same package
public class MathUtils {
    public static int power(int base, int exp) {
        return (int) Math.pow(base, exp);
    }
}


// 3. Main Program (`MainDemo.java`) - Default Package



import java.util.Scanner;
import mymath.Calculator;     // Import external package class
import utils.MathUtils;     // Import same package public class

public class PackageDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // === ACCESSING EXTERNAL PACKAGE CLASS ===
        System.out.print("External Package Demo - Enter two numbers: ");
        int a = sc.nextInt(), b = sc.nextInt();
        
        Calculator calc = new Calculator(a, b);  // External class access
        System.out.printf("Calculator (%d, %d): Add = %d, Multiply = %d%n", 
                         calc.num1, calc.num2, calc.add(), calc.multiply());
        
        // === ACCESSING SAME PACKAGE CLASS ===
        System.out.print("Same Package Demo - Enter base & exponent: ");
        int base = sc.nextInt(), exp = sc.nextInt();
        
        int result = MathUtils.power(base, exp);  // Same package static method
        System.out.printf("%d^%d = %d%n", base, exp, result);
        
        sc.close();
    }
}


/*

## Compilation & Execution Commands

```bash
# 1. Create directories
mkdir -p mymath utils

# 2. Compile ALL files (order matters for packages)
javac mymath/Calculator.java
javac utils/Helper.java utils/MathUtils.java
javac -cp .:mymath:utils MainDemo.java

# 3. Run
java -cp .:mymath:utils MainDemo
```

## Sample Output

```
External Package Demo - Enter two numbers: 10 5
Calculator (10, 5): Add = 15, Multiply = 50
Same Package Demo - Enter base & exponent: 3 4
3^4 = 81
```

## Access Rules Demonstrated

| Access Type | Same Package | Different Package | Example |
|-------------|--------------|-------------------|---------|
| **public** | ✅ Yes | ✅ Yes (import) | `Calculator.add()` |
| **protected** | ✅ Yes | ✅ Subclass only | (Not shown) |
| **default** | ✅ Yes | ❌ No | `Helper.square()` |
| **private** | ❌ No | ❌ No | Instance vars |

**Key Points:**
- **External access** requires `public` + `import`
- **Same package** access works automatically
- **Default/package-private** = same package only
- Use `-cp` (classpath) to include all packages when running [geeksforgeeks](https://www.geeksforgeeks.org/java/java-program-to-create-a-package-to-access-the-member-of-external-class-and-same-package/)


*/