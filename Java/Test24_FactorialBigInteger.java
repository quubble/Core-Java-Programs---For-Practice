package com.core.basic_java_programs;

//BigInteger Factorial with Auto-Close Scanner

import java.math.BigInteger;
import java.util.Scanner;

public class Test24_FactorialBigInteger {

    // Recursive factorial using BigInteger
    public static BigInteger factorial(BigInteger n) {
        if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE)) {
            return BigInteger.ONE; // Base case
        } else {
            return n.multiply(factorial(n.subtract(BigInteger.ONE))); // Recursive step
        }
    }

    public static void main(String[] args) {

        // Try-with-resources: Scanner will auto-close
        try (Scanner sc = new Scanner(System.in)) {

            System.out.print("Enter a Number: ");
            int num = sc.nextInt();

            BigInteger result = factorial(BigInteger.valueOf(num));

            System.out.println("Factorial: " + result);
        } // Scanner closes automatically here
    }
}