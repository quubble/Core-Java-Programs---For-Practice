//reverse a number

import java.util.Scanner;

public class ReverseNumber {
    // Function to reverse a number
    public static long reverseNumber(int num) {
        long reversed = 0;
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return reversed;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.close();
        
        long reversed = reverseNumber(number);
        System.out.println("Reversed: " + reversed);
    }
}