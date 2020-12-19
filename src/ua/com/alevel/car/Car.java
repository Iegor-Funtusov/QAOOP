package ua.com.alevel.car;

/**
 * @author Iehor Funtusov, created 19/12/2020 - 12:13 PM
 */

public abstract class Car {

    protected String motor = "test";

    public Car() {
        System.out.println("Car.Car");
    }

    public Car(String motor) {
        this.motor = motor;
    }

    public abstract String getMotor();
}
