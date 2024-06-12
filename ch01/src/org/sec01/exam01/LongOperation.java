package org.sec01.exam01;

public class LongOperation {
    public static void main(String[] args){
        byte byteVal = 10;
        int intVal = 100;
        long longVal = 1000L;

        long result = byteVal + intVal + longVal;

        System.out.println(result);
    }
}
