package com.godoro.jsftest.bolum6.object;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import java.util.ArrayList;
import java.util.List;

@ManagedBean
@RequestScoped
public class ExpressBean {
    private long id;
    private String name;
    private double value;
    private List<String> stringList;
    private List<Sample> samples;
    private Sample sample;

    public ExpressBean() {
        this.id = 501;
        name = "Tolga";
        value = 3.14;

        sample = new Sample(123, "Ornek", 4123.123);

        stringList = new ArrayList<>();
        stringList.add("ad");
        stringList.add("adc");
        stringList.add("adcd");
        stringList.add("adcdf");

        samples = new ArrayList<>();
        samples.add(new Sample(12, "asddasdas", 231.4123));
        samples.add(new Sample(13, "asdasd", 231.4123));
        samples.add(new Sample(14, "asdasd", 231.4123));

    }


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value) {
        this.value = value;
    }

    public Sample getSample() {
        return sample;
    }

    public List<String> getStringList() {
        return stringList;
    }

    public void setStringList(List<String> stringList) {
        this.stringList = stringList;
    }

    public void setSample(Sample sample) {
        this.sample = sample;
    }

    public List<Sample> getSamples() {
        return samples;
    }

    public void setSamples(List<Sample> samples) {
        this.samples = samples;
    }
}
