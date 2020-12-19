package ua.com.alevel.car;

/**
 * @author Iehor Funtusov, created 19/12/2020 - 12:15 PM
 */

public class Audi extends Car implements CarStyle, CarDrive {

    public int i;
    private CarHistory history;

    public Audi(String motor) {
        super(motor);
    }

    public Audi() {
        this("AUDI !!!!!!!!!!!");
    }

    public String getMotor() {
        this.i = 10;
        int i = 5;

        int ii = this.i + i;

        String motor = "";

        return super.motor;
    }

    @Override
    public void coloring() {

    }

    @Override
    public void drive() {
        System.out.println("Audi drive");
    }

    public CarHistory getHistory() {
        return history;
    }

    public void setHistory(CarHistory history) {
        this.history = history;
    }
}
