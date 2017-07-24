package com.example.demo.model;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by Nazri on 13/7/17.
 */

@Entity
public class Response {

    @Id //Declare as Primary Key
    @GeneratedValue(strategy= GenerationType.AUTO) //Auto generate the IDvalue
    private Integer responseID;

    @OneToOne(cascade = CascadeType.ALL)
    private User user;
    @OneToOne(cascade = CascadeType.ALL)
    private Survey survey;
    @OneToOne(cascade = CascadeType.ALL)
    private Question question;
    @OneToOne(cascade = CascadeType.ALL)
    private QuestionOption questionOption;

    private Date datetimeOfResponse;


    public Response(){

    }

    public Integer getResponseID() {
        return responseID;
    }

    public void setResponseID(Integer responseID) {
        this.responseID = responseID;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Survey getSurvey() {
        return survey;
    }

    public void setSurvey(Survey survey) {
        this.survey = survey;
    }

    public Question getQuestion() {
        return question;
    }

    public void setQuestion(Question question) {
        this.question = question;
    }

    public QuestionOption getQuestionOption() {
        return questionOption;
    }

    public void setQuestionOption(QuestionOption questionOption) {
        this.questionOption = questionOption;
    }


    public Date getDatetimeOfResponse() {
        return datetimeOfResponse;
    }

    public void setDatetimeOfResponse(Date datetimeOfResponse) {
        this.datetimeOfResponse = datetimeOfResponse;
    }
}
