package com.wjw.controller;


import com.wjw.model.Role;
import com.wjw.model.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;
import java.util.Date;

@Controller
public class TestController {

    @RequestMapping("hello")
    public String hello(Model model){
        model.addAttribute("hello","java hello");
        return "hello";
    }

    @RequestMapping("hello1")
    public String hello1(Model model, HttpSession httpSession){
        User user=new User("翁",18);
        user.setRole(new Role("帅哥"));
        model.addAttribute("user",user);
        model.addAttribute("date",new Date());
        httpSession.setAttribute("user",user);
        return "hello";
    }

    @ResponseBody
    @RequestMapping("order/details")
    public String details(String itemName,Model model){
        return "ok";
    }

    @RequestMapping("listrals")
    public String listrals(Model model){
        return "listrals";
    }
}

