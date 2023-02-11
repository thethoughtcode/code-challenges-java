package io.thoughtcode.java.exercism;

import java.util.ArrayList;
import java.util.List;

public class FlattenList {

    @SuppressWarnings("unchecked")
    public List<Object> flatten(final List<Object> list) {

        final List<Object> result = new ArrayList<>();

        for (int index = 0; index < list.size(); index++) {

            final Object value = list.get(index);

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
