package com.codewithbubblu.DBConnection;

import java.sql.Connection;
import java.sql.DriverManager;


public class Database {
    Connection connection;
    private static final String connectionUrl="jdbc:mysql://localhost:3306/form";
    private static final String username="root";
    private static final String password="root";

    public Database(){
        connection=getDBConnection();
    }

    public static Connection getDBConnection() {
        Connection connection=null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection= DriverManager.getConnection(connectionUrl,username,password);
        } catch (Exception e) {
            System.out.println(e);
        }
        return connection;
    }
}
