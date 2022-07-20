package io.sampadadubey.java.exercism;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class LanguageList {

    private final List<String> languages = new ArrayList<>();

    private final Set<String> excitingLanguages = new HashSet<>(Arrays.asList("Java", "Kotlin"));

    public boolean isEmpty() {
        return languages.isEmpty();
    }

    public void addLanguage(final String language) {
        if (!containsLanguage(language)) {
            languages.add(language);
        }
    }

    public void removeLanguage(final String language) {
        languages.remove(language);
    }

    public String firstLanguage() {
        return !isEmpty() ? languages.get(0) : null;
    }

    public int count() {
        return languages.size();
    }

    public boolean containsLanguage(final String language) {
        return languages.contains(language);
    }

    public boolean isExciting() {
        return languages.stream().anyMatch(excitingLanguages::contains);
    }
}
