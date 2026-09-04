package Jobsheet02;

public class account {
    public String ownerName;
    public double balance;

    public account(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance = balance + amount;
    }

    public void withdraw(double amount) {
        balance = balance - amount;
        if (isOverdrawn()) {
            balance = balance + amount;
            System.out.println("Withdraw rejected: infused balance");
        }
    }

    public void printInfo() {
        System.out.println(ownerName + " - balance: " + balance);
    }

    public String formatBalance(){  
        return String.format("%,.2f", balance);
    }

    public boolean isOverdrawn(){
        return balance < 0;
    }
}
