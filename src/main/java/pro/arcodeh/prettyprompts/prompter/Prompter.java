package pro.arcodeh.prettyprompts.prompter;

/**
 * Prints a question to the console, and returns the answer entered by the user
 * The instances of classes that implement this interface are thread-safe and immutable.
 */

public interface Prompter {
    /**
     * Returns a string {@link String} as entered by the user
     * @param question the {@link String} question
     * @param info {@link String} any additional information/instructions
     * @return user's input {@link String}
     */
    String promptStringAnswer(String question, String info);

    /**
     * Returns a string {@link String} as entered by the user
     * @param question the {@link String} question
     * @return user's input {@link String}
     */
    String promptStringAnswer(String question);

    /**
     * Returns a string {@link String} as entered by the user
     * @param question the {@link String} question
     * @param options {@link String[]} an array of possible answers
     * @return user's input {@link String}
     */
    String promptStringAnswer(String question, String[] options);

    /**
     * Returns a string {@link String} as entered by the user
     * @param question the {@link String} question
     * @param options {@link String[]} an array of possible answers
     * @param labelType {@link LabelType} the kind of labelling for the options, defaults to dashes
     * @return user's input {@link String}
     */
    String promptStringAnswer(String question, String[] options, LabelType labelType);

    /**
     * Returns a string {@link String} as entered by the user
     * @param question the {@link String} question
     * @param options {@link String[]} an array of possible answers
     * @param info {@link String} any additional information/instructions
     * @param labelType {@link LabelType} the kind of labelling for the options, defaults to dashes
     * @return user's input {@link String}
     */
    String promptStringAnswer(String question, String[] options, String info, LabelType labelType);


    /**
     * Returns an integer {@link int} as entered by the user
     * @param question the {@link String} question
     * @param options {@link String[]} an array of possible answers
     * @param info {@link String} any additional information/instructions
     * @param labelType {@link LabelType} the kind of labelling for the options, defaults to dashes
     * @return user's input {@link int}
     */
    int promptNumericAnswer(String question, String[] options, String info, LabelType labelType);

    /**
     * Returns an integer {@link int} as entered by the user
     * @param question the {@link String} question
     * @param info {@link String} any additional information/instructions
     * @return user's input {@link int}
     */
    int promptNumericAnswer(String question, String info);

    /**
     * Returns an integer {@link int} as entered by the user
     * @param question the {@link String} question
     * @return user's input {@link int}
     */
    int promptNumericAnswer(String question);

    /**
     * Returns an integer {@link int} as entered by the user
     * @param question the {@link String} question
     * @param options {@link String[]} an array of possible answers
     * @return user's input {@link int}
     */
    int promptNumericAnswer(String question, String[] options);

    /**
     * Returns an integer {@link int} as entered by the user
     * @param question the {@link String} question
     * @param options {@link String[]} an array of possible answers
     * @param labelType {@link LabelType} the kind of labelling for the options, defaults to dashes
     * @return user's input {@link int}
     */
    int promptNumericAnswer(String question, String[] options, LabelType labelType);


    /**
     * Returns a boolean {@link boolean} based on the user's input
     * @param question the {@link String} question
     * @param options {@link String[]} an array of possible answers
     * @param info {@link String} any additional information/instructions
     * @param labelType {@link LabelType} the kind of labelling for the options, defaults to dashes
     * @return {@link boolean}
     */
    boolean promptBooleanAnswer(String question, String[] options, String info, LabelType labelType);

    /**
     * Returns a boolean {@link boolean} based on the user's input
     * @param question the {@link String} question
     * @param info {@link String} any additional information/instructions
     * @return {@link boolean}
     */
    boolean promptBooleanAnswer(String question, String info);

    /**
     * Returns a boolean {@link boolean} based on the user's input
     * @param question the {@link String} question
    * @return {@link boolean}
     */
    boolean promptBooleanAnswer(String question);

    /**
     * Returns a boolean {@link boolean} based on the user's input
     * @param question the {@link String} question
     * @param options {@link String[]} an array of possible answers
     * @return {@link boolean}
     */
    boolean promptBooleanAnswer(String question, String[] options);

    /**
     * Returns a boolean {@link boolean} based on the user's input
     * @param question the {@link String} question
     * @param options {@link String[]} an array of possible answers
     * @param labelType {@link LabelType} the kind of labelling for the options, defaults to dashes
     * @return {@link boolean}
     */
    boolean promptBooleanAnswer(String question, String[] options, LabelType labelType);


    /**
     * Returns a char {@link char} as entered by the user
     * @param question the {@link String} question
     * @param options {@link String[]} an array of possible answers
     * @param info {@link String} any additional information/instructions
     * @param labelType {@link LabelType} the kind of labelling for the options, defaults to dashes
     * @return {@link char} user's input
     */
    char promptCharAnswer(String question, String[] options, String info, LabelType labelType);

    /**
     * Returns a char {@link char} as entered by the user
     * @param question the {@link String} question
     * @param info {@link String} any additional information/instructions
     * @return {@link char} user's input
     */
    char promptCharAnswer(String question, String info);

    /**
     * Returns a char {@link char} as entered by the user
     * @param question the {@link String} question
     * @return {@link char} user's input
     */
    char promptCharAnswer(String question);

    /**
     * Returns a char {@link char} as entered by the user
     * @param question the {@link String} question
     * @param options {@link String[]} an array of possible answers
     * @return {@link char} user's input
     */
    char promptCharAnswer(String question, String[] options);

    /**
     * Returns a char {@link char} as entered by the user
     * @param question the {@link String} question
     * @param options {@link String[]} an array of possible answers
     * @param labelType {@link LabelType} the kind of labelling for the options, defaults to dashes
     * @return {@link char} user's input
     */
    char promptCharAnswer(String question, String[] options, LabelType labelType);
}
