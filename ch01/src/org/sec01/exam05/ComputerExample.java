package org.sec01.exam05;

import java.util.Arrays;

public class ComputerExample {
    public static void main(String[] args) {
        Computer com = new Computer();

        int arrInt1 [] = {11, 22, 33, 44, 55};

        int testTotal = com.sum1(arrInt1);
        System.out.println(testTotal);

        int arrInt2[] = new int[3];

        for (int i= 0; i<arrInt2.length; i++){
            arrInt2[i] = i;
            System.out.println(arrInt2[i]);
        }
        System.out.println(Arrays.toString(arrInt2));

        int testTotal2 = com.sum(11, 22, 33, 44, 55);
        System.out.println(testTotal2);
    }
}
