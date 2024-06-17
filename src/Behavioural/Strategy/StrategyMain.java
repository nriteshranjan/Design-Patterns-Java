package Behavioural.Strategy;

public class StrategyMain {
    public static void main(String[] args) {
        ShoppingCart cart = new ShoppingCart();
        cart.addToCart(new Product(100, "Macbook", 83000));
        cart.addToCart(new Product(200, "iPhone", 139000));

//        cart.pay(new CashPaymentStrategy());
        cart.pay(new CreditCardPaymentStrategy("Ritesh", 818110));
    }

}
