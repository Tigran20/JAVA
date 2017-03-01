public class Loader
{
    public static void main(String[] args)
    {

        Integer dimaAge = 54;
        Integer mishaAge = 18;
        Integer vasyaAge = 19;

        String name_1 = "Dima";
        String name_2 = "Misha";
        String name_3 = "Vasya";

        // определяем младший и старший возраст через логический оператор && и тернарный оператор ?:

        Integer youngest = (dimaAge < mishaAge && dimaAge < vasyaAge) ? dimaAge : (mishaAge < vasyaAge ? mishaAge : vasyaAge);
        Integer oldest = (dimaAge > mishaAge && dimaAge > vasyaAge) ? dimaAge : (mishaAge > vasyaAge ? mishaAge : vasyaAge);
        Integer middle = null;

        if (vasyaAge == mishaAge)
        {
            System.out.println(name_2 + " " + "and" + " " + name_3 + " " + "-" + " " + vasyaAge);
        }

        if (dimaAge == mishaAge)
        {
            System.out.println(name_1 + " " + "and" + " " + name_2 + " " + "-" + " " + dimaAge);
        }

        if (dimaAge == vasyaAge)
        {
            System.out.println(name_1 + " " + "and" + " " + name_3 + " " + "-" + " " + vasyaAge);
        }


        // определяем средний возраст

        if (dimaAge < oldest && dimaAge > youngest)
        {
            middle = dimaAge;
        }

        if (mishaAge < oldest && mishaAge > youngest)
        {
            middle = mishaAge;
        }

        if (vasyaAge < oldest && vasyaAge > youngest)
        {
            middle = vasyaAge;
        }


        System.out.println("Most old age is "+oldest);
        System.out.println("Middle age is "+middle);
        System.out.println("Most young age is "+youngest);

    }
}