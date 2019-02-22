package com.baizhi.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/test1")
public class test {
    @RequestMapping("/test1")
    public String hhh() {
        System.out.println(1);
        System.out.println(1);
        return "index";
    }
}
