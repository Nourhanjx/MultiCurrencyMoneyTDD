class Money implements Expression{


    protected int amount;

    protected String currency;

    Money(int amount,String currency){
        this.amount = amount;
        this.currency=currency;
    }


    public boolean equals(Object object){
        Money money = (Money) object;
        return amount == money.amount && currency().equals(money.currency());
    }

    static Money dolar(int amount){
        return new Money(amount, "USD");
    }

    static Money francs(int amount){
        return new Money(amount, "CHF");
    }
    String currency(){
        return currency;

    }
    public String toString(){
        return amount+""+currency;
    }

    Money times(int multiplier){
        return new Money(amount *=  multiplier,currency);
    }

    Expression Plus(Money addend){
        return new Money(amount+addend.amount,currency);
    }


}
