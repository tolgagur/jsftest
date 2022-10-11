package com.godoro.jsftest.utils;

import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class FacesUtils {

    public static HttpServletRequest getRequest(){
        return (HttpServletRequest) FacesContext
                .getCurrentInstance()
                .getExternalContext()
                .getRequest();
    }

    public static HttpServletResponse getResponse(){
        return (HttpServletResponse) FacesContext
                .getCurrentInstance()
                .getExternalContext()
                .getResponse();
    }

    public static HttpSession getSession(){
        return (HttpSession) FacesContext
                .getCurrentInstance()
                .getExternalContext()
                .getSession(true);
    }


}
