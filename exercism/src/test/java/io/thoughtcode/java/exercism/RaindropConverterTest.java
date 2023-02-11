package io.thoughtcode.java.exercism;

import static io.thoughtcode.java.exercism.RaindropConverter.PLANG;
import static io.thoughtcode.java.exercism.RaindropConverter.PLING;
import static io.thoughtcode.java.exercism.RaindropConverter.PLONG;
import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class RaindropConverterTest {

    private final RaindropConverter raindropConverter = new RaindropConverter();

    @Test
    void soundFor1Is1() {
        assertThat(raindropConverter.convert(1)).isEqualTo("1");
    }

    @Test
    void soundFor3IsPling() {
        assertThat(raindropConverter.convert(3)).isEqualTo(PLING);
    }

    @Test
    void soundFor5IsPlang() {
        assertThat(raindropConverter.convert(5)).isEqualTo(PLANG);
    }

    @Test
    void soundFor7IsPlong() {
        assertThat(raindropConverter.convert(7)).isEqualTo(PLONG);
    }

    @Test
    void soundFor6IsPlingAsItHasFactor3() {
        assertThat(raindropConverter.convert(6)).isEqualTo(PLING);
    }

    @Test
    void noSoundFor2Cubed() {
        assertThat(raindropConverter.convert(8)).isEqualTo("8");
    }

    @Test
    void soundFor9IsPlingAsItHasFactor3() {
        assertThat(raindropConverter.convert(9)).isEqualTo(PLING);
    }

    @Test
    void soundFor10IsPlangAsItHasFactor5() {
        assertThat(raindropConverter.convert(10)).isEqualTo(PLANG);
    }

    @Test
    void soundFor14IsPlongAsItHasFactor7() {
        assertThat(raindropConverter.convert(14)).isEqualTo(PLONG);
    }

    @Test
    void soundFor15IsPlingPlangAsItHasFactors3And5() {
        assertThat(raindropConverter.convert(15)).isEqualTo("PlingPlang");
    }

    @Test
    void soundFor21IsPlingPlongAsItHasFactors3And7() {
        assertThat(raindropConverter.convert(21)).isEqualTo("PlingPlong");
    }

    @Test
    void soundFor25IsPlangAsItHasFactor5() {
        assertThat(raindropConverter.convert(25)).isEqualTo(PLANG);
    }

    @Test
    void soundFor27IsPlingAsItHasFactor3() {
        assertThat(raindropConverter.convert(27)).isEqualTo(PLING);
    }

    @Test
    void soundFor35IsPlangPlongAsItHasFactors5And7() {
        assertThat(raindropConverter.convert(35)).isEqualTo("PlangPlong");
    }

    @Test
    void soundFor49IsPlongAsItHasFactor7() {
        assertThat(raindropConverter.convert(49)).isEqualTo(PLONG);
    }

    @Test
    void noSoundFor52() {
        assertThat(raindropConverter.convert(52)).isEqualTo("52");
    }

    @Test
    void soundFor105IsPlingPlangPlongAsItHasFactors3And5And7() {
        assertThat(raindropConverter.convert(105)).isEqualTo("PlingPlangPlong");
    }

    @Test
    void soundFor3125IsPlangAsItHasFactor5() {
        assertThat(raindropConverter.convert(3125)).isEqualTo(PLANG);
    }
}
