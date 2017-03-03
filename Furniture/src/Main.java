

public class Main {
    public static void main(String[] args) {

        Table table = new Table();
        Chair chair = new Chair();

        table.setColor("Черный");
        table.putOnTable();
        String t = table.getColor();


        chair.setWeight(2);
        int c = chair.getWeight();

        System.out.println("Цвет стола: " + t);
        System.out.println("Вес стула: " + c);
    }
}
