package pro.arcodeh.prettyprompts.prompter;

import java.util.Collections;
import java.util.List;

/**
 * Utilities class for measuring and modifying strings
 */
public class StringUtilities {
    /**
     * Compare a list of strings and return an integer showing the length of the longest
     * @param allLines {@link String[]} a list of
     * @return int length of longest string
     */
    public static int longest(List<String[]> allLines) {
        int longest = 0;
        for (String[] lines : allLines) {
            for (String str : lines) {
                if (str.length() > longest) {
                    longest = str.length();
                }
            }
        }
        return longest;
    }

    /**
     * Function to add whitespace to string in order to properly line up box vertical sides
     * @param text {@link String} the text to be padded
     * @param length {@link int} the final length required
     * @return {@link String} the padded string
     */
    public static String pad(String text, int length) {
        int requiredWhitespace = Collections.max(List.of(0, length - text.length()));
        String rightPadding = " ".repeat(requiredWhitespace);
        return text + rightPadding;
    }
}
