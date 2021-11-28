package ch01;

public abstract class Money {
    protected int amount;

    abstract String currency();

    static Dollar dollar(int amount){
        return new Dollar(amount);
    }

    static Franc franc(int amount){
        return new Franc(amount);
    }

    abstract Money times(int multiplier);

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Money dollar = (Money) o;
        return amount == dollar.amount;
    }
}
