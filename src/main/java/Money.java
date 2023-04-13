public class Money {
    protected int amount;

    public Money(int amount) {
        this.amount = amount;
    }
    Money times(int multiplier) {
        return new Money(amount * multiplier);
    }

    public boolean equals(Object object) {
        Money money = (Money) object;
        return amount == money.amount;
    }
}
