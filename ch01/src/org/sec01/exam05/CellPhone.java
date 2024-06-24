package org.sec01.exam05;

public class CellPhone {

    String model;
    String color;

    void powerOn(){
        System.out.println("Power On");
    }

    void powerOff(){
        System.out.println("Power Off");
    }

    void bell(){
        System.out.println("The bell rigns");
    }

    void sendVoice(String voice){
        System.out.println("send bell : " + voice);
    }

    void receiveVoice(String voice){
        System.out.println("receive bell : " + voice);
    }

    void haugUp(){
        System.out.println("Hang up the phone");
    }
}
