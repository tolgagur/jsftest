package com.godoro.jsftest.bolum6.property;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "bolum6ExampleBean")
@RequestScoped
public class ExampleBean {

    private long expressId;
    private String expressName;
    private double expressValue;


    public ExampleBean(){
        expressId = 12;
        expressName = "Tolga";
        expressValue = 35.55;
    }

    public long getExpressId() {
        return expressId;
    }

    public void setExpressId(long expressId) {
        this.expressId = expressId;
    }

    public String getExpressName() {
        return expressName;
    }

    public void setExpressName(String expressName) {
        this.expressName = expressName;
    }

    public double getExpressValue() {
        return expressValue;
    }

    public void setExpressValue(double expressValue) {
        this.expressValue = expressValue;
    }
}
