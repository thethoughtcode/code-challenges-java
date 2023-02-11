package io.thoughtcode.java.exercism;

import java.util.HashSet;
import java.util.Optional;
import java.util.Set;

public class BlackJack {

    static final int SCORE_BLACKJACK = 21;

    static final int SCORE_TWENTY = 20;

    static final int SCORE_SEVENTEEN = 17;

    static final int SCORE_ELEVEN = 11;

    static final int SCORE_SEVEN = 7;

    static final Set<Integer> HIGH_VALUE_CARDS = new HashSet<>();

    static {
        HIGH_VALUE_CARDS.add(Card.ACE.getValue());
        HIGH_VALUE_CARDS.add(Card.TEN.getValue());
        HIGH_VALUE_CARDS.add(Card.JACK.getValue());
        HIGH_VALUE_CARDS.add(Card.QUEEN.getValue());
        HIGH_VALUE_CARDS.add(Card.KING.getValue());
    }

    public int parseCard(final String card) {
        return Card.get(card).getValue();
    }

    public boolean isBlackjack(final String card1, final String card2) {
        return parseCard(card1) + parseCard(card2) == SCORE_BLACKJACK;
    }

    public String largeHand(final boolean isBlackjack, final int dealerScore) {

        final Decision decision;

        if (isBlackjack) {
            if (HIGH_VALUE_CARDS.contains(dealerScore)) {
                decision = Decision.STAND;
            } else {
                decision = Decision.WIN;
            }
        } else {
            // It's not Blackjack, and large-hand scenario (player-score -> 22)
            decision = Decision.SPLIT;
        }

        return decision.getCode();
    }

    public String smallHand(final int handScore, final int dealerScore) {

        final Decision decision;

        if (handScore >= SCORE_SEVENTEEN) {
            decision = Decision.STAND;
        } else if (handScore <= SCORE_ELEVEN) {
            decision = Decision.HIT;
        } else {
            if (dealerScore >= SCORE_SEVEN) {
                decision = Decision.HIT;
            } else {
                decision = Decision.STAND;
            }
        }

        return decision.getCode();
    }

    // FirstTurn returns the semi-optimal decision for the first turn, given the
    // cards of the player and the dealer.
    // This function is already implemented and does not need to be edited. It pulls
    // the other functions together in a
    // complete decision tree for the first turn.
    public String firstTurn(final String card1, final String card2, final String dealerCard) {

        final int handScore = parseCard(card1) + parseCard(card2);
        final int dealerScore = parseCard(dealerCard);

        final String result;

        if (SCORE_TWENTY < handScore) {
            result = largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            result = smallHand(handScore, dealerScore);
        }

        return result;
    }
}

enum Card {

    ACE(11),

    TWO(2),

    THREE(3),

    FOUR(4),

    FIVE(5),

    SIX(6),

    SEVEN(7),

    EIGHT(8),

    NINE(9),

    TEN(10),

    JACK(10),

    QUEEN(10),

    KING(10),

    UNKNOWN(0);

    private int value;

    static Card get(final String cardValueToParse) {

        Card resultCard = null;

        for (final Card card : Card.values()) {
            if (card.name().equalsIgnoreCase(cardValueToParse)) {
                resultCard = card;
                break;
            }
        }

        return Optional.ofNullable(resultCard).orElse(Card.UNKNOWN);
    }

    Card(final int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}

enum Decision {

    STAND("S"),

    HIT("H"),

    SPLIT("P"),

    WIN("W");

    private String code;

    Decision(final String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
