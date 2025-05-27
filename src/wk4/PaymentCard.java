package wk4;

public class PaymentCard {
    private double balance;

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {

        this.balance = balance >= 0 ? balance : 0;
    }
    public PaymentCard(double balance) {
        setBalance(balance);
    }
}
