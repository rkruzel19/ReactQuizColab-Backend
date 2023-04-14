package com.reactquiz.backend.service;

import com.reactquiz.backend.model.Question;

import java.util.List;

public interface QuestionService {

    Question addQuestion(Question question);
    List<Question> getAllQuestions();

}
