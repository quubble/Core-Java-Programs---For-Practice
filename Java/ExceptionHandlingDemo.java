/*Here is a **Java program** that handles exceptions using a `try` block with **multiple `catch` blocks**, and takes **user input** using `Scanner`. [programiz](https://www.programiz.com/java-programming/try-catch)

### Java code: try with multiple catch blocks

```java*/

import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number (dividend): ");
            int num1 = sc.nextInt();

            System.out.print("Enter second number (divisor): ");
            int num2 = sc.nextInt();

            // ArithmeticException: division by zero
            int result = num1 / num2;
            System.out.println("Result = " + result);

            // ArrayIndexOutOfBoundsException demo
            int[] arr = new int[3];
            System.out.print("Enter index (0, 1, 2): ");
            int index = sc.nextInt();

            arr[index] = 100;
            System.out.println("arr[" + index + "] = " + arr[index]);

            // NumberFormatException demo (if desired, uncomment next line)
            // Integer.parseInt("abc");

        } catch (ArithmeticException e) {
            System.out.println("Error: Cannot divide by zero.");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Array index is out of bounds.");
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid number format.");
        } catch (Exception e) {
            System.out.println("An unexpected error occurred: " + e.getMessage());
        } finally {
            System.out.println("Program ended.");
            sc.close();
        }
    }
}

/* ### How multiple `catch` blocks work

- A single `try` block can throw different exceptions (here: `ArithmeticException`, `ArrayIndexOutOfBoundsException`, `NumberFormatException`). [beginnersbook](https://beginnersbook.com/2013/04/try-catch-in-java/)
- Each `catch` block is tried **in order**, and the first matching type handles the exception. [geeksforgeeks](https://www.geeksforgeeks.org/java/multicatch-in-java/)
- The last `catch (Exception e)` is a generic fallback for any other checked/unchecked exception. [tutorialspoint](https://www.tutorialspoint.com/java/java_multi_catch_block.htm)

### How to run

- Save as `ExceptionHandlingDemo.java`.  
- Compile: `javac ExceptionHandlingDemo.java`.  
- Run: `java ExceptionHandlingDemo`.  

You can test different errors by entering `0` as divisor (for `ArithmeticException`) or index `5` (for `ArrayIndexOutOfBoundsException`). [sanfoundry](https://www.sanfoundry.com/java-program-handle-exception-using-try-multiple-catch-block

*/