package Rectangle;

//создаем точку вхождения, создаем экземляр класса Rectangle и выводим работу методов
class Main{
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle();

        double aC = rectangle.areaCalculator(rectangle.getSide1(), rectangle.getSide2());
        double pC = rectangle.perimeterCalculator(rectangle.getSide1(), rectangle.getSide2());

        System.out.println("Площадь четырехугольника: " + aC);
        System.out.println("Периметр четырехугольника: " + pC);
    }
}
