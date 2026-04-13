//Recursive Numbers Print and Sum 

import java.util.Scanner;

public class RecursiveNumbers {
    
    // Function 1: Print numbers from 1 to N using recursion
    public static void printNumbers(int n) {
        if (n < 1) {
            return;  // Base case
        }
        printNumbers(n - 1);  // Recursive call
        System.out.print(n + " ");  // Print after recursion (ascending order)
    }
    
    // Function 2: Sum numbers from 1 to N using recursion
    public static int sumNumbers(int n) {
        if (n == 0) {
            return 0;  // Base case
        }
        return n + sumNumbers(n - 1);  // Recursive case
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = scanner.nextInt();
        scanner.close();
        
        if (n < 1) {
            System.out.println("Please enter a positive number.");
            return;
        }
        
        // Print numbers 1 to N
        System.out.print("Numbers 1 to " + n + ": ");
        printNumbers(n);
        System.out.println();
        
        // Sum numbers 1 to N
        int total = sumNumbers(n);
        System.out.println("Sum 1 to " + n + " = " + total);
    }
}