package com.windows3.yml.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by 3 on 2018/11/5.
 */
@RestController
public class IndexController3 {

    @RequestMapping("/getTest")
    public String getTest(){
        return "success";
    }
}
