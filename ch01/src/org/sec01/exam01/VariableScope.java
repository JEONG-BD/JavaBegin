package org.sec01.exam01;

public class VariableScope {
    public static void main(String[] args) {
        int v1 = 15;
        if (v1>10) {
            int v2;
            v2 = v1 - 10;
            System.out.println(v2);
        }

        //int v3 = v1 + v2 - 5
        int v3 = v1 - 5;

    }
}
