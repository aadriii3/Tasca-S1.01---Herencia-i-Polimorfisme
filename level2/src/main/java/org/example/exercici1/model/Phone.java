package org.example.exercici1.model;

public class Phone{

    private final String model;
    private final String brand;

    public Phone(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public void doCalls(int number){
        System.out.println("S'està trucant al número: " + number);
    }
}
