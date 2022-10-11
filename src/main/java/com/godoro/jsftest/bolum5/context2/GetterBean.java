package com.godoro.jsftest.bolum5.context2;

import com.godoro.jsftest.utils.FacesUtils;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

@ManagedBean(name = "context2GetterBean")
@RequestScoped
public class GetterBean {
    private String myRequestParameter;
    private String myRequestAttribute;
    private String mySessionAttribute;
    public GetterBean() {
        HttpServletRequest request = FacesUtils.getRequest();
        myRequestAttribute = (String) request.getAttribute("myRequestAttribute");
        myRequestParameter = request.getParameter("myRequestParameter");

        HttpSession session = FacesUtils.getSession();
        mySessionAttribute = (String) session.getAttribute("mySessionAttribute");
        //genellikle sessionAttribute alındıktan sonra silinir
        session.removeAttribute(mySessionAttribute);
    }

    public String getMyRequestAttribute() {
        return myRequestAttribute;
    }

    public String getMyRequestParameter() {
        return myRequestParameter;
    }

    public String getMySessionAttribute() {
        return mySessionAttribute;
    }

}
