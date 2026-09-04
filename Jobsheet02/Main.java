package Jobsheet02;

public class Main {
    public static void main(String[] args) {
        account acc = new account();
        acc.ownerName = "Nadia";
        acc.balance = 500000;
        
        System.out.println(acc.ownerName + " - balance: " + acc.balance);
    }
}
