package com.example.demo.model;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by Nazri on 13/7/17.
 */

// This tells Hibernate to make a table out of this class
@Entity
public class Survey {

    @Id //Declare as Primary Key
    @GeneratedValue(strategy= GenerationType.AUTO) //Auto generate the IDvalue
    private int surveyID;


    @OneToMany(
            cascade = CascadeType.ALL,
            orphanRemoval = true
    )
    private List<Question> questionList;

    public Survey(){

        questionList = new ArrayList<Question>();

    }

    public Integer getSurveyID() {
        return surveyID;
    }

    public void setSurveyID(Integer surveyID) {
        this.surveyID = surveyID;
    }

    public List<Question> getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List<Question> questionList) {
        this.questionList = questionList;
    }


    // 1 Survey have many questions
    // 1 Question have many options
    // 1 Response have 1 question and options and survey ID


}
