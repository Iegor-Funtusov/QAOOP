package ua.com.alevel.b;

import ua.com.alevel.a.A;
import ua.com.alevel.a.A1;

/**
 * @author Iehor Funtusov, created 19/12/2020 - 11:19 AM
 */

public class B {

    private int i;

    public void b() {
        A a = new A();
        a.aMethod();
        int i = A1.INT;
    }

    private static class B1 {

    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        if (i <= 10) {
            System.out.println("i = " + i);
        } else {
            this.i = i;
        }
    }
}
