package com.reactquiz.backend.controller;

import com.reactquiz.backend.model.Answer;
import com.reactquiz.backend.service.answer.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/answer")
public class AnswerController {

    @Autowired
    private AnswerService answerService;

    @PostMapping("/add")
    public String addAnswer(@RequestBody Answer answer){
        answerService.addAnswer(answer);
        return "Answer was added";
    }

    @GetMapping("/getAll")
    public List<Answer> getAllAnswers(){
        return answerService.getAllAnswers();
    }

}
