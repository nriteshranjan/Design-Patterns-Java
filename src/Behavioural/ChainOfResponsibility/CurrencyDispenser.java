package Behavioural.ChainOfResponsibility;

public interface CurrencyDispenser {
    void dispense(int amount);

    void setNextDispenser(CurrencyDispenser next);
}
