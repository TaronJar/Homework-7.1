import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MoneyTest {

    @Test
    public void testAdd() {
        Money money1 = new Money(10, (byte) 50);
        Money money2 = new Money(5, (byte) 30);

        Money expected = new Money(15, (byte) 80);
        Money actual = money1.add(money2);

        Assertions.assertEquals(expected.getGrivnas(), actual.getGrivnas());
        Assertions.assertEquals(expected.getKopiykas(), actual.getKopiykas());
    }

    @Test
    public void testSubtract() {
        Money money1 = new Money(10, (byte) 50);
        Money money2 = new Money(5, (byte) 30);

        Money expected = new Money(5, (byte) 20);
        Money actual = money1.subtract(money2);

        Assertions.assertEquals(expected.getGrivnas(), actual.getGrivnas());
        Assertions.assertEquals(expected.getKopiykas(), actual.getKopiykas());
    }

    @Test
    public void testDivide() {
        Money money = new Money(10, (byte) 50);
        double divisor = 2.5;

        Money expected = new Money(4, (byte) 20);
        Money actual = money.divide(divisor);

        Assertions.assertEquals(expected.getGrivnas(), actual.getGrivnas());
        Assertions.assertEquals(expected.getKopiykas(), actual.getKopiykas());
    }

    @Test
    public void testMultiply() {
        Money money = new Money(10, (byte) 50);
        double multiplier = 1.5;

        Money expected = new Money(15, (byte) 75);
        Money actual = money.multiply(multiplier);

        Assertions.assertEquals(expected.getGrivnas(), actual.getGrivnas());
        Assertions.assertEquals(expected.getKopiykas(), actual.getKopiykas());
    }

    @Test
    public void testCompare() {
        Money money1 = new Money(10, (byte) 50);
        Money money2 = new Money(5, (byte) 30);
        Money money3 = new Money(10, (byte) 50);

        Assertions.assertTrue(money1.compare(money2) > 0);
        Assertions.assertTrue(money2.compare(money1) < 0);
        Assertions.assertTrue(money1.compare(money3) == 0);
    }
}