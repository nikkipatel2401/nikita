package com.example.cuteheart.activity;

import java.io.Serializable;

public class student implements Serializable {
    private String name,password,city,cpi,number;

    public student() {
    }

    public student(String name, String password, String city, String cpi, String number) {
        this.name = name;
        this.password = password;
        this.city = city;
        this.cpi = cpi;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCpi() {
        return cpi;
    }

    public void setCpi(String cpi) {
        this.cpi = cpi;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }
}
