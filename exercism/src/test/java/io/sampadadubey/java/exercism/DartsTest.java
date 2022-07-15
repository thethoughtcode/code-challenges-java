package io.sampadadubey.java.exercism;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

public class DartsTest {

    @Test
    public void missedTarget() {
        final Darts dart = new Darts(-9, 9);
        assertThat(dart.score()).isEqualTo(0);
    }

    @Test
    public void onTheOuterCircle() {
        final Darts dart = new Darts(0, 10);
        assertThat(dart.score()).isEqualTo(1);
    }

    @Test
    public void onTheMiddleCircle() {
        final Darts dart = new Darts(-5, 0);
        assertThat(dart.score()).isEqualTo(5);
    }

    @Test
    public void onTheInnerCircle() {
        final Darts dart = new Darts(0, -1);
        assertThat(dart.score()).isEqualTo(10);
    }

    @Test
    public void exactlyOnCentre() {
        final Darts dart = new Darts(0, 0);
        assertThat(dart.score()).isEqualTo(10);
    }

    @Test
    public void nearTheCentre() {
        final Darts dart = new Darts(-0.1, -0.1);
        assertThat(dart.score()).isEqualTo(10);
    }

    @Test
    public void justWithinTheInnerCircle() {
        final Darts dart = new Darts(0.7, 0.7);
        assertThat(dart.score()).isEqualTo(10);
    }

    @Test
    public void justOutsideTheInnerCircle() {
        final Darts dart = new Darts(0.8, -0.8);
        assertThat(dart.score()).isEqualTo(5);
    }

    @Test
    public void justWithinTheMiddleCirlce() {
        final Darts dart = new Darts(-3.5, 3.5);
        assertThat(dart.score()).isEqualTo(5);
    }

    @Test
    public void justOutsideTheMiddleCircle() {
        final Darts dart = new Darts(-3.6, -3.6);
        assertThat(dart.score()).isEqualTo(1);
    }

    @Test
    public void justWithinTheOuterCirlce() {
        final Darts dart = new Darts(-7.0, 7.0);
        assertThat(dart.score()).isEqualTo(1);
    }

    @Test
    public void justOutsideTheOuterCircle() {
        final Darts dart = new Darts(7.1, -7.1);
        assertThat(dart.score()).isEqualTo(0);
    }

    @Test
    public void asymmetricPositionBetweenTheInnerAndMiddleCircles() {
        final Darts dart = new Darts(0.5, -4);
        assertThat(dart.score()).isEqualTo(5);
    }
}
