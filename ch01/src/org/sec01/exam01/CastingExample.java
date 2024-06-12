package org.sec01.exam01;

public class CastingExample {

    public static void main(String[] args){
        int intValue = 44032;

        char charValue = (char)intValue;
        System.out.println("intValue : " + intValue);
        System.out.println("charValue : " + charValue);

        long longValue = 500L;
        intValue = (int)longValue;

        System.out.println("intValue : " + intValue);
        System.out.println("longValue : " + longValue);

        double doubleValue = 3.14;
        intValue = (int)doubleValue;

        System.out.println("intValue : " + intValue);
        System.out.println("doubleValue : " + doubleValue);

    }
}
