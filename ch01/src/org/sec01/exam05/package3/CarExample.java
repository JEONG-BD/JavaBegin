package org.sec01.exam05.package3;

public class CarExample {
    public static void main(String[] args){

        Car car01 = new Car();

        for (int i=0; i<=5; i++){
            int promotion = car01.run();
            System.out.println( "promotion" + promotion );
            switch (promotion){
                case 1 :
                    System.out.println("앞 왼쪽 타이어 교체");
                    car01.frontLeftTire = new HankookTire("한국", 15);
                    break;
                case 2 :
                    System.out.println("앞 오른쪽 타이어 교체");
                    car01.frontRightTire = new KumhoTire("금호", 15);
                break;
                    case 3 :
                    System.out.println("뒤 왼쪽 타이어 교체");
                    car01.backLeftTire = new HankookTire("한국", 14);
                    break;
                case 4 :
                    System.out.println("뒤 오른쪽 타이어 교체");
                    car01.backtRightTire = new KumhoTire("금호", 17);
                    break;
            }
            System.out.println("===========");

        }


    }
}
