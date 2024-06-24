package org.sec01.exam05.package3;

public class ChildExample02 {
    public static void main(String[]args){
        Parent02 parent = new Child02();

        parent.method1();
        parent.method2();
        //parent.method3();
        System.out.println("===========");
        Child02 child02 = (Child02) parent;
        child02.method3();
        child02.method1();
        child02.method1();
    }
}
