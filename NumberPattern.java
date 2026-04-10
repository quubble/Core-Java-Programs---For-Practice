package com.core.basic_java_programs;

import java.util.Scanner;

public class NumberPattern {
    static void printNumberPattern(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
            {
                System.out.print(j + " ");
            }
            System.out.println();
        }
    }

public static void main(String[] args)
    {
        int n;
        System.out.print("enter size of pattern: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        printNumberPattern(n);
    }
}



/*package com.core.basic_java_programs;
import java.util.Scanner;

// This class contains pattern printing programs
public class NumberPatterns {

    // ===============================
    // Function to print number pattern
    // ===============================
    static void printNumberPattern(int n)
    {
        // OUTER LOOP: controls number of rows
        // i starts from 1 and goes up to n (user-defined limit)
        for (int i = 1; i <= n; i++)
        {
            // INNER LOOP: controls numbers printed in each row
            // j starts from 1 and goes up to current row number (i)
            for (int j = 1; j <= i; j++)
            {
                // Print value of j followed by a space
                // This prints: 1, then 1 2, then 1 2 3, etc.
                System.out.print(j + " ");
            }

            // After completing one row, move cursor to next line
            System.out.println();
        }
    }

    // ===============================
    // Main method - starting point of program
    // ===============================
    public static void main(String[] args)
    {
        // Declare variable n (size of pattern)
        // This means we want to print pattern up to 5 rows
        int n;
        System.out.print("enter size of pattern: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        // Call the function and pass value of n
        // This executes the pattern printing logic
        printNumberPattern(n);
    }
}*/