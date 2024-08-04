# Pretty Prompter

> The base type is `Prompter`, and you can get an instance of this using the `PrompterFactory` like so:
```java 
  Prompter prompter = PrompterFactory.createPrompter();
```
> This should return you an instance of the prompter, on which you can then call your required methods.

## Methods
The prompter provides methods for querying for different types of user input. Supported are:
- String (`promptStringAnswer`)
- int (`promptNumericAnswer`)
- boolean (`promptBooleanAnswer`)
- char (`promptCharAnswer`)

Each method is overloaded to accept the following arguments:
- String (question): This is the question to be asked, and it is required.
- String[] (options): This is an optional array of strings, usually possible answers to the question. These are rendered in a bulleted list.
- String (info): This is an optional string with supporting information/instructions. It is rendered last, below the options (if those are provided).
- LabelType (labelType): This is an optional enum value that determines how the options list is styled.
The type is imported from this library's package, and has three possible values:
  - NONE: This is the default value, and results in dashes being used
  - ALPHABETIC: This labels the options using lowercase alphabets in ascending order.
  - NUMERIC: This labels the options using numbers, in ascending order.

## Return Values
Each method returns a value of the type as depicted above.

## Example Usage
```java
    Prompter prompter = PrompterFactory.createPrompter();

    String range = prompter.promptStringAnswer(
        "How old are you?",
        new String[] {"15 - 21", "22 - 35", "36 - 50", "Above 50"},
        "Type the relevant number from the list"
        LabelType.NUMERIC
    );

    int age = prompter.promptNumericAnswer("How old are you?");

    boolean delete = prompter.promptBooleanAnswer(
        "Are you sure you want to delete?",
        "Type yes/no"
    );

    char consent = prompter.promptCharAnswer(
        "Are you of legal age?",
        "Type y/n"
    );
```