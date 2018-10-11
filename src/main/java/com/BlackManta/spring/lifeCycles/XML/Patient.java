package com.BlackManta.spring.lifeCycles.XML;

public class Patient {
    private int id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    //Acts as our int method
    public void helloWorld(){
        System.out.println("Hello World !");
    }

    //Acts as our destroy method
    public void dip(){
        System.out.println("I wanna Dip my hommie");
    }
}
