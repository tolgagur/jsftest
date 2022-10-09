package com.godoro.jsftest.bolum5.context;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

@ManagedBean
@RequestScoped
public class GetterBean {
    private String myRequestParameter;
    public GetterBean() {
        HttpServletRequest request = (HttpServletRequest) FacesContext.
                getCurrentInstance().
                getExternalContext().
                getRequest();

        myRequestParameter = request.getParameter("myRequestParameter");
    }

    public String getMyRequestParameter() {
        return myRequestParameter;
    }
}
