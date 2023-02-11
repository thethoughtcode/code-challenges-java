package io.thoughtcode.java.exercism;

class Proverb {

    private final String[] words;

    Proverb(final String[] words) {
        this.words = words;
    }

    String recite() {

        final StringBuilder result = new StringBuilder();

        if (words.length > 0) {

            for (int index = 1; index < words.length; index++) {
                result.append(String.format("For want of a %s the %s was lost.\n", words[index - 1], words[index]));
            }

            result.append(String.format("And all for the want of a %s.\n", words[0]));
        }

        return result.toString().trim();
    }

}
