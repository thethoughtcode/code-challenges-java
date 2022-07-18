package io.sampadadubey.java.exercism;

import java.util.HashMap;
import java.util.Map;

class RnaTranscription {

    static final Map<Character, String> DNA_TO_RNA = new HashMap<>() {
        {
            put('G', "C");
            put('C', "G");
            put('T', "A");
            put('A', "U");
        }
    };

    String transcribe(final String dnaStrand) {

        final StringBuilder rnaStrand = new StringBuilder(dnaStrand.length());

        for (final Character character : dnaStrand.toCharArray()) {
            rnaStrand.append(DNA_TO_RNA.get(character));
        }

        return rnaStrand.toString();
    }
}
