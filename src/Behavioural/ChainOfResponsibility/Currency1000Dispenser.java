package Behavioural.ChainOfResponsibility;

public class Currency1000Dispenser implements CurrencyDispenser {
    private CurrencyDispenser dispenser;

    @Override
    public void dispense(int amount) {
        if (amount / 1000 != 0) {
            System.out.println("Dispensing " + amount / 1000 + " notes in 1000 dollar bills");
        }
        if (amount % 1000 != 0) {
            dispenser.dispense(amount % 1000);
        }
    }

    @Override
    public void setNextDispenser(CurrencyDispenser nextDispenser) {
        this.dispenser = nextDispenser;
    }
}
