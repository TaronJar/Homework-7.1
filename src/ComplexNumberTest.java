import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


class ComplexNumberTest {

    @Test
    void testAdd() {
        ComplexNumber num1 = new ComplexNumber(3, 4);
        ComplexNumber num2 = new ComplexNumber(2, 6);
        assertEquals(new ComplexNumber(5, 10), num1.add(num2));
    }

    @Test
    void testSubtract() {
        ComplexNumber num1 = new ComplexNumber(3, 4);
        ComplexNumber num2 = new ComplexNumber(2, 6);
        assertEquals(new ComplexNumber(1, -2), num1.subtract(num2));
    }

    @Test
    void testMultiply() {
        ComplexNumber num1 = new ComplexNumber(3, 4);
        ComplexNumber num2 = new ComplexNumber(2, 6);
        assertEquals(new ComplexNumber(-18, 26), num1.multiply(num2));
    }

    @Test
    void testEquals() {
        ComplexNumber num1 = new ComplexNumber(3, 4);
        ComplexNumber num2 = new ComplexNumber(3, 4);
        assertTrue(num1.equals(num2));
    }
}


