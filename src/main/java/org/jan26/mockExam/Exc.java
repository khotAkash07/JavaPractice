package org.jan26.mockExam;

import java.util.*;

class TransactionLimitExceededException extends Exception{
    public TransactionLimitExceededException(String msg){
        super(msg);
    }
}

class BankAccount {
    private long accNo;
    private String accHolderName;
    private int balance;
    private long dailyTransactionLimit;

    public long getAccNo() { return accNo; }
    public void setAccNo(long accNo) {this.accNo = accNo; }

    public String getAccHolderName() {return accHolderName;}
    public void setAccHolderName(String AccHolderName) { this.accHolderName = accHolderName;}

    public int getBalance() {return balance;}
    public void setBalance(int balance) {this.balance = balance;}

    public long getDailyTransactionLimit() { return dailyTransactionLimit;}
    public void setDailyTransactionLimit(long dailyTransactionLimit) {this.dailyTransactionLimit = dailyTransactionLimit;}

    public void transfer (double amount) throws TransactionLimitExceededException {
		if(amount <= balance){
			if(amount > dailyTransactionLimit)throw new TransactionLimitExceededException("Successful transfer within limit, Transfer exceeding the limit...");
			else balance -= amount;
		}else{
			System.out.println("Low Acc Balance...");
		}
    }
}

public class Exc{
    public static void main(String [] args){

        Scanner sc = new Scanner(System.in);
        BankAccount ba = new BankAccount();
        System.out.println("Enter Acc no: ");
        ba.setAccNo(sc.nextLong());
        System.out.println("Enter Acc holder Name: ");
        sc.nextLine();
        ba.setAccHolderName(sc.nextLine());
        System.out.println("Enter Acc Balance: ");
        ba.setBalance(sc.nextInt());
        System.out.println("Enter Acc dailyTransactionLimit: ");
        ba.setDailyTransactionLimit(sc.nextLong());

        System.out.println("Enter Amount for transfer");
        try{
            ba.transfer(sc.nextDouble());
        }catch(Exception ex){
            System.out.println(ex);
        }
    }
}