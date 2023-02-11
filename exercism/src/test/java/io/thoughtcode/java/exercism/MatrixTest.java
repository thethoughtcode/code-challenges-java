package io.thoughtcode.java.exercism;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class MatrixTest {

    @Test
    void extractRowFromOneNumberMatrixTest() {

        final String matrixAsString = "1";
        final int rowIndex = 1;
        final int[] expectedRow = { 1 };

        final Matrix matrix = new Matrix(matrixAsString);

        assertThat(matrix.getRow(rowIndex)).isEqualTo(expectedRow);
    }

    @Test
    void extractRowFromMatrixTest() {

        final String matrixAsString = "1 2\n3 4";
        final int rowIndex = 2;
        final int[] expectedRow = { 3, 4 };

        final Matrix matrix = new Matrix(matrixAsString);

        assertThat(matrix.getRow(rowIndex)).isEqualTo(expectedRow);
    }

    @Test
    void extractRowFromDiffWidthsMatrixTest() {

        final String matrixAsString = "1 2\n10 20";
        final int rowIndex = 2;
        final int[] expectedRow = { 10, 20 };

        final Matrix matrix = new Matrix(matrixAsString);

        assertThat(matrix.getRow(rowIndex)).isEqualTo(expectedRow);
    }

    @Test
    void extractRowFromNonSquareMatrixTest() {

        final String matrixAsString = "1 2 3\n4 5 6\n7 8 9\n8 7 6";
        final int rowIndex = 4;
        final int[] expectedRow = { 8, 7, 6 };

        final Matrix matrix = new Matrix(matrixAsString);

        assertThat(matrix.getRow(rowIndex)).isEqualTo(expectedRow);
    }

    @Test
    void extractColumnFromOneNumberMatrixTest() {

        final String matrixAsString = "1";
        final int columnIndex = 1;
        final int[] expectedColumn = { 1 };

        final Matrix matrix = new Matrix(matrixAsString);

        assertThat(matrix.getRow(columnIndex)).isEqualTo(expectedColumn);
    }

    @Test
    void extractColumnMatrixTest() {

        final String matrixAsString = "1 2 3\n4 5 6\n7 8 9";
        final int columnIndex = 3;
        final int[] expectedColumn = { 3, 6, 9 };

        final Matrix matrix = new Matrix(matrixAsString);

        assertThat(matrix.getColumn(columnIndex)).isEqualTo(expectedColumn);
    }

    @Test
    void extractColumnFromNonSquareMatrixTest() {

        final String matrixAsString = "1 2 3 4\n5 6 7 8\n9 8 7 6";
        final int columnIndex = 4;
        final int[] expectedColumn = { 4, 8, 6 };

        final Matrix matrix = new Matrix(matrixAsString);

        assertThat(matrix.getColumn(columnIndex)).isEqualTo(expectedColumn);
    }

    @Test
    void extractColumnFromDiffWidthsMatrixTest() {

        final String matrixAsString = "89 1903 3\n18 3 1\n9 4 800";
        final int columnIndex = 2;
        final int[] expectedColumn = { 1903, 3, 4 };

        final Matrix matrix = new Matrix(matrixAsString);

        assertThat(matrix.getColumn(columnIndex)).isEqualTo(expectedColumn);
    }
}
