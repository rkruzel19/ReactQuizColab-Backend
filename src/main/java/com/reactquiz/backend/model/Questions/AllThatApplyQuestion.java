package com.reactquiz.backend.model.Questions;

import com.reactquiz.backend.model.Answer;

public class AllThatApplyQuestion extends QuestionBase{

    public AllThatApplyQuestion(){
        super(QuestionType.ALLTHATAPPLY);
    }

    private Answer[] correctAnswers;
    private Answer[] choiceAnswers;
    private int optionNumber;

    public Answer[] getCorrectAnswer() {
        return correctAnswers;
    }

    public void setCorrectAnswer(Answer[] correctAnswer) {
        this.correctAnswers = correctAnswer;
    }

    public Answer[] getChoiceAnswer() {
        return choiceAnswers;
    }

    public void setChoiceAnswersAnswer(Answer[] correctAnswer) {
        this.choiceAnswers = choiceAnswers;
    }

    public int getOptionNumber() {
        return optionNumber;
    }

    public void setOptionNumber(int optionNumber) {
        this.optionNumber = optionNumber;
    }
}
