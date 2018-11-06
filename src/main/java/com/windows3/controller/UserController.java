package com.windows3.controller;

import com.windows3.dao.UserDao;
import com.windows3.entity.User;
import com.windows3.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

/**
 * Created by 3 on 2018/11/6.
 */
@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @Autowired
    private UserDao userDao;

    @RequestMapping("/createUser")
    public String createUser(String name, Integer age) {
        userService.createUser(name, age);
        return "success";
    }

    @RequestMapping("/getUser")
    public Optional<User> getUser(Integer id) {

        Optional<User> byId = userDao.findById(id);
        return    byId;

    }
}
