package pl.javastart.euler2;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.*;

class Euler2Test {

    @Test
    public void shouldReturn10ForLimitValue10() {
        //given
        long limitValue = 10;
        //when
        long sum = Euler2.sumEvenNumbersOfFibonacciSequence(limitValue);
        //then
        assertThat(sum).isEqualTo(10);
    }

    @Test
    public void shouldReturn44ForLimitValue34() {
        //given
        long limitValue = 34;
        //when
        long sum = Euler2.sumEvenNumbersOfFibonacciSequence(limitValue);
        //then
        assertThat(sum).isEqualTo(44);
    }

    @Test
    public void shouldReturn2ForLimitValue2() {
        //given
        long limitValue = 2;
        //when
        long sum = Euler2.sumEvenNumbersOfFibonacciSequence(limitValue);
        //then
        assertThat(sum).isEqualTo(2);
    }

    @Test
    public void shouldReturn4613732ForLimitValue4000000() {
        //given
        long limitValue = 4000000;
        //when
        long sum = Euler2.sumEvenNumbersOfFibonacciSequence(limitValue);
        //then
        assertThat(sum).isEqualTo(4613732);
    }

}