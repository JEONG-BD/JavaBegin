package org.sec01.exam05.package3;

public class ChildExample {
    public static void main(String[] args){
        Child child = new Child();

        Parent parent = child;
        parent.method1();
        parent.method2();

    }
}
