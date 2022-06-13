package io.sampadadubey.java.hackerrank.strings;

public class Java01StringIntroduction {

    public void run(final String firstWord, final String secondWord) {
        System.out.println(firstWord.length() + secondWord.length());
        System.out.println(firstWord.compareTo(secondWord) > 0 ? "Yes" : "No");
        System.out.printf("%s %s\n", toTitleCase(firstWord), toTitleCase(secondWord));
    }

    public String toTitleCase(final String string) {
        return string.substring(0, 1).toUpperCase() + string.substring(1);
    }
}
