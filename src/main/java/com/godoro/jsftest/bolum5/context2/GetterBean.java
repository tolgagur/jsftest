package com.godoro.jsftest.bolum5.context2;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

@ManagedBean(name = "context2GetterBean")
@RequestScoped
public class GetterBean {
    private String myRequestParameter;
    private String myRequestAttribute;
    public GetterBean() {
        HttpServletRequest request = (HttpServletRequest) FacesContext.
                getCurrentInstance().
                getExternalContext().
                getRequest();

        myRequestAttribute = (String) request.getAttribute("myRequestAttribute");
        myRequestParameter = request.getParameter("myRequestParameter");
    }

    public String getMyRequestAttribute() {
        return myRequestAttribute;
    }

    public String getMyRequestParameter() {
        return myRequestParameter;
    }
}
