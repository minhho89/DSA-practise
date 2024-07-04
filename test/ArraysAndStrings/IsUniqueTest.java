package test.ArraysAndStrings;

import ArraysAndStrings.IsUnique;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class IsUniqueTest {

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
    }

    @org.junit.jupiter.api.Test
    void isUnique() {
    }

    @Test
    public void testHasUniqueCharacters_PositiveCase() {
        Assertions.assertTrue(IsUnique.hasUniqueCharacters("abcdefg"));
    }

    @Test
    public void testHasUniqueCharacters_NegativeCase() {
        assertFalse(IsUnique.hasUniqueCharacters("hello"));
    }

    @Test
    public void testHasUniqueCharacters_EmptyString() {
        assertTrue(IsUnique.hasUniqueCharacters(""));
    }

    @Test
    public void testHasUniqueCharacters_NullString() {
        assertTrue(IsUnique.hasUniqueCharacters(null));
    }

    @Test
    public void testHasUniqueCharacters_MixedCase_PositiveCase() {
        assertTrue(IsUnique.hasUniqueCharacters("aA"));
    }

    @Test
    public void testHasUniqueCharacters_MixedCase_NegativeCase() {
        assertFalse(IsUnique.hasUniqueCharacters("aAa"));
    }

}
