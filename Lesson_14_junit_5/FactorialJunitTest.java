import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.;


class FactorialJunitTest {



    @Test
    public void testCalculateOne() {
        long number = 5;
        BigInteger expected =  BigInteger.valueOf(120);
        BigInteger actual = FactorialJunit.calculateFactorial(number);
        assertEquals(expected, actual, Факториал числа 5 должен быть равен 120);
    }

    @Test
    public void testCalculateTwo() {
        long number = 0;
        BigInteger expected =  BigInteger.valueOf(1);
        BigInteger actual = FactorialJunit.calculateFactorial(number);
        assertEquals(expected, actual, Факториал числа 0 должен быть равен 1);
    }

    @Test
    public void testCalculateThree() {
        long number = -5;
        assertThrows(IllegalArgumentException.class, () - FactorialJunit.calculateFactorial(number),
                Факториал не может быть отрицательным числом);
    }
    @ParameterizedTest
    @ValueSource(ints = {1, 2, 3, 4, 5})
    void testCalculateFour(int n) {
        BigInteger expected = FactorialJunit.calculateFactorial(n);
        BigInteger actual = FactorialJunit.calculateFactorial(n);
        assertEquals(expected, actual, Факториал  + n +  не должен быть символом);
    }

}