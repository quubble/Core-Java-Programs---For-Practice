package com.core.basic_java_programs;

import java.util.Scanner;

public class UpTriangle {

    // ✅ Function to print upward triangle
    static void printUpwardTriangle(int n) 
    {
        for (int i = 1; i <= n; i++)   // rows
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
            
            printUpwardTriangle(n); // calling function
        }
        
    }
}