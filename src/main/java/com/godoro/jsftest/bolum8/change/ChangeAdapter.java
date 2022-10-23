package com.godoro.jsftest.bolum8.change;

import com.godoro.jsftest.bolum8.action.ActionBean;

import javax.faces.context.FacesContext;
import javax.faces.event.*;

public class ChangeAdapter implements ValueChangeListener {

    @Override
    public void processValueChange(ValueChangeEvent event) throws AbortProcessingException {
        System.out.println("sınıtan deger : " + event.getComponent().getClientId() );
        ChangeBean changeBean = (ChangeBean) FacesContext
                .getCurrentInstance()
                .getExternalContext()
                .getRequestMap()
                .get("bolum8ChangeBean");

        System.out.println("old deger : " + event.getOldValue() );
        System.out.println("new deger : " + event.getNewValue() );
        System.out.println("siniftan gelen bean " + changeBean.getStringValue());
    }
}
