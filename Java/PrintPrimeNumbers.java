import java.util.Scanner;

public class PrintPrimeNumbers {
    
    // Function to check if a number is prime
    public static boolean isPrime(int num) {
        if (num < 2) return false;
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    
    // Function to print all primes from 1 to N
    public static void printPrimes(int n) {
        System.out.println("Prime numbers from 1 to " + n + ":");
        for (int i = 2; i <= n; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
        System.out.println();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = scanner.nextInt();
        scanner.close();
        
        if (n < 2) {
            System.out.println("No prime numbers in this range.");
        } else {
            printPrimes(n);
        }
    }
}