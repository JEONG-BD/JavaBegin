package org.sec01.exam04;

public class AdvancedFor {
    public static void main(String [] args) {
        int[] scores = {99, 98, 97, 96, 95};

        int sum = 0 ;

        for (int score : scores){
            System.out.println(score);
            sum += score;
        }

        double avg = (double) sum / scores.length;
        System.out.println(avg);
    }
}
