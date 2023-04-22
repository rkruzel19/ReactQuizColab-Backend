package com.reactquiz.backend.model.Questions;

import com.reactquiz.backend.model.Answer;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;

@Entity
public class AllThatApplyQuestion extends QuestionBase{

    public AllThatApplyQuestion(){
        super(QuestionType.ALLTHATAPPLY);
    }
    @OneToMany
    private Answer[] correctAnswers;
    @OneToMany
    private Answer[] choiceAnswers;
    private int optionNumber;

    public Answer[] getCorrectAnswer() {
        return correctAnswers;
    }

    public void setCorrectAnswer(Answer[] correctAnswer) {
        this.correctAnswers = correctAnswer;
    }

    public Answer[] getChoiceAnswers() {
        return choiceAnswers;
    }

    public void setChoiceAnswers(Answer[] correctAnswer) {
        this.choiceAnswers = choiceAnswers;
    }

    public int getOptionNumber() {
        return optionNumber;
    }

    public void setOptionNumber(int optionNumber) {
        this.optionNumber = optionNumber;
    }
}
