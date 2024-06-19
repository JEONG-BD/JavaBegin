package org.sec01.exam05;

public class CalculatorExample {
    public static void main(String[] args){

        int x = 20;
        int y = 10;

        Calculator cal = new Calculator();
        int addResult ;
        int subResult ;
        double divResult ;
        int mulResult ;

        cal.powerOn();
        addResult = cal.addition(x, y);
        subResult = cal.substraction(x, y);
        mulResult = cal.multiplation(x, y);
        divResult = cal.divide(x, y);
        cal.powerOff();


    }
}
