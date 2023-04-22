package com.reactquiz.backend.controller;

import com.reactquiz.backend.model.Questions.AllThatApplyQuestion;
import com.reactquiz.backend.model.Questions.QuestionBase;
import com.reactquiz.backend.service.question.ATAQuestionService;
import com.reactquiz.backend.service.question.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
@RequestMapping("/question")
public class QuestionController {

    @Autowired
    private QuestionService questionService;
    @Autowired
    private ATAQuestionService ataQuestionService;
    //region Base question CRUD
    @PostMapping("/add")
    public String addQuestion(@RequestBody QuestionBase question){
        questionService.addQuestion(question);
        return "Question was added";
    }
    @GetMapping("/getAll")
    public List<QuestionBase> getAllQuestions(){
        return questionService.getAllQuestions();
    }

    @GetMapping("/getId")
    public Optional<QuestionBase> getQuestionById(@RequestBody Long id){
        return questionService.getQuestionById(id);
    }
    @DeleteMapping("/delete")
    public String deleteQuestion(@RequestBody QuestionBase question){
        return questionService.deleteQuestion(question);
    }

    @PostMapping("/update")
    public Optional<QuestionBase> updateQuestion(@RequestBody QuestionBase updatedQuestion){
        return questionService.updateQuestion(updatedQuestion);
    }
    //endregion

    //region ATA question CRUD
    @GetMapping("/getAllAta")
    public List<AllThatApplyQuestion> getAllAtaQuestions(){ return ataQuestionService.getAllAtaQuestions(); }

    @PostMapping("/addAtaQuestion")
    public String addAtaQuestion(@RequestBody AllThatApplyQuestion allThatApplyQuestion){
        return ataQuestionService.addAtaQuestion(allThatApplyQuestion);

    }

    @DeleteMapping("/deleteAtaQuestion")
    public String deleteAtaQuestion(@RequestBody AllThatApplyQuestion allThatApplyQuestion)
    {
        return ataQuestionService.deleteAtaQuestion(allThatApplyQuestion);
    }

    @PostMapping("/updateAtaQuestion")
    public Optional<AllThatApplyQuestion> updateAtaQuestion(@RequestBody AllThatApplyQuestion allThatApplyQuestion)
    {
        return ataQuestionService.updateAtaQuestion(allThatApplyQuestion);
    }
    //endregion
}
