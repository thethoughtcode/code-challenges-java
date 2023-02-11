package io.thoughtcode.java.exercism;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ArmstrongNumbersTest {

    private ArmstrongNumbers armstrongNumbers;

    @BeforeEach
    void setup() {
        armstrongNumbers = new ArmstrongNumbers();
    }

    @Test
    void zeroIsArmstrongNumber() {
        assertThat(armstrongNumbers.isArmstrongNumber(0)).isTrue();
    }

    @Test
    void singleDigitsAreArmstrongNumbers() {
        assertThat(armstrongNumbers.isArmstrongNumber(5)).isTrue();
    }

    @Test
    void noTwoDigitArmstrongNumbers() {
        assertThat(armstrongNumbers.isArmstrongNumber(10)).isFalse();
    }

    @Test
    void threeDigitNumberIsArmstrongNumber() {
        assertThat(armstrongNumbers.isArmstrongNumber(153)).isTrue();
    }

    @Test
    void threeDigitNumberIsNotArmstrongNumber() {
        assertThat(armstrongNumbers.isArmstrongNumber(100)).isFalse();
    }

    @Test
    void fourDigitNumberIsArmstrongNumber() {
        assertThat(armstrongNumbers.isArmstrongNumber(9_474)).isTrue();
    }

    @Test
    void fourDigitNumberIsNotArmstrongNumber() {
        assertThat(armstrongNumbers.isArmstrongNumber(9_475)).isFalse();
    }

    @Test
    void sevenDigitNumberIsArmstrongNumber() {
        assertThat(armstrongNumbers.isArmstrongNumber(9_926_315)).isTrue();
    }

    @Test
    void sevenDigitNumberIsNotArmstrongNumber() {
        assertThat(armstrongNumbers.isArmstrongNumber(9_926_314)).isFalse();
    }
}
