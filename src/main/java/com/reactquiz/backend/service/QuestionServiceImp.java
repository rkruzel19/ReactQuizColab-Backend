package com.reactquiz.backend.service;

import com.reactquiz.backend.model.Questions.QuestionBase;
import com.reactquiz.backend.repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionServiceImp implements QuestionService{

    @Autowired
    QuestionRepository questionRepository;

    @Override
    public QuestionBase addQuestion(QuestionBase question) {
        return questionRepository.save(question);
    }

    @Override
    public List<QuestionBase> getAllQuestions() {
        return questionRepository.findAll();
    }
}
