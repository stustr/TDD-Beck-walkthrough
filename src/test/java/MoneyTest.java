import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MoneyTest {

    @Test
    public void testMultiplication() {
        Money five = Money.dollar(5);
        assertEquals(Money.dollar(10), five.times(2));
        assertEquals(Money.dollar(15), five.times(3));
    }

    @Test
    public void testEquality() {
        assertTrue(Money.dollar(5).equals(new Dollar(5,
                "USD")));
        assertFalse(Money.dollar(5).equals(new Dollar(6,
         "USD")));
        assertTrue(Money.franc(5).equals(new Franc(5,
                "CHF")));
        assertFalse(Money.franc(5).equals(new Franc(6,
                "CHF")));
        assertFalse(Money.dollar(5).equals(new Franc(5,
                "CHF")));
    }

    @Test
    public void testCurrency() {
        assertEquals("USD", Money.dollar(1).currency());
        assertEquals("CHF", Money.franc(1).currency());
    }
}