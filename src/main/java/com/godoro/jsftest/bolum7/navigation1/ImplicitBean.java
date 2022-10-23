package com.godoro.jsftest.bolum7.navigation1;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class ImplicitBean {

    public String go(){
        return "target.xhtml";
    }
}
