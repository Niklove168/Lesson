import java.math.BigInteger;
public class FactorialJunit {
    public static void main(String[] args) {
        long number = 5;
        try {
            BigInteger factorial = calculateFactorial(number);
            System.out.println("Факториал числа " + number + " равен: " + factorial);
        } catch (IllegalArgumentException e) {
            System.out.println("Факториал не может быть отрицательным числом");
        }
    }

    static BigInteger calculateFactorial(long n) {
        if (n < 0) {
            throw new IllegalArgumentException();
        }
        BigInteger result = BigInteger.ONE;
        for (long i = 1; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }
}