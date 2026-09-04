package Jobsheet02;

public class Main {
    public static void main(String[] args) {
        account acc = new account();
        acc.ownerName = "Nadia";
        acc.deposit(500000);
        acc.withdraw(150000);
        acc.printInfo();
    }
}
