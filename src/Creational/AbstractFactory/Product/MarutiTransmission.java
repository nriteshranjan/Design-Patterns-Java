package Creational.AbstractFactory.Product;

public class MarutiTransmission implements Transmission {
    @Override
    public void makeTransmission() {
        System.out.println("This is a Maruti Transmission");
    }
}
