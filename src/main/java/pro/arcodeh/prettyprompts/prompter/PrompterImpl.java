package pro.arcodeh.prettyprompts.prompter;

import java.util.List;
import java.util.Scanner;

class PrompterImpl implements Prompter{
    private final Scanner scanner;
    private final Graphics graphics;

    public PrompterImpl() {
        this.scanner = new Scanner(System.in);
        this.graphics = new Graphics();
    }

    private boolean checkBool(String input) {
        List<String> positiveAnswers = List.of("Yes", "YES", "yes", "y", "Y", "true", "True", "TRUE");
        return positiveAnswers.contains(input);
    }

    @Override
    public String promptStringAnswer(String question, String info) {
        this.graphics.draw(question, new String[]{}, info, LabelType.NONE);
        return this.scanner.nextLine();
    }

    @Override
    public String promptStringAnswer(String question, String[] options, String info, LabelType labelType) {
        this.graphics.draw(question, options, info, labelType);
        return this.scanner.nextLine();
    }

    @Override
    public String promptStringAnswer(String question) {
        this.graphics.draw(question, new String[]{}, "", LabelType.NONE);
        return this.scanner.nextLine();
    }

    @Override
    public String promptStringAnswer(String question, String[] options) {
        this.graphics.draw(question, options, "", LabelType.NONE);
        return this.scanner.nextLine();
    }

    @Override
    public String promptStringAnswer(String question, String[] options, LabelType labelType) {
        this.graphics.draw(question, options, "", labelType);
        return this.scanner.nextLine();
    }

    @Override
    public int promptNumericAnswer(String question, String info) {
        this.graphics.draw(question, new String[]{}, info, LabelType.NONE);
        return Integer.parseInt(this.scanner.nextLine());
    }

    @Override
    public int promptNumericAnswer(String question, String[] options, String info, LabelType labelType) {
        this.graphics.draw(question, options, info, labelType);
        return Integer.parseInt(this.scanner.nextLine());
    }

    @Override
    public int promptNumericAnswer(String question) {
        this.graphics.draw(question, new String[] {}, "", LabelType.NONE);
        return Integer.parseInt(this.scanner.nextLine());
    }

    @Override
    public int promptNumericAnswer(String question, String[] options) {
        this.graphics.draw(question, options, "", LabelType.NONE);
        return Integer.parseInt(this.scanner.nextLine());
    }

    @Override
    public int promptNumericAnswer(String question, String[] options, LabelType labelType) {
        this.graphics.draw(question, options, "", labelType);
        return Integer.parseInt(this.scanner.nextLine());
    }

    @Override
    public boolean promptBooleanAnswer(String question, String[] options, String info, LabelType labelType) {
        this.graphics.draw(question, options, info, labelType);
        return this.checkBool(this.scanner.nextLine());
    }

    @Override
    public boolean promptBooleanAnswer(String question, String info) {
        this.graphics.draw(question, new String[]{}, info, LabelType.NONE);
        return this.checkBool(this.scanner.nextLine());
    }

    @Override
    public boolean promptBooleanAnswer(String question) {
        this.graphics.draw(question, new String[] {}, "", LabelType.NONE);
        return this.checkBool(this.scanner.nextLine());
    }

    @Override
    public boolean promptBooleanAnswer(String question, String[] options) {
        this.graphics.draw(question, options, "", LabelType.NONE);
        return this.checkBool(this.scanner.nextLine());
    }

    @Override
    public boolean promptBooleanAnswer(String question, String[] options, LabelType labelType) {
        this.graphics.draw(question, options, "", labelType);
        return this.checkBool(this.scanner.nextLine());
    }

    @Override
    public char promptCharAnswer(String question, String[] options, String info, LabelType labelType) {
        this.graphics.draw(question, options, info, labelType);
        return this.scanner.nextLine().charAt(0);
    }

    @Override
    public char promptCharAnswer(String question, String info) {
        this.graphics.draw(question, new String[]{}, info, LabelType.NONE);
        return this.scanner.nextLine().charAt(0);
    }

    @Override
    public char promptCharAnswer(String question) {
        this.graphics.draw(question, new String[] {}, "", LabelType.NONE);
        return this.scanner.nextLine().charAt(0);
    }

    @Override
    public char promptCharAnswer(String question, String[] options) {
        this.graphics.draw(question, options, "", LabelType.NONE);
        return this.scanner.nextLine().charAt(0);
    }

    @Override
    public char promptCharAnswer(String question, String[] options, LabelType labelType) {
        this.graphics.draw(question, options, "", labelType);
        return this.scanner.nextLine().charAt(0);
    }
}
