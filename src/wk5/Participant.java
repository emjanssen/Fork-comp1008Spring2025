package wk5;

public class Participant {

    private String name;
    private Score score;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Score getScore() {
        return score;
    }

    public void setScore(Score score) {
        this.score = score;
    }

    public Participant(String name) {
        setName(name);
    }
}
