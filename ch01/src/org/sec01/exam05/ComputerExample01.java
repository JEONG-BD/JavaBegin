package org.sec01.exam05;

import org.sec01.exam05.package2.C;

public class ComputerExample01 {
    public static void main(String[] args){
        int r = 10;

        Calculator05 calculator05 = new Calculator05();
        System.out.println("원면적 : " + calculator05.areaCircle(r));
        System.out.println();

        Computer01 computer = new Computer01();
        System.out.println("원면적 : "  + computer.areaCircle(r));

    }
}
