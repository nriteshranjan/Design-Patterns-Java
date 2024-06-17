package Structural.Decorator;

// Concrete Decorators - Extending the base decorator functionality and modifying the component behavior accordingly.
public class LegDecorator extends Decorator {
    public LegDecorator(Animal animal) {
        super(animal);
    }

    @Override
    public void describe() {
        animal.describe();
        System.out.println("I have legs and can walk");
    }

}
