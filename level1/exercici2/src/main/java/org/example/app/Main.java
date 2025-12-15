package org.example.app;

import org.example.model.Car;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(200);
        Car car2 = new Car(300);

        Car.setModel("IBIZA");
        car.accelerate();
        Car.brake();

        Car.setModel("ARONA");
        Car.brake();
        car2.accelerate();


    }
}