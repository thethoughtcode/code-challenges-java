package io.sampadadubey.java.exercism;

import java.util.Arrays;

public class DnDCharacter {

    static final Random DICE = new Random();

    private final int strength;

    private final int dexterity;

    private final int constitution;

    private final int intelligence;

    private final int wisdom;

    private final int charisma;

    static int rollDice() {
        final int rolledValue = DICE.nextInt(6);
        return rolledValue != 0 ? rolledValue : 1;
    }

    DnDCharacter() {
        this.strength = ability();
        this.dexterity = ability();
        this.constitution = ability();
        this.intelligence = ability();
        this.wisdom = ability();
        this.charisma = ability();
    }

    int ability() {
        return getSum(getHighestNValues(4, 3));
    }

    int modifier(final int input) {
        return (int) Math.floor((input - 10.0) / 2);
    }

    int getStrength() {
        return strength;
    }

    int getDexterity() {
        return dexterity;
    }

    int getConstitution() {
        return constitution;
    }

    int getIntelligence() {
        return intelligence;
    }

    int getWisdom() {
        return wisdom;
    }

    int getCharisma() {
        return charisma;
    }

    int getHitpoints() {
        return 10 + modifier(constitution);
    }

    private int getSum(final int[] values) {
        return Arrays.stream(values).sum();
    }

    private int[] getHighestNValues(final int count, final int highestN) {

        final int[] values = getRandomValues(count);
        final int[] highestNValues = new int[highestN];

        Arrays.sort(values);

        for (int index = 0; index < highestN; index++) {
            highestNValues[index] = values[values.length - index - 1];
        }

        return highestNValues;
    }

    private int[] getRandomValues(final int count) {

        final int[] values = new int[count];

        for (int index = 0; index < count; index++) {
            values[index] = rollDice();
        }

        return values;
    }
}

class Random {

    int nextInt(final int limit) {
        return (int) Math.random() * limit;
    }
}
