package com.reactquiz.backend.service.question;

import com.reactquiz.backend.model.Questions.AllThatApplyQuestion;
import com.reactquiz.backend.model.Questions.QuestionBase;
import com.reactquiz.backend.repository.questions.ATAQuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class ATAQuestionServiceImp implements ATAQuestionService {
    @Autowired
    ATAQuestionRepository ataQuestionRepository;
    @Override
    public List<AllThatApplyQuestion> getAllAtaQuestions() { return ataQuestionRepository.findAll(); }

    //This actually might be redundant, since ata questions shouldn't have unique ids from base questions which already have a get by id?
    public Optional<AllThatApplyQuestion> getAtaQuestionById(Long id){
        return ataQuestionRepository.findById(id);
    }
    public String addAtaQuestion(AllThatApplyQuestion allThatApplyQuestion){
        ataQuestionRepository.save(allThatApplyQuestion);
        return "Question added";
    }

    public String deleteAtaQuestion(AllThatApplyQuestion allThatApplyQuestion){
        Optional<AllThatApplyQuestion> optionalQuestion = ataQuestionRepository.findById(allThatApplyQuestion.getId());
        if(optionalQuestion.isPresent()){
            ataQuestionRepository.delete(allThatApplyQuestion);
            return "Question deleted";
        }else {
            return "Question not found";
        }

    }

    public Optional<AllThatApplyQuestion> updateAtaQuestion(AllThatApplyQuestion updatedAtaApplyQuestion){
        Optional<AllThatApplyQuestion> existingAtaQuestion = ataQuestionRepository.findById(updatedAtaApplyQuestion.getId());
        if(existingAtaQuestion.isPresent()){
            AllThatApplyQuestion ataQuestion = existingAtaQuestion.get();
            ataQuestion.setCorrectAnswer(updatedAtaApplyQuestion.getCorrectAnswer());
            ataQuestion.setChoiceAnswers(updatedAtaApplyQuestion.getChoiceAnswers());
            ataQuestion.setOptionNumber(updatedAtaApplyQuestion.getOptionNumber());
            ataQuestionRepository.save(ataQuestion);
            return Optional.of(ataQuestion);
        } else {
            return Optional.empty();
        }



    }
}
