package io.thoughtcode.java.exercism;

class Matrix {

    private final int rows;

    private final int cols;

    private final int[][] data;

    Matrix(final String matrixAsString) {

        final String[] rowData = matrixAsString.split("\\n");
        final String[] firstColumnData = rowData[0].split(" ");

        this.rows = rowData.length;
        this.cols = rowData[0].split(" ").length;
        this.data = new int[rowData.length][firstColumnData.length];

        int row = 0;
        String[] currentRowData;

        do {

            currentRowData = rowData[row].split(" ");

            data[row] = new int[cols];

            for (int col = 0; col < cols; col++) {
                data[row][col] = Integer.parseInt(currentRowData[col]);
            }

            row++;

        } while (row < rowData.length);

    }

    int[] getRow(final int rowNumber) {

        final int[] rowData = new int[cols];

        for (int col = 0; col < cols; col++) {
            rowData[col] = data[rowNumber - 1][col];
        }

        return rowData;
    }

    int[] getColumn(final int columnNumber) {

        final int[] colData = new int[rows];

        for (int row = 0; row < rows; row++) {
            colData[row] = data[row][columnNumber - 1];
        }

        return colData;
    }
}
