public class BankAccount {
    private String accountNumber;
    private String ownerName;
    private double balance;

    public BankAccount(String accountNumber, String ownerName, double balance) {
        this.accountNumber = accountNumber;
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("So du khong du!");
        }
    }

    public double checkBalance() {
        return balance;
    }

    public void display() {
        System.out.println("STK: " + accountNumber + 
                           " – Chu tai khoan: " + ownerName + 
                           " – So du: " + balance);
    }
}
