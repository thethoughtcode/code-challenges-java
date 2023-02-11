package io.thoughtcode.java.exercism;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TwelveDaysTest {
    private TwelveDays twelveDays;

    @BeforeEach
    void setup() {
        twelveDays = new TwelveDays();
    }

    @Test
    void testVerseOne() {
        final String expectedVerseOne = "On the first day of Christmas my true love gave to me: "
                + "a Partridge in a Pear Tree.\n";
        assertThat(twelveDays.verse(1)).isEqualTo(expectedVerseOne);
    }

    @Test
    void testVerseTwo() {
        final String expectedVerseTwo = "On the second day of Christmas my true love gave to me: "
                + "two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertThat(twelveDays.verse(2)).isEqualTo(expectedVerseTwo);
    }

    @Test
    void testVerseThree() {
        final String expectedVerseThree = "On the third day of Christmas my true love gave to me: "
                + "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertThat(twelveDays.verse(3)).isEqualTo(expectedVerseThree);
    }

    @Test
    void testVerseFour() {
        final String expectedVerseFour = "On the fourth day of Christmas my true love gave to me: "
                + "four Calling Birds, three French Hens, two Turtle Doves, "
                + "and a Partridge in a Pear Tree.\n";
        assertThat(twelveDays.verse(4)).isEqualTo(expectedVerseFour);
    }

    @Test
    void testVerseFive() {
        final String expectedVerseFive = "On the fifth day of Christmas my true love gave to me: "
                + "five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, "
                + "and a Partridge in a Pear Tree.\n";
        assertThat(twelveDays.verse(5)).isEqualTo(expectedVerseFive);
    }

    @Test
    void testVerseSix() {
        final String expectedVerseSix = "On the sixth day of Christmas my true love gave to me: "
                + "six Geese-a-Laying, five Gold Rings, four Calling Birds, "
                + "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertThat(twelveDays.verse(6)).isEqualTo(expectedVerseSix);
    }

    @Test
    void testVerseSeven() {
        final String expectedVerseSeven = "On the seventh day of Christmas my true love gave to me: "
                + "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds,"
                + " three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertThat(twelveDays.verse(7)).isEqualTo(expectedVerseSeven);
    }

    @Test
    void testVerseEight() {
        final String expectedVerseEight = "On the eighth day of Christmas my true love gave to me: "
                + "eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, "
                + "five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, "
                + "and a Partridge in a Pear Tree.\n";
        assertThat(twelveDays.verse(8)).isEqualTo(expectedVerseEight);
    }

    @Test
    void testVerseNine() {
        final String expectedVerseNine = "On the ninth day of Christmas my true love gave to me: "
                + "nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, "
                + "six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, "
                + "two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertThat(twelveDays.verse(9)).isEqualTo(expectedVerseNine);
    }

    @Test
    void testVerseTen() {
        final String expectedVerseTen = "On the tenth day of Christmas my true love gave to me: "
                + "ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, "
                + "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, "
                + "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertThat(twelveDays.verse(10)).isEqualTo(expectedVerseTen);
    }

    @Test
    void testVerseEleven() {
        final String expectedVerseEleven = "On the eleventh day of Christmas my true love gave to me: "
                + "eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, "
                + "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, "
                + "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertThat(twelveDays.verse(11)).isEqualTo(expectedVerseEleven);
    }

    @Test
    void testVerseTwelve() {
        final String expectedVerseTwelve = "On the twelfth day of Christmas my true love gave to me: "
                + "twelve Drummers Drumming, eleven Pipers Piping, ten Lords-a-Leaping, "
                + "nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, "
                + "six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, "
                + "two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertThat(twelveDays.verse(12)).isEqualTo(expectedVerseTwelve);
    }

    @Test
    void testFirstThreeVerses() {
        final String expectedVersesOneToThree = "On the first day of Christmas my true love gave to me: "
                + "a Partridge in a Pear Tree.\n\n"
                + "On the second day of Christmas my true love gave to me: two Turtle Doves, "
                + "and a Partridge in a Pear Tree.\n\n"
                + "On the third day of Christmas my true love gave to me: three French Hens, "
                + "two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertThat(twelveDays.verses(1, 3)).isEqualTo(expectedVersesOneToThree);
    }

    @Test
    void testFourthToSixthVerses() {
        final String expectedVersesFourToSix = "On the fourth day of Christmas my true love gave to me: "
                + "four Calling Birds, three French Hens, two Turtle Doves, "
                + "and a Partridge in a Pear Tree.\n\n"
                + "On the fifth day of Christmas my true love gave to me: five Gold Rings, "
                + "four Calling Birds, three French Hens, two Turtle Doves, "
                + "and a Partridge in a Pear Tree.\n\n"
                + "On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, "
                + "five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, "
                + "and a Partridge in a Pear Tree.\n";
        assertThat(twelveDays.verses(4, 6)).isEqualTo(expectedVersesFourToSix);
    }

    @Test
    void testSingWholeSong() {
        final String expectedSong = "On the first day of Christmas my true love gave to me: "
                + "a Partridge in a Pear Tree.\n"
                + "\n"
                + "On the second day of Christmas my true love gave to me: two Turtle Doves, "
                + "and a Partridge in a Pear Tree.\n"
                + "\n"
                + "On the third day of Christmas my true love gave to me: three French Hens, "
                + "two Turtle Doves, and a Partridge in a Pear Tree.\n"
                + "\n"
                + "On the fourth day of Christmas my true love gave to me: four Calling Birds, "
                + "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n"
                + "\n"
                + "On the fifth day of Christmas my true love gave to me: five Gold Rings, "
                + "four Calling Birds, three French Hens, two Turtle Doves, "
                + "and a Partridge in a Pear Tree.\n"
                + "\n"
                + "On the sixth day of Christmas my true love gave to me: six Geese-a-Laying, "
                + "five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, "
                + "and a Partridge in a Pear Tree.\n"
                + "\n"
                + "On the seventh day of Christmas my true love gave to me: seven Swans-a-Swimming, "
                + "six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, "
                + "two Turtle Doves, and a Partridge in a Pear Tree.\n"
                + "\n"
                + "On the eighth day of Christmas my true love gave to me: eight Maids-a-Milking, "
                + "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, "
                + "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n"
                + "\n"
                + "On the ninth day of Christmas my true love gave to me: nine Ladies Dancing, "
                + "eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, "
                + "four Calling Birds, three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n"
                + "\n"
                + "On the tenth day of Christmas my true love gave to me: ten Lords-a-Leaping, "
                + "nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, six Geese-a-Laying, "
                + "five Gold Rings, four Calling Birds, three French Hens, two Turtle Doves, "
                + "and a Partridge in a Pear Tree.\n"
                + "\n"
                + "On the eleventh day of Christmas my true love gave to me: eleven Pipers Piping, "
                + "ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, seven Swans-a-Swimming, "
                + "six Geese-a-Laying, five Gold Rings, four Calling Birds, three French Hens, "
                + "two Turtle Doves, and a Partridge in a Pear Tree.\n"
                + "\n"
                + "On the twelfth day of Christmas my true love gave to me: twelve Drummers Drumming, "
                + "eleven Pipers Piping, ten Lords-a-Leaping, nine Ladies Dancing, eight Maids-a-Milking, "
                + "seven Swans-a-Swimming, six Geese-a-Laying, five Gold Rings, four Calling Birds, "
                + "three French Hens, two Turtle Doves, and a Partridge in a Pear Tree.\n";
        assertThat(twelveDays.sing()).isEqualTo(expectedSong);
    }
}
