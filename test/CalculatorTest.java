import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import rikkei.academy.Calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {
    @Test
    @DisplayName("Testing add 0 + 0")
    public void testAdd0And0() {
        int first = 0;
        int second = 0;
        int expected = 0;
        int result = Calculator.add(first,second);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Testing add 1 + 0")
    public void testAdd1And0() {
        int first = 1;
        int second = 0;
        int expected = 1;
        int result = Calculator.add(first,second);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Testing add 0 + 1")
    public void testAdd0And1() {
        int first = 0;
        int second = 1;
        int expected = 1;
        int result = Calculator.add(first,second);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Testing add 5 + 3")
    public void testAdd5And3() {
        int first = 5;
        int second = 3;
        int expected = 8;
        int result = Calculator.add(first,second);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Testing add 0 - 0")
    public void testSub0And0() {
        int first = 0;
        int second = 0;
        int expected = 0;
        int result = Calculator.sub(first,second);
        assertEquals(expected,result);
    }

    @Test
    @DisplayName("Testing add 1 - 0")
    public void testSub1And0() {
        int first = 1;
        int second = 0;
        int expected = 1;
        int result = Calculator.sub(first,second);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Testing add 0 + 1")
    public void testSub0And1() {
        int first = 0;
        int second = 1;
        int expected = -1;
        int result = Calculator.sub(first,second);
        assertEquals(expected,result);
    }
    @Test
    @DisplayName("Testing add 5 - 3")
    public void testSub5And3() {
        int first = 5;
        int second = 3;
        int expected = 2;
        int result = Calculator.sub(first,second);
        assertEquals(expected,result);
    }
}
