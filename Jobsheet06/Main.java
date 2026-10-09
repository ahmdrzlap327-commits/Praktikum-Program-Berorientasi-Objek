package Jobsheet06;

public class Main {
    public static void main(String[] args) {
        Customer customer = new Customer("Rian", "0812-0000-0003");
        SavingAccount savings = new SavingAccount("A003", customer, 100000, 0.02);
        
        boolean result = savings.withdraw(70000);
        System.out.println("Withdraw 70000 allowed? " + result);
        
        savings.printInfo();
    }
}
