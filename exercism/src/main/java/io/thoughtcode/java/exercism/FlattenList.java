package io.thoughtcode.java.exercism;

import java.util.ArrayList;
import java.util.List;

public class FlattenList {

    @SuppressWarnings("unchecked")
    public List<Object> flatten(final List<Object> list) {

        final List<Object> result = new ArrayList<>();

        int index = 0;

        while (index < list.size()) {

            final Object value = list.get(index);

            index++;

            if (value == null) {
                continue;
            }

            if (value instanceof List) {
                result.addAll(flatten((List<Object>) value));
            } else {
                result.add(value);
            }
        }

        return result;
    }
}
