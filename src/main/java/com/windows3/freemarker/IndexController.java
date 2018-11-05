package com.windows3.freemarker;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by 3 on 2018/11/5.
 */
@Controller
public class IndexController {

    @RequestMapping("/indexFreemarker")
    public String index(Map<String,Object> map){
        map.put("name","zsn");
        map.put("age",24);
        map.put("sex","man");
        List<String> list = new ArrayList<>();
        list.add("zhangsan");
        list.add("lisi");
        map.put("userList",list);
        return "index";
    }


}
