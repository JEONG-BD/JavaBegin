package org.sec01.exam01;

public class FloatDouble {
    public static void main(String [] args){
        //float var1 = 3.14;
        float var1 = 3.14f;
        float var2 = 3;
        System.out.println("var1 : " + var1);
        System.out.println("var2 : " + var2);


        //정밀도 테스트
        float var4 = 0.1234567890123456789f;
        double var5 = 0.1234567890123456789;

        System.out.println("정밀도");
        System.out.println("var4 :" + var4);
        System.out.println("var5 :" + var5);

        double var6 = 3e6 ;
        float var7 = 3e6F;
        double var8 = 2e-3;

        System.out.println("var6 :" + var6);
        System.out.println("var7 :" + var7);
        System.out.println("var8 :" + var8);

    }
}
