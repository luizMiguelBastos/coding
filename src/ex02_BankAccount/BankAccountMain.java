package ex02_BankAccount;

public class BankAccountMain {
    static void main(String[] args) {


        BankAccount bankAccount = new BankAccount("Luiz Miguel");

        double deposit = bankAccount.deposit(100);
        double withdraw = bankAccount.withdraw(30);
        double withdraw1 = bankAccount.withdraw(500);
    }
}
