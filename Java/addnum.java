package com.example.addnum;

import java.util.Scanner;

public class addnum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        int sum = num1 + num2;
        
        System.out.println("Sum: " + sum);
        
        scanner.close();
    }
}



/* Function to add 2 numbers

package com.example.addnum;

import java.util.Scanner;

public class AddTwoNumbers {

    // Function to read two numbers and return their sum
    public static int addTwoNumbersFromUser() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        
        scanner.close(); // Close only once, in this function
        
        return num1 + num2;
    }

    public static void main(String[] args) {
        int sum = addTwoNumbersFromUser();
        System.out.println("Sum: " + sum);
    }
}*/