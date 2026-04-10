package com.core.basic_java_programs;

import java.util.Scanner;

public class AdvancedPatterns {

    // =========================
    // 🧬 1. Pascal Triangle
    // =========================
    static void printPascalTriangle(int n)
    {
        for (int i = 0; i < n; i++)
        {
            // spaces
            for (int j = 1; j <= n - i; j++)
            {
                System.out.print(" ");
            }

            int value = 1;

            for (int j = 0; j <= i; j++)
            {
                System.out.print(value + " ");
                value = value * (i - j) / (j + 1); // nCr logic
            }

            System.out.println();
        }
    }

    // =========================
    // 💎 2. Diamond Pattern
    // =========================
    static void printDiamond(int n)
    {
        // Upper half
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");

            for (int j = 1; j <= i; j++)
                System.out.print("* ");

            System.out.println();
        }

        // Lower half
        for (int i = n - 1; i >= 1; i--)
        {
            for (int j = 1; j <= n - i; j++)
                System.out.print(" ");

            for (int j = 1; j <= i; j++)
                System.out.print("* ");

            System.out.println();
        }
    }

    // =========================
    // 🕳️ 3. Hollow Square Pattern
    // =========================
    static void printHollowSquare(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= n; j++)
            {
                // border condition
                if (i == 1 || i == n || j == 1 || j == n)
                {
                    System.out.print("* ");
                }
                else
                {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }

            // =========================
            // 🕳️ 4. Number Pattern
            // =========================
    static void printNumberPattern(int n)
    {
        for (int i = 1; i <= n; i++)
        {
            for (int j = 1; j <= i; j++)
                System.out.print(j + " ");
            System.out.println();
        }
    }


    // =========================
    // 🚀 Main Method
    // =========================
    public static void main(String[] args)
    {
        int n;
        System.out.print("enter size of pattern: ");
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        System.out.println("🧬 Pascal Triangle:");
        printPascalTriangle(n);

        System.out.println("\nNumber Pattern:");
        printNumberPattern(n);

        System.out.println("\n💎 Diamond Pattern:");
        printDiamond(n);

        System.out.println("\n🕳️ Hollow Square Pattern:");
        printHollowSquare(n);
    }
}









// 📌 Pattern Logic Table (Java Star Patterns)
// Pattern	Rule
// 🔺 Upward	rows increase, stars = row number (j <= i)
// 🔻 Downward	rows decrease, stars = decreasing (j <= i but i--)
// 🔺 Pyramid	spaces + stars (spaces = n - i, stars = i)
// 🔢 Numbers	print j from 1 to row number
// 🧬 Pascal	each number = sum of two above numbers (binomial logic)


//triangle logic
// 🔺 Upward → increase
// 🔻 Downward → decrease
// 🔺 Pyramid → spaces + stars
// 🔢 Numbers → print j
// 🧬 Pascal → math (nCr logic)