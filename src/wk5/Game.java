package wk5;

import java.util.ArrayList;

public class Game {

    private Quiz quizTaken;
    private ArrayList<Participant> participants = new ArrayList<>();

    public Quiz getQuizTaken() {
        return quizTaken;
    }

    public void setQuizTaken(Quiz quizTaken) {
        this.quizTaken = quizTaken;
    }

    public ArrayList<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(Participant ...participants) {
        this.participants.clear();

        for (Participant p : participants) {
            this.participants.add(p);
        }
    }

    public Game(Quiz quizTaken, Participant ...participants) {
        setQuizTaken(quizTaken);
        setParticipants(participants);
    }
}
