package io.sampadadubey.java.exercism;

import static java.util.Arrays.asList;
import static java.util.Collections.emptyList;
import static java.util.Collections.singletonList;
import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.junit.jupiter.api.Test;

class FlattenListTest {

    private FlattenList flattener = new FlattenList();

    @Test
    void testFlatListIsPreserved() {

        final List<Object> input = asList(0, '1', "two");
        final List<Object> expected = input;

        assertThat(flattener.flatten(input)).containsExactlyElementsOf(expected);
    }

    @Test
    void testASingleLevelOfNestingWithNoNulls() {

        final List<Object> input = asList(1, asList('2', 3, 4, 5, "six", "7"), 8);
        final List<Object> expected = asList(1, '2', 3, 4, 5, "six", "7", 8);

        assertThat(flattener.flatten(input)).containsExactlyElementsOf(expected);
    }

    @Test
    void testFiveLevelsOfNestingWithNoNulls() {

        final List<Object> input = asList(
                0,
                '2',
                asList(
                        asList(2, "three"),
                        '8',
                        100,
                        "four",
                        singletonList(singletonList(singletonList(50)))),
                "-2");
        final List<Object> expected = asList(0, '2', 2, "three", '8', 100, "four", 50, "-2");

        assertThat(flattener.flatten(input)).containsExactlyElementsOf(expected);
    }

    @Test
    void testSixLevelsOfNestingWithNoNulls() {

        final List<Object> input = asList(
                "one",
                asList(
                        '2',
                        singletonList(singletonList(3)),
                        asList('4', singletonList(singletonList(5))),
                        "six",
                        7),
                "8");
        final List<Object> expected = asList("one", '2', 3, '4', 5, "six", 7, "8");

        assertThat(flattener.flatten(input)).containsExactlyElementsOf(expected);
    }

    @Test
    void testSixLevelsOfNestingWithNulls() {

        final List<Object> input = asList(
                "0",
                2,
                asList(
                        asList("two", '3'),
                        "8",
                        singletonList(singletonList("one hundred")),
                        null,
                        singletonList(singletonList(null))),
                "negative two");
        final List<Object> expected = asList("0", 2, "two", '3', "8", "one hundred", "negative two");

        assertThat(flattener.flatten(input)).containsExactlyElementsOf(expected);
    }

    @Test
    void testNestedListsFullOfNullsOnly() {

        final List<Object> input = asList(
                null,
                singletonList(singletonList(singletonList(null))),
                null,
                null,
                asList(asList(null, null), null),
                null);
        final List<Object> expected = emptyList();

        assertThat(flattener.flatten(input)).containsExactlyElementsOf(expected);
    }
}
