
import java.io.IOException;
import java.util.Scanner;

public class Calculator
{
    public static void main(String[] args) throws IOException
    {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите первое число: ");
        int operand1 = scanner.nextInt();

        System.out.println("Введите второе число: ");
        int operand2 = scanner.nextInt();

        System.out.println("Введите арифметический знак: ");
        String sign = scanner.next();

        switch (sign) {
            case "+":
                System.out.println(operand1 + operand2);
                break;
            case "-":
                System.out.println(operand1 - operand2);
                break;
            case "*":
                System.out.println(operand1 * operand2);
                break;
            case "/" :
                    try
                    {
                        System.out.println(operand1 / operand2);
                    }
                    catch (Exception e)
                    {
                        System.out.println("На ноль делить нельзя!");
                    }
                break;
            default:
                System.out.println("Неверный знак");
        }
    }
}
