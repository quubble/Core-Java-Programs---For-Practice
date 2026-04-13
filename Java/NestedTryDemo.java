/*Here is a **Java program** that implements **nested `try` statements** (a `try` block inside another `try` block) with user input. [tutorialspoint](https://www.tutorialspoint.com/java/java_nested_try_block.htm)

### Example: Nested try blocks


*/

import java.util.Scanner;

public class NestedTryDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a number (numerator): ");
            int num1 = sc.nextInt();

            System.out.print("Enter another number (denominator): ");
            int num2 = sc.nextInt();

            // Outer try: may cause division‑by‑zero
            try {
                System.out.println("Trying to divide " + num1 + " by " + num2);
                int result = num1 / num2;   // may throw ArithmeticException
                System.out.println("Result = " + result);
            } catch (ArithmeticException e) {
                System.out.println("Inner catch: Cannot divide by zero.");
            }

            // Outer try: may cause ArrayIndexOutOfBoundsException
            int[] arr = {10, 20, 30};
            System.out.print("Enter index (0, 1, 2): ");
            int index = sc.nextInt();

            System.out.println("arr[" + index + "] = " + arr[index]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Outer catch: Array index is out of bounds.");
        } catch (Exception e) {
            System.out.println("Outer generic catch: " + e.getMessage());
        } finally {
            System.out.println("Nested try block example ended.");
            sc.close();
        }
    }
}

/*

### How nested `try` works

- A **nested `try`** means one `try` block is written inside another `try`. [techvidvan](https://techvidvan.com/tutorials/java-nested-try-block/)
- The **inner `try`** handles its own exceptions first; if not caught there, they propagate to the **outer `try`**. [beginnersbook](https://beginnersbook.com/2013/04/nested-try-catch/)
- You can test:
  - Enter `0` as denominator → inner `ArithmeticException` is caught.  
  - Enter index `5` → outer `ArrayIndexOutOfBoundsException` is caught. [blog.thinknthriveacademy](https://blog.thinknthriveacademy.in/2022/11/write-program-to-show-use-of-nested-try.html)

Save as `NestedTryDemo.java`, compile with `javac NestedTryDemo.java`, then run with `java NestedTryDemo`.

*/