import java.util.Scanner;

public class PalindromeChecker {
    
    // Function to check if a number is palindrome
    public static boolean isNumberPalindrome(int num) {
        int original = num;
        long reversed = 0;
        
        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        return original == reversed;
    }
    
    // Function to check if a string is palindrome (case-insensitive)
    public static boolean isStringPalindrome(String str) {
        str = str.toLowerCase().replaceAll("[^a-z0-9]", "");
        int left = 0, right = str.length() - 1;
        
        while (left < right) {
            if (str.charAt(left) != str.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Number palindrome check
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        scanner.nextLine(); // consume newline
        
        if (isNumberPalindrome(number)) {
            System.out.println(number + " is a palindrome number.");
        } else {
            System.out.println(number + " is not a palindrome number.");
        }
        
        // String palindrome check
        System.out.print("Enter a string: ");
        String text = scanner.nextLine();
        
        if (isStringPalindrome(text)) {
            System.out.println("\"" + text + "\" is a palindrome string.");
        } else {
            System.out.println("\"" + text + "\" is not a palindrome string.");
        }
        
        scanner.close();
    }
}