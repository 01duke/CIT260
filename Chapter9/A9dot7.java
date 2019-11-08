
public class A9dot7 {
    public static void main(String[] args) {
        Account a1 = new Account(1122, 20000.00);
        a1.setAnnualInterestRate(.045);
        a1.withdraw(2500.00);
        a1.deposit(3000.00);
        System.out.printf("Balance = $%.2f\n", a1.getBalance());
        System.out.printf("Monthly Interest = $%.2f\n", a1.getMonthlyIntrest());
        System.out.prinln("Date Created = " + a1.getDateCreated());
        
        Account a2 = new Account(1122, 200000.00);
        a2.setAnnualInterestRate(.045);
        a2.withdraw(2500.00);
        a2.deposit(3000.00);
        System.out.printf("Balance = $%.2f\n", a2.getBalance());
        System.out.printf("Monthly Interest = $%.2f\n", a2.getMonthlyIntrest());
        System.out.prinln("Date Created = " + a2.getDateCreated());
    }
}
