package Behavioural.ChainOfResponsibility;

public class Currency100Dispenser implements CurrencyDispenser {
    private CurrencyDispenser dispenser;

    @Override
    public void dispense(int amount) {
        System.out.println("Dispensing " + amount / 100 + " notes in 100 dollar bills");
    }

    @Override
    public void setNextDispenser(CurrencyDispenser nextDispenser) {
        this.dispenser = nextDispenser;
    }
}
