package org.sec01.exam04;

public class ArrayLength {
    public static void main(String[] args) {
        int[] scores = {10, 11, 12};

        int intLength = scores.length;
        int intSum = 0;
        for(int i=0; i<scores.length; i++){
            intSum += scores[i];
        }

        double doubleAvg = intSum / intLength;
        System.out.println(doubleAvg);
    }
}
