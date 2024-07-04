package test.ArraysAndStrings;

import ArraysAndStrings.CheckPermutation;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CheckPermutationTest {

    @BeforeEach
    void setUp() {
    }

    @Test
    void checkPermutation() {
    }

    @Test
    public void testArePermutations_PositiveCase() {
        assertTrue(CheckPermutation.checkPermutation("listen", "silent"));
    }

    @Test
    public void testArePermutations_NegativeCase() {
        assertFalse(CheckPermutation.checkPermutation("hello", "world"));
    }

    @Test
    public void testArePermutations_EmptyStrings() {
        assertTrue(CheckPermutation.checkPermutation("", ""));
    }

    @Test
    public void testArePermutations_OneEmptyString() {
        assertFalse(CheckPermutation.checkPermutation("abc", ""));
    }

    @Test
    public void testArePermutations_NullStrings() {
        assertTrue(CheckPermutation.checkPermutation(null, null));
    }

    @Test
    public void testArePermutations_OneNullString() {
        assertFalse(CheckPermutation.checkPermutation("abc", null));
    }

    @Test
    public void testArePermutations_MixedCase_PositiveCase() {
        assertTrue(CheckPermutation.checkPermutation("TeSt", "tEsT"));
    }

    @Test
    public void testArePermutations_MixedCase_NegativeCase() {
        assertFalse(CheckPermutation.checkPermutation("Abc", "aBC"));
    }
}
