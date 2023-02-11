package io.thoughtcode.java.exercism;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BlackJackTest {

    private static final String TWO = "two";

    private static final String THREE = "three";

    private static final String FOUR = "four";

    private static final String FIVE = "five";

    private static final String SIX = "six";

    private static final String SEVEN = "seven";

    private static final String EIGHT = "eight";

    private static final String NINE = "nine";

    private static final String TEN = "ten";

    private static final String JACK = "jack";

    private static final String QUEEN = "queen";

    private static final String KING = "king";

    private static final String ACE = "ace";

    private BlackJack fixture;

    @BeforeEach
    void setUp() {
        fixture = new BlackJack();
    }

    @Test
    void correctParsesAce() {
        assertThat(fixture.parseCard(ACE)).isEqualTo(11);
    }

    @Test
    void correctParsesTwo() {
        assertThat(fixture.parseCard(TWO)).isEqualTo(2);
    }

    @Test
    void correctParsesThree() {
        assertThat(fixture.parseCard(THREE)).isEqualTo(3);
    }

    @Test
    void correctParsesFour() {
        assertThat(fixture.parseCard(FOUR)).isEqualTo(4);
    }

    @Test
    void correctParsesFive() {
        assertThat(fixture.parseCard(FIVE)).isEqualTo(5);
    }

    @Test
    void correctParsesSix() {
        assertThat(fixture.parseCard(SIX)).isEqualTo(6);
    }

    @Test
    void correctParsesSeven() {
        assertThat(fixture.parseCard(SEVEN)).isEqualTo(7);
    }

    @Test
    void correctParsesEight() {
        assertThat(fixture.parseCard(EIGHT)).isEqualTo(8);
    }

    @Test
    void correctParsesNine() {
        assertThat(fixture.parseCard(NINE)).isEqualTo(9);
    }

    @Test
    void correctParsesTen() {
        assertThat(fixture.parseCard(TEN)).isEqualTo(10);
    }

    @Test
    void correctParsesJack() {
        assertThat(fixture.parseCard(JACK)).isEqualTo(10);
    }

    @Test
    void correctParsesQueen() {
        assertThat(fixture.parseCard(QUEEN)).isEqualTo(10);
    }

    @Test
    void correctParsesKing() {
        assertThat(fixture.parseCard(KING)).isEqualTo(10);
    }

    @Test
    void blackjackWithTenAceSecond() {
        assertThat(fixture.isBlackjack(TEN, ACE)).isEqualTo(true);
    }

    @Test
    void blackjackWithJackAceSecond() {
        assertThat(fixture.isBlackjack(JACK, ACE)).isEqualTo(true);
    }

    @Test
    void blackjackWithQueenAceSecond() {
        assertThat(fixture.isBlackjack(QUEEN, ACE)).isEqualTo(true);
    }

    @Test
    void blackjackWithKingAceSecond() {
        assertThat(fixture.isBlackjack(KING, ACE)).isEqualTo(true);
    }

    @Test
    void noBlackjackWithFive() {
        assertThat(fixture.isBlackjack(ACE, FIVE)).isEqualTo(false);
    }

    @Test
    void noBlackjackWithNine() {
        assertThat(fixture.isBlackjack(ACE, NINE)).isEqualTo(false);
    }

    @Test
    void noBlackjackWithTwoAces() {
        assertThat(fixture.isBlackjack(ACE, ACE)).isEqualTo(false);
    }

    @Test
    void noBlackjackWithTwoFigures() {
        assertThat(fixture.isBlackjack(QUEEN, JACK)).isEqualTo(false);
    }

    @Test
    void noBlackjackWithKingAndFive() {
        assertThat(fixture.isBlackjack(KING, FIVE)).isEqualTo(false);
    }

    @Test
    void noBlackjackWithEightAndFive() {
        assertThat(fixture.isBlackjack(EIGHT, FIVE)).isEqualTo(false);
    }

    @Test
    void firstTurnWithAceAceAndDealerAce() {
        assertThat(fixture.firstTurn(ACE, ACE, ACE)).isEqualTo("P");
    }

    @Test
    void firstTurnWithJackJackAndDealerAce() {
        assertThat(fixture.firstTurn(JACK, JACK, ACE)).isEqualTo("S");
    }

    @Test
    void firstTurnWithKingKingAndDealerAce() {
        assertThat(fixture.firstTurn(KING, KING, ACE)).isEqualTo("S");
    }

    @Test
    void firstTurnWithTwoTwoAndDealerAce() {
        assertThat(fixture.firstTurn(TWO, TWO, ACE)).isEqualTo("H");
    }

    @Test
    void firstTurnWithFiveFiveAndAce() {
        assertThat(fixture.firstTurn(FIVE, FIVE, ACE)).isEqualTo("H");
    }

    @Test
    void firstTurnWithJackAceAndDealerAce() {
        assertThat(fixture.firstTurn(JACK, ACE, ACE)).isEqualTo("S");
    }

    @Test
    void firstTurnWithAceKingAndDealerQueen() {
        assertThat(fixture.firstTurn(ACE, KING, QUEEN)).isEqualTo("S");
    }

    @Test
    void firstTurnWithTenAceAndDealerFive() {
        assertThat(fixture.firstTurn(TEN, ACE, FIVE)).isEqualTo("W");
    }

    @Test
    void firstTurnWithKingAceAndDealerNine() {
        assertThat(fixture.firstTurn(KING, ACE, NINE)).isEqualTo("W");
    }

    @Test
    void firstTurnWithKingTenAndDealerAce() {
        assertThat(fixture.firstTurn(KING, TEN, ACE)).isEqualTo("S");
    }

    @Test
    void firstTurnWithNineTenAndDealerAce() {
        assertThat(fixture.firstTurn(NINE, TEN, ACE)).isEqualTo("S");
    }

    @Test
    void firstTurnWithEightTenAndDealerAce() {
        assertThat(fixture.firstTurn(EIGHT, TEN, ACE)).isEqualTo("S");
    }

    @Test
    void firstTurnWithKingSevenAndDealerAce() {
        assertThat(fixture.firstTurn(KING, SEVEN, ACE)).isEqualTo("S");
    }

    @Test
    void firstTurnWithSixTenAndDealerSix() {
        assertThat(fixture.firstTurn(SIX, TEN, SIX)).isEqualTo("S");
    }

    @Test
    void firstTurnWithSixTenAndDealerSeven() {
        assertThat(fixture.firstTurn(SIX, TEN, SEVEN)).isEqualTo("H");
    }

    @Test
    void firstTurnWithSixTenAndDealerAce() {
        assertThat(fixture.firstTurn(SIX, TEN, ACE)).isEqualTo("H");
    }

    @Test
    void firstTurnWithFiveTenAndDealerSix() {
        assertThat(fixture.firstTurn(FIVE, TEN, SIX)).isEqualTo("S");
    }

    @Test
    void firstTurnWithFiveTenAndDealerSeven() {
        assertThat(fixture.firstTurn(FIVE, TEN, SEVEN)).isEqualTo("H");
    }

    @Test
    void firstTurnWithFiveTenAndDealerKing() {
        assertThat(fixture.firstTurn(FIVE, TEN, KING)).isEqualTo("H");
    }

    @Test
    void firstTurnWithFourTenAndDealerSix() {
        assertThat(fixture.firstTurn(FOUR, TEN, SIX)).isEqualTo("S");
    }

    @Test
    void firstTurnWithFourTenAndDealerSeven() {
        assertThat(fixture.firstTurn(FOUR, TEN, SEVEN)).isEqualTo("H");
    }

    @Test
    void firstTurnWithFourTenAndDealerQueen() {
        assertThat(fixture.firstTurn(FOUR, TEN, QUEEN)).isEqualTo("H");
    }

    @Test
    void firstTurnWithThreeTenAndDealerSix() {
        assertThat(fixture.firstTurn(THREE, TEN, SIX)).isEqualTo("S");
    }

    @Test
    void firstTurnWithThreeTenAndDealerSeven() {
        assertThat(fixture.firstTurn(THREE, TEN, SEVEN)).isEqualTo("H");
    }

    @Test
    void firstTurnWithThreeTenAndDealerQueen() {
        assertThat(fixture.firstTurn(THREE, TEN, QUEEN)).isEqualTo("H");
    }

    @Test
    void firstTurnWithTwoTenAndDealerSix() {
        assertThat(fixture.firstTurn(TWO, TEN, SIX)).isEqualTo("S");
    }

    @Test
    void firstTurnWithTwoTenAndDealerSeven() {
        assertThat(fixture.firstTurn(TWO, TEN, SEVEN)).isEqualTo("H");
    }

    @Test
    void firstTurnWithTwoTenAndDealerQueen() {
        assertThat(fixture.firstTurn(TWO, TEN, QUEEN)).isEqualTo("H");
    }

    @Test
    void firstTurnWithTwoNineAndDealerQueen() {
        assertThat(fixture.firstTurn(TWO, NINE, QUEEN)).isEqualTo("H");
    }

    @Test
    void firstTurnWithTwoEightAndDealerTwo() {
        assertThat(fixture.firstTurn(TWO, EIGHT, TWO)).isEqualTo("H");
    }

    @Test
    void firstTurnWithTwoThreeAndDealerQueen() {
        assertThat(fixture.firstTurn(TWO, THREE, QUEEN)).isEqualTo("H");
    }

    @Test
    void firstTurnWithTwoTwoAndDealerFive() {
        assertThat(fixture.firstTurn(TWO, TWO, FIVE)).isEqualTo("H");
    }

}
