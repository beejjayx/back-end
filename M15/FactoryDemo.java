package models;

import factory.Car;
import factory.SUVFactory;
import factory.MustangFactory;
import factory.carFactory;

public class FactoryDemo {
    public static void main(String[] args) {
        carFactory MustangFactory = new MustangFactory();
        Car myMustang = MustangFactory.createCar("Preto", 30000);
        myMustang.assemble(); 

        carFactory SUVFactory = new SUVFactory();
        Car mySUV = SUVFactory.createCar("Vermelho", 30000);
        mySUV.assemble(); 
    }
}
