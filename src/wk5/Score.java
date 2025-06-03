package wk5;

public class Score {

    private int correct, total;
    private Quiz quiz;

    public int getCorrect() {
        return correct;
    }

    public void setCorrect(int correct) {
        this.correct = correct;
    }
    public void userAnsweredCorrectly(){
        this.correct += 1;
    }

    public int getTotal() {
        return total;
    }

    private void setTotal(int total) {
        this.total = total;
    }


    public Quiz getQuiz() {
        return quiz;
    }

    public void setQuiz(Quiz quiz) {
        this.quiz = quiz;
        setTotal(this.quiz.getQuestions().size());
    }

    public Score(Quiz quiz) {
        setQuiz(quiz);
    }

}
