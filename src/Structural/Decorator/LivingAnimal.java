package Structural.Decorator;

// Component Implementation - The basic implementation of the component interface.
public class LivingAnimal implements Animal { // this is the base
    @Override
    public void describe() {
        System.out.println("I am a living animal");
    }
}
