package org.sec01.exam05.package3;

public class HankookTire extends Tire{
    public HankookTire(String location, int maxRotation) {
        super(location, maxRotation);
    }

    @Override
    public boolean roll() {
        ++accmulateRotation;
        if(accmulateRotation < maxRotation){
            System.out.println(location + " HanKookTire 수명" + (maxRotation - accmulateRotation) + "회");
            return true;
        }else {
            System.out.println("***" + location + "HanKook Tire 펑크 ***" );
            return false;
        }
    }
}
