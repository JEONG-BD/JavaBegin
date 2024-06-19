package org.sec01.exam05;

public class Car04 {

    String model;
    int speed;

    Car04(String model){
        this.model = model;
    }

    void setSpeed(int speed){
        this.speed = speed;
    }

    void run(){
        for(int i=0; i<=50; i++){
            this.setSpeed(i);
            System.out.printf("%s Run %d \n" , this.model, this.speed);
        }
    }
}
