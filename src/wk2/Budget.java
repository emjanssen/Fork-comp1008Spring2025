package wk2;

import java.util.ArrayList;

public class Budget {

    ArrayList<Expense> expenses = new ArrayList<>();
    private double minLimit = 200, maxLimit = 1000, limit = minLimit, maxOneTimePurchase = Math.round(limit * 0.15);

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
        if(limit >= minLimit && limit <= maxLimit)
            this.limit = limit;
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
}
