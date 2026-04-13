//Swap two numbers (with and without third variable)

public class SwapVariable1 {
 public static void main(String[] args) {
 int a = 10, b = 20;
 // With third variable
 int temp = a; a = b; b = temp;
 System.out.println("With 3rd variable: "+a + " " + b);
 // Without third variable (XOR)
 a = 10; b = 20;
 a ^= b; b ^= a; a ^= b;
 System.out.println("Without 3rd variable: "+a + " " + b);
 }
}