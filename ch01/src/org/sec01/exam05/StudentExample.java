package org.sec01.exam05;

public class StudentExample {
    public static void main(String[] args){
        Student s1 = new Student();
        System.out.println("s1 변수가 Student 객체를 참조 합니다 : " + s1);

        Student s2 = new Student();
        System.out.println("s2 변수가 Student 객체를 참조 합니다 : " + s2);

        System.out.println(s1 == s2);

    }
}
