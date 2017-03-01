import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

public class Loader
{
    public static void main(String[] args)
    {
        DateFormat dateFormat = new SimpleDateFormat(" - dd.MM.yyyy - EEE", Locale.ENGLISH);
        Calendar calendar = Calendar.getInstance();
        calendar.set(1981, Calendar.MAY, 18);  // Задаем наш день рождения
        Date date = new Date();
        Date age = calendar.getTime();
        int i = 0;
        while (date.compareTo(age) > 0)
        {
            System.out.println(i + dateFormat.format(age));
            calendar.add(Calendar.YEAR, 1);
            age = calendar.getTime();
            i++;

        }

    }
}
