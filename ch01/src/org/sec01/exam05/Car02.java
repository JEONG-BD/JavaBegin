package org.sec01.exam05;

public class Car02 {
    int gas ;


    void setGas(int gas){
        this.gas = gas;
    }

    boolean isLeftGas(){
        if (gas == 0){
            System.out.println("Gas가 없습니다");
            return false;
        }
        System.out.println("Gas : " + gas);
        return true;
    }

    void run(){
        while(true){
            if(gas > 0){
                System.out.println("Run Gas amount : " + gas);
                gas -= 1;
            } else {
                System.out.println("Stop Gas amount : " + gas );
                return;
            }
        }
    }
}
