package com.hacka.noel.controller;

import com.hacka.noel.entity.Question;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class QuestionController {

    Question question = new Question(0);

    @GetMapping("/")
    public String home() {

        return "question1";
    }
}