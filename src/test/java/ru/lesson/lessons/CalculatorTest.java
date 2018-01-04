package ru.lesson.lessons;

import org.junit.Assert;
import org.junit.Test;

import javax.jws.soap.SOAPBinding;

import static org.junit.Assert.*;

/**
 * Testare Calculator
 */
public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    public void add() {
        calculator.add(1, 1);
        assertEquals(2, calculator.getResult());
    }

    @Test
    public void diff() {
        calculator.diff(1, 2);
        assertEquals(-1, calculator.getResult());
    }

    @Test
    public void prod() {
        calculator.prod(2, 3);
        assertEquals(6, calculator.getResult());
    }

    @Test
    public void div() throws UserException {
        calculator.div(6, 2);
        assertEquals(3, calculator.getResult());
    }

    @Test
    public void mod() {
        calculator.mod(9, 2);
        assertEquals(1, calculator.getResult());
    }
}