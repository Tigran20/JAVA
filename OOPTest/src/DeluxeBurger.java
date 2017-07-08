

public class DeluxeBurger extends Hamburger{

    public DeluxeBurger() {
        super("Делюкс", "Курица и Баранина", "белый", 300);
        super.addHamburgerAddition1("Наггетсы", 60);
        super.addHamburgerAddition2("Кофе", 80);
    }
}
