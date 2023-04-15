package com.reactquiz.backend.model.Questions;

import com.reactquiz.backend.model.Answer;
public class FillInTheBlankQuestion extends QuestionBase {

    public FillInTheBlankQuestion(){
        super(QuestionType.FILLINTHEBLANK);
    }
    /*I'm thinking about multi fill in the blank ie: Java is ______ oriented programming language
    based on ___
     */
    private Answer[] correctAnswer;

    public Answer[] getCorrectAnswer() {
        return correctAnswer;
    }

    public void setCorrectAnswer(Answer[] correctAnswer) {
        this.correctAnswer = correctAnswer;
    }
}
