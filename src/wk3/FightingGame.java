package wk3;

import java.util.ArrayList;
import java.util.Random;

public class FightingGame {

    //private ArrayList<Fighter> fighters = new ArrayList<>();
    private Fighter[] fighters = new Fighter[2];
    private Fighter attacker, victim, winner, loser;
    // this line declares four instance variables within the FightingGame class
    // each one is of type Fighter
    // will hold reference to current attacker, victim, winner, and loser
    boolean isGameOver = false;


    public FightingGame(Fighter fighter1, Fighter fighter2) {
        fighters[0] = fighter1;
        fighters[1] = fighter2;
        // When calling in Main: FightingGame game = new FightingGame(f1, f2);
        // fighter1 and fighter2 get passed into fighters array
    }

    public void fight(){

        Random random = new Random();

        while(!isGameOver){
            int remainder = random.nextInt(1, 100) % 2;
            // generates random number to pick who attacks
            // remainder will be either 0 or 1 randomly.
            // this line is using a method of the Random class called nextInt(int origin, int bound)
            // it generates a random number: >= origin (inclusive) < bound (exclusive)

            attacker = fighters[remainder];
            victim = fighters[remainder == 0 ? 1 : 0];

            /* chooses who is victim and who is attacker based on 0 or 1 resulted from remainder
            * attacker = fighters[remainder];
            * if (remainder == 0) {
                victim = fighters[1];
            } else {
                victim = fighters[0];
            }
            * */

            victim.getAttacked(attacker.getPower());
            /* attacker.getPower()
            This calls the getPower() method from the Fighter class.
            It returns the attacker's power level (an int).
            Example: if attacker is Superman with a power of 7, this returns 7.

            victim.getAttacked(...)
            This calls the getAttacked(int power) method on the victim fighter.
            It reduces the victim’s health by the amount of power passed in.
            If power is valid (within allowed range), it subtracts power from the victim’s health.

            public void getAttacked(int power) {
                if (power >= MIN_POWER && power <= MAX_POWER)
                    health -= power;
            } */

            System.out.printf("%s attacked %s.\n", attacker.getName(), victim.getName());
            // prints attacker and victim name
            System.out.println(attacker);
            /* Java automatically calls the toString() method when you use System.out.println() on an object.
            we overworte soString() in Fighter so it calls from there
            public String toString() {
                return String.format("%s's attack power is %d and has a health level of %d", name, power, health);
            }*/
            System.out.println(victim);
            System.out.println("*".repeat(20));
            // prints twenty * just to provide a separator in console

            isGameOver = !attacker.isAlive() || !victim.isAlive();
            // isGameOver will be true if either the attacker or the victim is no longer alive

        }

    winner = fighters[0].isAlive() ? fighters[0] : fighters[1];
    loser = !fighters[0].isAlive() ? fighters[0] : fighters[1];

    /* if (fighters[0].isAlive()) {
        winner = fighters[0];
        loser = fighters[1];
    } else {
        winner = fighters[1];
        loser = fighters[0];
    }
    checks who is still alive and assigns winner and loser */

        System.out.printf("%s is victorious over %s\n", winner.getName(), loser.getName());
        // prints results

    }

}
