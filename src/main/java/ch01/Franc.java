package ch01;

public class Franc extends Money {

    public Franc(int amount, String currency) {
        super(amount, currency);
    }

    Franc times(int multiplier) {
        return Money.franc(amount * multiplier);
    }
}
