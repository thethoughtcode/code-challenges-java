package io.sampadadubey.java.exercism;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.Test;

class GreeterTest {

    @Test
    public void greeter_returns_the_correct_greeting() {
        assertThat(new Greeter().getGreeting()).isEqualTo("Hello, World!");
    }
}
