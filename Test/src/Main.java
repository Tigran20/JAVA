import java.io.IOException;


public class Main {
    public static void main(String[] args) throws IOException
    {
        Account account = new Account("Alex", 999000660);
        account.withdraw(100.0);

        account.deposit(50.0);
        account.withdraw(100.0);

        account.deposit(51.0);
        account.withdraw(100.0);
    }
}
