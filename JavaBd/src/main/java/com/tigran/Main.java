package com.tigran;



import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {

    private final static String URLFIXED =
            "jdbc:mysql://localhost:3306/mydbtest?useUnicode=true&useSSL=true&useJDBCCompliantTimezoneShift=true" +
                    "&useLegacyDatetimeCode=false&serverTimezone=UTC";
    private static final String USERNAME = "root";
    private static final String PASSWORD = "root";


    public static void main(String[] args) {
        Connection connection;

        try
        {
            connection = DriverManager.getConnection(URLFIXED, USERNAME, PASSWORD);
            if(!connection.isClosed())
            {
                System.out.println("Соединение с БД установлено!");
            }

            connection.close();

            if(connection.isClosed())
            {
                System.out.println("Соединение с БД закрыто!");
            }
        }

        catch (SQLException e)
        {
            System.out.println("Не удалось загрузить драйвер");
        }
    }
}
