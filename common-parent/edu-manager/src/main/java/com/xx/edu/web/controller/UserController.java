package com.xx.edu.web.controller;

import com.xx.edu.model.User;
import com.xx.edu.service.IUserService;
import com.xx.edu.service.impl.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("user")
public class UserController {

    @Autowired
    private UserServiceImpl userService;

    @RequestMapping("login")
    public String login(){
        System.out.println("abcdefg");
        return "/Default";
    }

    @RequestMapping("find")
    public String find(Integer id){
        System.out.println("abcdefg1111");
        User user = (User) userService.findById(id);
        System.out.println(user);

        return null;
    }

    @RequestMapping("manage")
    public String manage(){
        return "/User/UserManage";
    }

    @RequestMapping("info")
    public String info(){
        return "/User/UserInfo";
    }

    @RequestMapping("edit")
    public String edit(){
        return "/User/UserEdit";
    }


}
