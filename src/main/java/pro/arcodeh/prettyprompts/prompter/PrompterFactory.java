package pro.arcodeh.prettyprompts.prompter;

/**
 * Factory for creating instances of {@link Prompter}
 */
public class PrompterFactory {
    private PrompterFactory() {}

    /**
     * Creates an instance of {@link Prompter}
     * @return the new instance of {@link Prompter}
     */
    public static Prompter createPrompter() {
        return new PrompterImpl();
    }
}
