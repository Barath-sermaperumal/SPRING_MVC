package com.codewithbubblu.controller;

import com.codewithbubblu.Dao.AuthDao;
import com.codewithbubblu.Dao.HomeDao;
import com.codewithbubblu.Dao.RegisterDao;
import com.codewithbubblu.Model.UserModel;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.sql.SQLException;
import java.util.ArrayList;

@Controller
public class HomeController {

    UserModel user;
    HomeDao homeDao;
    public HomeController(){
        user=new UserModel();
        homeDao=new HomeDao();
    }
    @RequestMapping(value = "/")
    public String index(@ModelAttribute("user") UserModel user){
        return "index";
    }

    @RequestMapping(value = "/home",method = RequestMethod.POST)
    public String home(@ModelAttribute("user") UserModel user,HttpServletRequest httpServletRequest,Model model) throws SQLException {
        AuthDao authDao=new AuthDao();
        String res=authDao.validateUser(user.getEmail(),user.getPassword());
        if(res.equals("index")){
            httpServletRequest.setAttribute("error", true);
        }
        ArrayList<UserModel> users;
        users = homeDao.getUser();
        model.addAttribute("users", users);
        return res;
    }
    @RequestMapping(value = "/register",method = RequestMethod.GET)
    public String register(Model model){
        UserModel user=new UserModel();
        model.addAttribute("user", user);
        return "register";
    }

    @RequestMapping(value = "/register",method = RequestMethod.POST)
    public String register(@ModelAttribute("user") UserModel user) throws SQLException {
        if (user.getPassword().equals(user.getC_password())) {
            RegisterDao registerDao=new RegisterDao();
            registerDao.regUser(user);
        }
        return "index";
    }

    @RequestMapping(value = "/home", method = RequestMethod.GET)
    public String home(Model model) {
        System.out.println("home navigated");
        ArrayList<UserModel> users;
        users = homeDao.getUser();
        System.out.println(users);
        model.addAttribute("users", users);
        return "home";
    }
}
