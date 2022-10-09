package com.godoro.jsftest.bolum4.scope;

import javax.faces.bean.ApplicationScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@ApplicationScoped
public class ApplicationTestBean {

    private int number;

    public ApplicationTestBean(){
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
