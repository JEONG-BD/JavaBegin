package org.sec01.exam01;

public class StringLiteral {
    public static void main(String[] args){
        String str1 = "A";
        String str2 = "홍길동";

        System.out.println(str1);
        System.out.println(str2);

        System.out.println(str1 instanceof String);

        String str3 = "Life is too short You need \"Java\"";
        System.out.println(str3);
        String str4 = "Hello \n world";
        System.out.println(str4);


        System.out.println("Number\tName\tAge");
        System.out.print("Row\n");
        System.out.print("Row\n");
        System.out.println("Life is too short You need \"Java\"");
        System.out.print("Row\n");
        System.out.println("\\Spring\\Summer\\Autumn\\Winter");

    }
}
