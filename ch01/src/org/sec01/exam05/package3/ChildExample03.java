package org.sec01.exam05.package3;

public class ChildExample03 {

    public static void method1(Parent03 parent03){
        if(parent03 instanceof Child03){
            Child03 child03 = (Child03) parent03;
            System.out.println("method1 - Child 변경 성공");
        } else {
            System.out.println("method1 - Child 변환되지 않음");
        }
    }

    public static void method2(Parent03 parent03){
        try {
            Child03 child03 = (Child03) parent03;
            System.out.println("method02 - Child 변환 성공");

        }catch (ClassCastException e){
            System.out.println("Error");
        }
    }

    public static void main(String[] args){
        Parent03 parent03 = new Child03();
        method1(parent03);
        method2(parent03);
        System.out.println("============");
        Parent03 parent04 = new Parent03();
        method1(parent04);
        method2(parent04);
    }
}
