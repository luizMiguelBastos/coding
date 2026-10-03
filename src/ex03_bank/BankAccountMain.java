package ex03_bank;

public class BankAccountMain {
    static void main(String[] args) {


    Bank bank01 = new Bank();

    BankAccount bankAccount01 = new BankAccount("Miguel");
    bank01.addAccount(bankAccount01);
   bankAccount01.deposit(100);

    BankAccount bankAccount02 = new BankAccount("Miguelzinho");
    bank01.addAccount(bankAccount02);
    bankAccount02.deposit(200);

    BankAccount bankAccount03 = new BankAccount("Miguelito");
    bank01.addAccount(bankAccount03);
    bankAccount03.deposit(300);

        System.out.println(bank01.totalBalance());
        System.out.println(bank01.richestAccount().getHolder());
        System.out.println(bank01.findByHolder("Luiz"));



    }
}
