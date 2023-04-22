package com.reactquiz.backend.service.question;

import com.reactquiz.backend.model.Questions.QuestionBase;
import com.reactquiz.backend.repository.questions.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

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

    public Optional<QuestionBase> getQuestionById(Long id){
        return questionRepository.findById(id);
    }

    public String deleteQuestion(QuestionBase question){
        Optional<QuestionBase> optionalQuestion = questionRepository.findById(question.getId());
        if (optionalQuestion.isPresent()) {
            questionRepository.delete(question);
            return "Question deleted";
        } else {
            return "Question not found";
        }
    }

    //TODO: Maybe add a bulk delete function to avoid needing to loop on the front end
    public Optional<QuestionBase> updateQuestion(QuestionBase updatedQuestion) {
        Optional<QuestionBase> optionalQuestion = questionRepository.findById(updatedQuestion.getId());
        if(optionalQuestion.isPresent()) {
            QuestionBase question = optionalQuestion.get();
            question.setQuestionText(updatedQuestion.getQuestionText());
            question.setQuestionType(updatedQuestion.getQuestionType());
            question.setLibrary(updatedQuestion.getLibrary());
            question.setTags(updatedQuestion.getTags());
            question.setImgURL(updatedQuestion.getImgURL());
            questionRepository.save(question);
            return Optional.of(question);
        } else {
            return Optional.empty();
        }
    }



}
