package io.thoughtcode.java.exercism;

import static java.lang.String.format;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

import io.thoughtcode.java.common.NumberConstants;

class TwelveDays {

    static final String PREFIX = "On the %s day of Christmas my true love gave to me:";

    static final Map<Integer, String[]> ITEMS = new LinkedHashMap<>();

    static {
        ITEMS.put(1, new String[] { "first", "a Partridge in a Pear Tree" });
        ITEMS.put(2, new String[] { "second", "two Turtle Doves" });
        ITEMS.put(3, new String[] { "third", "three French Hens" });
        ITEMS.put(4, new String[] { "fourth", "four Calling Birds" });
        ITEMS.put(5, new String[] { "fifth", "five Gold Rings" });
        ITEMS.put(6, new String[] { "sixth", "six Geese-a-Laying" });
        ITEMS.put(7, new String[] { "seventh", "seven Swans-a-Swimming" });
        ITEMS.put(8, new String[] { "eighth", "eight Maids-a-Milking" });
        ITEMS.put(9, new String[] { "ninth", "nine Ladies Dancing" });
        ITEMS.put(10, new String[] { "tenth", "ten Lords-a-Leaping" });
        ITEMS.put(11, new String[] { "eleventh", "eleven Pipers Piping" });
        ITEMS.put(12, new String[] { "twelfth", "twelve Drummers Drumming" });
    }

    String verse(final int verseNumber) {

        final String verse;

        if (verseNumber > NumberConstants.ONE) {

            final String[] firstItem = ITEMS.get(1);

            final List<String> verseItems = new ArrayList<>(verseNumber - 1);

            for (int index = verseNumber; index > 1; index--) {
                verseItems.add(ITEMS.get(index)[1]);
            }

            final String prefix = format(PREFIX, ITEMS.get(verseNumber)[0]);
            final String verseItemsExceptFirst = String.join(", ", verseItems);

            verse = format("%s %s, and %s.", prefix, verseItemsExceptFirst, firstItem[1]);

        } else if (verseNumber == NumberConstants.ONE) {
            verse = format("%s %s.", format(PREFIX, ITEMS.get(verseNumber)[0]), ITEMS.get(verseNumber)[1]);
        } else {
            verse = "";
        }

        return verse + "\n";
    }

    String verses(final int startVerse, final int endVerse) {

        final List<String> verses = new ArrayList<>(endVerse - startVerse);

        for (int verseNumber = startVerse; verseNumber <= endVerse; verseNumber++) {
            verses.add(verse(verseNumber));
        }

        return String.join("\n", verses);
    }

    String sing() {
        return verses(1, 12);
    }
}
