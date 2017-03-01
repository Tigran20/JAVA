package Rectangle;

import java.util.Scanner;

public class Rectangle {
    Scanner sc = new Scanner(System.in);

    //создаем две переменные типа double
    private double side1 = sc.nextDouble();
    private double side2 = sc.nextDouble();

    //создаем геттеры и сеттеры
    public double getSide1()
    {
        return side1;
    }

    public void setSide1(double side1)
    {
        this.side1 = side1;
    }

    public double getSide2()
    {
        return side2;
    }

    public void setSide2(double side2)
    {
        this.side2 = side2;
    }

    //создаем метод вычисления площади
    double areaCalculator (double side1, double side2)
    {
        double sArea = side1 * side2;
        return sArea;
    }

    //создаем метод вычисления периметра
    double perimeterCalculator (double side1, double side2)
    {
        double sPerimeter = (side1 + side2) * 2;
        return sPerimeter;
    }
}


