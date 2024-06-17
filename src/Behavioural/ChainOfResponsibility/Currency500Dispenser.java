package Behavioural.ChainOfResponsibility;

public class Currency500Dispenser implements CurrencyDispenser {
    private CurrencyDispenser dispenser;

    @Override
    public void dispense(int amount) {
        if (amount / 500 != 0) {
            System.out.println("Dispensing " + amount / 500 + " notes in 500 dollar bills");
        }
        if (amount % 500 != 0) {
            dispenser.dispense(amount % 500);
        }
    }

    @Override
    public void setNextDispenser(CurrencyDispenser nextDispenser) {
        this.dispenser = nextDispenser;
    }
}
