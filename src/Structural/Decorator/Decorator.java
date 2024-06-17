package Structural.Decorator;

// Decorator - Decorator class implements the component interface, and it has a HAS-A relationship with the component interface.
public abstract class Decorator implements Animal {
    protected Animal animal; // making this as protected as the component variable should be accessible to child decorator class

    public Decorator(Animal animal) {
        super();
        this.animal = animal;
    }
}
