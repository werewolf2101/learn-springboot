package com.geasslinks.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * 处理请求
 */
//@Controller
//@ResponseBody

//这个类的所有方法返回的数据直接写给浏览器, (如果是对象转为json数据)
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello(){
        return "Hello World";
    }
    // RESTAPI方式
}
