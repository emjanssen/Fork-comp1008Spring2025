package wk2;

import java.io.Console;
import java.util.ArrayList;

public class Budget {

    ArrayList<Expense> expenses = new ArrayList<>();
    private double minLimit = 200, maxLimit = 1000, limit = minLimit,
            maxOneTimePurchase = Math.round(limit * 0.15), totalExpenses = 0;

    //right-click => Generate...


    public double getMinLimit() {
        return minLimit;
    }

    public void setMinLimit(double minLimit) {
        this.minLimit = minLimit;
    }

    public double getMaxLimit() {
        return maxLimit;
    }

    public void setMaxLimit(double maxLimit) {
        this.maxLimit = maxLimit;
    }

    public double getLimit() {
        return limit;
    }

    public void setLimit(double limit) {
        if(limit >= minLimit && limit <= maxLimit){
            this.limit = limit;
            setMaxOneTimePurchase(Math.round(limit * 0.15));

        }
        else{
            System.err.println("Limit must be between " + minLimit + " and " + maxLimit);
        }
    }

    public double getMaxOneTimePurchase() {
        return maxOneTimePurchase;
    }

    public void setMaxOneTimePurchase(double maxOneTimePurchase) {
        this.maxOneTimePurchase = maxOneTimePurchase;
    }

    /*
            create a method that memics our runner task in Week2 budget
            -continually ask the user for an expense
                ensure that the expense does not surpass maxOneTimePurchase
                and expenses do not surpass limit


     */
    private boolean isWithinMaxOneTimePurchaseLimit(double value){
        return value <= maxOneTimePurchase;
    }
    private boolean doesNewExpenseStayWithinTotalExpenses(double value){
        return value + totalExpenses <= limit;
    }

    public void run(){
        Console console = System.console();
        double userEntry = 0;
        do{
            System.out.println("Enter an expense Name");
            String expenseName = console.readLine();
            System.out.println("Enter an expense Amount");
            userEntry = Double.parseDouble(console.readLine());

            //determine if userEntry is within limit of maxOneTimePurchase
                //iff, add userEntry to the totalExpenses iff not overbudget

            if(isWithinMaxOneTimePurchaseLimit(userEntry)
            &&
            doesNewExpenseStayWithinTotalExpenses(userEntry)
            ){
                expenses.add(new Expense(expenseName, userEntry));
                totalExpenses += userEntry;
            }
            else{
                System.err.println("Invalid input");
                break;
            }

        }
        while( totalExpenses + userEntry < limit );

    }

    //summarize the object values
    public String toString(){

        return String.format("The budget was set to %.2f. The number of expenses are: %d. The total price of " +
                "the expenses is: %.2f", limit, expenses.size(), totalExpenses);
    }


}
