package io.thoughtcode.java.exercism;

import java.util.Optional;

public final class FootballMatchReports {

    static final int GOALIE = 1;
    static final int LEFT_BACK = 2;
    static final int CENTER_BACK_ONE = 3;
    static final int CENTER_BACK_TWO = 4;
    static final int RIGHT_BACK = 5;
    static final int LEFT_MIDFIELDER = 6;
    static final int CENTER_MIDFIELDER = 7;
    static final int RIGHT_MIDFILDER = 8;
    static final int LEFT_WING = 9;
    static final int STRIKER = 10;
    static final int RIGHT_WING = 11;

    public static String onField(final int shirtNum) {

        String description = null;

        switch (shirtNum) {
            case GOALIE:
                description = "goalie";
                break;
            case LEFT_BACK:
                description = "left back";
                break;
            case CENTER_BACK_ONE:
            case CENTER_BACK_TWO:
                description = "center back";
                break;
            case RIGHT_BACK:
                description = "right back";
                break;
            case LEFT_MIDFIELDER:
            case CENTER_MIDFIELDER:
            case RIGHT_MIDFILDER:
                description = "midfielder";
                break;
            case LEFT_WING:
                description = "left wing";
                break;
            case STRIKER:
                description = "striker";
                break;
            case RIGHT_WING:
                description = "right wing";
                break;
            default:
                break;
        }

        return Optional.ofNullable(description).orElseThrow(() -> new IllegalArgumentException());
    }

    private FootballMatchReports(){
    }
}
