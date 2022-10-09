package com.godoro.jsftest.bolum4.clientservice;

public class ClientBean {
    private String clientString;
    //@ManagedProperty("#{serviceBean}") --> faces-configde yapmamıza gerek kalmıyor.
    private ServiceBean service;

    public ClientBean() {
        clientString = "istemci";
    }
    public String getDependencyString(){
        return clientString + " " + service.getServiceString();
    }

    public void setService(ServiceBean service) {
        this.service = service;
    }
}
