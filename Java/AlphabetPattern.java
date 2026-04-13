import java.util.Scanner;

public class AlphabetPattern {
    
    // Function to print alphabet pattern A, AB, ABC... up to n rows
    public static void printAlphabetPattern(int n) {
        int startChar = 65;  // ASCII for 'A'
        
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print((char)(startChar + j - 1));
            }
            System.out.println();
        }
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        scanner.close();
        
        if (rows <= 0) {
            System.out.println("Please enter a positive number.");
        } else {
            printAlphabetPattern(rows);
        }
    }
}