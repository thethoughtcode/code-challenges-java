package io.thoughtcode.java.exercism;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LeapYearTest {

    private LeapYear leap;

    @BeforeEach
    void setup() {
        leap = new LeapYear();
    }

    @Test
    void testYearNotDivBy4InCommonYear() {
        assertThat(leap.isLeapYear(2015)).isFalse();
    }

    @Test
    void testYearDivBy2NotDivBy4InCommonYear() {
        assertThat(leap.isLeapYear(1970)).isFalse();
    }

    @Test
    void testYearDivBy4NotDivBy100InLeapYear() {
        assertThat(leap.isLeapYear(1996)).isTrue();
    }

    @Test
    void testYearDivBy4And5InLeapYear() {
        assertThat(leap.isLeapYear(1960)).isTrue();
    }

    @Test
    void testYearDivBy100NotDivBy400InCommonYear() {
        assertThat(leap.isLeapYear(2100)).isFalse();
    }

    @Test
    void testYearDivBy100NotDivBy3IsNotLeapYear() {
        assertThat(leap.isLeapYear(1900)).isFalse();
    }

    @Test
    void testYearDivBy400InLeapYear() {
        assertThat(leap.isLeapYear(2000)).isTrue();
    }

    @Test
    void testYearDivBy400NotDivBy125IsLeapYear() {
        assertThat(leap.isLeapYear(2400)).isTrue();
    }

    @Test
    void testYearDivBy200NotDivBy400InCommonYear() {
        assertThat(leap.isLeapYear(1800)).isFalse();
    }
}
