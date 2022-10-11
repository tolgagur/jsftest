package com.godoro.jsftest.bolum5.message2;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class MessageBean2 {

    private String stringValue;
    private double doubleValue;

    public MessageBean2() {
        stringValue = "first Value";
        doubleValue = 15.26;

    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public double getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public void process() {
        System.out.println("sicim " + stringValue);
        System.out.println("ikiser " + doubleValue);
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,
                "Bicim basarili",
                "uzun uzun ayrıntı yazilir");
        FacesContext
                .getCurrentInstance()
                .addMessage(null, message);

        if (stringValue.length()<5){
            FacesMessage messageString = new FacesMessage(FacesMessage.SEVERITY_ERROR,
                    "Sicim gecersiz",
                    "Sicim en az 5 karakterli olmalı");
            FacesContext
                    .getCurrentInstance()
                    .addMessage("myForm:myString",messageString);
        }



    }
}
