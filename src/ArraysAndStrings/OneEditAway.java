package ArraysAndStrings;
/**
 * There are 3 types of edits that can be performed on strings:
 * - Insert a character
 * - Remove a character
 * - Replace a character
 * Given two strings, write a function to check if they are One edit (or zero edits) away.
 * EXAMPLE
 *  pale, ple   -> true
 *  pales, pale -> true
 *  pale, bale  -> true
 *  pale, bae   -> false
 */
public class OneEditAway {
    public static boolean isOneEditAway(String first, String second) {
        if (first.length() == second.length()) {
            if (first.equals(second)) return true;
            return checkReplace(first, second);
        } else if (first.length() + 1 == second.length()) {
            return checkInsertDelete(first, second);
        } else if (first.length() - 1 == second.length()) {
            return checkInsertDelete(second, first);
        }
        return false;
    }

    private static boolean checkInsertDelete(String first, String second) {
        int index1 = 0, index2 = 0;
        while(index1 < first.length() && index2 < second.length()) {
            if (first.charAt(index1) != second.charAt(index2)) {
                if (index1 != index2) {
                    return false;
                }
                index2++;
            } else {
                index1++;
                index2++;
            }
        }
        //if (index1 < index2) return false;
        return true;
    }


    private static boolean checkReplace(String first, String second) {
        boolean foundReplacement = false;
        for (int i = 0; i < first.length(); i++) {
            if (first.charAt(i) != second.charAt(i)) {
                if (foundReplacement) return false;
                foundReplacement = true;
            }
        }
        return foundReplacement;
    }
}
