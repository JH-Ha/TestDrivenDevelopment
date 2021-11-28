package ch01;

public class Money {
    protected int amount;
    protected String currency;

    public Money(int amount, String currency){
        this.amount = amount;
        this.currency = currency;
    }

    String currency(){
        return currency;
    }

    static Dollar dollar(int amount){
        return new Dollar(amount, "USD");
    }

    static Franc franc(int amount){
        return new Franc(amount, "CHF");
    }

    Money times(int multiplier){
        return null;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        Money money = (Money) o;
        return amount == money.amount && currency().equals(money.currency());
    }
}
