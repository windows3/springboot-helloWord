package com.windows3.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

/**
 * Created by 3 on 2018/11/6.
 */
@Service
public class UserService {

    @Autowired
    private JdbcTemplate jdbcTemplate;


    public void createUser(String name,Integer age){
        jdbcTemplate.update("insert into user(username, name, age) VALUES (null,?,?)",name,age);
    }
}
