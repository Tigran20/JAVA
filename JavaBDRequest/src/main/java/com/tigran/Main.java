package com.tigran;


public class Main {
    public static void main(String[] args) throws Exception {
        //при вызове данного метода мы заполняем данные с клавиатуры и записываем в БД
        AddUser.userDate();

        //данный метод сохраняет данные БД в файл users.xml
        SaveBd.SaveBdInFile();
    }
}
