package org.sec01.exam05;

public class CarExample {
    public static void main(String[] args){

        Car myCar =  new Car();
        System.out.println(myCar.company);
        System.out.println(myCar.model);
        System.out.println(myCar.color);
        System.out.println(myCar.maxSpeed);
        System.out.println(myCar.speed);

        myCar.speed = 20;
        System.out.println(myCar.speed);


    }
}
