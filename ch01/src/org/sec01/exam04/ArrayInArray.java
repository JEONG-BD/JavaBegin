package org.sec01.exam04;

import java.util.Arrays;

public class ArrayInArray {
    public static void main(String[] args){
        int[][] arrInt = new int[3][4];

        for(int i=0; i<arrInt.length; i++){
            for(int k=0; k<arrInt[i].length; k++){
                arrInt[i][k] = k;
            }
        }
        System.out.println(Arrays.deepToString(arrInt));


        int englishScores[][] = new int[2][];

        System.out.println(Arrays.deepToString(englishScores));

        englishScores[0] = new int[2];
        System.out.println(Arrays.deepToString(englishScores));

        englishScores[1] = new int[3];
        System.out.println(Arrays.deepToString(englishScores));



    }
}
