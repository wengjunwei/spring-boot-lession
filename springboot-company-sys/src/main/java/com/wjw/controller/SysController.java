package com.wjw.controller;

import com.wjw.model.User;
import com.wjw.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class SysController {

    @Autowired
    private UserService userService;

    @GetMapping("insert")
    public String insert(User user){
        userService.insert(user);
        return "success";
    }

    @GetMapping("getById")
    public User getById(int userId){

        return userService.getById(userId);
    }

    @GetMapping("list")
    public List<User> list(){
        return userService.list();
    }

    @GetMapping("update")
    public String update(User user){
        userService.update(user);
        return "success";
    }

    @GetMapping("delete")
    public String delete(int empId){
        userService.delete(empId);
        return "success";
    }

}
