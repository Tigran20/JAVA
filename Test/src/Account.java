
public class Account {
    private int number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private int customerPhoneNumber;

    public void deposit(double depositAmount)
    {
        this.balance += depositAmount;
        System.out.println("Депозит на " + depositAmount + " создан. Текущий баланс " + this.balance);
    }

    public void withdraw(double withdrawalAmount)
    {
        if (this.balance - withdrawalAmount <= 0)
        {
            System.out.println("Доступно " + balance + ". Невозможно снять " + withdrawalAmount);
        }
        else
        {
            this.balance -= withdrawalAmount;
            System.out.println("Снятие " + withdrawalAmount + " выполнено. Остаток на счете = " + this.balance);
        }
    }

    public Account(String customerName, int customerPhoneNumber) {
        this.customerName = customerName;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public int getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(int customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }
}
