package com.core.basic_java_programs;

import java.util.Scanner;

public class StarPatterns {

    static void printDownwardTriangle(int n)
    {
        for (int i = n; i >= 1; i--)
        {
            for (int j = 1; j <= i; j++)
                System.out.print("* ");
            System.out.println();
        }
    }

    static void printPyramid(int n)
    {
        for (int i = 1; i <= n; i++)
        {  
            // spaces
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");
            
            // stars
            for (int j = 1; j <= i; j++)
                System.out.print("* ");

            System.out.println();
        }
    }
        // Logic
        // Outer loop → rows
        // Inner loop → print numbers from 1 to row number
    static void printNumberPattern(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
                System.out.print(j + " ");
            System.out.println();
        }
    }

    public static void main(String[] args)
    {
        int n;
        System.out.print("enter size of pattern: ");
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
            System.out.println();
            printDownwardTriangle(n);
            System.out.println();

            printPyramid(n);
            System.out.println();

            printNumberPattern(n);
        }
    }
}    