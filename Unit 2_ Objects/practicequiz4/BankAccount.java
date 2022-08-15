package practicequiz4;

public class BankAccount{

    private String accountName;
    private double interestRate;
    private double balance;

    public BankAccount(String accountName, double interestRate, double startingBalance){
        this.accountName = accountName;
        this.interestRate = interestRate;
        this.balance = startingBalance;
    }

    public BankAccount(String accountName, double interestRate){
        this.accountName = accountName;
        this.interestRate = interestRate;
        this.balance = 0;
    }

    public BankAccount(BankAccount a) {
        accountName = a.accountName;
        interestRate = a.interestRate;
        balance = a.balance;
    }

    public void setAccountName(String accountName){
        this.accountName = accountName;
    }

    public void setInterestRate (double interestRate){
        this.interestRate = interestRate;
    }

    public void setBalance (double balance){
        this.balance = balance;
    }

    public String getAccountName(){
        return accountName;
    }

    public double getInterestRate(){
        return interestRate;
    }

    public double getBalance(){
        return balance;
    }

    public 
}