package com.reactquiz.backend.service.question;

import com.reactquiz.backend.model.Questions.AllThatApplyQuestion;

import java.util.List;
import java.util.Optional;

public interface ATAQuestionService {

    List<AllThatApplyQuestion> getAllAtaQuestions();

    Optional<AllThatApplyQuestion> getAtaQuestionById(Long id);

    String addAtaQuestion(AllThatApplyQuestion allThatApplyQuestion);

    String deleteAtaQuestion(AllThatApplyQuestion allThatApplyQuestion);

    Optional<AllThatApplyQuestion> updateAtaQuestion(AllThatApplyQuestion allThatApplyQuestion);


}
