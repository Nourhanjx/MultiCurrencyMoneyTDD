import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    @Test
    public void testSimpleAddition(){
        Money five = Money.dolar(5);
        Expression sum = five.Plus(five);
        Bank bank = new Bank();
        Money reduced = bank.reduce(sum,"USD");
        assertEquals(Money.dolar(10),reduced);
    }


    @Test
    public void testMultiplication(){
        Money five= Money.dolar(5);
        assertEquals( Money.dolar(10), five.times(2));
        assertEquals(Money.dolar(30), five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(Money.dolar(5).equals(Money.dolar(5)));
        assertFalse(Money.dolar(5).equals(Money.dolar(6)));
        assertTrue(Money.francs(5).equals(Money.francs(5)));

    }


    @Test
    public void testCurrency(){
        assertEquals("USD",Money.dolar(1).currency());
        assertEquals("CHF",Money.francs(1).currency());
    }

    @Test
    public void testDifferentClassEquality(){
        assertTrue(new Money(10,"CHF").equals(new Money(10,"CHF")));
    }


}