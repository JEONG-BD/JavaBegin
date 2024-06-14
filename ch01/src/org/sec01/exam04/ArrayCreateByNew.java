package org.sec01.exam04;

import java.util.Arrays;

public class ArrayCreateByNew {
    public static void main(String[] args){
        int arrInt[] = new int[3];
        for (int i = 0; i<arrInt.length; i++){
            System.out.println(arrInt[i]);
        }
        System.out.println(arrInt.length);

        arrInt[0] = 10;
        arrInt[1] = 11;
        arrInt[2] = 12;

        for (int i = 0; i<arrInt.length; i++){
            System.out.println(arrInt[i]);
        }

        double arrDouble[] = new double[3];
        for (int i = 0; i<arrDouble.length; i++){
            System.out.println(arrDouble[i]);
        }

        arrDouble[0] = 0.1;
        arrDouble[1] = 0.2;
        arrDouble[2] = 0.3;

        for(int i=0; i<arrDouble.length; i++){
            System.out.println(arrDouble[i]);
        }

        String arrStr[] = new String [3];

        System.out.println(Arrays.deepToString(arrStr));

        for(int i=0; i<arrStr.length; i++){
            arrStr[i] = String.valueOf(i) + "Month";
        }
        for(int i=0; i<arrStr.length; i++){
            System.out.println(arrStr[i]);
        }

    }
}
