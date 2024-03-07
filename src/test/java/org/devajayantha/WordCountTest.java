package org.devajayantha;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Word Count Service Test")
public class WordCountTest {
    private WordCount wordCount = new WordCount("Making a cake when mother at home with me", "m");

    @DisplayName("Test Count Word Success")
    @Test
    public void testCountWordSuccess() {
        assert wordCount.resultCountWord() == 3;
    }

    @DisplayName("Test Count Word Failed")
    @Test
    public void testCountWordFailed() {
        assertThrows(IllegalArgumentException.class, () -> {
            wordCount.setCharFind("");
        });
    }
}
