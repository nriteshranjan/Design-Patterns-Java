package Creational.AbstractFactory;

import Creational.AbstractFactory.Factory.CarFactory;
import Creational.AbstractFactory.Product.Engine;
import Creational.AbstractFactory.Product.Transmission;

public class CarFactoryMain {
    public static void main(String[] args) {
        CarFactory carFactory = CarFactory.getFactory("Maruti");
        Engine engine = carFactory.createEngine();
        Transmission transmission = carFactory.createTransmission();

        engine.makeEngine();
        transmission.makeTransmission();

        carFactory = CarFactory.getFactory("Ford");
        engine = carFactory.createEngine();
        transmission = carFactory.createTransmission();

        engine.makeEngine();
        transmission.makeTransmission();

    }
}
