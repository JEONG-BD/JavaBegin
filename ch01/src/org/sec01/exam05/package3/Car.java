package org.sec01.exam05.package3;

public class Car {
    Tire frontLeftTire = new Tire("front-left", 6);
    Tire frontRightTire = new Tire("front-right", 2);
    Tire backLeftTire = new Tire("back-left", 3);
    Tire backtRightTire = new Tire("back-right", 4);

    int run(){
        System.out.println("자동차가 달립니다");

        if(frontLeftTire.roll() == false){
            stop();
            return 1;
        }
        if(frontRightTire.roll() == false){
            stop();
            return 2;
        }
        if(backLeftTire.roll() == false){
            stop();
            return 3;
        }
        if(backtRightTire.roll() == false){
            stop();
            return 4;
        }

        return 0;
    }

    void stop(){
        System.out.println("자동차가 멈춥니다");
    }
}
