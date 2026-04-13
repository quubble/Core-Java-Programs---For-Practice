//check prime number 
public class NumberFunction {
    
    // Function to check if number is prime
    public static boolean isPrime(int num) {
        if (num <= 1) {
            return false;  // 0 and 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) {
                return false;  // Found a divisor, not prime
            }
        }
        return true;  // No divisors found, it's prime
    }
    
    // Function to check if number is even or odd
    public static String isEvenOrOdd(int num) {
        if (num % 2 == 0) {
            return "Even";
        } else {
            return "Odd";
        }
    }
    
    public static void main(String[] args) {
        // Test cases
        int[] testNumbers = {2, 3, 4, 7, 9, 11, 17, 25};
        
        for (int num : testNumbers) {
            System.out.print(num + " is ");
            
            if (isPrime(num)) {
                System.out.print("PRIME ");
            } else {
                System.out.print("not prime ");
            }
            
            System.out.println("and " + isEvenOrOdd(num));
        }
    }
}
