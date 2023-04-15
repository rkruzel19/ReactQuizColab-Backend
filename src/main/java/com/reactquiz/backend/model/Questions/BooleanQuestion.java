package com.reactquiz.backend.model.Questions;

import com.reactquiz.backend.model.Answer;

public class BooleanQuestion extends QuestionBase{
    public BooleanQuestion(){
        super(QuestionType.TRUEFALSE);
    }
    private Answer correctAnswer;

    public Answer getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(Answer correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
