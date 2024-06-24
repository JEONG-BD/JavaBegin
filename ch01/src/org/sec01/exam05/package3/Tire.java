package org.sec01.exam05.package3;

public class Tire {

    public int maxRotation;
    public int accmulateRotation;

    public String location;

    public Tire(String location, int maxRotation) {
        this.maxRotation = maxRotation;
        this.location = location;
    }

    public boolean roll(){
        ++accmulateRotation;
        if(accmulateRotation < maxRotation){
            System.out.println(location + " Tire 수명" + (maxRotation - accmulateRotation) + "회");
            return true;
        } else {
            System.out.println("***" + location + "Tire 펑크 ***" );
            return false;
        }
    }
}
