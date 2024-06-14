package org.sec01.exam04;

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args){
        //int[] intArray;
        //double[] doubleArray ;
        //String [] strArray;

        int intArray[];
        double doubleArray[];
        String strArray[];

        //Type[] 변수 = {값1, 값2, 값3 }

        String[] names = {"Java", "Python", "Go" };
        System.out.println(names[0]);
        System.out.println(names[1]);
        System.out.println(names[2]);
        System.out.println(Arrays.deepToString(names));

        for (int i=0; i<names.length; i++){
            //System.out.println(i + " : "+ names[i]);
            System.out.printf("%d : %6s\n", i, names[i]);
        }

        int scores [] = {83, 97, 87};

        System.out.println(scores[0]);
        System.out.println(scores[1]);
        System.out.println(scores[2]);

        int sum = 0;
        for (int i=0; i<scores.length; i++){
            sum += scores[i];
        }
        System.out.println(sum);


        String[] arrNames = null;
        arrNames = new String[]{"1" , "2", "3", "4", "5", "6"};

        System.out.println(Arrays.deepToString(arrNames));
    }

}
