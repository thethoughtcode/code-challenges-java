package io.sampadadubey.java.exercism;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class DnDCharacterTest {

    private final DnDCharacter dndCharacter = new DnDCharacter();

    @Test
    void testAbilityModifierForScore3IsNegative4() {
        assertEquals(-4, dndCharacter.modifier(3));
    }

    @Test
    void testAbilityModifierForScore4IsNegative3() {
        assertEquals(-3, dndCharacter.modifier(4));
    }

    @Test
    void testAbilityModifierForScore5IsNegative3() {
        assertEquals(-3, dndCharacter.modifier(5));
    }

    @Test
    void testAbilityModifierForScore6IsNegative2() {
        assertEquals(-2, dndCharacter.modifier(6));
    }

    @Test
    void testAbilityModifierForScore7IsNegative2() {
        assertEquals(-2, dndCharacter.modifier(7));
    }

    @Test
    void testAbilityModifierForScore8IsNegative1() {
        assertEquals(-1, dndCharacter.modifier(8));
    }

    @Test
    void testAbilityModifierForScore9IsNegative1() {
        assertEquals(-1, dndCharacter.modifier(9));
    }

    @Test
    void testAbilityModifierForScore10Is0() {
        assertEquals(0, dndCharacter.modifier(10));
    }

    @Test
    void testAbilityModifierForScore11Is0() {
        assertEquals(0, dndCharacter.modifier(11));
    }

    @Test
    void testAbilityModifierForScore12Is1() {
        assertEquals(1, dndCharacter.modifier(12));
    }

    @Test
    void testAbilityModifierForScore13Is1() {
        assertEquals(1, dndCharacter.modifier(13));
    }

    @Test
    void testAbilityModifierForScore14Is2() {
        assertEquals(2, dndCharacter.modifier(14));
    }

    @Test
    void testAbilityModifierForScore15Is2() {
        assertEquals(2, dndCharacter.modifier(15));
    }

    @Test
    void testAbilityModifierForScore16Is3() {
        assertEquals(3, dndCharacter.modifier(16));
    }

    @Test
    void testAbilityModifierForScore17Is3() {
        assertEquals(3, dndCharacter.modifier(17));
    }

    @Test
    void testAbilityModifierForScore18Is4() {
        assertEquals(4, dndCharacter.modifier(18));
    }

    @Test
    void testRandomAbilityIsWithinRange() {
        final int score = dndCharacter.ability();
        assertTrue(score > 2 && score < 19);
    }

    @Test
    void testRandomCharacterIsValid() {

        for (int index = 0; index < 1000; index++) {

            final DnDCharacter character = new DnDCharacter();

            assertTrue(character.getStrength() > 2 && character.getStrength() < 19);
            assertTrue(character.getDexterity() > 2 && character.getDexterity() < 19);
            assertTrue(character.getConstitution() > 2 && character.getConstitution() < 19);
            assertTrue(character.getIntelligence() > 2 && character.getIntelligence() < 19);
            assertTrue(character.getWisdom() > 2 && character.getWisdom() < 19);
            assertTrue(character.getCharisma() > 2 && character.getCharisma() < 19);
            assertEquals(character.getHitpoints(), 10 + character.modifier(character.getConstitution()));
        }
    }

    @Test
    void testEachAbilityIsOnlyCalculatedOnce() {
        assertEquals(dndCharacter.getStrength(), dndCharacter.getStrength());
    }
}
