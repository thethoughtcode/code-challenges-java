package io.sampadadubey.java.exercism;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BlackJackTest {

    private BlackJack fixture;

    @BeforeEach
    void setUp() {
        fixture = new BlackJack();
    }

    @Test
    void correctParsesAce() {
        assertThat(fixture.parseCard("ace")).isEqualTo(11);
    }

    @Test
    void correctParsesTwo() {
        assertThat(fixture.parseCard("two")).isEqualTo(2);
    }

    @Test
    void correctParsesThree() {
        assertThat(fixture.parseCard("three")).isEqualTo(3);
    }

    @Test
    void correctParsesFour() {
        assertThat(fixture.parseCard("four")).isEqualTo(4);
    }

    @Test
    void correctParsesFive() {
        assertThat(fixture.parseCard("five")).isEqualTo(5);
    }

    @Test
    void correctParsesSix() {
        assertThat(fixture.parseCard("six")).isEqualTo(6);
    }

    @Test
    void correctParsesSeven() {
        assertThat(fixture.parseCard("seven")).isEqualTo(7);
    }

    @Test
    void correctParsesEight() {
        assertThat(fixture.parseCard("eight")).isEqualTo(8);
    }

    @Test
    void correctParsesNine() {
        assertThat(fixture.parseCard("nine")).isEqualTo(9);
    }

    @Test
    void correctParsesTen() {
        assertThat(fixture.parseCard("ten")).isEqualTo(10);
    }

    @Test
    void correctParsesJack() {
        assertThat(fixture.parseCard("jack")).isEqualTo(10);
    }

    @Test
    void correctParsesQueen() {
        assertThat(fixture.parseCard("queen")).isEqualTo(10);
    }

    @Test
    void correctParsesKing() {
        assertThat(fixture.parseCard("king")).isEqualTo(10);
    }

    @Test
    void blackjackWithTenAceSecond() {
        assertThat(fixture.isBlackjack("ten", "ace")).isEqualTo(true);
    }

    @Test
    void blackjackWithJackAceSecond() {
        assertThat(fixture.isBlackjack("jack", "ace")).isEqualTo(true);
    }

    @Test
    void blackjackWithQueenAceSecond() {
        assertThat(fixture.isBlackjack("queen", "ace")).isEqualTo(true);
    }

    @Test
    void blackjackWithKingAceSecond() {
        assertThat(fixture.isBlackjack("king", "ace")).isEqualTo(true);
    }

    @Test
    void noBlackjackWithFive() {
        assertThat(fixture.isBlackjack("ace", "five")).isEqualTo(false);
    }

    @Test
    void noBlackjackWithNine() {
        assertThat(fixture.isBlackjack("ace", "nine")).isEqualTo(false);
    }

    @Test
    void noBlackjackWithTwoAces() {
        assertThat(fixture.isBlackjack("ace", "ace")).isEqualTo(false);
    }

    @Test
    void noBlackjackWithTwoFigures() {
        assertThat(fixture.isBlackjack("queen", "jack")).isEqualTo(false);
    }

    @Test
    void noBlackjackWithKingAndFive() {
        assertThat(fixture.isBlackjack("king", "five")).isEqualTo(false);
    }

    @Test
    void noBlackjackWithEightAndFive() {
        assertThat(fixture.isBlackjack("eight", "five")).isEqualTo(false);
    }

    @Test
    void firstTurnWithAceAceAndDealerAce() {
        assertThat(fixture.firstTurn("ace", "ace", "ace")).isEqualTo("P");
    }

    @Test
    void firstTurnWithJackJackAndDealerAce() {
        assertThat(fixture.firstTurn("jack", "jack", "ace")).isEqualTo("S");
    }

    @Test
    void firstTurnWithKingKingAndDealerAce() {
        assertThat(fixture.firstTurn("king", "king", "ace")).isEqualTo("S");
    }

    @Test
    void firstTurnWithTwoTwoAndDealerAce() {
        assertThat(fixture.firstTurn("two", "two", "ace")).isEqualTo("H");
    }

    @Test
    void firstTurnWithFiveFiveAndAce() {
        assertThat(fixture.firstTurn("five", "five", "ace")).isEqualTo("H");
    }

    @Test
    void firstTurnWithJackAceAndDealerAce() {
        assertThat(fixture.firstTurn("jack", "ace", "ace")).isEqualTo("S");
    }

    @Test
    void firstTurnWithAceKingAndDealerQueen() {
        assertThat(fixture.firstTurn("ace", "king", "queen")).isEqualTo("S");
    }

    @Test
    void firstTurnWithTenAceAndDealerFive() {
        assertThat(fixture.firstTurn("ten", "ace", "five")).isEqualTo("W");
    }

    @Test
    void firstTurnWithKingAceAndDealerNine() {
        assertThat(fixture.firstTurn("king", "ace", "nine")).isEqualTo("W");
    }

    @Test
    void firstTurnWithKingTenAndDealerAce() {
        assertThat(fixture.firstTurn("king", "ten", "ace")).isEqualTo("S");
    }

    @Test
    void firstTurnWithNineTenAndDealerAce() {
        assertThat(fixture.firstTurn("nine", "ten", "ace")).isEqualTo("S");
    }

    @Test
    void firstTurnWithEightTenAndDealerAce() {
        assertThat(fixture.firstTurn("eight", "ten", "ace")).isEqualTo("S");
    }

    @Test
    void firstTurnWithKingSevenAndDealerAce() {
        assertThat(fixture.firstTurn("king", "seven", "ace")).isEqualTo("S");
    }

    @Test
    void firstTurnWithSixTenAndDealerSix() {
        assertThat(fixture.firstTurn("six", "ten", "six")).isEqualTo("S");
    }

    @Test
    void firstTurnWithSixTenAndDealerSeven() {
        assertThat(fixture.firstTurn("six", "ten", "seven")).isEqualTo("H");
    }

    @Test
    void firstTurnWithSixTenAndDealerAce() {
        assertThat(fixture.firstTurn("six", "ten", "ace")).isEqualTo("H");
    }

    @Test
    void firstTurnWithFiveTenAndDealerSix() {
        assertThat(fixture.firstTurn("five", "ten", "six")).isEqualTo("S");
    }

    @Test
    void firstTurnWithFiveTenAndDealerSeven() {
        assertThat(fixture.firstTurn("five", "ten", "seven")).isEqualTo("H");
    }

    @Test
    void firstTurnWithFiveTenAndDealerKing() {
        assertThat(fixture.firstTurn("five", "ten", "king")).isEqualTo("H");
    }

    @Test
    void firstTurnWithFourTenAndDealerSix() {
        assertThat(fixture.firstTurn("four", "ten", "six")).isEqualTo("S");
    }

    @Test
    void firstTurnWithFourTenAndDealerSeven() {
        assertThat(fixture.firstTurn("four", "ten", "seven")).isEqualTo("H");
    }

    @Test
    void firstTurnWithFourTenAndDealerQueen() {
        assertThat(fixture.firstTurn("four", "ten", "queen")).isEqualTo("H");
    }

    @Test
    void firstTurnWithThreeTenAndDealerSix() {
        assertThat(fixture.firstTurn("three", "ten", "six")).isEqualTo("S");
    }

    @Test
    void firstTurnWithThreeTenAndDealerSeven() {
        assertThat(fixture.firstTurn("three", "ten", "seven")).isEqualTo("H");
    }

    @Test
    void firstTurnWithThreeTenAndDealerQueen() {
        assertThat(fixture.firstTurn("three", "ten", "queen")).isEqualTo("H");
    }

    @Test
    void firstTurnWithTwoTenAndDealerSix() {
        assertThat(fixture.firstTurn("two", "ten", "six")).isEqualTo("S");
    }

    @Test
    void firstTurnWithTwoTenAndDealerSeven() {
        assertThat(fixture.firstTurn("two", "ten", "seven")).isEqualTo("H");
    }

    @Test
    void firstTurnWithTwoTenAndDealerQueen() {
        assertThat(fixture.firstTurn("two", "ten", "queen")).isEqualTo("H");
    }

    @Test
    void firstTurnWithTwoNineAndDealerQueen() {
        assertThat(fixture.firstTurn("two", "nine", "queen")).isEqualTo("H");
    }

    @Test
    void firstTurnWithTwoEightAndDealerTwo() {
        assertThat(fixture.firstTurn("two", "eight", "two")).isEqualTo("H");
    }

    @Test
    void firstTurnWithTwoThreeAndDealerQueen() {
        assertThat(fixture.firstTurn("two", "three", "queen")).isEqualTo("H");
    }

    @Test
    void firstTurnWithTwoTwoAndDealerFive() {
        assertThat(fixture.firstTurn("two", "two", "five")).isEqualTo("H");
    }

}
