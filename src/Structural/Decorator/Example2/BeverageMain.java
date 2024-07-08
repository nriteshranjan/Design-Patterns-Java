package Structural.Decorator.Example2;

public class BeverageMain {
    public static void main(String[] args) {
        Beverage darkRoast = new DarkRoast();
        System.out.println(darkRoast.getDescription());
        System.out.println("Price: $" + darkRoast.cost());
        System.out.println("============================================================");
        Beverage darkRostWithMocha = new Mocha(darkRoast);
        System.out.println(darkRostWithMocha.getDescription());
        System.out.println("Price: $" + darkRostWithMocha.cost());
        System.out.println("============================================================");
        Beverage darkRostWithWhipAndMocha = new Whip(darkRostWithMocha);
        System.out.println(darkRostWithWhipAndMocha.getDescription());
        System.out.println("Price: $" + darkRostWithWhipAndMocha.cost());
        System.out.println("============================================================");
        Beverage darkRostWithWhipAndDoubleMocha = new Mocha(darkRostWithWhipAndMocha);
        System.out.println(darkRostWithWhipAndDoubleMocha.getDescription());
        System.out.println("Price: $" + darkRostWithWhipAndDoubleMocha.cost());
        System.out.println("============================================================");
        Beverage beverage = new DarkRoast();
        System.out.println(beverage.getDescription());
        System.out.println("Price: $" + beverage.cost());
        beverage = new Mocha(beverage);
        System.out.println(beverage.getDescription());
        System.out.println("Price: $" + beverage.cost());
    }
}
