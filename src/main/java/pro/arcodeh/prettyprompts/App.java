package pro.arcodeh.prettyprompts;

import pro.arcodeh.prettyprompts.prompter.LabelType;
import pro.arcodeh.prettyprompts.prompter.Prompter;
import pro.arcodeh.prettyprompts.prompter.PrompterFactory;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        Prompter prompter = PrompterFactory.createPrompter();

//        boolean isHorny = prompter.promptBooleanAnswer(
//                "Are you horny?",
//                ""
//        );
//        System.out.println(isHorny);

        char limit = prompter.promptCharAnswer(
                "Would you creampie a prostitute?",
                new String[] {"y", "n"},
                "",
                LabelType.ALPHABETIC
        );
        System.out.println(limit);
    }
}