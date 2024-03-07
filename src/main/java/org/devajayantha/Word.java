package org.devajayantha;

import java.util.ArrayList;
import java.util.Arrays;

public class Word {
    protected ArrayList<String> sentence;

    public Word(String sentence) {
        this.sentence = manipulateWord(sentence);;
    }
    public ArrayList<String> getSentence() {
        return sentence;
    }

    public void setSentence(ArrayList<String> sentence) {
        this.sentence = sentence;
    }

    public ArrayList<String> manipulateWord(String words) {
        return new ArrayList<String>(Arrays.asList(words.split(" ")));
    }
}
