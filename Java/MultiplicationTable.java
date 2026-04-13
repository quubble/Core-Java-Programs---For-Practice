import java.util.Scanner;

public class MultiplicationTable {
    
    // Function to print multiplication table up to given limit
    public static void printTable(int number, int limit) {
        System.out.println("\nMultiplication table of " + number + " till " + limit + ":");
        for (int i = 1; i <= limit; i++) {
            System.out.println(number + " x " + i + " = " + (number * i));
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        
        System.out.print("Enter the limit (till when to print table): ");
        int limit = scanner.nextInt();
        
        scanner.close();
        
        // Call the function
        printTable(number, limit);
    }
}