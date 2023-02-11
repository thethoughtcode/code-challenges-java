package io.thoughtcode.java.exercism;

import static org.assertj.core.api.Assertions.assertThat;
import static org.assertj.core.api.Assertions.assertThatExceptionOfType;

import org.junit.jupiter.api.Test;

class FootballMatchReportsTest {

    @Test
    void test_goalie() {
        assertThat(FootballMatchReports.onField(1)).isEqualTo("goalie");
    }

    @Test
    void test_left_back() {
        assertThat(FootballMatchReports.onField(2)).isEqualTo("left back");
    }

    @Test
    void test_right_back() {
        assertThat(FootballMatchReports.onField(5)).isEqualTo("right back");
    }

    @Test
    void test_center_back() {
        assertThat(FootballMatchReports.onField(3)).isEqualTo("center back");
        assertThat(FootballMatchReports.onField(4)).isEqualTo("center back");
    }

    @Test
    void test_midfielder() {
        final String expected = "midfielder";
        assertThat(FootballMatchReports.onField(6)).isEqualTo(expected);
        assertThat(FootballMatchReports.onField(7)).isEqualTo(expected);
        assertThat(FootballMatchReports.onField(8)).isEqualTo(expected);
    }

    @Test
    void test_left_wing() {
        assertThat(FootballMatchReports.onField(9)).isEqualTo("left wing");
    }

    @Test
    void test_striker() {
        assertThat(FootballMatchReports.onField(10)).isEqualTo("striker");
    }

    @Test
    void test_right_wing() {
        assertThat(FootballMatchReports.onField(11)).isEqualTo("right wing");
    }

    @Test
    void test_exception() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> FootballMatchReports.onField(13));
    }

    @Test
    void test_exception_negative_number() {
        assertThatExceptionOfType(IllegalArgumentException.class)
                .isThrownBy(() -> FootballMatchReports.onField(-1));
    }
}
