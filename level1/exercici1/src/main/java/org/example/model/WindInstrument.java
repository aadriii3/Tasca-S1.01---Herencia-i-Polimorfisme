package org.example.model;

public class WindInstrument extends Instrument{


    public WindInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("Està sonant un instrument de vent: " + getName() +  ", " + getPrice());
    }
}
