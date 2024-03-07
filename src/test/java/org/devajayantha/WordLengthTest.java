package org.devajayantha;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.assertThrows;

@DisplayName("Word Length Service Test")
public class WordLengthTest {
    private WordLength wordlength = new WordLength("Making a cake when mother at home with me", 5);

    @DisplayName("Test Length Word Success")
    @Test
    public void testCountWordSuccess() {
        assert wordlength.wordLongerThan().size() == 2;
    }

    @DisplayName("Test Length Word Failed")
    @Test
    public void testCountWordFailed() {
        assertThrows(IllegalArgumentException.class, () -> {
            wordlength.setLength(0);
        });
    }
}