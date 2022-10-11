package com.godoro.jsftest.bolum5.context2;

import com.godoro.jsftest.utils.FacesUtils;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

@ManagedBean
@RequestScoped
public class SetterBean {

    private String myInput;
    public SetterBean(){
        myInput = "SetterBean gönder";
    }

    public String getMyInput() {
        return myInput;
    }

    public String setToRequest2(){
        HttpServletRequest request = (HttpServletRequest) FacesContext.
                getCurrentInstance().
                getExternalContext().
                getRequest();
        request.setAttribute("myRequestAttribute",myInput);
        return  "Getter.xhtml";
    }
    public void setToSession(){
        HttpSession session = FacesUtils.getSession();
        session.setAttribute("mySessionAttribute",myInput);

        HttpServletResponse response = FacesUtils.getResponse();

        try {
            response.sendRedirect("Getter.xhtml");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void setMyInput(String myInput) {
        this.myInput = myInput;
    }

    public String setToRequest(){
        return "Getter.xhtml?faces-redirect=true";
    }
}
