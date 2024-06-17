package Creational.Factory;

public class MathOperationFactory {

    public static MathOperation getMathOperation(String operation) { // if you need a data to be shared you can make it non-static and create an object of factory class in the main
        switch (operation) {
            case "add":
                return new Adder();
            case "multiply":
                return new Multiplier();
            case "subtract":
                return new Substracter();
            default: throw new RuntimeException("Unknown operation: " + operation);
        }
    }

    private static class Adder implements MathOperation {
        @Override
        public int operate(int a, int b) {
            return a + b;
        }
    }

    private static class Multiplier implements MathOperation {
        @Override
        public int operate(int a, int b) {
            return a * b;
        }
    }

    private static class Substracter implements MathOperation {
        @Override
        public int operate(int a, int b) {
            return a - b;
        }
    }
}
