package io.thoughtcode.java.exercism;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class SaddlePoint {

    private final List<List<Integer>> values;

    SaddlePoint(final List<List<Integer>> values) {
        this.values = values;
    }

    Set<MatrixCoordinate> getSaddlePoints() {

        final int rowCount = values.size();
        final int colCount = rowCount > 0 ? values.get(0).size() : 0;

        final List<Integer[]> rowMaxValues = new ArrayList<>(rowCount);
        final List<Integer[]> colMaxValues = new ArrayList<>(colCount);

        for (int row = 0; row < rowCount; row++) {

            int maxValue = values.get(row).get(0);
            int maxRowCoordinate = row;
            int maxColCoordinate = 0;

            for (int col = 1; col < colCount; col++) {

                final int currentValue = values.get(row).get(col);

                if (currentValue > maxValue) {
                    maxValue = currentValue;
                    maxRowCoordinate = row;
                    maxColCoordinate = col;
                }
            }

            rowMaxValues.add(new Integer[] { maxRowCoordinate, maxColCoordinate, maxValue });
        }

        for (int col = 0; col < colCount; col++) {

            int minValue = values.get(0).get(col);
            int minRowCoordinate = 0;
            int minColCoordinate = col;

            for (int row = 1; row < rowCount; row++) {

                final int currentValue = values.get(row).get(col);

                if (currentValue < minValue) {
                    minValue = currentValue;
                    minRowCoordinate = row;
                    minColCoordinate = col;
                }
            }

            colMaxValues.add(new Integer[] { minRowCoordinate, minColCoordinate, minValue });
        }

        final Set<MatrixCoordinate> saddlePoints = new HashSet<>();

        for (int row = 0; row < rowCount; row++) {
            for (int col = 0; col < colCount; col++) {

                final int currentValue = values.get(row).get(col);

                final Integer[] rowMax = rowMaxValues.get(row);
                final int rowMaxValue = rowMax[2];

                final Integer[] colMax = colMaxValues.get(col);
                final int colMaxValue = colMax[2];

                if (currentValue >= rowMaxValue && currentValue <= colMaxValue) {
                    saddlePoints.add(new MatrixCoordinate(row + 1, col + 1));
                }
            }
        }

        return saddlePoints;
    }
}

class MatrixCoordinate implements Comparable<MatrixCoordinate> {

    private final int row;

    private final int col;

    MatrixCoordinate(final int row, final int col) {
        this.row = row;
        this.col = col;
    }

    @Override
    public String toString() {
        return "Row: " + row + ", Column: " + col;
    }

    @Override
    public boolean equals(final Object other) {

        boolean result;

        if (this == other) {
            result = true;
        } else if (other == null || getClass() != other.getClass()) {
            result = false;
        } else {
            final MatrixCoordinate that = (MatrixCoordinate) other;
            result = this.row == that.row && this.col == that.col;
        }

        return result;
    }

    @Override
    public int hashCode() {
        int result = row;
        result = 31 * result + col;
        return result;
    }

    @Override
    public int compareTo(final MatrixCoordinate other) {
        final int rowComparison = Integer.compare(this.row, other.row);
        return (rowComparison == 0) ? Integer.compare(this.col, other.col) : rowComparison;
    }
}
