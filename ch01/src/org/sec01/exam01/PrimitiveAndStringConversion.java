package org.sec01.exam01;

public class PrimitiveAndStringConversion {
    public static void main(String[] args) {
        int intVal = Integer.parseInt("10");
        double doubleVal = Double.parseDouble("3.141592");
        boolean boolVal1 = Boolean.parseBoolean("true");
        boolean boolVal2 = Boolean.parseBoolean("True");

        System.out.println(intVal);
        System.out.println(doubleVal);
        System.out.println(boolVal1);
        System.out.println(boolVal2);

        String str1 = String.valueOf(intVal);
        String str2 = String.valueOf(doubleVal);
        String str3 = String.valueOf(boolVal1);
        String str4 = String.valueOf(boolVal2);

        System.out.println(str1);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);

    }
}
