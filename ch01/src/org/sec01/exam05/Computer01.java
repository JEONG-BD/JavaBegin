package org.sec01.exam05;

public class Computer01 extends Calculator05{

    @Override
    double areaCircle(double r){
        System.out.println("Computer 객체 areaCircle() 실행");
        return Math.PI * r * r;
    }

}
