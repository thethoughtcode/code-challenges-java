package io.sampadadubey.java.exercism;

import static org.assertj.core.api.Assertions.assertThat;

import org.assertj.core.data.Offset;
import org.junit.jupiter.api.Test;

class SpaceAgeTest {

    private static final Offset<Double> MAXIMUM_DELTA = Offset.offset(1E-02);

    @Test
    void ageOnEarth() {
        assertThat(new SpaceAge(1_000_000_000).onEarth()).isEqualTo(31.69, MAXIMUM_DELTA);
    }

    @Test
    void ageOnMercury() {
        assertThat(new SpaceAge(2_134_835_688).onMercury()).isEqualTo(280.88, MAXIMUM_DELTA);
    }

    @Test
    void ageOnVenus() {
        assertThat(new SpaceAge(189_839_836).onVenus()).isEqualTo(9.78, MAXIMUM_DELTA);
    }

    @Test
    void ageOnMars() {
        assertThat(new SpaceAge(2_129_871_239).onMars()).isEqualTo(35.88, MAXIMUM_DELTA);
    }

    @Test
    void ageOnJupiter() {
        assertThat(new SpaceAge(901_876_382).onJupiter()).isEqualTo(2.41, MAXIMUM_DELTA);
    }

    @Test
    void ageOnSaturn() {
        assertThat(new SpaceAge(2_000_000_000).onSaturn()).isEqualTo(2.15, MAXIMUM_DELTA);
    }

    @Test
    void ageOnUranus() {
        assertThat(new SpaceAge(1_210_123_456).onUranus()).isEqualTo(0.46, MAXIMUM_DELTA);
    }

    @Test
    void ageOnNeptune() {
        assertThat(new SpaceAge(1_821_023_456).onNeptune()).isEqualTo(0.35, MAXIMUM_DELTA);
    }
}
