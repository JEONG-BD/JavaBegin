package org.sec01.exam05;

public class Calculator {

    void powerOn(){
        System.out.println("=====Power On=====");
    }

    int addition(int x, int y){

        int intResult = x + y;
        System.out.printf("%d + %d = %d", x, y, intResult );
        System.out.println();
        return intResult ;
    }

    double divide(int x, int y) {
        double dobuleResult = (double)x / (double)y ;
        System.out.printf("%d / %d = %f", x, y, dobuleResult );
        System.out.println();

        return dobuleResult;
    }

    int substraction(int x, int y){
        int intResult = x - y ;
        System.out.printf("%d - %d = %d", x, y, intResult );
        System.out.println();

        return intResult;
    }

    int multiplation(int x, int y){
        int intResult = x * y ;
        System.out.printf("%d * %d = %d", x, y, intResult );
        System.out.println();
        return intResult;
    }

    void powerOff(){
        System.out.println("=====Power Off=====");
    }
}
