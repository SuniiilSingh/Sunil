package com.ajira.Rover.entiry;

public class Rover {
    public String is;
    public Performs performs;

    public Rover() {
    }

    public Rover(String is, Performs performs) {
        this.is = is;
        this.performs = performs;
    }

    public String getIs() {
        return is;
    }

    public void setIs(String is) {
        this.is = is;
    }

    public Performs getPerforms() {
        return performs;
    }

    public void setPerforms(Performs performs) {
        this.performs = performs;
    }
}
