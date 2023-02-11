package io.thoughtcode.java.exercism;

import java.util.HashMap;
import java.util.Map;

class RnaTranscription {

    static final Map<Character, String> DNA_TO_RNA = new HashMap<>(4);

    static {
        DNA_TO_RNA.put('G', "C");
        DNA_TO_RNA.put('C', "G");
        DNA_TO_RNA.put('T', "A");
        DNA_TO_RNA.put('A', "U");
    }

    String transcribe(final String dnaStrand) {

        final StringBuilder rnaStrand = new StringBuilder(dnaStrand.length());

        for (final Character character : dnaStrand.toCharArray()) {
            rnaStrand.append(DNA_TO_RNA.get(character));
        }

        return rnaStrand.toString();
    }
}
