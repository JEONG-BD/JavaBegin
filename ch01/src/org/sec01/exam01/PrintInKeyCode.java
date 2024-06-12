package org.sec01.exam01;

public class PrintInKeyCode {
    public static void main(String [] args) throws Exception {
        int keyCode ;

        keyCode = System.in.read();

        System.out.println("Key Code : " + keyCode);


        keyCode = System.in.read();

        System.out.println("Key Code : " + keyCode);


        keyCode = System.in.read();

        System.out.println("Key Code : " + keyCode);
    }
}
