package ua.com.alevel.car;

/**
 * @author Iehor Funtusov, created 19/12/2020 - 12:14 PM
 */

public class BMW extends Car implements CarStyle, CarDrive {

    @Override
    public String getMotor() {
        return null;
    }

    @Override
    public void coloring() {

    }

    @Override
    public void drive() {
        System.out.println("BMW drive");
    }
}
