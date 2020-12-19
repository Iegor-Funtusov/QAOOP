package ua.com.alevel;

import java.util.Objects;

/**
 * @author Iehor Funtusov, created 16/12/2020 - 9:35 PM
 */

public class Test {

    int a;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public void test() {
        int a;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Test test = (Test) o;
        return a == test.a;

    }

    @Override
    public int hashCode() {
        return Objects.hash(a);
    }
}
