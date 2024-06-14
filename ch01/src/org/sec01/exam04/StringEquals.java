package org.sec01.exam04;

public class StringEquals {
    public static void main(String[] arg){
        String strVar1 = "Java";
        String strVar2 = "Java";

        if (strVar1 == strVar2) {
            System.out.println("strVar1 == strVar2");
        } else {
            System.out.println("strVar1 != strVar2");
        }

        if (strVar1.equals(strVar2)){
            System.out.println("strVar1.equals(strVar2)");
        }

        String strVar3 = new String("Python");
        String strVar4 = new String("Python");

        if (strVar3 == strVar4) {
            System.out.println("strVar3 == strVar4");
        } else {
            System.out.println("strVar3 != strVar4");
        }

        if (strVar3.equals(strVar4)){
            System.out.println("strVar3.equals(strVar4)");
        }
    }
}
