package pro.arcodeh.prettyprompts.prompter;

public interface Prompter {
    String promptStringAnswer(String question, String info);
    String promptStringAnswer(String question);
    String promptStringAnswer(String question, String[] options);
    String promptStringAnswer(String question, String[] options, LabelType labelType);
    String promptStringAnswer(String question, String[] options, String info, LabelType labelType);

    int promptNumericAnswer(String question, String[] options, String info, LabelType labelType);
    int promptNumericAnswer(String question, String info);
    int promptNumericAnswer(String question);
    int promptNumericAnswer(String question, String[] options);
    int promptNumericAnswer(String question, String[] options, LabelType labelType);

    boolean promptBooleanAnswer(String question, String[] options, String info, LabelType labelType);
    boolean promptBooleanAnswer(String question, String info);
    boolean promptBooleanAnswer(String question);
    boolean promptBooleanAnswer(String question, String[] options);
    boolean promptBooleanAnswer(String question, String[] options, LabelType labelType);

    char promptCharAnswer(String question, String[] options, String info, LabelType labelType);
    char promptCharAnswer(String question, String info);
    char promptCharAnswer(String question);
    char promptCharAnswer(String question, String[] options);
    char promptCharAnswer(String question, String[] options, LabelType labelType);
}
