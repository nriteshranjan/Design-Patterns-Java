package Behavioural.Strategy;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    List<Product> cart = new ArrayList<>();
    public void addToCart(Product p) {
        cart.add(p);
    }

    public double getCartValue() {
        double total = 0;
        for (Product p : cart) {
            total += p.getPrice();
        }
        return total;
    }

    public void pay(PaymentStrategy ps) {
        double amt = getCartValue();
        ps.dispense(amt);

    }

}
