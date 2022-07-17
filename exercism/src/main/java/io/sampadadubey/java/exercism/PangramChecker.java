package io.sampadadubey.java.exercism;

import static java.util.stream.Collectors.toSet;

import java.util.Arrays;
import java.util.Set;

public class PangramChecker {

    public boolean isPangram(final String input) {

        final Set<String> characters = Arrays.stream("abcdefghijklmnopqrstuvwxyz".split("")).collect(toSet());
        final Set<String> inputCharacters = Arrays.stream(input.split("")).map(String::toLowerCase).collect(toSet());

        return inputCharacters.containsAll(characters);
    }
}
