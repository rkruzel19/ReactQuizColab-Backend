package com.reactquiz.backend.service.question;

import java.util.List;
import java.util.Optional;

import com.reactquiz.backend.model.Questions.AllThatApplyQuestion;
import com.reactquiz.backend.model.Questions.QuestionBase;

public interface QuestionService {

    QuestionBase addQuestion(QuestionBase question);
    List<QuestionBase> getAllQuestions();
    Optional<QuestionBase> getQuestionById(Long id);
    String deleteQuestion(QuestionBase question);
    Optional<QuestionBase> updateQuestion(QuestionBase updatedQuestion);


}
