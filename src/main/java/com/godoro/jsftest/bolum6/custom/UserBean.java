package com.godoro.jsftest.bolum6.custom;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.bean.SessionScoped;
import java.io.Serializable;

@ManagedBean(name="customUser")
@RequestScoped
public class UserBean implements Serializable {

    String bookmarkURL;

    public String getBookmarkURL() {
        return bookmarkURL;
    }

    public void setBookmarkURL(String bookmarkURL) {
        this.bookmarkURL = bookmarkURL;
    }

}