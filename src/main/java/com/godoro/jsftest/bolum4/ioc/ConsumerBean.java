package com.godoro.jsftest.bolum4.ioc;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class ConsumerBean {
    private String clientString;
    @ManagedProperty("#{serviceObject}")
    private ServiceSpecification service;

    public ConsumerBean() {
        clientString = "Alimci";
    }
    public String getInversionString(){
        return clientString + " " + service.getServiceString();
    }

    public ServiceSpecification getService() {
        return service;
    }

    public void setService(ServiceSpecification service) {
        this.service = service;
    }
}
