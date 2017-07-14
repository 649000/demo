package com.example.demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Created by Nazri on 13/7/17.
 */
// This tells Hibernate to make a table out of this class
@Entity
public class QuestionOption {

    @Id //Declare as Primary Key
    @GeneratedValue(strategy= GenerationType.AUTO) //Auto generate the IDvalue
    private int optionID;

    private String optionContent;

    public QuestionOption(){

    }


    public int getOptionID() {
        return optionID;
    }

    public void setOptionID(int optionID) {
        this.optionID = optionID;
    }

    public String getOptionContent() {
        return optionContent;
    }

    public void setOptionContent(String optionContent) {
        this.optionContent = optionContent;
    }
}
