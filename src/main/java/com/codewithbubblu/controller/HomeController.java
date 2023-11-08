package com.codewithbubblu.controller;

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

@Controller
public class HomeController {

    UserModel user;
    public HomeController(){
        user=new UserModel();
    }
    @RequestMapping("/")
    public String index(){
        return "index";
    }
    @RequestMapping("/home")
    public String home(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Model model){
        String name=httpServletRequest.getParameter("rname");
        String email=httpServletRequest.getParameter("remail");
        String gender=httpServletRequest.getParameter("rgender");
        String language=httpServletRequest.getParameter("rlanguage");
        String state=httpServletRequest.getParameter("rstate");
        String country=httpServletRequest.getParameter("rcountry");
        String password=httpServletRequest.getParameter("rpassword");
        String c_password=httpServletRequest.getParameter("rc_password");

        model.addAttribute("name",name);
        model.addAttribute("email",email);
        model.addAttribute("gender",gender);
        model.addAttribute("language",language);
        model.addAttribute("state",state);
        model.addAttribute("country",country);
        model.addAttribute("password",password);
        model.addAttribute("c_password",c_password);

        return "home";
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
}
