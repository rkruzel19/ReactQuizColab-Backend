package com.reactquiz.backend.model.Questions;

import com.reactquiz.backend.model.Answer;

public class MultipleChoiceQuestion extends QuestionBase {
    public MultipleChoiceQuestion(){
        super(QuestionType.MULTIPLECHOICE);
    }
    private int optionNumber;
    private Answer correctAnswer;
    private Answer[] choiceAnswers;

    public Answer getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(Answer correctAnswer) {
        this.correctAnswer = correctAnswer;
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
