package org.sec01.exam05.package3;

public class KumhoTire extends Tire {
    public KumhoTire(String location, int maxRotation) {
        super(location, maxRotation);
    }

    @Override
    public boolean roll() {
        ++accmulateRotation;
        if(accmulateRotation < maxRotation){
            System.out.println(location + " kumhoTire 수명" + (maxRotation - accmulateRotation) + "회");
            return true;
        }else {
            System.out.println("***" + location + " kumho Tire 펑크 ***" );
            return false;
        }
    }
}
