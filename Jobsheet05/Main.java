package Jobsheet05;

public class Main {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Nadia", "0812-0000-0001");
        SavingAccount acc1 = new SavingAccount("A001", customer1, 500000, 0.01);
        acc1.withdraw(150000);
        acc1.printInfo();
        acc1.printAccountType();
    }
}
