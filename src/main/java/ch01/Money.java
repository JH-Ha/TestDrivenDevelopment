package ch01;

public class Money implements Expression{
    protected int amount;
    protected String currency;

    public Money(int amount, String currency) {
        this.amount = amount;
        this.currency = currency;
    }

    String currency() {
        return currency;
    }

    static Money dollar(int amount) {
        return new Money(amount, "USD");
    }

    static Money franc(int amount) {
        return new Money(amount, "CHF");
    }

    Money times(int multiplier) {
        return new Money(amount * multiplier, currency);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Money money = (Money) o;
        return amount == money.amount && currency().equals(money.currency());
    }

    Expression plus(Money addend){
        return new Money(amount + addend.amount, currency);
    }
}
