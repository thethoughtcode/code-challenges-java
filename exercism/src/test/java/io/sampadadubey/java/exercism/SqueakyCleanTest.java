package io.sampadadubey.java.exercism;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class SqueakyCleanTest {

    private final SqueakyClean fixture = new SqueakyClean();

    @Test
    void empty() {
        new SqueakyClean();
        assertThat(fixture.clean("")).isEmpty();
    }

    @Test
    void single_letter() {
        assertThat(fixture.clean("A")).isEqualTo("A");
    }

    @Test
    void string() {
        assertThat(fixture.clean("àḃç")).isEqualTo("àḃç");
    }

    @Test
    void spaces() {
        assertThat(fixture.clean("my   Id")).isEqualTo("my___Id");
    }

    @Test
    void leading_and_trailing_spaces() {
        assertThat(fixture.clean(" myId ")).isEqualTo("_myId_");
    }

    @Test
    void ctrl() {
        assertThat(fixture.clean("my\0\r\u007FId")).isEqualTo("myCTRLCTRLCTRLId");
    }

    @Test
    void string_with_no_letters() {
        assertThat(fixture.clean("\uD83D\uDE00\uD83D\uDE00\uD83D\uDE00")).isEmpty();
    }

    @Test
    void keep_only_letters() {
        assertThat(fixture.clean("a1\uD83D\uDE002\uD83D\uDE003\uD83D\uDE00b")).isEqualTo("ab");
    }

    @Test
    void kebab_to_camel_case() {
        assertThat(fixture.clean("à-ḃç")).isEqualTo("àḂç");
    }

    @Test
    void kebab_to_camel_case_no_letter() {
        assertThat(fixture.clean("a-1C")).isEqualTo("aC");
    }

    @Test
    void omit_lower_case_greek_letters() {
        assertThat(fixture.clean("MyΟβιεγτFinder")).isEqualTo("MyΟFinder");
    }

    @Test
    void combine_conversions() {
        assertThat(fixture.clean("9 -abcĐ\uD83D\uDE00ω\0")).isEqualTo("_AbcĐCTRL");
    }

    @Test
    void kebab_to_camel_case_hyphen_at_the_end() {
        assertThat(fixture.clean("a-")).isEqualTo("a-");
    }
}
