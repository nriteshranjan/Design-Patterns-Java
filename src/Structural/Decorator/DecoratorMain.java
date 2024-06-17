package Structural.Decorator;

public class DecoratorMain {
    public static void main(String[] args) {
        LivingAnimal animal = new LivingAnimal(); // customization possible during runtime at client-side
        animal.describe();
        System.out.println("===================");
        LegDecorator ld = new LegDecorator(new LivingAnimal());
        ld.describe();
        System.out.println("===================");
        WingsDecorator wd = new WingsDecorator(new LegDecorator(new LivingAnimal()));
        wd.describe();
    }
}
