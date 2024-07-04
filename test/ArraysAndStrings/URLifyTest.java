package test.ArraysAndStrings;

import ArraysAndStrings.URLify;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class URLifyTest {

    @Test
    void urlify() {
        assertEquals("Mr%20John%20Smith",
                URLify.urlify("Mr John Smith    ", 13));
    }
}
