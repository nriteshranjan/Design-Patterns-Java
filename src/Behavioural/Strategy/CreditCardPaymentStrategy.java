package Behavioural.Strategy;

public class CreditCardPaymentStrategy implements PaymentStrategy {

    private String name;
    private int cardNumber;

    public CreditCardPaymentStrategy(String name, int cardNumber) {
        this.name = name;
        this.cardNumber = cardNumber;
    }

    @Override
    public void dispense(double amount) {
        System.out.println("Paid " + amount + " using credit card wih card number " + cardNumber + " and name " + name);
    }
}
