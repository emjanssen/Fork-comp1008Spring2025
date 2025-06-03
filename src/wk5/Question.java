package wk5;

import java.util.ArrayList;

public class Question {

    private String questionText;
    private int answer;
    private ArrayList<QuestionOption> options = new ArrayList<>();

    public String getQuestionText() {
        return questionText;
    }

    public void setQuestionText(String questionText) {
        this.questionText = questionText;
    }

    public String getAnswer() {
        return options.get(answer).getText();
    }

    public void setAnswer(int answer) {
        if (answer >= 0 && answer < options.size())
            this.answer = answer;
    }

    public ArrayList<QuestionOption> getOptions() {
        return options;
    }
    //setOptions("First Choice", "Second Choice", "Third Choice", "Fourth Choice")
    //setOptions("First Choice")
    //setOptions("First Choice", "Second Choice")
    //setOptions("First Choice", "Second Choice", "Third Choice")

    public void setOptions(String ...questionOption) {
        options.clear();  //delete any entries
        for(String option : questionOption) {
            options.add(new QuestionOption(option));
        }

    }
    public Question(String questionText, int answer, String ...options) {

        setQuestionText(questionText);
        setAnswer(answer);
        setOptions(options);
    }
    public Question(String questionText, String ...options) {
        this(questionText, 0, options);
    }
}
