package io.thoughtcode.java.exercism;

import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class BirdWatcherTest {

    private static final int DAY1 = 0;
    private static final int DAY2 = 2;
    private static final int DAY3 = 5;
    private static final int DAY4 = 3;
    private static final int DAY5 = 7;
    private static final int DAY6 = 8;
    private static final int TODAY = 4;

    private BirdWatcher fixture;

    private int lastWeek[] = { DAY1, DAY2, DAY3, DAY4, DAY5, DAY6, TODAY };

    @BeforeEach
    void setUp() {
        fixture = new BirdWatcher(lastWeek);
    }

    @Test
    void itTestGetLastWeek() {
        assertThat(fixture.getLastWeek())
                .containsExactly(DAY1, DAY2, DAY3, DAY4, DAY5, DAY6, TODAY);
    }

    @Test
    void itTestGetToday() {
        assertThat(fixture.getToday()).isEqualTo(TODAY);
    }

    @Test
    void itShouldReturnZeroIfBirdWatcherLastWeekIsEmpty() {
        int[] lastWeekEmpty = new int[0];
        fixture = new BirdWatcher(lastWeekEmpty);
        assertThat(fixture.getToday()).isEqualTo(0);
    }

    @Test
    void itIncrementTodaysCount() {
        fixture.incrementTodaysCount();
        assertThat(fixture.getToday()).isEqualTo(TODAY + 1);
    }

    @Test
    void itHasDayWithoutBirds() {
        assertThat(fixture.hasDayWithoutBirds()).isTrue();
    }

    @Test
    void itShouldNotHaveDaysWithoutBirds() {
        fixture = new BirdWatcher(new int[] { 1, 2, 5, 3, 7, 8, 4 });
        assertThat(fixture.hasDayWithoutBirds()).isFalse();
    }

    @Test
    void itTestGetCountForFirstDays() {
        assertThat(fixture.getCountForFirstDays(4)).isEqualTo(DAY1 + DAY2 + DAY3 + DAY4);
    }

    @Test
    void itTestGetCountForMoreDaysThanTheArraySize() {
        assertThat(fixture.getCountForFirstDays(10))
                .isEqualTo(DAY1 + DAY2 + DAY3 + DAY4 + DAY5 + DAY6 + TODAY);
    }

    @Test
    void itTestGetCountForBusyDays() {
        // DAY3, DAY5 and DAY6 are all >= 5 birds
        assertThat(fixture.getBusyDays()).isEqualTo(3);
    }

    @Test
    void itShouldNotHaveBusyDays() {
        fixture = new BirdWatcher(new int[] { 1, 2, 3, 3, 2, 1, 4 });
        assertThat(fixture.getBusyDays()).isEqualTo(0);
    }
}
