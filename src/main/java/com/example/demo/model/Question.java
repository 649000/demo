package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.CascadeType;
import javax.persistence.OneToMany;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nazri on 13/7/17.
 */
@Entity
public class Question {

    @Id //Declare as Primary Key
    @GeneratedValue(strategy= GenerationType.AUTO) //Auto generate the IDvalue
    private int questionID;

    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<QuestionOption> questionOptionList;

    public Question(){

        questionOptionList = new ArrayList<QuestionOption>();

    }


    public int getQuestionID() {
        return questionID;
    }

    public void setQuestionID(int questionID) {
        this.questionID = questionID;
    }

    public List<QuestionOption> getQuestionOptionList() {
        return questionOptionList;
    }

    public void setQuestionOptionList(List<QuestionOption> questionOptionList) {
        this.questionOptionList = questionOptionList;
    }
}
