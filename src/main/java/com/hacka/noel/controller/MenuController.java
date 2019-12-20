package com.hacka.noel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MenuController {

    @GetMapping("/")
    public String home() {
        return "indexWithModal";
    }

    @GetMapping("/index")
    public String index() {
        return "index";
    }

    @PostMapping("/save-info")
    public String saveInfo() {
        // TODO : MYSQL
        return "redirect:/index";
    }

    @GetMapping("/projet")
    public String projet() {
        return "projet";
    }

    @GetMapping("/a-propos")
    public String aPropos() {
        return "a-propos";
    }

    @GetMapping("/villes")
    public String villes() {
        return "villes";
    }

}
