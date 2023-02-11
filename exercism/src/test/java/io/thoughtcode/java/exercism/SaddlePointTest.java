package io.thoughtcode.java.exercism;

import static java.util.Collections.emptyList;
import static java.util.Collections.emptySet;
import static java.util.Collections.singleton;
import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.jupiter.api.Test;

class SaddlePointTest {

    @Test
    void testCanIdentifySingleSaddlePoint() {

        final SaddlePoint matrix = new SaddlePoint(Arrays.asList(
                Arrays.asList(9, 8, 7),
                Arrays.asList(5, 3, 2),
                Arrays.asList(6, 6, 7)
        ));

        final Set<MatrixCoordinate> expectedSaddlePoints = singleton(new MatrixCoordinate(2, 1));

        assertThat(matrix.getSaddlePoints()).isEqualTo(expectedSaddlePoints);
    }

    @Test
    void testCanIdentifyThatEmptyMatrixHasNoSaddlePoints() {

        final SaddlePoint matrix = new SaddlePoint(emptyList());

        final Set<MatrixCoordinate> expectedSaddlePoints = emptySet();

        assertThat(matrix.getSaddlePoints()).isEqualTo(expectedSaddlePoints);
    }

    @Test
    void testCanIdentifyLackOfSaddlePointsWhenThereAreNone() {

        final SaddlePoint matrix = new SaddlePoint(Arrays.asList(
                Arrays.asList(1, 2, 3),
                Arrays.asList(3, 1, 2),
                Arrays.asList(2, 3, 1)
        ));

        final Set<MatrixCoordinate> expectedSaddlePoints = emptySet();

        assertThat(matrix.getSaddlePoints()).isEqualTo(expectedSaddlePoints);
    }

    @Test
    void testCanIdentifyMultipleSaddlePointsInAColumn() {

        final SaddlePoint matrix = new SaddlePoint(Arrays.asList(
                Arrays.asList(4, 5, 4),
                Arrays.asList(3, 5, 5),
                Arrays.asList(1, 5, 4)
        ));

        final Set<MatrixCoordinate> expectedSaddlePoints = new HashSet<>(Arrays.asList(
                new MatrixCoordinate(1, 2),
                new MatrixCoordinate(2, 2),
                new MatrixCoordinate(3, 2)
        ));

        assertThat(matrix.getSaddlePoints()).isEqualTo(expectedSaddlePoints);
    }

    @Test
    void testCanIdentifyMultipleSaddlePointsInARow() {

        final SaddlePoint matrix = new SaddlePoint(Arrays.asList(
                Arrays.asList(6, 7, 8),
                Arrays.asList(5, 5, 5),
                Arrays.asList(7, 5, 6)
        ));

        final Set<MatrixCoordinate> expectedSaddlePoints = new HashSet<>(Arrays.asList(
                new MatrixCoordinate(2, 1),
                new MatrixCoordinate(2, 2),
                new MatrixCoordinate(2, 3)
        ));
        assertThat(matrix.getSaddlePoints()).isEqualTo(expectedSaddlePoints);
    }

    @Test
    void testCanIdentifySaddlePointInBottomRightCorner() {

        final SaddlePoint matrix = new SaddlePoint(Arrays.asList(
                Arrays.asList(8, 7, 9),
                Arrays.asList(6, 7, 6),
                Arrays.asList(3, 2, 5)
        ));

        final Set<MatrixCoordinate> expectedSaddlePoints = singleton(new MatrixCoordinate(3, 3));

        assertThat(matrix.getSaddlePoints()).isEqualTo(expectedSaddlePoints);
    }

    @Test
    void testCanIdentifySaddlePointsInANonSquareMatrix() {

        final SaddlePoint matrix = new SaddlePoint(Arrays.asList(
                Arrays.asList(3, 1, 3),
                Arrays.asList(3, 2, 4)
        ));

        final Set<MatrixCoordinate> expectedSaddlePoints = new HashSet<>(Arrays.asList(
                new MatrixCoordinate(1, 3),
                new MatrixCoordinate(1, 1)
        ));

        assertThat(matrix.getSaddlePoints()).isEqualTo(expectedSaddlePoints);
    }

    @Test
    void testCanIdentifyThatSaddlePointsInASingleColumnMatrixAreThoseWithMinimumValue() {

        final SaddlePoint matrix = new SaddlePoint(Arrays.asList(
                singletonList(2),
                singletonList(1),
                singletonList(4),
                singletonList(1)
        ));

        final Set<MatrixCoordinate> expectedSaddlePoints = new HashSet<>(Arrays.asList(
                new MatrixCoordinate(2, 1),
                new MatrixCoordinate(4, 1)
        ));

        assertThat(matrix.getSaddlePoints()).isEqualTo(expectedSaddlePoints);
    }

    @Test
    void testCanIdentifyThatSaddlePointsInASingleRowMatrixAreThoseWithMaximumValue() {

        final SaddlePoint matrix = new SaddlePoint(Arrays.asList(
                Arrays.asList(2, 5, 3, 5)
        ));

        final Set<MatrixCoordinate> expectedSaddlePoints = new HashSet<>(Arrays.asList(
                new MatrixCoordinate(1, 2),
                new MatrixCoordinate(1, 4)
        ));

        assertThat(matrix.getSaddlePoints()).isEqualTo(expectedSaddlePoints);
    }
}
