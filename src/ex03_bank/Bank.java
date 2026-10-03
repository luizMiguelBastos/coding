package ex03_bank;

import java.util.ArrayList;
import java.util.List;

public class Bank {

    private List<BankAccount> bankAccoutList = new ArrayList<>();


    public void addAccount (BankAccount bankAccount){
        bankAccoutList.add(bankAccount);
    }

    public BankAccount findByHolder(String holder){
        for (BankAccount i : bankAccoutList){
            if (i.getHolder().equals(holder)){
                return i;
            }
        }
        throw new IllegalArgumentException("Holder not found");
    }

    public BankAccount richestAccount(){
        if (bankAccoutList.isEmpty()){
            throw new IllegalStateException("The list is empty");
        }
        BankAccount richiestAccount = bankAccoutList.get(0);
        for (BankAccount i : bankAccoutList){
            if (i.getBalance() > richiestAccount.getBalance()){
                richiestAccount = i;
            }
        }
        return richiestAccount;
    }

    public double totalBalance(){
        double totalBalance = 0;
        for (BankAccount i : bankAccoutList){
            totalBalance+= i.getBalance();
        }
        return totalBalance;
    }

}
