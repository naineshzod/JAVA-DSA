public class Encapsulation {
    private double balance; // Private data member

    public Encapsulation(double initialBalance) {
        if (initialBalance >= 0) {
            this.balance = initialBalance;
        } else {
            this.balance = 0; // Initialize with 0 if invalid
        }
    }
    


    // Getter method for balance
    public double getBalance() {
        return balance;
    }

    // Setter method for balance with validation
    public void deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
        }
    }

    // Method for withdrawal with validation
    public void withdraw(double amount) {
        if (amount > 0 && this.balance >= amount) {
            this.balance -= amount;
        } else {
            System.out.println("Insufficient balance or invalid withdrawal amount.");
        }
    }

    public static void main(String[] args) {
        // Create an account with initial balance
        Encapsulation account = new Encapsulation(1000.0);
        
        // Display initial balance
        System.out.println("Initial balance: $" + account.getBalance());
        
        // Deposit money
        account.deposit(500.0);
        System.out.println("After deposit of $500: $" + account.getBalance());
        
        // Withdraw money
        account.withdraw(200.0);
        System.out.println("After withdrawal of $200: $" + account.getBalance());
        
        // Try to withdraw more than available balance
        account.withdraw(2000.0);
        System.out.println("Final balance: $" + account.getBalance());
    }
}
