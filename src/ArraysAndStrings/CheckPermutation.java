package ArraysAndStrings;

import java.util.HashMap;

/**
 * Given two strings, write a method to decide if one is a permutation of the other
 */
public class CheckPermutation {
     public static boolean checkPermutation(String str1, String str2) {
         if (str1.length() != str2.length()) return false;

         HashMap<Character, Integer> str1Map = new HashMap<>();
         for (Character c : str1.toCharArray()) {
             str1Map.put(c, str1Map.getOrDefault(c, 0) + 1);
         }

         for (Character c: str2.toCharArray()) {
             int freq = str1Map.getOrDefault(c, 0);
             if (freq == 0) return false;
             str1Map.put(c, freq - 1);
         }

         return true;

     }
}
