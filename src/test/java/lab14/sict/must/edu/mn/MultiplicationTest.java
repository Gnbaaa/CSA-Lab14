package lab14.sict.must.edu.mn;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

/**
 * Multiplication классын тестүүд.
 */
public class MultiplicationTest {
    @Test
    void testMultiplyPositive() {
        Multiplication calc = new Multiplication();
        assertEquals(6.0, calc.multiply(2.0, 3.0), "2 * 3 нь 6-тай тэнцүү байх ёстой");
    }

    @Test
    void testMultiplyNegative() {
        Multiplication calc = new Multiplication();
        assertEquals(-6.0, calc.multiply(-2.0, 3.0), "-2 * 3 нь -6-тай тэнцүү байх ёстой");
    }

    @Test
    void testMultiplyByZero() {
        Multiplication calc = new Multiplication();
        assertEquals(0.0, calc.multiply(5.0, 0.0), "5 * 0 нь 0-тэй тэнцүү байх ёстой");
    }
}

