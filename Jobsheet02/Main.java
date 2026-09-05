package Jobsheet02;

public class Main {
    public static void main(String[] args) {
        account from = new account("Nadia", 500000);
        account to = new account("Budi", 200000);
        
        from.transferTo(to, 100000);
        
        from.printInfo();
        to.printInfo();
    }
}
