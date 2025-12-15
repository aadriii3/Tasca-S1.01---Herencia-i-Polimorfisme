package org.example.model;

public class WindInstrument extends Instrument{

    /*Constructor de subclase*/
    public WindInstrument(String name, double price) {
        super(name, price);
    }

    /*Metodo abstracto requerido por la superclase*/
    @Override
    public void play() {
        System.out.println("Està sonant un instrument de vent: " + getName() +  ", " + getPrice());
    }
}
