package org.sec01.exam01;

import java.util.Scanner;

public class ScannerExample {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        String strInput ;

        while (true){
            strInput = scanner.next();
            System.out.println("Input \""+ strInput + "\"" );
            if(strInput.equals("q")){
                break;
            }
        }
        System.out.println("Exit");
    }
}
