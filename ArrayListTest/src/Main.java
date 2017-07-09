import java.util.Scanner;

public class Main {
    private static Scanner scanner = new Scanner(System.in);
    private static MobilePhone mobilePhone = new MobilePhone("916 360-97-08");

    public static void main(String[] args) {

        boolean quit = false;
        startPhone();
        printActions();
        while (!quit){
            System.out.println("\nВведите цифру: (доступно 6 действий)");
            int action = scanner.nextInt();
            scanner.nextLine();

            switch (action){
                case 0:
                    System.out.println("Выключение...\n");
                    quit = true;
                    break;
                case 1:
                    mobilePhone.printContacts();
                    break;
                case 2:
                    addNewContact();
                    break;
                case 3:
                    updateContact();
                    break;
                case 4:
                    removeContact();
                    break;
                case 5:
                    queryContact();
                    break;
                case 6:
                    printActions();
                    break;
            }
        }

    }

    private static void addNewContact(){
        System.out.println("Введите имя нового контакта: ");
        String name = scanner.nextLine();
        System.out.println("Введите номер телефона: ");
        String phone = scanner.nextLine();
        Contact newContact = Contact.createContact(name, phone);
        if(mobilePhone.addNewContact(newContact)){
            System.out.println("Новый контакт добавлен: " + name + ", телефон =  " + phone);
        }
        else {
            System.out.println("Невозможно добавить, " + name + " уже в списке.");
        }
    }

    private static void updateContact(){
        System.out.println("Введите существующее имя: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if(existingContactRecord == null) {
            System.out.println("Контакт не найден");
            return;
        }

        System.out.print("Введите имя нового контакта: ");
        String newName = scanner.nextLine();
        System.out.print("Введите новый номер телефона: ");
        String newNumber = scanner.nextLine();
        Contact newContact = Contact.createContact(newName, newNumber);

        if(mobilePhone.updateContact(existingContactRecord, newContact)){
            System.out.println("Контакт успешно обновлен");
        }
        else {
            System.out.println("Ошибка обновления контакта");
        }
    }

    private static void removeContact() {
        System.out.println("Введите существующее имя: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Контакт не найден");
            return;
        }

        if(mobilePhone.removeContact(existingContactRecord)) {
            System.out.println("Удаление успешно");
        }
        else {
            System.out.println("Ошибка удаления контакта");
        }
    }

    private static void queryContact() {
        System.out.println("Введите существующее имя: ");
        String name = scanner.nextLine();
        Contact existingContactRecord = mobilePhone.queryContact(name);
        if (existingContactRecord == null) {
            System.out.println("Контакт не найден");
            return;
        }

        System.out.println("Имя: " + existingContactRecord.getName() + " номер телефона - " + existingContactRecord.getPhoneNumber());
    }


    private static void startPhone(){
        System.out.println("Телефон включается...");
    }

    private static void printActions(){
        System.out.println("\nДоступные действия: \nнажмите");
        System.out.println("0 - выключить телефон\n" +
                           "1 - вывод списка контактов\n" +
                           "2 - добавить новый контакт\n" +
                           "3 - обновить существующий контакт\n" +
                           "4 - удалить существующий контакт\n" +
                           "5 - очередь\n" +
                           "6 - вывести список доступных действий");
        System.out.println("Выберите действие: ");
    }
}
