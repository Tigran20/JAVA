package Address;

public class Main
{
    public static void main(String[] args)
    {
        Address address = new Address();
        address.setCountry("Россия");
        address.setCity("Москва");
        address.setStreet("Улица");

        String country = address.getCountry();
        String city = address.getCity();
        String street = address.getStreet();

        System.out.println("Полный адрес: " + country + ", г." + city + ", ул." + street);
    }
}
