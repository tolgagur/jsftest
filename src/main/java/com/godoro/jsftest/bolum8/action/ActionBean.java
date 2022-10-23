package com.godoro.jsftest.bolum8.action;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;

@ManagedBean(name = "bolum8EventActionBean")
@RequestScoped
public class ActionBean {

    private String stringValue;


    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public void listenAction(ActionEvent event){

        System.out.println("deger : " + stringValue );
        System.out.println("deger : " + event.getComponent().getClientId() );
    }
}
