

public class Main {

    public static void main(String[] args) {

        Hamburger hamburger = new Hamburger("Биг-Тейсти",  "говядина", "белый", 180);
        hamburger.addHamburgerAddition1("соус", 30);
        double priceNormal1 = hamburger.itemizeHamburger();

        System.out.println();
        Hamburger hamburger2 = new Hamburger("Биг-Мак",  "говядина", "белый", 110);
        hamburger2.addHamburgerAddition1("сыр", 20);
        double priceNormal2 = hamburger2.itemizeHamburger();
        System.out.println();

        double priceNormal = priceNormal1 + priceNormal2;

        HealthyBurger healthyBurger = new HealthyBurger("свинина", 230);
        healthyBurger.addHealthAddition1("капуста", 45);
        double priceHealthy = healthyBurger.itemizeHamburger();
        System.out.println();

        DeluxeBurger deluxeBurger = new DeluxeBurger();
        double db = deluxeBurger.itemizeHamburger();

        double priceTotal = priceNormal + priceHealthy + db;

        System.out.println("\n");
        System.out.println("Общаяя стоимость всех бургеров: " + priceTotal);
    }
}
