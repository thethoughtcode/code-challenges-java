package io.thoughtcode.java.exercism;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class LogLevelsTest {

    private final LogLevels fixture = new LogLevels();

    @Test
    void error_message() {
        assertThat(fixture.message("[ERROR]: Stack overflow")).isEqualTo("Stack overflow");
    }

    @Test
    void warning_message() {
        assertThat(fixture.message("[WARNING]: Disk almost full")).isEqualTo("Disk almost full");
    }

    @Test
    void info_message() {
        assertThat(fixture.message("[INFO]: File moved")).isEqualTo("File moved");
    }

    @Test
    void message_with_leading_and_trailing_white_space() {
        assertThat(fixture.message("[WARNING]:   \tTimezone not set  \r\n")).isEqualTo("Timezone not set");
    }

    @Test
    void error_log_level() {
        assertThat(fixture.logLevel("[ERROR]: Disk full")).isEqualTo("error");
    }

    @Test
    void warning_log_level() {
        assertThat(fixture.logLevel("[WARNING]: Unsafe password")).isEqualTo("warning");
    }

    @Test
    void info_log_level() {
        assertThat(fixture.logLevel("[INFO]: Timezone changed")).isEqualTo("info");
    }

    @Test
    void error_reformat() {
        assertThat(fixture.reformat("[ERROR]: Segmentation fault"))
                .isEqualTo("Segmentation fault (error)");
    }

    @Test
    void warning_reformat() {
        assertThat(fixture.reformat("[WARNING]: Decreased performance"))
                .isEqualTo("Decreased performance (warning)");
    }

    @Test
    void info_reformat() {
        assertThat(fixture.reformat("[INFO]: Disk defragmented"))
                .isEqualTo("Disk defragmented (info)");
    }

    @Test
    void reformat_with_leading_and_trailing_white_space() {
        assertThat(fixture.reformat("[ERROR]: \t Corrupt disk\t \t \r\n"))
                .isEqualTo("Corrupt disk (error)");
    }
}
