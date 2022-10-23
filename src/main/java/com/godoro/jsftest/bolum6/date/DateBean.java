package com.godoro.jsftest.bolum6.date;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.Date;

@ManagedBean
@RequestScoped
public class DateBean {


    Date date;

    public DateBean(){
        date = new Date();
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}
