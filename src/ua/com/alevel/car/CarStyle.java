package ua.com.alevel.car;

/**
 * @author Iehor Funtusov, created 19/12/2020 - 12:30 PM
 */

public abstract interface CarStyle {

    public static final Integer INT = 10;

    public abstract void coloring();

    default void style() {
        System.out.println("CarStyle.style");
    }
}
