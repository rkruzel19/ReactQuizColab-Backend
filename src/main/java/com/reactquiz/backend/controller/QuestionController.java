package com.reactquiz.backend.controller;

import com.reactquiz.backend.model.Questions.QuestionBase;
import com.reactquiz.backend.service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;

    @PostMapping("/add")
    public String addQuestion(@RequestBody QuestionBase question){
        questionService.addQuestion(question);
        return "Question was added";
    }

    @GetMapping("/getAll")
    public List<QuestionBase> getAllQuestions(){
        return questionService.getAllQuestions();
    }

}
