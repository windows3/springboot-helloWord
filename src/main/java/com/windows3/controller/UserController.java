package com.windows3.controller;

import com.windows3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 3 on 2018/11/6.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/createUser")
    public String createUser(String name,Integer age){
        userService.createUser(name, age);
        return "success";
    }
}
