package io.thoughtcode.java.exercism;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import org.junit.jupiter.api.Test;

class SaySayTest {

    private final SaySay say = new SaySay();

    @Test
    void zero() {
        assertThat(say.say(0)).isEqualTo("zero");
    }

    @Test
    void one() {
        assertThat(say.say(1)).isEqualTo("one");
    }

    @Test
    void fourteen() {
        assertThat(say.say(14)).isEqualTo("fourteen");
    }

    @Test
    void twenty() {
        assertThat(say.say(20)).isEqualTo("twenty");
    }

    @Test
    void twentyTwo() {
        assertThat(say.say(22)).isEqualTo("twenty-two");
    }

    @Test
    void oneHundred() {
        assertThat(say.say(100)).isEqualTo("one hundred");
    }

    @Test
    void oneHundredTwentyThree() {
        assertThat(say.say(123)).isEqualTo("one hundred twenty-three");
    }

    @Test
    void oneThousand() {
        assertThat(say.say(1_000)).isEqualTo("one thousand");
    }

    @Test
    void oneThousandTwoHundredThirtyFour() {
        assertThat(say.say(1_234)).isEqualTo("one thousand two hundred thirty-four");
    }

    @Test
    void oneMillion() {
        assertThat(say.say(1_000_000)).isEqualTo("one million");
    }

    @Test
    void oneMillionTwoThousandThreeHundredFortyFive() {
        assertThat(say.say(1_002_345)).isEqualTo("one million two thousand three hundred forty-five");
    }

    @Test
    void oneBillion() {
        assertThat(say.say(1_000_000_000)).isEqualTo("one billion");
    }

    @Test
    void nineHundredEightySevenBillionSixHundredFiftyFourThreeHundredTwentyOneThousandOneHundredTwentyThree() {
        assertThat(say.say(987_654_321_123L))
                .isEqualTo("nine hundred eighty-seven billion six hundred fifty-four million"
                         + " three hundred twenty-one thousand one hundred twenty-three");
    }

    @Test
    void illegalNegativeNumber() {
        assertThatExceptionOfType(IllegalArgumentException.class).isThrownBy(() -> say.say(-1));
    }

    @Test
    void illegalTooBigNumber() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> say.say(NamedNumber.TRILLION.getNumber()));
    }
}
