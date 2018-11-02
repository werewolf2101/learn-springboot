package com.geasslinks.springboot.controller;

import com.sun.xml.internal.xsom.impl.scd.Iterators;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {
    @ResponseBody
    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }

    //查出一些数据, 在页面展示
    @GetMapping("/success")
    public String success(Map<String,Object> map){
        map.put("hello","<h1>你好</h1>");
        map.put("users", Arrays.asList("zs", "ls", "ww"));
        //classpath:/templates/success.html
        return "success";
    }
}
