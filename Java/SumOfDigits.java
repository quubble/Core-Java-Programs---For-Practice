//SumOfDigits

import java.util.Scanner;

public class SumOfDigits {
    
    // Function to calculate sum of digits
    public static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            int digit = number % 10;  // Extract last digit
            sum += digit;
            number /= 10;             // Remove last digit
        }
        return sum;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a number: ");
        int num = scanner.nextInt();
        scanner.close();
        
        int result = sumOfDigits(num);
        System.out.println("Sum of digits of " + num + " = " + result);
    }
}