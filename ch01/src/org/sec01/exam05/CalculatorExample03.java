package org.sec01.exam05;

public class CalculatorExample03 {
    public static void main(String[] args){
        Calculator03 cal = new Calculator03();

        double result1 = cal.getAreaRectangle(10);
        double result2 = cal.getAreaRectangle(10, 20);
        System.out.println(result1);
        System.out.println(result2);

    }
}
