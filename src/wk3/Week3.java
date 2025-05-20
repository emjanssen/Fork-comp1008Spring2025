package wk3;

import wk2.Budget;
import wk2.Expense;

import java.io.Console;

public class Week3 {
    public static void main(String[] args) {

        example2();

    }
    static void example2(){

        Fighter f1 = new Fighter("Batman", 50, 6);
        Fighter f2 = new Fighter("Superman", 60, 7);
        FightingGame game = new FightingGame(f1, f2);
        game.fight();

    }

    static void example1(){
        System.out.println("Welcome to our Budgeting app");
        System.out.println("What monthly limit do you want to have?");
        Console console = System.console();
        int limit = Integer.parseInt(console.readLine());

        Budget budget = new Budget();
        budget.setLimit(limit);
        budget.run();
        System.out.println(budget.toString());

    }
}
