//Armstrong numbers (sum of cubes of digits equals the number).

import java.util.Scanner;

public class ArmstrongChecker {
    
    public static boolean isArmstrong3Digit(int num) {
        if (num < 100 || num > 999) return false;
        
        int original = num;
        int sum = 0;
        
        while (num > 0) {
            int digit = num % 10;
            sum += digit * digit * digit;
            num /= 10;
        }
        
        return sum == original;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a 3-digit number: ");
        int number = scanner.nextInt();
        scanner.close();
        
        if (isArmstrong3Digit(number)) {
            System.out.println(number + " is an Armstrong number.");
        } else {
            System.out.println(number + " is not an Armstrong number.");
        }
    }
}