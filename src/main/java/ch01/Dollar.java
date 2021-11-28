package ch01;

public class Dollar extends Money{

    public Dollar(int amount, String currency) {
        super(amount, "USD");
    }

    Dollar times(int multiplier) {
        return Money.dollar(amount * multiplier);
    }
}
