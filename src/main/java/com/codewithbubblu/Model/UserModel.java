package com.codewithbubblu.Model;

import java.util.List;

public class UserModel {
    private int id;
    private String name;
    private String email;
    private String gender;
    private String country;
    private String state;
    private String languages;
    private String password;
    private String c_password;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getC_password() {
        return c_password;
    }

    public void setC_password(String c_password) {
        this.c_password = c_password;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getLanguages() {
        String s="";
//        for (String language : languages) {
//            if (s != "") {
//                s = s + "," + language;
//            }
//        }
        return s;
    }

//    public void setLanguages(String[] languages) {
//        this.languages = languages;
//    }
}
