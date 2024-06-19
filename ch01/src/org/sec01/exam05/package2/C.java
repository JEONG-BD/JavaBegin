package org.sec01.exam05.package2;
import org.sec01.exam05.package1.*;
public class C {
    //A a1 = new A(true);

    //A a2 = new A(1);

    // A a3 = new A("문자열");
    B b;
    public C(){
        A a = new A();
        a.field1 = 1;
        //a.field2 = 2;
        //a.field3 = 3;

        a.method1();
        //a.method2();
        //a.method3();
    }


}
