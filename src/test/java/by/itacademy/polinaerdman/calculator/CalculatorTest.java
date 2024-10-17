package by.itacademy.polinaerdman.calculator;

import by.itacademy.polnaerdman.calculator2.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {

    @Test
    public void testSum1() {
        Calculator calculator = new Calculator();
        double actual = calculator.sum(1.3, 2.3);
        Assertions.assertEquals(3.6, actual, 0.001);
    }
}
