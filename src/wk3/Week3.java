package wk3;

import wk2.Budget;
import wk2.Expense;

import java.io.Console;

public class Week3 {
    public static void main(String[] args) {

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
