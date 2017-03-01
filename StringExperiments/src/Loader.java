
public class Loader
{
    public static void main(String[] args)
    {
        String text = "Вася заработал 5001 рублей, Петя - 7563 рубля, а Маша - 1000 рублей";

        String vasyaSalSubstr = text.substring(0, text.indexOf(" руб"));
        String vasyaSalStr = vasyaSalSubstr.substring(vasyaSalSubstr.lastIndexOf(' ')).trim();
        int vasyaSalary = Integer.parseInt(vasyaSalStr);

        String mashaSalSubstr = text.substring(0, text.lastIndexOf(" руб"));
        String mashaSalStr = mashaSalSubstr.substring(mashaSalSubstr.lastIndexOf(' ')).trim();
        int mashaSalary = Integer.parseInt(mashaSalStr);

        int summa = vasyaSalary + mashaSalary;

        System.out.println("Заработок Васи и Маши вместе: " + summa + Loader.rubEnding(summa));
    }

    static String rubEnding(int rub)
    {
        int rem = rub % 10;

        if(rem == 0 || rem > 4)
            return " рублей";
        else if(rem == 1)
            return " рубль";
        else
            return " рубля";
    }
}