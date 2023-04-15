package com.reactquiz.backend.model.Questions;

import com.reactquiz.backend.model.Library;
import com.reactquiz.backend.model.Tag;
import jakarta.persistence.*;

@Entity
public class QuestionBase {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String questionText;
    private QuestionType questionType;
    @OneToOne
    private Library library;
    @OneToMany
    private Tag[] tags;
    private String[] questionImgUrl;

    public QuestionBase(QuestionType questionType) {
        this.questionType=questionType;
    }

    public QuestionBase(){

    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public QuestionType getQuestionType() {
        return questionType;
    }

    public void setQuestionType(QuestionType questionType) {
        this.questionType = questionType;
    }

    public Library getLibrary() {
        return library;
    }

    public void setLibrary(Library library) {
        this.library = library;
    }

    public Tag[] getTags() {
        return tags;
    }

    public void setTags(Tag[] tags) {
        this.tags = tags;
    }

    public String[] getImgURL() {
        return questionImgUrl;
    }

    public void setImgURL(String[] questionImgUrl) {
        this.questionImgUrl = questionImgUrl;
    }

}


