package Jobsheet05;

public class SavingAccount extends Account {
    private double interestRate;

    public SavingAccount(String accountNumber,Customer owner, double balance, double interestRate){
        super(accountNumber, owner, balance);
        this.interestRate = interestRate;
    }

    public double getInterestRate(){
        return interestRate;
    }

    public void printAccountType(){
        System.out.println("Account type: Savings, interest rate: " + interestRate);
    }
}
