package com.example.demo.model;

/**
 * Created by Nazri on 13/7/17.
 */
public class Response {

    private Integer responseID;
    private User user;
    private Survey survey;
    private Question question;
    private QuestionOption questionOption;


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


}
