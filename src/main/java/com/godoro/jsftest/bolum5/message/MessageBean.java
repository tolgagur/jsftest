package com.godoro.jsftest.bolum5.message;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean
@RequestScoped
public class MessageBean {

    private String stringValue;
    private double doubleValue;

    public MessageBean() {
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
        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_INFO,"Bicim basarili","uzun uzun ayrıntı yazilir");

        FacesContext
                .getCurrentInstance()
                .addMessage(null, message);

        System.out.println("sicim " + stringValue);
        System.out.println("ikiser " + doubleValue);


    }
}
