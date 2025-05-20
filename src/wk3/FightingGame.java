package wk3;

import java.util.ArrayList;
import java.util.Random;

public class FightingGame {

    //private ArrayList<Fighter> fighters = new ArrayList<>();
    private Fighter[] fighters = new Fighter[2];
    private Fighter attacker, victim, winner, loser;
    boolean isGameOver = false;


    public FightingGame(Fighter fighter1, Fighter fighter2) {
        fighters[0] = fighter1;
        fighters[1] = fighter2;
    }

    public void fight(){

        Random random = new Random();

        while(!isGameOver){
            int remainder = random.nextInt(1, 100) % 2;

            attacker = fighters[remainder];
            victim = fighters[remainder == 0 ? 1 : 0];
            victim.getAttacked(attacker.getPower());
            System.out.printf("%s attacked %s.\n", attacker.getName(), victim.getName());
            System.out.println(attacker);
            System.out.println(victim);
            System.out.println("*".repeat(20));

            isGameOver = !attacker.isAlive() || !victim.isAlive();

        }

    winner = fighters[0].isAlive() ? fighters[0] : fighters[1];
    loser = !fighters[0].isAlive() ? fighters[0] : fighters[1];

        System.out.printf("%s is victorious over %s\n", winner.getName(), loser.getName());

    }

}
