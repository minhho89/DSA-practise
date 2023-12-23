package test.ArraysAndStrings;

import ArraysAndStrings.PalindromePermutation;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.AbstractMap;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.*;

class PalindromePermutationTest {

    @ParameterizedTest
    @MethodSource("testCases")
    public void testCheckPalindromePermutation1(String input, boolean expectedResult) {
        boolean actualResult = PalindromePermutation.checkPalindromePermutation1(input);
        assertEquals(expectedResult, actualResult);
    }

    // Define the test cases as a static method returning a Stream of arguments
    private static Stream<Object[]> testCases() {
        return Stream.of(
                new Object[]{"civic", true},
                new Object[]{"ivicc", true},
                new Object[]{"hello", false},
                new Object[]{"radar", true},
                new Object[]{"level", true},
                new Object[]{"deified", true},
                new Object[]{"abcba", true},
                new Object[]{"xyzzyx", true},
                new Object[]{"world", false},
                new Object[]{"abc", false},
                new Object[]{"abcdd", false},
                new Object[]{"xyz", false}
        );
    }

    @Test
    void checkPalindromePermutation1() {
    }
}
