


public class HealthyBurger extends Hamburger{

    private String healthy1Name;
    private double healthy1Price;

    private String healthy2Name;
    private double healthy2Price;



    public HealthyBurger(String meat, double price) {
        super("Здоровый", meat,"Коричневая рожь" , price);
    }

    public void addHealthAddition1(String name, double price) {
        this.healthy1Name = name;
        this.healthy1Price = price;
    }

    public void addHealthAddition2(String name, double price) {
        this.healthy2Name = name;
        this.healthy2Price = price;
    }

    @Override
    public double itemizeHamburger() {
        double hamburgerPrice = super.itemizeHamburger();
        if(this.healthy1Name != null) {
            hamburgerPrice += this.healthy1Price;
            System.out.println("-Добавлена " + healthy1Name + " стоимостью: " + this.healthy1Price);
        }
        if(this.healthy2Name != null) {
            hamburgerPrice += this.healthy2Price;
            System.out.println("-Добавлен " + healthy2Name + " стоимостью: " + this.healthy2Price);
        }

        return hamburgerPrice;
    }
}
