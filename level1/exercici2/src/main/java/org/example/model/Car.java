package org.example.model;

public class Car {

    private static final String BRAND = "SEAT";
    private static String model;
    private final int power;

    public Car(int power) {
        this.power = power;
    }

    public static String getBrand() {
        return BRAND;
    }

    public static String getModel() {
        return model;
    }

    public static void setModel(String model) {
        Car.model = model;
    }

    public int getPower() {
        return power;
    }

    public static void brake() {
        System.out.println("El vehicle " + Car.BRAND + " " + Car.getModel() + " està frenant.");
    }

    public void accelerate(){
        System.out.println("El vehicle " + Car.BRAND + " " + Car.getModel() + " està accelerant");
    }
}

