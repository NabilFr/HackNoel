package com.hacka.noel.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

@Controller
public class QuestionController {

    @GetMapping("/")
    public String home() {

        return "test1";
    }
}