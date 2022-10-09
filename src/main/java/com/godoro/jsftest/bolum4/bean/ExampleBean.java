package com.godoro.jsftest.bolum4.bean;

public class ExampleBean {

    private String myFirst;
    private String mySecond;

    public ExampleBean(){
        myFirst = "ilk deger";
    }

    public String getMySecond() {
        return mySecond;
    }

    public void setMySecond(String mySecond) {
        this.mySecond = mySecond;
    }

    public String getMyFirst(){
        return myFirst;
    }

    public void setMyFirst(String myFirst){
        this.myFirst = myFirst;
    }
}
