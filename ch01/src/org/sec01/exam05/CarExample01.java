package org.sec01.exam05;

public class CarExample01 {
    public static void main(String[] args) {
        Car01 car = new Car01("Black", 3000);

        System.out.println(car);


        Car01 car01 = new Car01("자가용");
        System.out.println("----Car01");
        System.out.println(car01.model);
        System.out.println(car01.color);
        System.out.println(car01.maxSpeed);

        Car01 car02 = new Car01("자가용", "black");
        System.out.println("----Car02");
        System.out.println(car02.model);
        System.out.println(car02.color);
        System.out.println(car02.maxSpeed);

        Car01 car03 = new Car01("자가용", "black", 400);
        System.out.println("----Car03");
        System.out.println(car03.model);
        System.out.println(car03.color);
        System.out.println(car03.maxSpeed);

    }
}
