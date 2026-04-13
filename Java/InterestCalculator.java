/*Here's a Java program with separate functions to calculate **Simple Interest** and **Compound Interest** using user input via Scanner.

## Complete Program

*/


import java.util.Scanner;

public class InterestCalculator {
    
    // Simple Interest: SI = (P * R * T) / 100
    public static double calculateSimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100;
    }
    
    // Compound Interest: CI = P * (1 + R/100)^T - P
    public static double calculateCompoundInterest(double principal, double rate, double time) {
        return principal * Math.pow((1 + rate / 100), time) - principal;
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter Principal Amount (P): ₹");
        double principal = sc.nextDouble();
        
        System.out.print("Enter Rate of Interest (R %): ");
        double rate = sc.nextDouble();
        
        System.out.print("Enter Time (T years): ");
        double time = sc.nextDouble();
        
        // Calculate interests using functions
        double simpleInterest = calculateSimpleInterest(principal, rate, time);
        double compoundInterest = calculateCompoundInterest(principal, rate, time);
        
        // Display results
        System.out.println("\n=== INTEREST CALCULATION RESULTS ===");
        System.out.printf("Principal: ₹%.2f%n", principal);
        System.out.printf("Rate: %.2f%%%n", rate);
        System.out.printf("Time: %.2f years%n", time);
        System.out.printf("Simple Interest: ₹%.2f%n", simpleInterest);
        System.out.printf("Compound Interest: ₹%.2f%n", compoundInterest);
        System.out.printf("Difference (CI - SI): ₹%.2f%n", compoundInterest - simpleInterest);
        
        sc.close();
    }
}


/* Sample Run

```
Enter Principal Amount (P): ₹10000
Enter Rate of Interest (R %): 5
Enter Time (T years): 2

=== INTEREST CALCULATION RESULTS ===
Principal: ₹10000.00
Rate: 5.00%
Time: 2.00 years
Simple Interest: ₹1000.00
Compound Interest: ₹1025.00
Difference (CI - SI): ₹25.00
```

## Function Explanations

**Simple Interest Function:**
- Formula: `SI = (P × R × T) / 100`
- P = Principal, R = Rate (%), T = Time (years)

**Compound Interest Function:**
- Formula: `CI = P × (1 + R/100)^T - P`
- `Math.pow(base, exponent)` calculates power
- Annual compounding assumed

**Key Features:**
- User input validation not included (for simplicity)
- `%.2f` formats output to 2 decimal places
- Functions are reusableand modular [programiz](https://www.programiz.com/java-programming/examples/simple-compound-intrest


*/

