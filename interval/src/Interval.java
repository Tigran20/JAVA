import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


public class Interval
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Введите число от 1 до 20:");
        String number = reader.readLine();

        switch (number) {
            case "1":
            case "2":
            case "3":
            case "4":
            case "5":
            case "6":
            case "7":
            case "8":
            case "9":
                System.out.println("Вы попали в промежуток от 1 до 9");
                break;
            case "10":
            case "11":
            case "12":
            case "13":
            case "14":
            case "15":
            case "16":
            case "17":
            case "18":
            case "19":
            case "20":
                System.out.println("Вы попали в промежуток от 10 до 20");
                break;
            default:
                System.out.println("Вы ввели неверное число!");
        }
    }
}
