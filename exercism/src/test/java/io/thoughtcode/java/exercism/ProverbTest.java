package io.thoughtcode.java.exercism;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class ProverbTest {

    @Test
    void zeroWordsAreGiven() {

        final String[] words = new String[0];

        assertThat(new Proverb(words).recite()).isEqualTo("");
    }

    @Test
    void singlePieceOfProverb() {

        final String[] words = { "nail" };

        assertThat(new Proverb(words).recite())
                .isEqualTo("And all for the want of a nail.");
    }

    @Test
    void twoPiecesOfProverb() {

        final String[] words = { "nail", "shoe" };

        assertThat(new Proverb(words).recite())
                .isEqualTo(
                        "For want of a nail the shoe was lost.\n"
                      + "And all for the want of a nail.");
    }

    @Test
    void shortChainOfConsequences() {

        final String[] words = { "nail", "shoe", "horse" };

        assertThat(new Proverb(words).recite())
                .isEqualTo(
                        "For want of a nail the shoe was lost.\n"
                      + "For want of a shoe the horse was lost.\n"
                      + "And all for the want of a nail.");
    }

    @Test
    void fullProverb() {

        final String[] words = { "nail", "shoe", "horse", "rider", "message", "battle", "kingdom" };

        assertThat(new Proverb(words).recite())
                .isEqualTo(
                        "For want of a nail the shoe was lost.\n"
                      + "For want of a shoe the horse was lost.\n"
                      + "For want of a horse the rider was lost.\n"
                      + "For want of a rider the message was lost.\n"
                      + "For want of a message the battle was lost.\n"
                      + "For want of a battle the kingdom was lost.\n"
                      + "And all for the want of a nail.");
    }

    @Test
    void fourPiecesModernizedProverb() {

        final String[] words = { "pin", "gun", "soldier", "battle" };

        assertThat(new Proverb(words).recite())
                .isEqualTo(
                        "For want of a pin the gun was lost.\n"
                      + "For want of a gun the soldier was lost.\n"
                      + "For want of a soldier the battle was lost.\n"
                      + "And all for the want of a pin.");
    }
}
