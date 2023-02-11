package io.thoughtcode.java.exercism;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class Gigasecond {

    static final long ONE_GIGASECONDS = 1_000_000_000L;

    private final LocalDateTime moment;

    public Gigasecond(final LocalDate moment) {
        this(moment.atTime(0, 0));
    }

    public Gigasecond(final LocalDateTime moment) {
        this.moment = moment.plus(ONE_GIGASECONDS, ChronoUnit.SECONDS);
    }

    public LocalDateTime getDateTime() {
        return moment;
    }
}
