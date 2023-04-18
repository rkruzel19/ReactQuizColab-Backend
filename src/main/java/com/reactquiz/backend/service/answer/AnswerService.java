package com.reactquiz.backend.service.answer;

import com.reactquiz.backend.model.Answer;
import java.util.List;

public interface AnswerService {

    Answer addAnswer(Answer answer);
    List<Answer> getAllAnswers();

}
