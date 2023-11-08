package com.codewithbubblu.Dao;

import com.codewithbubblu.DBConnection.Database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AuthDao {
    private static final String PICK_USER = "SELECT * FROM users where email=? and password=?;";
    Database database;
    private final Connection con=Database.getDBConnection();;
    public AuthDao(){
        database=new Database();
    }
    public String validateUser(String email, String password) throws SQLException {
        String s="index";
        PreparedStatement ps=con.prepareStatement(PICK_USER);
        ps.setString(1,email);
        ps.setString(2,password);
        ResultSet rs=ps.executeQuery();
        if (rs.next()){
            if(email.equals(rs.getString("email")) && password.equals(rs.getString("password"))){
                s="home";
            }
        }
        return s;
    }
}
