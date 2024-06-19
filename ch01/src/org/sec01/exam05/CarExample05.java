package org.sec01.exam05;

public class CarExample05 {
    public static void main(String[] args){
        Car05 myCar = new Car05();

        myCar.setSpeed(-50);

        System.out.println("현재 속도 " + myCar.getSpeed());

        myCar.setSpeed(60);

        if(!myCar.isStop()){
            myCar.setStop(true);
        }
        System.out.println("현재 속도 " + myCar.getSpeed());
    }
}
