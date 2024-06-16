package org.sec01.exam04;

public class ArrayReference {
    public static void main(String[] args){
        String[] arrStr = new String[3];
        arrStr[0] = "Java";
        arrStr[1] = "Java";
        arrStr[2] = new String("Java");

        System.out.println(arrStr[0] == arrStr[1]);
        System.out.println(arrStr[0] == arrStr[2]);
        System.out.println(arrStr[0].equals(arrStr[2]));


    }
}
