// BankAccount class definition
class BankAccount {
    // Attributes with different access modifiers
    public String accountHolder;  // Public attribute
    private double balance;       // Private attribute
    protected String accountType; // Protected attribute

    // Constructor to initialize the account holder, balance, and account type
    public BankAccount(String accountHolder, double balance, String accountType) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountType = accountType;
    }

    // Method to deposit money into the account
    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;  // Increase balance by the deposit amount
        }
    }

    // Method to withdraw money from the account
    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;  // Decrease balance by the withdrawal amount
        }
    }

    // Method to get the current balance
    public double getBalance() {
        return balance;
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        // Create a BankAccount object with initial values
        BankAccount myAccount = new BankAccount("Alice", 1000.0, "Checking");

        // Perform some transactions
        myAccount.deposit(250.0);  // Deposit $250
        myAccount.withdraw(100.0); // Withdraw $100

        // Output the account details
        System.out.println("Account Holder: " + myAccount.accountHolder);
        System.out.println("Account Type: " + myAccount.accountType);
        System.out.println("Current Balance: $" + myAccount.getBalance());
    }
}
