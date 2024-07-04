package test.ArraysAndStrings;

import ArraysAndStrings.OneEditAway;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class OneEditAwayTest {

    @Test
    public void testOneEditAway_Insert() {
        assertTrue(OneEditAway.isOneEditAway("pale", "ple"));
        assertTrue(OneEditAway.isOneEditAway("pales", "pale"));
        assertTrue(OneEditAway.isOneEditAway("ple", "pale"));
    }

    @Test
    public void testOneEditAway_Remove() {
        assertTrue(OneEditAway.isOneEditAway("pale", "ple"));
        assertTrue(OneEditAway.isOneEditAway("pale", "pales"));
        assertTrue(OneEditAway.isOneEditAway("pale", "ale"));
    }

    @Test
    public void testOneEditAway_Replace() {
        assertTrue(OneEditAway.isOneEditAway("pale", "bale"));
        assertTrue(OneEditAway.isOneEditAway("pale", "pale"));
        assertFalse(OneEditAway.isOneEditAway("pale", "bake"));
    }

    @Test
    public void testOneEditAway_Equal() {
        assertTrue(OneEditAway.isOneEditAway("abc", "abc"));
        assertTrue(OneEditAway.isOneEditAway("", ""));
    }

    @Test
    public void testOneEditAway_DifferentLengths() {
        assertTrue(OneEditAway.isOneEditAway("abc", "abcd"));
        assertFalse(OneEditAway.isOneEditAway("abc", "a"));
        assertFalse(OneEditAway.isOneEditAway("abc", "abcdef"));
    }
}
