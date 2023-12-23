package ArraysAndStrings;

import java.util.Arrays;

/**
 * Write a method in Java to replace all spaces in a string with '%20'. You may assume that the string has sufficient space at the end to hold the additional characters and that you are given the "true" length of the string. (Use a  character array so that you can perform this operation in place).
 * EXAMPLE
 * Input: "Mr John Smith  ", 13
 * Output: "Mr%20John%20Smith"
 */
public class URLify {
    public static String urlify(String inputStr, int length) {
        int spaceCount = 0;
        char[] stringChars = inputStr.toCharArray();

        for (int i = 0; i < length; i++) {
            if (stringChars[i] == ' ') spaceCount++;
        }

        int index = length + spaceCount * 2;


        for (int i = length - 1; i >= 0; i--) {
            if (stringChars[i] != ' ') {
                stringChars[index - 1] = stringChars[i];
                index--;
            } else {
                stringChars[index - 1] = '0';
                stringChars[index - 2] = '2';
                stringChars[index - 3] = '%';
                index = index - 3;
            }
        }

        StringBuilder stringBuilder = new StringBuilder();
        for (char c: stringChars) {
            stringBuilder.append(c);
        }

        return stringBuilder.toString();
    }
}
