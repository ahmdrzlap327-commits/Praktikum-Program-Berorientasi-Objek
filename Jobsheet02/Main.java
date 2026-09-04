package Jobsheet02;

public class Main {
    public static void main(String[] args) {
        account original     = new account("Nadia", 500000);
        account copy = original;
        copy.deposit(100000);

        System.out.println("Via original: " + original.balance);
        System.out.println("Via copy: " + copy.balance);

        account empty = null;
        empty.printInfo();
    }
}
