package com.godoro.jsftest.bolum4.scope;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class MyRequestBean {

    private int number;

    public MyRequestBean(){
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
