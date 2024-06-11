package org.sec01.exam01;

public class CharLiteral {
    public static void main(String[] args){
        char ch1 = 'A';
        char ch2 = 'B';
        char ch3 = '가';
        char ch4 = 65 ;
        char ch5 = 0x0041;

        System.out.println("ch1 : " + ch1);
        System.out.println("ch2 : " + ch2);
        System.out.println("ch3 : " + ch3);
        System.out.println("ch4 : " + ch4);
        System.out.println("ch5 : " + ch5);

        int var1 = 'A';
        char ch6 = 'A';

        System.out.println("var1 : " + var1);
        System.out.println("ch6 : " + ch6);

        char c1 = 'A';
        char c2 = 65;
        char c3 = '\u0041';

        char c4 = '가';
        char c5 = 44032;
        char c6 = '\uac00';

        System.out.println("c1 : " + c1);
        System.out.println("c2 : " + c2);
        System.out.println("c3 : " + c3);
        System.out.println("c4 : " + c4);
        System.out.println("c5 : " + c5);
        System.out.println("c6 : " + c6);

    }
}
