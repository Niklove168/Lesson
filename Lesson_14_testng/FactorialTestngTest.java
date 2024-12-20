import org.testng.Assert;
import static org.testng.Assert.assertEquals;
import java.math.BigInteger;

public class FactorialTestngTest {

    @org.testng.annotations.Test
    public void testOne() {
        long number = 5;
        BigInteger expectedFactorial = BigInteger.valueOf(120);
        BigInteger actualFactorial = FactorialTestng.calculateFactorial(number);
        Assert.assertEquals(actualFactorial, expectedFactorial);
    }


    @org.testng.annotations.Test
    public void testTwo() {
        long negativeNumber = -1;
        FactorialTestng.calculateFactorial(negativeNumber);
    }
}

