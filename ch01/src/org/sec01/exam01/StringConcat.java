package org.sec01.exam01;

public class StringConcat {

    public static void main(String [] args){

        int value = 10 + 2 + 8 ;
        String str1 = 10 + "8";
        String str2 = 10 + "2" + 8;
        String str3 = "10" + 2 + 8;
        String str4 = "10" + (2 + 8);

        System.out.println(value);
        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }
}
