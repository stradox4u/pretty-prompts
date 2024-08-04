package pro.arcodeh.prettyprompts.prompter;

import java.util.ArrayList;
import java.util.List;

/**
 * Class in charge of drawing questions and options to the screen
 */
public class Graphics {

    /**
     * Function to draw prettified question and options to terminal
     * @param title the question {@link String}
     * @param options the possible answers {@link String[]}
     * @param info further information/instructions {@link String}
     * @param labelType the kind of labelling to use for the options {@link LabelType}
     */
    public void draw(String title, String[] options, String info, LabelType labelType) {
        int width = StringUtilities.longest(List.of(options, new String[]{title}, new String[]{info}));

        int titleLength = title.length();
        String titleLabel = titleLength > 0 ? " " + title + " " : "";
        int minWidth = 80;
        if(titleLength > 75) {
            minWidth = titleLength + 30;
        }
        ArrayList<String> linesToPrint = new ArrayList<>();

        String topBorder = "─".repeat(minWidth - width - titleLength + (titleLength > 0 ? 0 : 2));

        linesToPrint.add(" ┌" + titleLabel + topBorder + "┐");

        int interWidth = minWidth - width + 2;
        for (int i = 0; i < options.length; i++) {
            String line = "";
            switch(labelType) {
                case NONE -> line = " - " + options[i];
                case NUMERIC -> line = " " + (i + 1) + " - " + options[i];
//                TODO: Handle cases where we have more than 26 options
                case ALPHABETIC -> line = " " + ((char) (i + 97)) + " - " + options[i];
            }
            String intermediateLine = " │" + StringUtilities.pad(line, interWidth) + "│";
            linesToPrint.add(intermediateLine);
        }

        if(!info.isEmpty()) {
            String footerSeparator = " ├" + "─".repeat(interWidth) + "┤";
            linesToPrint.add(footerSeparator);

            String footerLine = " │" + StringUtilities.pad(info, interWidth) + "│";
            linesToPrint.add(footerLine);

        }

        String bottomBorder = " └" + "─".repeat(interWidth) + "┘";
        linesToPrint.add(bottomBorder);

        for(String line : linesToPrint) {
            System.out.println(line);
        }
    }
}
