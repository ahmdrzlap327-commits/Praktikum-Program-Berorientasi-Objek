package Jobsheet06;

public class Main {
    public static void main(String[] args) {
        Customer customer3 = new Customer("Budi", "0812-0000-0005");
        BusinessAccount business = new BusinessAccount("A005", customer3, 2000000, 25000);
        
        boolean result = business.withdraw(1500000);
        System.out.println("Withdraw 1500000 allowed? " + result);
        
        business.printInfo();
    }
}
