package org.sec01.exam05;

public class Calculator02 {

    int add(int x, int y){
        int addResult = 0 ;
        addResult = x + y;
        System.out.printf("%d + %d = %d \n", x, y, addResult);
        return addResult;
    }

    double avg(int x, int y){
        double avgResult = 0 ;
        double addResult = add(x, y);
        avgResult = addResult / 2;

        System.out.printf("%f / %d = %f \n", addResult, 2, avgResult);
        return avgResult;
    }

    void execute(){
        double avgResult = avg(7, 10);
        println("Result : " + avgResult);
    }

    void println(String message){
        System.out.println(message);
    }


}
