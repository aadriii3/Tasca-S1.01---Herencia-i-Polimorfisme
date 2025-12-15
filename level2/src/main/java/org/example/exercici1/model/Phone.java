package org.example.exercici1.model;

import org.example.exercici1.interfaces.Camera;
import org.example.exercici1.interfaces.Clock;

public class Phone implements Camera, Clock {

    private final String model;
    private final String brand;
    private int number;

    /*Constructor*/
    public Phone(String model, String brand, int number) {
        this.model = model;
        this.brand = brand;
        this.number = number;
    }

    /*Getters and Setters*/
    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }

    public int getNumber() {
        return number;
    }

    public int setNumber(int number) {
        return number;
    }

    public void doCalls(){
        System.out.println("S'està trucant al número: " + getNumber());
    }

    /*Interfaces*/
    @Override
    public void takePicture() {
        System.out.println("S'està fent una foto.");
    }
    @Override
    public void alarm() {
        System.out.println("Està sonant l'alarma!");
    }
}
