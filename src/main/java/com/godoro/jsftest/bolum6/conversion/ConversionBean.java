package com.godoro.jsftest.bolum6.conversion;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class ConversionBean {

    private long longValue;
    private double doubleValue;

    public ConversionBean() {
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

    public void perform(){
        System.out.println("uzun " + longValue);
        System.out.println("double " + doubleValue);
    }
}
