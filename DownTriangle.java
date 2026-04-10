package com.core.basic_java_programs;

import java.util.Scanner;

public class DownTriangle {

    // ✅ Function to print upward triangle
    static void printDownwardTriangle(int n) 
    {
        for (int i = n; i >= 1; i--)   // rows
        {
            for (int j = 1; j <= i; j++)   // stars
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    // ✅ Main method
    public static void main(String[] args) 
    {
        int n;
        System.out.print("enter size of pattern: ");
        try (Scanner sc = new Scanner(System.in)) {
            n = sc.nextInt();
            
            printDownwardTriangle(n); // calling function
        }
        
    }
}