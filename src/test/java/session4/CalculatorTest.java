package session4;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    Calculator calculator = new Calculator();

    @Test
    void should_pass_WHEN_addition() {
        //GIVEN
        int a = 1;
        int b = 1;
        int expected = 2;

        //WHEN
        int actual = calculator.addition(a, b);

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void should_pass_WHEN_minus() {
        //GIVEN
        int a = 5;
        int b = 4;
        int expected = 1;

        //WHEN
        int actual = calculator.minus(a, b);

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void should_pass_WHEN_multi() {
        //GIVEN
        int a = 3;
        int b = 2;
        int expected = 6;

        //WHEN
        int actual = calculator.multi(a, b);

        //THEN
        assertEquals(expected, actual);
    }

    @Test
    void should_pass_WHEN_div() {
        //GIVEN
        int a = 5;
        int b = 2;
        int expected = 2;

        //WHEN
        int actual = calculator.div(a, b);

        //THEN
        assertEquals(expected, actual);
    }
}
