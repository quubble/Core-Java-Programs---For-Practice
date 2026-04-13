//Fibonacci numbers 

import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of terms: ");
        int n = scanner.nextInt();
        scanner.close();
        
        if (n <= 0) {
            System.out.println("Please enter a positive number");
            return;
        }
        
        long a = 0, b = 1;
        System.out.print(a);
        if (n > 1) System.out.print(" " + b);
        
        for (int i = 2; i < n; i++) {
            long c = a + b;
            System.out.print(" " + c);
            a = b;
            b = c;
        }
        System.out.println();
    }
}