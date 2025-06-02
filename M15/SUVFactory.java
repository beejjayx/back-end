package factory;

import models.SUV;

public class SUVFactory implements carFactory {
    public Car createCar(String color, int km) {
        return new SUV(color, km);
    }
    
}
