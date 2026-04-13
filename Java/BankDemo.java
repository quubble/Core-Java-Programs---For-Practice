/*Here's a complete Java banking system using **inheritance** and **static** members to demonstrate account operations (deposit, withdrawal) with user input.

## Complete Bank Account Program

*/

import java.util.Scanner;

// Base class - Account
class Account {
    protected String accountNumber;
    protected String accountHolder;
    protected double balance;
    
    // Static variables - shared by all accounts
    protected static double totalDeposits = 0;
    protected static double totalWithdrawals = 0;
    protected static int totalAccounts = 0;
    
    // Constructor
    public Account(String accNo, String holder, double initialBalance) {
        this.accountNumber = accNo;
        this.accountHolder = holder;
        this.balance = initialBalance;
        totalAccounts++;
    }
    
    // Deposit function
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            totalDeposits += amount;
            System.out.printf("Deposited ₹%.2f successfully.%n", amount);
        } else {
            System.out.println("Invalid deposit amount!");
        }
    }
    
    // Withdrawal function
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            totalWithdrawals += amount;
            System.out.printf("Withdrawn ₹%.2f successfully.%n", amount);
        } else if (amount > balance) {
            System.out.println("Insufficient balance!");
        } else {
            System.out.println("Invalid withdrawal amount!");
        }
    }
    
    // Display account details
    public void display() {
        System.out.printf("Account: %s%n", accountNumber);
        System.out.printf("Holder: %s%n", accountHolder);
        System.out.printf("Balance: ₹%.2f%n", balance);
    }
    
    // Static method to show bank statistics
    public static void showBankStats() {
        System.out.printf("Total Accounts: %d%n", totalAccounts);
        System.out.printf("Total Deposits: ₹%.2f%n", totalDeposits);
        System.out.printf("Total Withdrawals: ₹%.2f%n", totalWithdrawals);
    }
}

// Child class - SavingsAccount (inherits Account)
class SavingsAccount extends Account {
    private double minBalance = 500.00;
    
    public SavingsAccount(String accNo, String holder, double initialBalance) {
        super(accNo, holder, initialBalance);  // Call parent constructor
    }
    
    @Override
    public void withdraw(double amount) {
        if (balance - amount < minBalance) {
            System.out.println("Cannot withdraw! Minimum balance ₹" + minBalance + " required.");
        } else {
            super.withdraw(amount);  // Call parent withdraw method
        }
    }
}

// Main Demo class
public class BankDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Create Savings Account
        System.out.print("Enter Account Number: ");
        String accNo = sc.nextLine();
        System.out.print("Enter Account Holder Name: ");
        String holder = sc.nextLine();
        System.out.print("Enter Initial Balance: ₹");
        double initial = sc.nextDouble();
        
        SavingsAccount savings = new SavingsAccount(accNo, holder, initial);
        
        // Banking Menu
        while (true) {
            System.out.println("\n=== BANKING MENU ===");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Bank Statistics");
            System.out.println("5. Exit");
            System.out.print("Choose option: ");
            
            int choice = sc.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ₹");
                    savings.deposit(sc.nextDouble());
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ₹");
                    savings.withdraw(sc.nextDouble());
                    break;
                case 3:
                    System.out.print("Current Balance: ₹");
                    System.out.printf("%.2f%n", savings.balance);
                    break;
                case 4:
                    Account.showBankStats();  // Static method call
                    break;
                case 5:
                    System.out.println("Thank you for banking!");
                    sc.close();
                    return;
                default:
                    System.out.println("Invalid option!");
            }
        }
    }
}

/*

## Sample Output

```
Enter Account Number: ACC001
Enter Account Holder Name: John Doe
Enter Initial Balance: ₹1000

=== BANKING MENU ===
1. Deposit    2. Withdraw    3. Check Balance    4. Bank Statistics    5. Exit
Choose option: 1
Enter deposit amount: ₹500
Deposited ₹500.00 successfully.

Choose option: 2
Enter withdrawal amount: ₹300
Withdrawn ₹300.00 successfully.

Choose option: 3
Current Balance: ₹1200.00

Choose option: 4
Total Accounts: 1
Total Deposits: ₹500.00
Total Withdrawals: ₹300.00
```

## Key Features Demonstrated

**Inheritance:**
- `SavingsAccount extends Account` - inherits deposit(), withdraw()
- `super()` calls parent constructor
- `@Override` - custom withdrawal with min balance check

**Static Members:**
- `totalAccounts`, `totalDeposits` - shared across all accounts
- `showBankStats()` - class method, no object needed

**Bank Functions:**
- ✅ Deposit (any positive amount)
- ✅ Withdrawal (with balance check + min balance for savings)
- ✅ Account display & statistics

**Compile & Run:** Save as `BankDemo.java`, `javac BankDemo.java`, `java BankDemo` [w3resource](https://www.w3resource.com/java-exercises/java-inheritance-exercise-5.php)

*/