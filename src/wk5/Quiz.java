package wk5;

import java.util.ArrayList;

public class Quiz {

    private ArrayList<Question> questions = new ArrayList<>();

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions( Question ...questions) {
        this.questions.clear();
        for(Question q : questions){
            this.questions.add(q);
        }
    }

    public Quiz(Question ...questions) {
        setQuestions(questions);
    }
}
