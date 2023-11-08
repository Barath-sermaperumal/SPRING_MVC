package com.codewithbubblu.Dao;

import com.codewithbubblu.DBConnection.Database;
import com.codewithbubblu.Model.UserModel;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RegisterDao {
    Database database;
    private final Connection con=Database.getDBConnection();;
    public RegisterDao(){
        database=new Database();
    }

    public static final String INSERT_USER="insert into users (name,email,gender,country,state,language,password) values (?,?,?,?,?,?,?)";

    public void regUser(UserModel userModel) throws SQLException {
        PreparedStatement ps=con.prepareStatement(INSERT_USER);
        ps.setString(1, userModel.getName());
        ps.setString(2,userModel.getEmail());
        ps.setString(3, userModel.getGender());
        ps.setString(4,userModel.getCountry());
        ps.setString(5,userModel.getState());
        ps.setString(6,userModel.getLanguages());
        ps.setString(7,userModel.getPassword());
        ps.executeUpdate();
    }
}
