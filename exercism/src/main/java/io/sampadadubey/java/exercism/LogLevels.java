package io.sampadadubey.java.exercism;

import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class LogLevels {

    static Pattern LOG_PATTERN = Pattern.compile("\\[([A-Z]+)\\]:(.*)", Pattern.DOTALL);

    static final int MATCHER_GROUP_LOG_LEVEL = 1;

    static final int MATCHER_GROUP_LOG_MESSAGE = 2;

    public String message(final String logLine) {
        final Matcher matcher = LOG_PATTERN.matcher(logLine);
        return matcher.matches() ? matcher.group(MATCHER_GROUP_LOG_MESSAGE).trim() : "";
    }

    public String logLevel(final String logLine) {
        final Matcher matcher = LOG_PATTERN.matcher(logLine);
        return matcher.matches() ? matcher.group(MATCHER_GROUP_LOG_LEVEL).trim().toLowerCase(Locale.getDefault()) : "";
    }

    public String reformat(final String logLine) {
        final String logLevel = logLevel(logLine);
        final String message = message(logLine);
        return String.format("%s (%s)", message, logLevel);
    }
}
