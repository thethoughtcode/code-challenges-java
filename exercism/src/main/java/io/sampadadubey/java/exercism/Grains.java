package io.sampadadubey.java.exercism;

import java.math.BigInteger;
import java.util.HashMap;
import java.util.Map;

public class Grains {

    static final Map<Integer, BigInteger> GRAINS_ON_SQUARE = new HashMap<>();

    static BigInteger TOTAL_GRAINS = BigInteger.ZERO;

    static {

        BigInteger grainOnPosition = BigInteger.ONE;

        for (int position = 1; position <= 64; position++) {

            // Math.pow is not accurate for very big numbers. That is why multiplication on
            // BigInteger is required
            grainOnPosition = position != 1 ? grainOnPosition.multiply(BigInteger.TWO) : BigInteger.ONE;

            // Store the grainOnPosition on the Map
            GRAINS_ON_SQUARE.put(position, grainOnPosition);

            // Calculate and store the total Grains
            TOTAL_GRAINS = TOTAL_GRAINS.add(grainOnPosition);
        }
    }

    BigInteger grainsOnSquare(final int square) {

        if (1 <= square && square <= 64) {
            return GRAINS_ON_SQUARE.get(square);
        }

        throw new IllegalArgumentException("square must be between 1 and 64");
    }

    BigInteger grainsOnBoard() {
        return TOTAL_GRAINS;
    }
}
