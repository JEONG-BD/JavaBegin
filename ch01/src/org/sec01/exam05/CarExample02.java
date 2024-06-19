package org.sec01.exam05;

public class CarExample02 {
    public static void main(String[] args){
        Car02 car = new Car02();

        car.setGas(20);

        boolean gasState = car.isLeftGas();

        if(gasState){
            System.out.println("Start Run");
            car.run();
        }

        if(car.isLeftGas()){
            System.out.println("Gas! ");
        } else {
            System.out.println("Gas? ");
        }
    }
}
