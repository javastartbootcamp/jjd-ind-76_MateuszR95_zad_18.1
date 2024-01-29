package pl.javastart.euler2;

public class Euler2 {

    private static final long FIBONACCI_SEQUENCE_VALUE_LIMIT = 4000000;

    public static void main(String[] args) {

        long sumEvenNumbersOfFibonacciSequence = sumEvenNumbersOfFibonacciSequence(FIBONACCI_SEQUENCE_VALUE_LIMIT);
        System.out.println("Suma elementów parzystych ciągu Fibonacciego, których wartość jest mniejsza od 4 milionów" +
                ", wynosi: " + sumEvenNumbersOfFibonacciSequence);
    }

    public static long sumEvenNumbersOfFibonacciSequence(long limitValue) {
        long a = 1;
        long b = 2;
        long sum = 0;
        while (b <= limitValue) {
            if (b % 2 == 0) {
                sum += b;
            }
            long nextValue = a + b;
            a = b;
            b = nextValue;
        }
        return sum;
    }
}
