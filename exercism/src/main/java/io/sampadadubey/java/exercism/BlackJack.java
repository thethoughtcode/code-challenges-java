package io.sampadadubey.java.exercism;

import java.util.HashSet;
import java.util.Set;

public class BlackJack {

    static final int BLACKJACK = 21;

    static final Set<Integer> HIGH_VALUE_CARDS = new HashSet<Integer>() {
        {
            add(Card.ACE.getValue());
            add(Card.TEN.getValue());
            add(Card.JACK.getValue());
            add(Card.QUEEN.getValue());
            add(Card.KING.getValue());
        }
    };

    public int parseCard(final String card) {
        return Card.get(card).getValue();
    }

    public boolean isBlackjack(final String card1, final String card2) {
        return parseCard(card1) + parseCard(card2) == BLACKJACK;
    }

    public String largeHand(final boolean isBlackjack, final int dealerScore) {

        final Decision decision;

        if (isBlackjack) {
            if (!HIGH_VALUE_CARDS.contains(dealerScore)) {
                decision = Decision.WIN;
            } else {
                decision = Decision.STAND;
            }
        } else {
            // It's not Blackjack, and large-hand scenario (player-score -> 22)
            decision = Decision.SPLIT;
        }

        return decision.getCode();
    }

    public String smallHand(final int handScore, final int dealerScore) {

        final Decision decision;

        if (handScore >= 17) {
            decision = Decision.STAND;
        } else if (handScore <= 11) {
            decision = Decision.HIT;
        } else {
            if (dealerScore >= 7) {
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
        int handScore = parseCard(card1) + parseCard(card2);
        int dealerScore = parseCard(dealerCard);

        if (20 < handScore) {
            return largeHand(isBlackjack(card1, card2), dealerScore);
        } else {
            return smallHand(handScore, dealerScore);
        }
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

        for (final Card card : Card.values()) {
            if (card.name().equalsIgnoreCase(cardValueToParse)) {
                return card;
            }
        }

        return Card.UNKNOWN;
    }

    private Card(final int value) {
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

    private Decision(final String code) {
        this.code = code;
    }

    public String getCode() {
        return code;
    }
}
