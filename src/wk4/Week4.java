package wk4;

import java.io.Console;

public class Week4 {

    public static void main(String[] args) {

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
