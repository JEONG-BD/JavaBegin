package org.sec01.exam01;

public class PromotionExample {
    public static void main(String [] args) {
        //자동 타입 변환
        // byte < short < int < long < float < double
        byte byteValue = 10;
        int intValue = byteValue;

        System.out.println("intValue :" + intValue);

        char charValue = '가';
        intValue = charValue;
        System.out.print("\'가'의 UniCode : " + intValue);

        intValue = 50;
        long longValue = intValue;
        System.out.println("longValue : " + longValue );

        longValue = 100;
        float floatValue = longValue;
        System.out.println("floatValue : " + floatValue );

        floatValue = 100.5F;
        double doubleValue = floatValue;
        System.out.println("doubleValue : " + doubleValue);

    }
}
