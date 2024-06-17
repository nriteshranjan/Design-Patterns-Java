package Creational.AbstractFactory.Product;

public class FordTransmission implements Transmission {
    @Override
    public void makeTransmission() {
        System.out.println("This is a Ford Transmission");
    }
}
