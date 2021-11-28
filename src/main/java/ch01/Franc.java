package ch01;

public class Franc extends Money {

    public Franc(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    Franc times(int multiplier) {
        return Money.franc(amount * multiplier);
    }
}
