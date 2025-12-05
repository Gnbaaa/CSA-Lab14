package lab14.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Calculator классын тестүүд.
 */
public class CalculatorTest {
    @Test
    void testAddPositive() {
        Calculator calc = new Calculator();
        assertEquals(5.0, calc.add(2.0, 3.0), "2 + 3 нь 5-тай тэнцүү байх ёстой");
    }

    @Test
    void testAddNegative() {
        Calculator calc = new Calculator();
        assertEquals(-1.0, calc.add(-2.0, 1.0), "-2 + 1 нь -1-тэй тэнцүү байх ёстой");
    }

    @Test
    void testSubtractPositive() {
        Calculator calc = new Calculator();
        assertEquals(1.0, calc.subtract(3.0, 2.0), "3 - 2 нь 1-тэй тэнцүү байх ёстой");
    }

    @Test
    void testSubtractNegative() {
        Calculator calc = new Calculator();
        assertEquals(-5.0, calc.subtract(-2.0, 3.0), "-2 - 3 нь -5-тай тэнцүү байх ёстой");
    }
}

