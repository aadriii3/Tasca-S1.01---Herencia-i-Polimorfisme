package org.example.app;

import org.example.model.Car;

public class Main {
    public static void main(String[] args) {

        Car.brake();

        Car car = new Car(200);
        Car car2 = new Car(300);

        Car.setModel("IBIZA");
        car.accelerate();
        System.out.println("El cotxe té " + car.getPower() + " CV");
        Car.brake();

        Car.setModel("ARONA");
        car2.accelerate();
        System.out.println("El cotxe té " + car2.getPower() + " CV");
        Car.brake();


    }
}