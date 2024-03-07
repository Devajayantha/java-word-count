package org.devajayantha;

import java.util.ArrayList;

public class WordCount extends Word {
    private String charFind;

    public WordCount(String sentence, String charFind) {
        super(sentence);
        this.charFind = charFind;
    }

    public String getCharFind() {
        return charFind;
    }

    public void setCharFind(String charFind) {
        if (charFind.isEmpty()) {
            throw new IllegalArgumentException("Character cannot be empty");
        }

        this.charFind = charFind;
    }

    public int resultCountWord() {
        ArrayList<String> wordResultList = new ArrayList<String>();

        this.sentence.forEach(word -> {
            if (word.startsWith(this.charFind.toLowerCase()) || word.startsWith(this.charFind.toUpperCase())){
                wordResultList.add(word);
            }
        });

        return wordResultList.size();
    }
}
