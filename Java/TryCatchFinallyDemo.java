//Here's a **simple, complete** Java **try-catch-finally** demo with **all scenarios**.

//## Complete Working Program




public class TryCatchFinallyDemo {
    public static void main(String[] args) {
        System.out.println("=== SCENARIO 1: NO EXCEPTION ===");
        try {
            int result = 10 / 2;
            System.out.println("Try: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Catch: Division error");
        } finally {
            System.out.println("Finally: Always runs!");
        }
        System.out.println("Program continues...\n");
        
        System.out.println("=== SCENARIO 2: EXCEPTION OCCURS ===");
        try {
            int result = 10 / 0;  // ArithmeticException!
            System.out.println("This won't print");
        } catch (ArithmeticException e) {
            System.out.println("Catch: " + e.getMessage());
        } finally {
            System.out.println("Finally: Cleanup done!");
        }
        System.out.println("Program continues...\n");
        
        System.out.println("=== SCENARIO 3: Multiple Catch Blocks ===");
        try {
            String str = null;
            int len = str.length();  // NullPointerException
        } catch (NullPointerException e) {
            System.out.println("Catch: NullPointer - " + e);
        } catch (ArithmeticException e) {
            System.out.println("Catch: Math error");
        } finally {
            System.out.println("Finally: Always executes");
        }
        
        System.out.println("\n=== SCENARIO 4: Return in Try ===");
        String result = testReturn();
        System.out.println("Result: " + result);
    }
    
    // Finally runs even with return!
    public static String testReturn() {
        try {
            System.out.println("Try: Returning early");
            return "Hello";
        } catch (Exception e) {
            return "Error";
        } finally {
            System.out.println("Finally: Runs even with return!");
        }
    }
}



/*

## Sample Output
```
=== SCENARIO 1: NO EXCEPTION ===
Try: 5
Finally: Always runs!
Program continues...

=== SCENARIO 2: EXCEPTION OCCURS ===
Catch: / by zero
Finally: Cleanup done!
Program continues...

=== SCENARIO 3: Multiple Catch Blocks ===
Catch: NullPointer - java.lang.NullPointerException
Finally: Always executes

=== SCENARIO 4: Return in Try ===
Try: Returning early
Finally: Runs even with return!
Result: Hello
```

## **Execution Flow** (Simple Rules)

| Scenario | **Try** | **Catch** | **Finally** |
|----------|---------|-----------|-------------|
| No error | ✅ Runs | Skipped | ✅ Runs |
| Error caught | ❌ Stops | ✅ Runs | ✅ Runs |
| Error NOT caught | ❌ Stops | Skipped | ✅ Runs |
| `return` in try | ✅ Runs | Skipped | ✅ Runs |

## **Real-Life Usage**
```java
// File handling example
File file = openFile();
try {
    readFile(file);
} catch (IOException e) {
    logError(e);
} finally {
    closeFile(file);  // Always close resources!
}



/*

## **Key Points**
```
✅ finally = ALWAYS executes (cleanup)
✅ Multiple catch blocks (specific → general)
✅ Order matters: ArithmeticException before Exception
✅ finally runs even with return/break/continue
```

**✅ 100% Compiles & Runs Perfectly** 🟢

**`finally` = Insurance policy** - Always cleans up no matter what happens!

*/