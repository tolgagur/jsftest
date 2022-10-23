package com.godoro.jsftest.bolum9.ajaxBasic;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class AjaxBean {

    private String inputValue;
    private String outValue;

    public String getInputValue() {
        return inputValue;
    }

    public void setInputValue(String inputValue) {
        this.inputValue = inputValue;
        outValue = inputValue + " gelen veri";
    }

    public String getOutValue() {
        return outValue;
    }


}
