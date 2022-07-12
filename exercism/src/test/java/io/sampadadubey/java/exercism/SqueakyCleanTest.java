package io.sampadadubey.java.exercism;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SqueakyCleanTest {

    @Test
    void empty() {
        new SqueakyClean();
        assertThat(SqueakyClean.clean("")).isEmpty();
    }

    @Test
    void single_letter() {
        assertThat(SqueakyClean.clean("A")).isEqualTo("A");
    }

    @Test
    void string() {
        assertThat(SqueakyClean.clean("àḃç")).isEqualTo("àḃç");
    }

    @Test
    void spaces() {
        assertThat(SqueakyClean.clean("my   Id")).isEqualTo("my___Id");
    }

    @Test
    void leading_and_trailing_spaces() {
        assertThat(SqueakyClean.clean(" myId ")).isEqualTo("_myId_");
    }

    @Test
    void ctrl() {
        assertThat(SqueakyClean.clean("my\0\r\u007FId")).isEqualTo("myCTRLCTRLCTRLId");
    }

    @Test
    void string_with_no_letters() {
        assertThat(SqueakyClean.clean("\uD83D\uDE00\uD83D\uDE00\uD83D\uDE00")).isEmpty();
    }

    @Test
    void keep_only_letters() {
        assertThat(SqueakyClean.clean("a1\uD83D\uDE002\uD83D\uDE003\uD83D\uDE00b")).isEqualTo("ab");
    }

    @Test
    void kebab_to_camel_case() {
        assertThat(SqueakyClean.clean("à-ḃç")).isEqualTo("àḂç");
    }

    @Test
    void kebab_to_camel_case_no_letter() {
        assertThat(SqueakyClean.clean("a-1C")).isEqualTo("aC");
    }

    @Test
    void omit_lower_case_greek_letters() {
        assertThat(SqueakyClean.clean("MyΟβιεγτFinder")).isEqualTo("MyΟFinder");
    }

    @Test
    void combine_conversions() {
        assertThat(SqueakyClean.clean("9 -abcĐ\uD83D\uDE00ω\0")).isEqualTo("_AbcĐCTRL");
    }

    @Test
    void kebab_to_camel_case_hyphen_at_the_end() {
        assertThat(SqueakyClean.clean("a-")).isEqualTo("a-");
    }
}
