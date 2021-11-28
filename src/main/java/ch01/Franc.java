package ch01;

public class Franc extends Money {

    public Franc(int amount) {
        this.amount = amount;
    }

    @Override
    String currency() {
        return "CHF";
    }

    Franc times(int multiplier) {
        return new Franc(amount * multiplier);
    }
}
