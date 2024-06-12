package org.sec01.exam01;

public class PrintExample {
    public static void main(String[] args){
        int value = 23;
        System.out.printf("price :%d\n", value);
        System.out.printf("price :%6d\n", value);
        System.out.printf("price :%-6d\n", value);
        System.out.printf("price :%06d\n", value);
        System.out.printf("price :%d\n", value);

        double doubleArea = 3.141592 * 10 * 10 ;
        System.out.printf("반지금이 %d인 원의 넓이 :%10.2f\n", 10, doubleArea);

        String strName = "홍길동";
        String strJob = "도적";

        System.out.printf("%6d | %-10s | %-10s", 1 , strName, strJob);
    }
}
