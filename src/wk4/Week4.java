package wk4;

import java.io.Console;

public class Week4 {

    public static void main(String[] args) {

        Station[] stations = {new Station("Allendale"),
        new Station("Barrie South"), new Station("Bradford"),
        new Station("Newmarket"), new Station("Aurora"),
        Station.UnionStation()};

        Line barrieLine = new Line();
        barrieLine.setStations(stations);
        barrieLine.setStartingStation(stations[stations.length-1]);
        barrieLine.setEndingStation(stations[0]);

        PaymentCard presto = new PaymentCard(100);
        Train goBarrie = new Train(barrieLine);

        Trip trip = new Trip();
        trip.setTrain(goBarrie);
        trip.setDeparting(barrieLine.getStations()[1]);
        trip.setDestination(barrieLine.getStations()[3]);
        trip.setPresto(presto);
        trip.setFare();
        System.out.println(trip.getPresto().getBalance());

    }
    static void example2(){


        Person adult = Person.Adult();
        System.out.println(adult.age);


    }
    static void example1(){
        Console console = System.console();

        System.out.println("You will enter car information");
        System.out.println("How many cars do you want to create");
        int numCars = Integer.parseInt(console.readLine());

        Car[] cars = new Car[numCars];

        for(int i = 0; i < numCars; i++) {

            System.out.println("Enter the car make");
            String make = console.readLine();
            System.out.println("Enter the car model");
            String model = console.readLine();
            System.out.println("Enter the car color");
            String color = console.readLine();

            cars[i] = new Car(color,make, model);

            System.out.printf("Car Data: Make = %s, Model = %s, Color = %s\n", cars[i].getMake(),
                    cars[i].getModel(), cars[i].getColor());

        }


    }
}
