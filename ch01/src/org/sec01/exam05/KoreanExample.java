package org.sec01.exam05;

public class KoreanExample {
    public static void main(String[] args){
        Korean k1 = new Korean("Java", "121212-121212");
        System.out.println(k1.nation);
        System.out.println(k1.name);
        System.out.println(k1.ssn);


        Korean k2 = new Korean("Python", "121212-121212");
        System.out.println(k2.nation);
        System.out.println(k2.name);
        System.out.println(k2.ssn);

    }
}
