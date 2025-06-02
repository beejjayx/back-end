package factory;

import models.Mustang;

public class MustangFactory implements carFactory {
    public Car createCar(String color, int km) {
        return new Mustang(color, km);
    }
    
}
