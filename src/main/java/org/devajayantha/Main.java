package org.devajayantha;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.print("Enter a sentence: ");

        String sentence = myObj.nextLine();

        WordCount wordCount = new WordCount(sentence, "m");
        WordLength wordLength = new WordLength(sentence, 5);

        System.out.println("Result Count Words start With "+ wordCount.getCharFind() + " : "+ wordCount.resultCountWord());
        System.out.println("Result Words Longer Than "+ wordLength.getLength() + " : "+ wordLength.wordLongerThan());
    }
}