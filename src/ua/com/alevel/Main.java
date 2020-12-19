package ua.com.alevel;

import ua.com.alevel.a.A1;
import ua.com.alevel.car.*;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

//        A1 a1 = new A1(10);

//        Car bmw = new BMW();
//        Car audi = new Audi();

        Audi audi = new Audi();
        System.out.println("audi = " + audi.getMotor());

        audi.setHistory(CarHistory.AA);

        System.out.println("audi = " + audi.getHistory().getVal());
        System.out.println("audi = " + audi.getHistory().getPosition());
//        CarHistory history = new CarHistory();

//        List<CarDrive> cars = new ArrayList<>();
//        cars.add(new BMW());
//        cars.add(new Audi());
//        cars.add(getCarDrive());
//
//        for (CarDrive car : cars) {
//            car.drive();
//        }



//        System.out.println("sum = " + ConsoleInput.sum());

//        Test test1 = new Test();
//        System.out.println("test1 = " + test1);
//        Test test2 = new Test();

//        System.out.println(test1.equals(test2));

//        System.out.println("args = " + args.length);
//        System.out.println("args = " + args[0]);
//        System.out.println("args = " + args[args.length -1]);
//
//        ConsoleInput consoleInput = new ConsoleInput();
//        int number = consoleInput.getConsoleResult();
//
//        SumAllNumber sumAllNumber = new SumAllNumber();
//        int sum = sumAllNumber.getSum(number);
//
//        System.out.println("sum = " + sum);

        getCarDrive();

    }

    public static CarDrive getCarDrive() {
        return new CarDrive() {
            @Override
            public void drive() {
                System.out.println("abstract drive");
            }
        };
    }
}
