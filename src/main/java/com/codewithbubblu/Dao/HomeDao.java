package com.codewithbubblu.Dao;

import com.codewithbubblu.DBConnection.Database;
import com.codewithbubblu.Model.UserModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class HomeDao {
    private static Connection connection;
    private static String GET_USER="SELECT * FROM users";

    public HomeDao(){
        connection= Database.getDBConnection();
    }

    public ArrayList<UserModel> getUser(){
        ArrayList<UserModel> users=new ArrayList<>();
        UserModel user=null;
        try{
            PreparedStatement statement=connection.prepareStatement(GET_USER);
            ResultSet rs = statement.executeQuery();
            if (rs.next()) {
                user=new UserModel();
                user.setId(rs.getInt("id"));
                user.setName(rs.getString("name"));
                user.setEmail(rs.getString("email"));
                users.add(user);
            }

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return users;
    }
}
