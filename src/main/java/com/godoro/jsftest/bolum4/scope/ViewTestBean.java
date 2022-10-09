package com.godoro.jsftest.bolum4.scope;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ViewTestBean {

    private int number;

    public ViewTestBean(){
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
