package com.tigran;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

                //метод для добавления пользователя в таблицу с полями: name, age, email
                //подключил заранее созданную БД - mybdtest и порт 3306, логин и пароль - "root"
public class AddUser {
    public static Object userDate() throws IOException {
        final String URL = "jdbc:mysql://localhost:3306/mydbtest?useUnicode=true&useSSL=true&useJDBCCompliantTimezoneShift=true" +
                "&useLegacyDatetimeCode=false&serverTimezone=UTC";
        final  String USERNAME = "root";
        final  String PASSWORD = "root";

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите имя: ");
        String name = reader.readLine();

        System.out.println("Введите возраст: ");
        int age = Integer.parseInt(reader.readLine());

        System.out.println("Введите email: ");
        String email = reader.readLine();

        try(Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            Statement statement = connection.createStatement())
        {
            statement.execute("INSERT INTO users(name, age, email) VALUES('"+name+"', '"+age+"', '"+email+"' )");
            System.out.println("Connected.");
            connection.close();
            System.out.println("Disconnected.");
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
        return name + " " + age + " " + email;
    }
}
