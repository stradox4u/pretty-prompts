package pro.arcodeh.prettyprompts.prompter;

import java.util.Collections;
import java.util.List;

public class StringUtilities {
    public static int longest(List<String[]> allLines) {
        int longest = 0;
        for(int i = 0; i < allLines.size(); i++) {
            String[] lines = allLines.get(i);
            for(String str : lines) {
                if(str.length() > longest) {
                    longest = str.length();
                }
            }
        }
        return longest;
    }

    public static String pad(String text, int length) {
        int requiredWhitespace = Collections.max(List.of(0, length - text.length()));
        String rightPadding = " ".repeat(requiredWhitespace);
        return text + rightPadding;
    }
}
