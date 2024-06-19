package org.sec01.exam05;

public class CarExample03 {
    public static void main(String[] args){
        Car03 car = new Car03();
        car.keyTurnOn();
        car.run();
        int speed = car.getSpeed();
        System.out.println("Speed" + speed);
    }
}
