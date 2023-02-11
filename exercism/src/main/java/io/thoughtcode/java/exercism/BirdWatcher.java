package io.thoughtcode.java.exercism;

class BirdWatcher {

    static final int DAYS_IN_WEEK = 7;

    static final int BUSY_DAY_MIN_COUNT = 5;

    private final int[] birdsPerDay;

    public BirdWatcher(final int[] birdsPerDay) {
        this.birdsPerDay = birdsPerDay.clone();
    }

    public int[] getLastWeek() {

        final int dayCount = birdsPerDay.length;

        final int[] lastWeekBirdsPerDay;

        if (dayCount <= DAYS_IN_WEEK) {
            lastWeekBirdsPerDay = birdsPerDay.clone();
        } else {

            final int multiplier = (dayCount - 1) / DAYS_IN_WEEK;

            final int lastWeekStartIndex = (DAYS_IN_WEEK * multiplier);

            lastWeekBirdsPerDay = new int[dayCount - lastWeekStartIndex];

            int currentIndex = lastWeekStartIndex;

            while (currentIndex < dayCount) {
                final int offset = currentIndex - lastWeekStartIndex;
                lastWeekBirdsPerDay[offset] = birdsPerDay[currentIndex];
                currentIndex++;
            }
        }

        return lastWeekBirdsPerDay;
    }

    public int getToday() {
        final int dayCount = birdsPerDay.length;
        return 0 != dayCount ? birdsPerDay[dayCount - 1] : 0;
    }

    public void incrementTodaysCount() {
        birdsPerDay[birdsPerDay.length - 1]++;
    }

    public boolean hasDayWithoutBirds() {

        final int dayCount = birdsPerDay.length;

        boolean dayWithoutBirds = false;

        for (int dayIndex = 0; dayIndex < dayCount; dayIndex++) {
            if (0 == birdsPerDay[dayIndex]) {
                dayWithoutBirds = true;
                break;
            }
        }

        return dayWithoutBirds;
    }

    public int getCountForFirstDays(final int numberOfDays) {

        final int[] lastWeekBirdsPerDay = getLastWeek();

        int totalBirds = 0;

        for (int index = 0; index < lastWeekBirdsPerDay.length && index < numberOfDays; index++) {
            totalBirds = totalBirds + lastWeekBirdsPerDay[index];
        }

        return totalBirds;
    }

    public int getBusyDays() {

        final int dayCount = birdsPerDay.length;

        int totalBusyDays = 0;

        for (int dayIndex = 0; dayIndex < dayCount; dayIndex++) {
            if (birdsPerDay[dayIndex] >= BUSY_DAY_MIN_COUNT) {
                totalBusyDays++;
            }
        }

        return totalBusyDays;
    }
}
