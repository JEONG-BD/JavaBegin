package org.sec01.exam05;

public class Computer {
    int sum1(int[] values) {
        int intTotal = 0;
        for(int val : values){
            intTotal += val;
        }
        return intTotal;
    }

    int sum(int ... values){
        int intTotal = 0;
        for (int val : values){
            intTotal += val;
        }
        return intTotal;
    }
}
