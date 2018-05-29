package com.yao;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AppController {


    @RequestMapping(value = "/")
    public String toString() {
        System.out.println("this is hello 2");
        return "hello,this is eureka 2 client!";
    }
}
