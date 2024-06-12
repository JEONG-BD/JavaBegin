package org.sec01.exam01;

public class OperationPromotion {
    public static void main(String[] args){
        byte byteVal1 = 10;
        byte byteVal2 = 20;
        // byte byteResult = byteVal1 + byteVal2;
        int intResult1 = byteVal1 + byteVal2;
        System.out.println("intResult1 : " + intResult1);

        char charVal1 = 'A';
        char charVal2 = 1;
        //char charResult = charVal1 + charVal2 ;
        int intResult2 = charVal1 + charVal2;
        System.out.println("intResult2 : " + intResult2);

        int intVal1 = 10;
        int intVal2 = intVal1/4;
        System.out.println("intVal2 : " + intVal2);

        int intVal3= 10 ;
        //int intResult3 = intVal3 / 3.5;
        //float floatResult1 = intVal3 / 3.5;
        double doubleResult1 = intVal3 / 3.5;
        System.out.println("doubleResult1 : " + doubleResult1);

        int intX = 1;
        int intY = 2;
        int intResult3 = intX / intY;
        double doubleResult2 = intX / intY;
        System.out.println("intResult3 : " + intResult3 );
        System.out.println("doubleResult2 : " + doubleResult2 );

    }
}
