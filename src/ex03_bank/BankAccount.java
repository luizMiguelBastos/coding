package ex03_bank;

public class BankAccount {

    private String holder;
    private double balance;

    public BankAccount(String holder) {
        this.holder = holder;
        this.balance = 0;
    }

    public double deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException("The value of deposit need to be more than 0");
        }
        balance += amount;
        System.out.println("Sucess.\nActual balance: " + balance);
        return balance;
    }

    public double withdraw(double amount) {
        if (amount > balance) {
            throw new IllegalArgumentException("Insufficient value");
        }
        balance -= amount;
        System.out.println("Sucess.\nActual balance: " + balance);
        return balance;
    }

    public double getBalance() {
        return balance;
    }

    public String getHolder() {
        return holder;
    }
}

