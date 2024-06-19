package org.sec01.exam05;

public class Car03 {
    int speed;

    int getSpeed(){
        return speed;
    }

    void keyTurnOn(){
        System.out.println("Turn the key");
    }

    void run(){
        for(int i=0; i<=50; i+=2){
            speed = i ;
            System.out.printf("Run (speed %d Km/h) \n", speed);
        }
    }
}
