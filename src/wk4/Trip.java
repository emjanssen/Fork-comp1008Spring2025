package wk4;

import java.util.Random;

public class Trip {

    private Train train;
    private PaymentCard presto;
    private  Station departing, destination;
    private double fare;

    public Trip(){}
    public Train getTrain() {
        return train;
    }

    public void setTrain(Train train) {
        this.train = train;
    }
    public void setPresto(PaymentCard presto) {
        this.presto = presto;
    }
    public PaymentCard getPresto() {
        return presto;
    }


    public Station getDeparting() {
        return departing;
    }

    public void setDeparting(Station departing) {
        this.departing = departing;
    }

    public Station getDestination() {
        return destination;
    }

    public void setDestination(Station destination) {
        this.destination = destination;
    }

    public double getFare() {
        return fare;
    }
    private int getStationIndex(Station station){

        for(int i = 0; i < train.getLine().getStations().length; i++){
            if(train.getLine().getStations()[i].getName().equals(station.getName())){
                return i;
            }
        }
        return -1;

    }

    public void setFare() {
        int numberOfStationsTravelled = Math.abs(getStationIndex(departing) - Math.abs(getStationIndex(destination)));


//        fare =  3.5 * new Random().nextInt(1, train.getLine().getStations().length);
        fare = 2.5 * numberOfStationsTravelled;

        presto.setBalance( presto.getBalance() - fare);

    }
}
