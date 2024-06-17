package Creational.AbstractFactory.Product;

public class FordEngine implements Engine {
    @Override
    public void makeEngine() {
        System.out.println("This is a Ford Engine");
    }
}
