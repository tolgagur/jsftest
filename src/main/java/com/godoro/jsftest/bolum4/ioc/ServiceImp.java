package com.godoro.jsftest.bolum4.ioc;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean(name = "serviceObject")
@RequestScoped
public class ServiceImp implements ServiceSpecification{
    private String serviceString;

    public ServiceImp(){
        serviceString = " İsgörü Yerine-Getirim Degeri";
    }

    public String getServiceString() {
        return serviceString;
    }
}
