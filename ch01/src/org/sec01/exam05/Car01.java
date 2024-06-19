package org.sec01.exam05;

public class Car01 {

    String strCompany = "Tesla";
    String model;
    String color;
    int maxSpeed;
    Car01(){

    }
    Car01(String model){
        //this.model = model;
        this(model, "Silver", 200);
    }

    Car01(String model, String color){
        //this.model = model;
        //this.color = color;
        this(model, color, 200);
    }

    Car01(String model, String color, int maxSpeed){
        this.model = model;
        this.color = color;
        this.maxSpeed = maxSpeed;
    }

    Car01(String color, int cc) {

    }
}
