package Structural.Decorator.Example2;

public class DarkRoast implements Beverage {
    @Override
    public double cost() {
        return 0.99;
    }

    @Override
    public String getDescription() {
        return "Enjoy our Dark Roast";
    }
}
