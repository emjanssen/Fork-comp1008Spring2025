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

    public static void budget3(){

        Budget budget = new Budget();
        budget.setMinLimit(200);
        budget.setMaxLimit(1000);
        budget.setLimit(3000);
        System.out.println(budget.getLimit());

        Console console = System.console();

        for(int i = 0; i < 3; i++){

            System.out.println("Enter an expense name");
            String expenseName = console.readLine();
            System.out.println("Enter the monthly amount for " + expenseName + ": ");
            double expenseAmount = Double.parseDouble(console.readLine());

            Expense expense = new Expense();
            expense.name = expenseName;
            expense.setAmount(expenseAmount);
            budget.expenses.add(expense);
        }

        System.out.println("Here are your expenses");

       for(Expense expense : budget.expenses){
           System.out.printf("Expense Name = %s, Expense Amount = $%.2f\n", expense.name, expense.getAmount());
       }


    }
    public static void main(String[] args) {
        budget3();
        //String string = "";

//        Expense expense = new Expense();
//        expense.name = "Food";
//        expense.setAmount(10);
//

    }

}
