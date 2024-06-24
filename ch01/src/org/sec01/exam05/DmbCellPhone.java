package org.sec01.exam05;

public class DmbCellPhone extends CellPhone{

    int channel;

    DmbCellPhone(String model, String color, int channel){
        this.model = model ;
        this.color = color;
        this.channel = channel;
    }

    void turnOnDmb(){
        System.out.println("Channel " + channel + "번 DMB 방송을 시작합니다");
    }

    void changeChannelDmb(int channel){
        this.channel = channel;
        System.out.println("Channel " + channel + "번으로 바꿉니다");
    }

    void turnOffDmb(){
        System.out.println("DMD 방송을 멈춥니다");
    }


}
