package wk2;

import java.io.Console;

public class Week2 {

    /*
    We will create a budget application in a static void budget() method

    The budget application will establish a limit.
    Then the budget will continually ask users for data until the budget
    is reached or surpassed
     */

    public static void budget(){


        double limit = 200; // per month
        double expenses = 0;
        double userValueEntered;

        Console console = System.console();

        while(expenses <= limit){

            System.out.println("Enter an expense value: ");
            userValueEntered = Double.parseDouble(console.readLine());
            if(expenses + userValueEntered > limit) {
                System.out.printf("Sorry but adding $%.2f to your " +
                        "expenses will make you go over your $%.2f budget ",
                        userValueEntered, limit);
                break;
            }

            expenses += userValueEntered;
            //expenses += Double.parseDouble(console.readLine());

            System.out.printf("Your total expense value is now $%.2f\n", expenses);
        }
    }

    public static void main(String[] args) {
        budget();
    }

}
