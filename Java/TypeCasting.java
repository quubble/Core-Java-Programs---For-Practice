//Here's a complete Java program demonstrating both **Widening (Implicit)** and **Narrowing (Explicit)** type casting.

// Complete Type Casting Program


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a byte value (-128 to 127): ");
        byte byteValue = sc.nextByte();
        
        // ========== WIDENING TYPE CASTING (AUTOMATIC) ==========
        System.out.println("\n--- WIDENING TYPE CASTING (Implicit/Automatic) ---");
        short shortValue = byteValue;           // byte → short (automatic)
        int intValue = byteValue;               // byte → int (automatic)  
        long longValue = byteValue;             // byte → long (automatic)
        float floatValue = byteValue;           // byte → float (automatic)
        double doubleValue = byteValue;         // byte → double (automatic)
        
        System.out.println("Byte: " + byteValue);
        System.out.println("Short: " + shortValue);
        System.out.println("Int: " + intValue);
        System.out.println("Long: " + longValue);
        System.out.println("Float: " + floatValue);
        System.out.println("Double: " + doubleValue);
        
        // ========== NARROWING TYPE CASTING (MANUAL) ==========
        System.out.println("\n--- NARROWING TYPE CASTING (Explicit/Manual) ---");
        System.out.print("\nEnter a double value: ");
        double inputDouble = sc.nextDouble();
        
        float floatCast = (float) inputDouble;      // double → float
        long longCast = (long) inputDouble;         // double → long
        int intCast = (int) inputDouble;            // double → int
        short shortCast = (short) inputDouble;      // double → short
        byte byteCast = (byte) inputDouble;         // double → byte
        
        System.out.println("Original Double: " + inputDouble);
        System.out.println("Float: " + floatCast);
        System.out.println("Long: " + longCast);
        System.out.println("Int: " + intCast);
        System.out.println("Short: " + shortCast);
        System.out.println("Byte: " + byteCast);
        
        // ========== DATA LOSS EXAMPLE ==========
        System.out.println("\n--- DATA LOSS IN NARROWING ---");
        double num = 123.456;
        int truncated = (int) num;
        System.out.println("123.456 → " + truncated + " (lost .456)");
        
        sc.close();
    }
}


//Sample Output

//Enter a byte value (-128 to 127): 100

/* 
--- WIDENING TYPE CASTING (Implicit/Automatic) ---
Byte: 100
Short: 100
Int: 100
Long: 100
Float: 100.0
Double: 100.0
*/
//--- NARROWING TYPE CASTING (Explicit/Manual) ---

/* Enter a double value: 99.887
Original Double: 99.887
Float: 99.887
Long: 99
Int: 99
Short: 99
Byte: 99*/

//--- DATA LOSS IN NARROWING ---
//123.456 → 123 (lost .456)


/* Key Concepts

**Widening (Implicit):**
- Small → Large: byte → short → int → long → float → double
- **Automatic** - no `(type)` needed
- **No data loss**

**Narrowing (Explicit):**
- Large → Small: double → float → long → int → short → byte
- **Manual** - requires `(type)` casting
- **Data loss possible** (decimals truncated)

**Type Casting Order:** byte < short < int < long < float < double> */

