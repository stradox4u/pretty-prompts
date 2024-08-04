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

        boolean isHungry = prompter.promptBooleanAnswer(
                "Are you hungry?",
                ""
        );
        System.out.println(isHungry);

    }
}
