package Creational.Factory;

public class Main {
    public static void main(String[] args) {
        MathOperation m = MathOperationFactory.getMathOperation("add"); // object of which class we will get is unknown to client
        System.out.println(m.operate(10, 20));
    }
}
