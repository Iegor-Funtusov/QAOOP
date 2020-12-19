package ua.com.alevel.a;

import ua.com.alevel.b.B;

import java.util.ArrayList;
import java.util.List;

/**
 * @author Iehor Funtusov, created 19/12/2020 - 11:22 AM
 */

public final class A1 {

    public final A a = new A();
    public final static Integer INT = 10;

    public A1( ) {
        String s = ".jhfdsa";
        List<Integer> integers = new ArrayList<>();
    }

    public A1(int a) {
//        B.B1 b1 = new B.B1();
        B b = new B();
        b.setI(a);
        System.out.println("b = " + b.getI());
    }

    public final void a1() {
        A a = new A();
    }

    public void a1(int a1) {
        A a = new A();
    }
}
