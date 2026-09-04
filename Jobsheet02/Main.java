package Jobsheet02;

public class Main {
    public static void main(String[] args) {
        account acc = new account("Nadia", 500000);
        acc.withdraw(150000);
        acc.printInfo();
        System.out.println("Formatted: " + acc.formatBalance());

        acc.withdraw(1000000);
        acc.printInfo();
    }
}
