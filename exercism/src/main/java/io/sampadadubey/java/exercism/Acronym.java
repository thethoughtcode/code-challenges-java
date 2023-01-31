package io.sampadadubey.java.exercism;

import java.util.Locale;

public class Acronym {

    private final String phrase;

    Acronym(final String phrase) {
        this.phrase = phrase;
    }

    String get() {

        final String[] parts = getCleanedPhrase().split(" ");

        final StringBuilder acronym = new StringBuilder();

        for (final String part : parts) {
            acronym.append(part.charAt(0));
        }

        return acronym.toString().toUpperCase(Locale.getDefault());
    }

    private String getCleanedPhrase() {
        return phrase.replaceAll("[^A-Za-z]*\\s+[^A-Za-z]*", " ").replaceAll("-", " ");
    }
}
