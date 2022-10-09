package com.godoro.jsftest.bolum4.scope;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

@ManagedBean
@SessionScoped
public class SessionTestBean {

    private int number;

    public SessionTestBean(){
        number = 6;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void increment(){
        number++;
    }
}
