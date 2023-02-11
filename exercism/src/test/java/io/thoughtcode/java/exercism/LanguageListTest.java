package io.thoughtcode.java.exercism;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class LanguageListTest {

    static final String JAVA = "Java";

    static final String PYTHON = "Python";

    static final String KOTLIN = "Kotlin";

    static final String RUBY = "Ruby";

    static final String CPP = "C++";

    private LanguageList languageList;

    @BeforeEach
    void setUp() {
        languageList = new LanguageList();
    }

    @Test
    void empty() {
        assertThat(languageList.isEmpty()).isTrue();
    }

    @Test
    void nonEmpty() {
        languageList.addLanguage(JAVA);

        assertThat(languageList.isEmpty()).isFalse();
    }

    @Test
    void addOneLanguage() {
        languageList.addLanguage(JAVA);

        assertThat(languageList.containsLanguage(JAVA)).isTrue();
        assertThat(languageList.containsLanguage(PYTHON)).isFalse();
    }

    @Test
    void doesNotAddLanguageWhenLanguageAlreadyExists() {

        languageList.addLanguage(JAVA);
        languageList.addLanguage(JAVA);

        assertThat(languageList.containsLanguage(JAVA)).isTrue();
        assertThat(languageList.count()).isEqualTo(1);
    }

    @Test
    void doesNotAddDuplicateLanguage() {
        languageList.addLanguage(JAVA);

        assertThat(languageList.containsLanguage(JAVA)).isTrue();
        assertThat(languageList.containsLanguage(PYTHON)).isFalse();
    }

    @Test
    void addMultipleLanguages() {
        languageList.addLanguage(JAVA);
        languageList.addLanguage(RUBY);
        languageList.addLanguage(CPP);

        assertThat(languageList.containsLanguage(JAVA)).isTrue();
        assertThat(languageList.containsLanguage(RUBY)).isTrue();
        assertThat(languageList.containsLanguage(CPP)).isTrue();
        assertThat(languageList.containsLanguage(PYTHON)).isFalse();
    }

    @Test
    void removeLanguage() {
        languageList.addLanguage(JAVA);
        languageList.addLanguage(PYTHON);
        languageList.addLanguage(RUBY);

        languageList.removeLanguage(PYTHON);

        assertThat(languageList.containsLanguage(JAVA)).isTrue();
        assertThat(languageList.containsLanguage(PYTHON)).isFalse();
        assertThat(languageList.containsLanguage(RUBY)).isTrue();
    }

    @Test
    void firstLanguage() {
        languageList.addLanguage(JAVA);
        languageList.addLanguage(PYTHON);
        languageList.addLanguage(RUBY);

        assertThat(languageList.firstLanguage()).isEqualTo(JAVA);
    }

    @Test
    void firstLanguageReturnsNullWhenEmptyList() {
        assertThat(languageList.firstLanguage()).isNull();
    }

    @Test
    void countThree() {
        languageList.addLanguage(JAVA);
        languageList.addLanguage(PYTHON);
        languageList.addLanguage(RUBY);

        assertThat(languageList.count()).isEqualTo(3);
    }

    @Test
    void countEmpty() {
        assertThat(languageList.count()).isEqualTo(0);
    }

    @Test
    void excitingLanguageListWithJava() {
        languageList.addLanguage(JAVA);

        assertThat(languageList.isExciting()).isTrue();
    }

    @Test
    void excitingLanguageListWithKotlin() {
        languageList.addLanguage(PYTHON);
        languageList.addLanguage(KOTLIN);

        assertThat(languageList.isExciting()).isTrue();
    }

    @Test
    void boringLanguageList() {
        languageList.addLanguage(PYTHON);
        languageList.addLanguage(RUBY);
        languageList.addLanguage(CPP);

        assertThat(languageList.isExciting()).isFalse();
    }
}
