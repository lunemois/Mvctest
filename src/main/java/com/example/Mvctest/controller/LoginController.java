package com.example.Mvctest.controller;

import com.example.Mvctest.model.User;
import com.example.Mvctest.service.LoginService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
@RequiredArgsConstructor
public class LoginController {

    @Autowired
    private LoginService loginService;

    @PostMapping("/login")
    public String login(User user, Model model) {
        String result = loginService.login(user);
        model.addAttribute(result);
        return "login.html";
    }
}
