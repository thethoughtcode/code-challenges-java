package io.thoughtcode.java.exercism;

public class SalaryCalculator {

    static final double BASE_SALARY = 1000.0;

    static final double MAX_SALARY = 2000.0;

    public double multiplierPerDaysSkipped(final int daysSkipped) {
        return daysSkipped > 5 ? 0.85 : 1.0;
    }

    public int multiplierPerProductsSold(final int productsSold) {
        return productsSold > 20 ? 13 : 10;
    }

    public double bonusForProductSold(final int productsSold) {
        return ((double) multiplierPerProductsSold(productsSold)) * productsSold;
    }

    public double finalSalary(final int daysSkipped, final int productsSold) {

        final double daySalary = BASE_SALARY * multiplierPerDaysSkipped(daysSkipped);
        final double bonus = bonusForProductSold(productsSold);

        final double salary = daySalary + bonus;

        return daySalary + bonus < MAX_SALARY ? salary : MAX_SALARY;
    }
}
