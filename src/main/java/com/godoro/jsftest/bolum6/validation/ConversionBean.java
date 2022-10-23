package com.godoro.jsftest.bolum6.validation;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "validationConversion")
@RequestScoped
public class ConversionBean {

    private long longValue;
    private double doubleValue;
    private String stringValue;
    private String requiredValue;

    public ConversionBean() {
        requiredValue="dsa";
        stringValue = "deneme ";
        longValue = 1321412;
        doubleValue = 12314.4123;
    }

    public long getLongValue() {
        return longValue;
    }

    public void setLongValue(long longValue) {
        this.longValue = longValue;
    }

    public double getDoubleValue() {
        return doubleValue;
    }

    public void setDoubleValue(double doubleValue) {
        this.doubleValue = doubleValue;
    }

    public String getStringValue() {
        return stringValue;
    }

    public void setStringValue(String stringValue) {
        this.stringValue = stringValue;
    }

    public String getRequiredValue() {
        return requiredValue;
    }

    public void setRequiredValue(String requiredValue) {
        this.requiredValue = requiredValue;
    }

    public void perform() {
        System.out.println("uzun " + longValue);
        System.out.println("double " + doubleValue);
        System.out.println("string " + stringValue);
        System.out.println("deger " + requiredValue );
    }
}
