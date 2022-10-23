package com.godoro.jsftest.bolum6.method;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class MethodBean {

    private String value;

    public MethodBean(){
        value = "value con";
    }

    public void myMethod(){
        System.out.println("void method");
    }

    public void myMethod(String par){
        System.out.println("void method " + par);
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
