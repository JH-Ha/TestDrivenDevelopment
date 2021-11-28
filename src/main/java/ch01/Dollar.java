package ch01;

public class Dollar extends Money{

    public Dollar(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    Dollar times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }
}
