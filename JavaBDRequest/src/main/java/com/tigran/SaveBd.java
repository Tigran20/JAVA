package com.tigran;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.*;
import java.sql.*;

public class SaveBd {

    public static void SaveBdInFile() throws Exception{
        final String URL = "jdbc:mysql://localhost:3306/mydbtest?useUnicode=true&useSSL=true&useJDBCCompliantTimezoneShift=true" +
                "&useLegacyDatetimeCode=false&serverTimezone=UTC";
        final  String USERNAME = "root";
        final  String PASSWORD = "root";
        Statement stmt;

        //получение данных с БД
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);

            stmt = connection.createStatement();
            String sql;
            sql = "SELECT * FROM mydbtest.users";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                int age = rs.getInt("age");
                String name = rs.getString("name");
                String email = rs.getString("email");

                String data = ("Id: " + id +
                        ", Имя: " + name +
                        ", Возраст: " + age +
                        ", Почта: " + email);

                //запись данных в файл
                try
                {
                    //сохраняет весь список из БД, но не создает обертку
                  BufferedWriter fileWriter = new BufferedWriter(new FileWriter("users.xml", true));
                  fileWriter.write(data);
                  fileWriter.newLine();
                  fileWriter.close();


                        //создает обертку, но выдает только последний элемент БД

//                    DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
//                    factory.setNamespaceAware(true);
//                    Document doc = factory.newDocumentBuilder().newDocument();
//
//                    Element root = doc.createElement("root");
//                    doc.appendChild(root);
//
//                        Element users = doc.createElement("users");
//                        root.appendChild(users);
//
//                            Element item = doc.createElement("item");
//                            item.setAttribute("user", data);
//                            users.appendChild(item);
//
//                    FileWriter file = new FileWriter("users.xml");
//
//                    Transformer transformer = TransformerFactory.newInstance().newTransformer();
//                    transformer.setOutputProperty(OutputKeys.INDENT, "yes");
//                    transformer.transform(new DOMSource(doc), new StreamResult(file));

                }
                catch (Exception ex)
                {
                    ex.printStackTrace();
                }
            }
            connection.close();
        }
        catch (SQLException ex)
        {
            ex.printStackTrace();
        }
    }
}