package io.sampadadubey.java.exercism;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;

class GrainsTest {

    private Grains grains = new Grains();

    @Test
    void countAtSquare1() {
        final BigInteger result = grains.grainsOnSquare(1);
        assertThat(result).isEqualTo(new BigInteger("1"));
    }

    @Test
    void countAtSquare2() {
        final BigInteger result = grains.grainsOnSquare(2);
        assertThat(result).isEqualTo(new BigInteger("2"));
    }

    @Test
    void countAtSquare3() {
        final BigInteger result = grains.grainsOnSquare(3);
        assertThat(result).isEqualTo(new BigInteger("4"));
    }

    @Test
    void countAtSquare4() {
        final BigInteger result = grains.grainsOnSquare(4);
        assertThat(result).isEqualTo(new BigInteger("8"));
    }

    @Test
    void countAtSquare16() {
        final BigInteger result = grains.grainsOnSquare(16);
        assertThat(result).isEqualTo(new BigInteger("32768"));
    }

    @Test
    void countAtSquare32() {
        final BigInteger result = grains.grainsOnSquare(32);
        assertThat(result).isEqualTo(new BigInteger("2147483648"));
    }

    @Test
    void countAtSquare64() {
        final BigInteger result = grains.grainsOnSquare(64);
        assertThat(result).isEqualTo(new BigInteger("9223372036854775808"));
    }

    @Test
    void errorOnNullBoardSize() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> grains.grainsOnSquare(0))
                .withMessage("square must be between 1 and 64");
    }

    @Test
    void errorOnNegativeBoardSize() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> grains.grainsOnSquare(-1))
                .withMessage("square must be between 1 and 64");
    }

    @Test
    void errorOnExcessiveBoardSize() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> grains.grainsOnSquare(65))
                .withMessage("square must be between 1 and 64");
    }

    @Test
    void totalNumberOfGrainsOnABoard() {
        final BigInteger total = grains.grainsOnBoard();
        assertThat(total).isEqualTo(new BigInteger("18446744073709551615"));
    }
}
