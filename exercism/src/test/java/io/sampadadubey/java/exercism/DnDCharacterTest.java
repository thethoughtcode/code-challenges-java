package io.sampadadubey.java.exercism;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class DnDCharacterTest {

    private final DnDCharacter dndCharacter = new DnDCharacter();

    @Test
    void testAbilityModifierForScore3IsNegative4() {
        assertThat(dndCharacter.modifier(3)).isEqualTo(-4);
    }

    @Test
    void testAbilityModifierForScore4IsNegative3() {
        assertThat(dndCharacter.modifier(4)).isEqualTo(-3);
    }

    @Test
    void testAbilityModifierForScore5IsNegative3() {
        assertThat(dndCharacter.modifier(5)).isEqualTo(-3);
    }

    @Test
    void testAbilityModifierForScore6IsNegative2() {
        assertThat(dndCharacter.modifier(6)).isEqualTo(-2);
    }

    @Test
    void testAbilityModifierForScore7IsNegative2() {
        assertThat(dndCharacter.modifier(7)).isEqualTo(-2);
    }

    @Test
    void testAbilityModifierForScore8IsNegative1() {
        assertThat(dndCharacter.modifier(8)).isEqualTo(-1);
    }

    @Test
    void testAbilityModifierForScore9IsNegative1() {
        assertThat(dndCharacter.modifier(9)).isEqualTo(-1);
    }

    @Test
    void testAbilityModifierForScore10Is0() {
        assertThat(dndCharacter.modifier(10)).isEqualTo(0);
    }

    @Test
    void testAbilityModifierForScore11Is0() {
        assertThat(dndCharacter.modifier(11)).isEqualTo(0);
    }

    @Test
    void testAbilityModifierForScore12Is1() {
        assertThat(dndCharacter.modifier(12)).isEqualTo(1);
    }

    @Test
    void testAbilityModifierForScore13Is1() {
        assertThat(dndCharacter.modifier(13)).isEqualTo(1);
    }

    @Test
    void testAbilityModifierForScore14Is2() {
        assertThat(dndCharacter.modifier(14)).isEqualTo(2);
    }

    @Test
    void testAbilityModifierForScore15Is2() {
        assertThat(dndCharacter.modifier(15)).isEqualTo(2);
    }

    @Test
    void testAbilityModifierForScore16Is3() {
        assertThat(dndCharacter.modifier(16)).isEqualTo(3);
    }

    @Test
    void testAbilityModifierForScore17Is3() {
        assertThat(dndCharacter.modifier(17)).isEqualTo(3);
    }

    @Test
    void testAbilityModifierForScore18Is4() {
        assertThat(dndCharacter.modifier(18)).isEqualTo(4);
    }

    @Test
    void testRandomAbilityIsWithinRange() {
        final int score = dndCharacter.ability();
        assertThat(score).isGreaterThan(2).isLessThan(19);
    }

    @Test
    void testRandomCharacterIsValid() {

        for (int index = 0; index < 1000; index++) {

            final DnDCharacter character = new DnDCharacter();

            assertThat(character.getStrength()).isGreaterThan(2).isLessThan(19);
            assertThat(character.getDexterity()).isGreaterThan(2).isLessThan(19);
            assertThat(character.getConstitution()).isGreaterThan(2).isLessThan(19);
            assertThat(character.getIntelligence()).isGreaterThan(2).isLessThan(19);
            assertThat(character.getWisdom()).isGreaterThan(2).isLessThan(19);
            assertThat(character.getCharisma()).isGreaterThan(2).isLessThan(19);
            assertThat(character.getHitpoints()).isEqualTo(10 + character.modifier(character.getConstitution()));
        }
    }

    @Test
    void testEachAbilityIsOnlyCalculatedOnce() {
        assertThat(dndCharacter.getStrength()).isEqualTo(dndCharacter.getStrength());
    }
}
