package FixedVersionOfCalculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FixedVersionOfCalculatorTest {

    @Test
    void reset() {
        FixedVersionOfCalculator calculator = new FixedVersionOfCalculator();
        calculator.add(10);
        calculator.add(-5);
        calculator.reset();
        assertEquals(0, calculator.getResult());
    }

    @Test
    void getResult() {
        FixedVersionOfCalculator calculator = new FixedVersionOfCalculator();
        assertEquals(0, calculator.getResult());
    }

    @Test
    void add() {
        FixedVersionOfCalculator calculator = new FixedVersionOfCalculator();
        calculator.add(10);
        calculator.add(-5);
        assertEquals(5, calculator.getResult());
    }

    @Test
    void subtract() {
        FixedVersionOfCalculator calculator = new FixedVersionOfCalculator();
        calculator.add(10);
        calculator.subtract(5);
        assertEquals(5, calculator.getResult());
    }

    @Test
    void multiply() {
        FixedVersionOfCalculator calculator = new FixedVersionOfCalculator();
        calculator.add(5);
        calculator.multiply(2);
        calculator.multiply(-3);
        assertEquals(-30, calculator.getResult());
    }

    @Test
    void exponent() {
        FixedVersionOfCalculator calculator = new FixedVersionOfCalculator();
        calculator.add(5);
        calculator.exponent(2);
        assertEquals(25, calculator.getResult());
    }
}