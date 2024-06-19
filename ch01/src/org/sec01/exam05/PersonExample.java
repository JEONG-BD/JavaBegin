package org.sec01.exam05;

public class PersonExample {
    public static void main(String[] args){
        Person p1 = new Person("123456-123456", "Java");

        System.out.println(p1.name);
        System.out.println(p1.ssn);
        System.out.println(p1.nation);

        //p1.nation = "Python";
        //p1.ssn = "567890-567890";
        p1.name = "Python";

        System.out.println(p1.name);
        System.out.println(p1.ssn);
        System.out.println(p1.nation);

    }
}
