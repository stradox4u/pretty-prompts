package pro.arcodeh.prettyprompts.prompter;

public class PrompterFactory {
    private PrompterFactory() {}

    public static Prompter createPrompter() {
        return new PrompterImpl();
    }
}
