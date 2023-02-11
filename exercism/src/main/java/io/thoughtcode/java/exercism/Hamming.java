package io.thoughtcode.java.exercism;

public class Hamming {

    private final String leftStrand;

    private final String rightStrand;

    public Hamming(final String leftStrand, final String rightStrand) {

        if (leftStrand.trim().isEmpty() && !rightStrand.trim().isEmpty()) {
            throw new IllegalArgumentException("left strand must not be empty.");
        }

        if (rightStrand.trim().isEmpty() && !leftStrand.trim().isEmpty()) {
            throw new IllegalArgumentException("right strand must not be empty.");
        }

        final int leftStrandLength = leftStrand.length();
        final int rightStrandLength = rightStrand.length();

        if (leftStrandLength != rightStrandLength) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }

        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;

    }

    public int getHammingDistance() {

        int hammingDistance = 0;

        for (int index = 0; index < leftStrand.length(); index++) {
            if (leftStrand.charAt(index) != rightStrand.charAt(index)) {
                hammingDistance++;
            }
        }

        return hammingDistance;
    }
}
