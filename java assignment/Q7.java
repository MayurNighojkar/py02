// Create a "BankAccount" class that supports deposits, withdrawals, and balance enquiries.

// Requirements:
// Store the account holder's name, account number, and balance as private fields.
// Initialize account details using a constructor.
// Implement separate "deposit()" and "withdraw()" methods.
// Reject zero or negative transaction amounts.
// Reject withdrawals that exceed the available balance.
// Do not allow an invalid initial balance.
// Display the transaction result and final balance.
// Sample Input

// Account Holder: Rahul
// Account Number: 1001
// Initial Balance: 5000
// Deposit: 2000
// Withdrawal: 1500




class BankAccount {
    private String holderName;
    private int accountNumber;
    private double balance;

    public BankAccount(String holderName, int accountNumber, double initialBalance) {
        if (initialBalance < 0)
            throw new IllegalArgumentException("Initial balance cannot be negative.");
        this.holderName = holderName;
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    public boolean deposit(double amount) {
        if (amount <= 0) { System.out.println("Deposit Failed: amount must be positive"); return false; }
        balance += amount;
        System.out.println("Deposit Successful");
        return true;
    }
    public boolean withdraw(double amount) {
        if (amount <= 0) { System.out.println("Withdrawal Failed: amount must be positive"); return false; }
        if (amount > balance) { System.out.println("Withdrawal Failed: insufficient balance"); return false; }
        balance -= amount;
        System.out.println("Withdrawal Successful");
        return true;
    }
    public double getBalance() { return balance; }
    public void displayAccountInfo() {
        System.out.println("Account Holder: " + holderName);
        System.out.println("Account Number: " + accountNumber);
    }
}

public class Q7 {
    public static void main(String[] args) {
        BankAccount acc = new BankAccount("Rahul", 1001, 5000);
        acc.displayAccountInfo();
        acc.deposit(2000);
        acc.withdraw(1500);
        System.out.println("Final Balance: " + acc.getBalance());
    }
}