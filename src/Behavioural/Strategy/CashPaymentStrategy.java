package Behavioural.Strategy;

public class CashPaymentStrategy implements PaymentStrategy {
    @Override
    public void dispense(double amount) {
        System.out.println("Paid " + amount + " using cash");
    }
}
