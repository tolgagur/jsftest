package com.godoro.jsftest.bolum8.change;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

@ManagedBean(name = "bolum8ChangeBean")
@RequestScoped
public class ChangeBean {

    private String stringValue;

    public ChangeBean(){
        stringValue = "eski deger";
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public void listenAction(ValueChangeEvent event){

        System.out.println("yeni deger : " + event.getOldValue() );
        System.out.println("eski deger : " + event.getNewValue() );
        System.out.println("deger : " + event.getComponent().getClientId() );
    }
}
