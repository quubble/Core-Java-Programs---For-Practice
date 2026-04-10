package com.core.basic_java_programs;

import java.util.Scanner;

//Find factorial using recursion in java
public class Test22_Find_Factorial_of_Number {
	// Recursive function
	public static int factorial(int n) {
		if (n == 0 || n == 1) // Base case
		{
			return 1;
		} else {
			return n * factorial(n - 1); // Recursive call
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter a Number : ");
		int n = sc.nextInt();

		int result = factorial(n);

		System.out.print("Factorial is : " + result);sc.close();
	}
}

/*
 * Bonus (clean version)
 * 
 * public static int factorial(int n) {
 * return (n <= 1) ? 1 : n * factorial(n - 1);
 * }
 * // Output :
 * /*
 * 
 * Enter a Number : 10
 * Factorial : 3628800
 */

/*
 * package com.test.Basic_Java_Programs;
 * 
 * import java.math.BigInteger;
 * import java.util.Scanner;
 * 
 * public class FactorialBigInteger {
 * 
 * // Recursive factorial using BigInteger
 * public static BigInteger factorial(BigInteger n) {
 * if (n.equals(BigInteger.ZERO) || n.equals(BigInteger.ONE)) {
 * return BigInteger.ONE; // Base case
 * } else {
 * return n.multiply(factorial(n.subtract(BigInteger.ONE)));
 * }
 * }
 * 
 * public static void main(String[] args) {
 * Scanner sc = new Scanner(System.in);
 * 
 * System.out.print("Enter a Number: ");
 * int num = sc.nextInt();
 * BigInteger result = factorial(BigInteger.valueOf(num));
 * 
 * System.out.println("Factorial: " + result);
 * }
 * }
 * 
 * 
 */


 /*package com.test.Basic_Java_Programs;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialBigInteger {

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
	*/