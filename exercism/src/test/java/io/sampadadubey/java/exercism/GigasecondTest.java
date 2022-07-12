package io.sampadadubey.java.exercism;

import static org.assertj.core.api.Assertions.assertThat;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Month;

import org.junit.jupiter.api.Test;

class GigasecondTest {

    @Test
    void modernTime() {

        final Gigasecond gigaSecond = new Gigasecond(LocalDate.of(2011, Month.APRIL, 25));

        assertThat(LocalDateTime.of(2043, Month.JANUARY, 1, 1, 46, 40)).isEqualTo(gigaSecond.getDateTime());
    }

    @Test
    void afterEpochTime() {

        final Gigasecond gigaSecond = new Gigasecond(LocalDate.of(1977, Month.JUNE, 13));

        assertThat(LocalDateTime.of(2009, Month.FEBRUARY, 19, 1, 46, 40)).isEqualTo(gigaSecond.getDateTime());
    }

    @Test
    void beforeEpochTime() {

        final Gigasecond gigaSecond = new Gigasecond(LocalDate.of(1959, Month.JULY, 19));

        assertThat(LocalDateTime.of(1991, Month.MARCH, 27, 1, 46, 40)).isEqualTo(gigaSecond.getDateTime());
    }

    @Test
    void withFullTimeSpecified() {

        final Gigasecond gigaSecond = new Gigasecond(LocalDateTime.of(2015, Month.JANUARY, 24, 22, 0, 0));

        assertThat(LocalDateTime.of(2046, Month.OCTOBER, 2, 23, 46, 40)).isEqualTo(gigaSecond.getDateTime());
    }

    @Test
    void withFullTimeSpecifiedAndDayRollover() {

        final Gigasecond gigaSecond = new Gigasecond(LocalDateTime.of(2015, Month.JANUARY, 24, 23, 59, 59));

        assertThat(LocalDateTime.of(2046, Month.OCTOBER, 3, 1, 46, 39)).isEqualTo(gigaSecond.getDateTime());
    }
}
