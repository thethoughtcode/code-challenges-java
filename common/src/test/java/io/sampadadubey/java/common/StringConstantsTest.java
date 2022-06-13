package io.sampadadubey.java.common;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

import org.junit.jupiter.api.Test;

class StringConstantsTest {

    @Test
    void defaultCase() {

        final Map<String, String> values = new HashMap<>();

        values.put(StringConstants.EMPTY, "");

        for (final Entry<String, String> entry : values.entrySet()) {
            assertThat(entry.getKey()).isEqualTo(entry.getValue());
        }
    }
}
