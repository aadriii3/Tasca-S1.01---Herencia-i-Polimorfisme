package org.example.model;

public abstract class Instrument {

    private String name;
    private double price;
    private static String info = "Clase instrument";

    static{
        System.out.println("El bloque static pertenece a la clase");
    }

    {
        System.out.println("El bloque de inicializacion pertenece a cada instancia (3 instancias)");
    }

    public static void infoClase(){
        System.out.println("Este metodo pertenece a la " + Instrument.info);
    }

    /*Constructor*/
    public Instrument(String name, double price) {
        this.name = name;
        this.price = price;
    }

    /*Metodo abstracto*/
    public abstract void play();

    /*Getters y Setters*/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
