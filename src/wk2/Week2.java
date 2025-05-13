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


    public static void budget2(){

        Console console = System.console();
        System.out.println("Welcome to our Budget App");
        System.out.println("Enter a monthly budget (Between $200-$1000)");
        double limit = Double.parseDouble(console.readLine());

        double minLimit = 200, maxLimit = 1000;

        if(limit < minLimit || limit > maxLimit){
            //serr+tab
            System.err.printf("$%.2f is not within the range of $%.2f and $%.2f\n", limit, minLimit,maxLimit);
            return;
        }

        double expenses = 0;
        double userValueEntered;
        long maxOneTimeExpense = Math.round(limit * 0.15);

      while(expenses <= limit){

            System.out.println("Enter an expense value: ");
            userValueEntered = Double.parseDouble(console.readLine());


          System.out.println("Is this value a yearly value? (y/n)");
          char answer = console.readLine().toLowerCase().trim().charAt(0);

          if(answer == 'y')
              userValueEntered /= 12;


          if(expenses + userValueEntered > limit) {
                System.out.printf("Sorry but adding $%.2f to your " +
                                "expenses will make you go over your $%.2f budget ",
                        userValueEntered, limit);
                break;
            }
            else if( userValueEntered > maxOneTimeExpense ){

                System.err.printf("Sorry but $%.2f is too high. Please enter a value no higher than $%d\n",
                        userValueEntered, maxOneTimeExpense
                        );
                continue;
            }


            expenses += userValueEntered;
            //expenses += Double.parseDouble(console.readLine());

            System.out.printf("Your total expense value is now $%.2f\n", expenses);
        }
    }

    public static void main(String[] args) {
        budget2();
    }

}
