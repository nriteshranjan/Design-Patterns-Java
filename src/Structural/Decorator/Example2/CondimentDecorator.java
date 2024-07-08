package Structural.Decorator.Example2;

public abstract class CondimentDecorator implements Beverage {
    protected Beverage beverage;

    public CondimentDecorator(Beverage beverage) {
        super();
        this.beverage = beverage;
    }
}
