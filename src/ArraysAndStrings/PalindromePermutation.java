package ArraysAndStrings;

import org.jetbrains.annotations.NotNull;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicReference;
import java.util.function.Supplier;

/**
 * Given a string, write a function to check if it is a permutation of a palindrome
 * The palindrome does not need to be limited to just dictionary words.
 */
public class PalindromePermutation {

    public static boolean checkPalindromePermutation1(@NotNull String string) {
        HashMap<Character, Integer> wordMap = new HashMap<>();
        for (char c : string.toLowerCase().toCharArray()) {
            wordMap.put(c, wordMap.getOrDefault(c, 0) + 1);
        }

        Supplier<Boolean> result = () -> {
            long oddCount = wordMap.values().stream().filter( value -> value % 2 != 0).count();
            return oddCount <= 1;
        };

        return result.get();
    }

}
