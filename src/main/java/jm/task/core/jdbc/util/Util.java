package jm.task.core.jdbc.util;

import java.sql.*;
import java.io.IOException;

public class Util {
    // реализуйте настройку соеденения с БД
    private static final String DB_DRIVER = "com.mysql.cj.jdbc.Driver";
    private static final String USER_NAME = "myroot";
    private static final String PASSWORD = "myroot";
    private static final String URL = "jdbc:mysql://localhost:3306/myfirstdb";
    private static Connection connection;


    public static Connection getConnection() {
        connection = null;
        try {
            Class.forName(DB_DRIVER);
            connection = DriverManager.getConnection(URL,USER_NAME,PASSWORD);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return connection;
    }
}
