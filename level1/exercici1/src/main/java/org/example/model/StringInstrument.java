package org.example.model;

public class StringInstrument extends Instrument{

    public StringInstrument(String name, double price) {
        super(name, price);
    }

    @Override
    public void play() {
        System.out.println("Està sonant un instrument de corda: " + getName() +  ", " + getPrice());
    }
}
