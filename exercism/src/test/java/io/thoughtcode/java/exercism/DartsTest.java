package io.thoughtcode.java.exercism;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class DartsTest {

    @Test
    void missedTarget() {
        final Darts dart = new Darts(-9, 9);
        assertThat(dart.score()).isEqualTo(0);
    }

    @Test
    void onTheOuterCircle() {
        final Darts dart = new Darts(0, 10);
        assertThat(dart.score()).isEqualTo(1);
    }

    @Test
    void onTheMiddleCircle() {
        final Darts dart = new Darts(-5, 0);
        assertThat(dart.score()).isEqualTo(5);
    }

    @Test
    void onTheInnerCircle() {
        final Darts dart = new Darts(0, -1);
        assertThat(dart.score()).isEqualTo(10);
    }

    @Test
    void exactlyOnCentre() {
        final Darts dart = new Darts(0, 0);
        assertThat(dart.score()).isEqualTo(10);
    }

    @Test
    void nearTheCentre() {
        final Darts dart = new Darts(-0.1, -0.1);
        assertThat(dart.score()).isEqualTo(10);
    }

    @Test
    void justWithinTheInnerCircle() {
        final Darts dart = new Darts(0.7, 0.7);
        assertThat(dart.score()).isEqualTo(10);
    }

    @Test
    void justOutsideTheInnerCircle() {
        final Darts dart = new Darts(0.8, -0.8);
        assertThat(dart.score()).isEqualTo(5);
    }

    @Test
    void justWithinTheMiddleCirlce() {
        final Darts dart = new Darts(-3.5, 3.5);
        assertThat(dart.score()).isEqualTo(5);
    }

    @Test
    void justOutsideTheMiddleCircle() {
        final Darts dart = new Darts(-3.6, -3.6);
        assertThat(dart.score()).isEqualTo(1);
    }

    @Test
    void justWithinTheOuterCirlce() {
        final Darts dart = new Darts(-7.0, 7.0);
        assertThat(dart.score()).isEqualTo(1);
    }

    @Test
    void justOutsideTheOuterCircle() {
        final Darts dart = new Darts(7.1, -7.1);
        assertThat(dart.score()).isEqualTo(0);
    }

    @Test
    void asymmetricPositionBetweenTheInnerAndMiddleCircles() {
        final Darts dart = new Darts(0.5, -4);
        assertThat(dart.score()).isEqualTo(5);
    }
}
