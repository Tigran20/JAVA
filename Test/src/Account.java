
public class Account {
    private String number;
    private double balance;
    private String customerName;
    private String customerEmail;
    private String customerPhoneNumber;

    public Account ()
    {
        this("1234", 0.0, "default", "default", "default");
    }

    public Account(String number, double balance, String customerName, String customerEmail, String customerPhoneNumber)
    {
        this.number = number;
        this.balance = balance;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhoneNumber = customerPhoneNumber;
    }

    public Account(String customerName, String customerEmail, String customerPhoneNumber) {
        this("99999", 105.0, customerName, customerEmail, customerPhoneNumber);
        System.out.println("Конструктор с параметрами - 2");
    }

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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
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

    public String getCustomerPhoneNumber() {
        return customerPhoneNumber;
    }

    public void setCustomerPhoneNumber(String customerPhoneNumber) {
        this.customerPhoneNumber = customerPhoneNumber;
    }

}
