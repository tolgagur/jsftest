package com.godoro.jsftest.bolum7.navigation2;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;

@ManagedBean(name = "navigation2Bean")
@RequestScoped
public class ImplicitBean {

    private String inputString;

    public ImplicitBean(){
        inputString = "input deneme";
    }
    public String getInputString() {
        return inputString;
    }

    public void setInputString(String inputString) {
        this.inputString = inputString;
    }

    public String go(){
        return "target.xhtml";
    }

    public String succedOrStay(){
        if (inputString!=null && inputString.length()>3)
            return "target";

        FacesMessage message = new FacesMessage(FacesMessage.SEVERITY_ERROR,
                "Hatali girdiniz","bos girilemez");
        FacesContext.getCurrentInstance()
                .addMessage(null,message);
        return "index";
    }

}

