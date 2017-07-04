import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException
    {
        Account account = new Account();
        System.out.println("Баланс на счету: " + account.getBalance());
        account.deposit(50);
        account.withdraw(100);
        account.deposit(350);
        account.withdraw(150);

        VipCustomer vipCustomer = new VipCustomer();
        System.out.println("Лимит кредита для VIP: " + vipCustomer.getCreditLimit());
    }
}
