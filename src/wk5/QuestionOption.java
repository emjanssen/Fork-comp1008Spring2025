package wk5;

//javadoc => documenting your java class

/**
 * This is Java Documentation. It is used to summarize the class.
 * @author Prof Ben
 * @since 2025-06-03
 * @version 1.0
 * @implSpec This describes how to implement this class, hence the name Implementation Specification
 * @apiNote These are technical notes about this Application User Interface
 */

public class QuestionOption {

            /** This represents the question option text */
            private String text;

    /**
     * The getter for text
      * @return value of the question option text
     */
    public String getText() {
        return text;
    }

    /**
     * The setter for question option text
     * @param text The question option text value
     */
    public void setText(String text) {
        this.text = text;
    }
    public QuestionOption(String text) {
        setText(text);
    }


}
