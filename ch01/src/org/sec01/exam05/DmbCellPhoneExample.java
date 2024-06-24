package org.sec01.exam05;

public class DmbCellPhoneExample {
    public static void main(String[] args){
        DmbCellPhone dmbCellPhone = new DmbCellPhone("JavaPhone", "Black", 10);

        System.out.println(dmbCellPhone.model);
        System.out.println(dmbCellPhone.color);

        System.out.println("Channel : " + dmbCellPhone.channel);

        dmbCellPhone.powerOn();
        dmbCellPhone.bell();
        dmbCellPhone.sendVoice("Hello");
        dmbCellPhone.receiveVoice("Hi");

        dmbCellPhone.sendVoice("Hello2");
        dmbCellPhone.haugUp();

        dmbCellPhone.turnOnDmb();
        dmbCellPhone.changeChannelDmb(12);
        dmbCellPhone.turnOffDmb();
    }
}
