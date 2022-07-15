package io.sampadadubey.java.exercism;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReverseStringTest {

    private ReverseString fixture;

    @BeforeEach
    void setUp() {
        fixture = new ReverseString();
    }

    @Test
    void testAnEmptyString() {
        assertThat(fixture.reverse("")).isEqualTo("");
    }

    @Test
    void testAWord() {
        assertThat(fixture.reverse("robot")).isEqualTo("tobor");
    }

    @Test
    void testACapitalizedWord() {
        assertThat(fixture.reverse("Ramen")).isEqualTo("nemaR");
    }

    @Test
    void testASentenceWithPunctuation() {
        assertThat(fixture.reverse("I'm hungry!")).isEqualTo("!yrgnuh m'I");
    }

    @Test
    void testAPalindrome() {
        assertThat(fixture.reverse("racecar")).isEqualTo("racecar");
    }

    @Test
    void testAnEvenSizedWord() {
        assertThat(fixture.reverse("drawer")).isEqualTo("reward");
    }
}
