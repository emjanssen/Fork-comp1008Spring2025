package wk5;

public class Week5 {

    public static void main(String[] args) {

    Participant me = new Participant("Myself");
    Participant you = new Participant("You");
    Participant school = new Participant("School");

    Question q1 = new Question("What is the first day of the week?",
            0, "Monday", "Tuesday", "Wednesday", "Thursday");

    Question q2 = new Question("What is the third month of the year?",
            2,"January", "February", "March", "April");

    Question q3 = new Question("What is the course code for this class?",
            3,"comp1030", "comp2003", "comp1234", "comp1008");

    Quiz quiz = new Quiz(q1, q2, q3);

    Game game = new Game(quiz);
    game.setParticipants(me, you, school);

    me.setScore(new Score(quiz));
    you.setScore(new Score(quiz));
    school.setScore(new Score(quiz));

    me.getScore().setCorrect(3);
    you.getScore().setCorrect(2);
    school.getScore().setCorrect(1);


    }
}
