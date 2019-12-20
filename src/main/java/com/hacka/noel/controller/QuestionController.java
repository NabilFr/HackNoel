package com.hacka.noel.controller;

import com.hacka.noel.entity.Question;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class QuestionController {

    Question question = new Question(0);

    @GetMapping("/question1")
    public String question1() {
        return "Question/question1";
    }

    @GetMapping("/question1-info")
    public String question1Info(@RequestParam int answer) {
        question.setResult(answer);
        return "Question/question1-info";
    }

    @GetMapping("/question2")
    public String question2() {
        return "Question/question2";
    }

    @GetMapping("/question2-info")
    public String question2Info(@RequestParam int answer) {
        question.setResult(question.getResult() + answer);
        return "Question/question2-info";
    }

    @GetMapping("/question3")
    public String question3() {
        return "Question/question3";
    }

    @GetMapping("/question3-info")
    public String question3Info(@RequestParam int answer) {
        question.setResult(question.getResult() + answer);
        return "Question/question3-info";
    }

    @GetMapping("/question4")
    public String question4() {
        return "Question/question4";
    }

    @GetMapping("/question4-info")
    public String question4Info(@RequestParam int answer) {
        question.setResult(question.getResult() + answer);
        return "Question/question4-info";
    }

    @GetMapping("/question5")
    public String question5() {
        return "Question/question5";
    }

    @GetMapping("/question5-info")
    public String question5Info(@RequestParam int answer) {
        question.setResult(question.getResult() + answer);
        return "Question/question5-info";
    }

    @GetMapping("/question6")
    public String question6() {
        return "Question/question6";
    }

    @GetMapping("/question6-info")
    public String question6Info(@RequestParam int answer) {
        question.setResult(question.getResult() + answer);
        return "Question/question6-info";
    }

    @GetMapping("/question7")
    public String question7() {
        return "Question/question7";
    }

    @GetMapping("/question7-info")
    public String question7Info(@RequestParam int answer) {
        question.setResult(question.getResult() + answer);
        return "Question/question7-info";
    }

    @GetMapping("/question8")
    public String question8() {
        return "question8";
    }

    @GetMapping("/question8-info")
    public String question8Info(@RequestParam int answer) {
        question.setResult(question.getResult() + answer);
        return "Question/question8-info";
    }

    @GetMapping("/result")
    public String result(Model out) {
        out.addAttribute("result", question.getResult());
        return "Question/result";
    }

    @GetMapping("/questionBis")
    public String result2(Model out) {
        out.addAttribute("result", question.getResult());
        return "Question/questionInfoBis";
    }

}