package org.devajayantha;

import java.util.ArrayList;

public class WordLength extends Word {
    private int length;

    public WordLength(String sentence, int length) {
        super(sentence);
        this.length = length;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        if (length == 0) {
            throw new IllegalArgumentException("Length cannot be 0.");
        }

        this.length = length;
    }

    public ArrayList<String> wordLongerThan() {
        ArrayList<String> wordResultList = new ArrayList<String>();

        this.sentence.forEach(word -> {
            if (word.length() > this.length) {
                wordResultList.add(word);
            }
        });

        return wordResultList;
    }
}
