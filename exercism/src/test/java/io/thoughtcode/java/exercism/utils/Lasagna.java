package io.thoughtcode.java.exercism.utils;

public class Lasagna extends ReflectionProxy {

    @Override
    public String getTargetClassName() {
        return "io.thoughtcode.java.exercism.Lasagna";
    }

    public int expectedMinutesInOven() {
        try {
            return invokeMethod("expectedMinutesInOven", new Class[] {});
        } catch (final Exception e) {
            throw new UnsupportedOperationException("Please implement the expectedMinutesInOven() method", e);
        }
    }

    public int remainingMinutesInOven(final int actualMinutes) {
        try {
            return invokeMethod("remainingMinutesInOven", new Class[] { int.class }, actualMinutes);
        } catch (final Exception e) {
            throw new UnsupportedOperationException("Please implement the remainingMinutesInOven(int) method", e);
        }
    }

    public int preparationTimeInMinutes(final int amountLayers) {
        try {
            return invokeMethod("preparationTimeInMinutes", new Class[] { int.class }, amountLayers);
        } catch (final Exception e) {
            throw new UnsupportedOperationException("Please implement the preparationTimeInMinutes(int) method", e);
        }
    }

    public int totalTimeInMinutes(final int amountLayers, final int actualMinutes) {
        try {
            return invokeMethod("totalTimeInMinutes", new Class[] { int.class, int.class }, amountLayers,
                    actualMinutes);
        } catch (final Exception e) {
            throw new UnsupportedOperationException("Please implement the totalTimeInMinutes(int, int) method", e);
        }
    }
}
