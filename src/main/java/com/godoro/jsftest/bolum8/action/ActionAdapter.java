package com.godoro.jsftest.bolum8.action;

import javax.faces.context.FacesContext;
import javax.faces.event.AbortProcessingException;
import javax.faces.event.ActionEvent;
import javax.faces.event.ActionListener;

public class ActionAdapter implements ActionListener {
    @Override
    public void processAction(ActionEvent event) throws AbortProcessingException {

        System.out.println("sınıtan deger : " + event.getComponent().getClientId() );
        ActionBean actionBean = (ActionBean) FacesContext
                .getCurrentInstance()
                .getExternalContext()
                .getRequestMap()
                .get("bolum8EventActionBean");
        System.out.println("siniftan gelen bean " + actionBean.getStringValue());

    }
}
