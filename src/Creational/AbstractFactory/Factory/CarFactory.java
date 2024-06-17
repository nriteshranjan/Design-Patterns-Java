package Creational.AbstractFactory.Factory;

import Creational.AbstractFactory.Product.*;

public interface CarFactory {
    Engine createEngine();
    Transmission createTransmission();

    public static CarFactory getFactory(String brand) {
        switch (brand) {
            case "Ford": return new FordFactory();
            case "Maruti": return new MarutiFactory();
            default: throw new RuntimeException("Unknown brand: " + brand);
        }
    }
}

class MarutiFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new MarutiEngine();
    }

    @Override
    public Transmission createTransmission() {
        return new MarutiTransmission();
    }
}

class FordFactory implements CarFactory {
    @Override
    public Engine createEngine() {
        return new FordEngine();
    }

    @Override
    public Transmission createTransmission() {
        return new FordTransmission();
    }
}

