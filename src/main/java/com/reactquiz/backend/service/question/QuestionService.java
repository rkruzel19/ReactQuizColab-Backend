package com.reactquiz.backend.service.question;

import java.util.List;
import com.reactquiz.backend.model.Questions.QuestionBase;

public interface QuestionService {

    QuestionBase addQuestion(QuestionBase question);
    List<QuestionBase> getAllQuestions();

}
