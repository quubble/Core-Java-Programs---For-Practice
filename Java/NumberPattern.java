//Number Pattern

import java.util.Scanner;

public class NumberPattern {
    
    // Function to print number pattern 1, 12, 123... up to n rows
    public static void printNumberPattern(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        scanner.close();
        
        if (rows <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            printNumberPattern(rows);
        }
    }
}