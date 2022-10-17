package com.example.Mvctest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    @GetMapping("/index")
    public String goIndex() {
        return "index.html";
    }

    /*@GetMapping("/login")
    public String goLogin() {
        return "login.html";
    }*/
}
