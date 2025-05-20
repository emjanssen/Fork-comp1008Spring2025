package wk2;

public class Expense {

    //attributes aka characteristics aka how object looks outwardly

        //instance variables

        //accessibility level: public, private, protected, default/package-private
        //data type*
        //name*
        //value

        String name;
        private double amount = 1;

    //actions aka behaviours aka processes aka how to interact with class

    public void setAmount(double amount){
            if(amount >= 1) {
                    this.amount = amount;
            }

    }
    public double getAmount(){
            return amount;
    }

    public Expense(){}
    public Expense(String name, double amount){
        this.name = name;
        setAmount(amount);
    }


}
