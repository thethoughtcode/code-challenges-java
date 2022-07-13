package io.sampadadubey.java.exercism;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

class ScrabbleScore {

    static Map<String, Integer> LETTER_VALUES = new HashMap<String, Integer>() {
        {
            final String[] valueOneCharacters = new String[] { "1", "a,e,i,o,u,l,n,r,s,t" };
            final String[] valueTwoCharacters = new String[] { "2", "d,g" };
            final String[] valueThreeCharacters = new String[] { "3", "b,c,m,p" };
            final String[] valueFourCharacters = new String[] { "4", "f,h,v,w,y" };
            final String[] valueFiveCharacters = new String[] { "5", "k" };
            final String[] valueEightCharacters = new String[] { "8", "j,x" };
            final String[] valueTenCharacters = new String[] { "10", "q,z" };

            final List<String[]> values = new ArrayList<>();
            values.add(valueOneCharacters);
            values.add(valueTwoCharacters);
            values.add(valueThreeCharacters);
            values.add(valueFourCharacters);
            values.add(valueFiveCharacters);
            values.add(valueEightCharacters);
            values.add(valueTenCharacters);

            for (final String[] value : values) {
                final Integer characterValue = Integer.parseInt(value[0]);
                final String[] characters = value[1].split(",");
                for (final String character : characters) {
                    put(character.toLowerCase(), characterValue);
                    put(character.toUpperCase(), characterValue);
                }
            }
        }
    };

    private final String word;

    ScrabbleScore(final String word) {
        this.word = Optional.ofNullable(word).orElseGet(() -> "").trim();
    }

    int getScore() {

        int score = 0;

        for (final char character : word.toCharArray()) {
            score = score + LETTER_VALUES.get(String.valueOf(character));
        }

        return score;
    }
}
