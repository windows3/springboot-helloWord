package com.windows3.controller;

import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by 3 on 2018/11/5.
 */
//创建容器  tomcat
@EnableAutoConfiguration
//所有接口全部返回json格式
@RestController
public class HelloWordController {

    @RequestMapping("/index")
    public String index(){
        return "success";
    }
    @RequestMapping("/getMsg")
    public Map<String,Object> getMsg(){
        HashMap<String, Object> map = new HashMap<>();
        map.put("errorCode","200");
        map.put("errorMsg","failed");
        return map;
    }
    @RequestMapping("/getException")
    public String getException() {
        int i=1/0;
        return "";

    }

}
