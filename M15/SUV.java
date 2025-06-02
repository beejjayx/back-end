package models;

import factory.Car;

public class SUV implements Car {
    private String color;
    private int km;

    public SUV(String color, int km) {
        this.color = color;
        this.km = km;
    }

    public void assemble() {
        System.out.println("Montagem do carro SUV, cor: " + color + " e  " + km + "Km rodados.");
        
    }

    public String getColor() {
        return color;
    }

    public int getKm() {
        return km;
    }
    
}
