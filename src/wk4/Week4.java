package wk4;

import java.io.Console;

public class Week4 {

    public static void main(String[] args) {

        System.out.println("Creating list of stations...");
        Station[] stations = {new Station("Allendale"),
        new Station("Barrie South"), new Station("Bradford"),
        new Station("Newmarket"), new Station("Aurora"),
        Station.UnionStation()};
        System.out.println("Station 1: " + stations[0]);
        System.out.println("Station 2: " + stations[1]);
        System.out.println("Station 3: " + stations[2]);
        System.out.println("Station 4: " + stations[3]);
        System.out.println("Station 5: " + stations[4]);
        // create a number of station objects and assign them to Station[] array

        Line barrieLine = new Line();
        System.out.println("Creating new Line called barrieLine...");
        barrieLine.setStations(stations);
        System.out.println("Set the stations to the Barrie Line");
        barrieLine.setStartingStation(stations[stations.length-1]);
        //Set the starting station to the last station in the array (Union Station).
        barrieLine.setEndingStation(stations[0]);
        System.out.println("Set ending station to the first index in the stations array.");

        PaymentCard presto = new PaymentCard(100);
        System.out.println("Creating new payment card with a balance of $100.");
        Train goBarrie = new Train(barrieLine);
        System.out.println("Creating new train object and assigning the barrie line to it.");

        Trip trip = new Trip();
        System.out.println("Create new Trip object.");
        trip.setTrain(goBarrie);
        System.out.println("Assign goBarrie train to the trip.");
        trip.setDeparting(barrieLine.getStations()[1]);
        System.out.println("Set the departing station to the second item in the array (Barrie South).");
        // Not sure why we went with Barrie South instead of Allendale
        trip.setDestination(barrieLine.getStations()[3]);
        System.out.println("Set the destination as index three, i.e. fourth station in the array.");
        trip.setPresto(presto);
        System.out.println("Assign presto card object to this trip.");
        trip.setFare();
        System.out.println("Calculate the fare.");
        System.out.println(trip.getPresto().getBalance());

    }

}
