package ArraysAndStrings;

import java.util.HashMap;

/**
 * Implement an algorithm to determine if a string has all unique characters.
 * What if you cannot use additional data structures?
 */
public class IsUnique {
    public static boolean hasUniqueCharacters(String str) {
        if (str == null) return true;
        HashMap<Character, Boolean> strHashMap = new HashMap<>();
        char[] chars = str.toCharArray();
        for (Character c: chars) {
            if(strHashMap.containsKey(c)) return false;
            strHashMap.put(c, true);
        }
        return true;
    }
}
