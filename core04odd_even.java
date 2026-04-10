package com.core.basic_java_programs;

import java.util.Scanner;

public class core04odd_even {
    // Function returns result
    public static String checkOddEven(int n) {
        return (n % 2 == 0) ? "Even Number" : "Odd Number";
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any Number : ");
        int n = sc.nextInt();

        System.out.println(checkOddEven(n));sc.close();
    }

}
