package org.sec01.exam01;

public class VariableChange {
    public static void main(String [] args){
        int x = 3;
        int y = 10 ;
        int temp ;
        System.out.println("x = " + x + " y =" + y );
        temp = x;
        x = y ;
        y = temp ;
        System.out.println("temp = " + temp + " x = " + x + " y = " + y );

    }
}
